package controller;

import session.ClientFacade;
import session.ProductFacade;
import session.HistoryFacade;
import entity.Client;
import entity.History;
import entity.Product;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author user
 */
@WebServlet(name = "Controller", urlPatterns = {
    "/product",//Шаблоны запроса, который отлавливает сервлет
    "/client",
    "/showNewProduct",
    "/createProduct",
    "/showNewClient",
    "/createClient",
    "/showListProducts",
    "/showListClients",
    "/showTakeProductToClient",
    "/takeProductToClient",
    "/showListTakeProducts",
    "/showProductInfo",
    "/showClientInfo",
    "/showAddCountProduct",
    "/AddCountProduct",
    "/showAddMoneyToClient",
    "/AddMoneyToClient",
})
public class Controller extends HttpServlet {
//    List<Product> listProducts = new ArrayList<>();
//    List<Client> listClients = new ArrayList<>();
    
    @EJB ClientFacade clientFacade;
    @EJB ProductFacade productFacade;
    @EJB HistoryFacade historyFacade;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        switch (path) {
            case "/product": 
                Product product = new Product(); //Инициация объекта книги
                product.setId(1L);
                product.setName("Adidas");
                product.setQuantity(10);
                product.setPrice(200);
                request.setAttribute("product", product); // Создание переменной book в контексте обработки jsp
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response); // Формирование ответа браузеру
                break;
            case "/client": 
                Client client = new Client(); //Инициация объекта книги
                client.setId(1L);
                client.setName("Дмитрий");
                client.setSurname("Иванов");
                client.setMoney(200);
                client.setPhone(3724290);
                request.setAttribute("client", client); // Создание переменной book в контексте обработки jsp
                request.getRequestDispatcher("/index.jsp")
                        
                        .forward(request, response); // Формирование ответа браузеру
                break;
        
            case "/showNewProduct":
                request.getRequestDispatcher("/NewProduct.jsp")
                    .forward(request, response); // Формирование ответа браузеру
                break;
            
            case "/createProduct":
                String name = request.getParameter("name");
                String price = request.getParameter("price");
                String quantity = request.getParameter("quantity");
                product = new Product(new Integer(price), new Integer(quantity), null, name);
                productFacade.create(product);
                List<Product> listProducts = productFacade.findAll();
                request.setAttribute("listProducts", listProducts);
                List<Client> listClients = clientFacade.findAll();
                request.setAttribute("listClients", listClients); 
                request.setAttribute("info", "Товар добавлен");
                request.getRequestDispatcher("/index.jsp")
                .forward(request, response); // Формирование ответа браузеру
                break;
                
            case "/showNewClient":
                request.getRequestDispatcher("/showNewClient.jsp")
                    .forward(request, response); // Формирование ответа браузеру
                break;
            case "/createClient":
                String nameClient = request.getParameter("nameClient");
                String surname = request.getParameter("surname");
                String money = request.getParameter("money");
                String phone = request.getParameter("phone");
                client = new Client(nameClient, surname, new Integer(money), new Integer(phone), null);
                clientFacade.create(client);
                listProducts = productFacade.findAll();
                request.setAttribute("listProducts", listProducts);
                listClients = clientFacade.findAll();
                request.setAttribute("listClients", listClients); 
                request.setAttribute("info", "Клиент добавлен");
                request.getRequestDispatcher("/index.jsp")
                    .forward(request, response); // Формирование ответа браузеру
                break;
                
            case "/showListProducts":
                listProducts = productFacade.findAll();
                request.setAttribute("listProducts", listProducts);
                request.getRequestDispatcher("/showListProducts.jsp")
                    .forward(request, response);
                break;
                
            case "/showListClients":
                listClients = clientFacade.findAll();
                request.setAttribute("listClients", listClients);
                request.getRequestDispatcher("/showListClients.jsp")
                    .forward(request, response);
                break;
            case "/showTakeProductToClient":
                listClients = clientFacade.findAll();
                listProducts = productFacade.findAll();
                request.setAttribute("listClients", listClients);
                request.setAttribute("listProducts", listProducts);
                request.getRequestDispatcher("/showTakeProductToClient.jsp")
                        .forward(request, response);
                break;
            case "/takeProductToClient":
                String clientId = request.getParameter("clientId");
                String productId = request.getParameter("productId");
                String count = request.getParameter("count");
                client = clientFacade.find(new Long(clientId));
                product = productFacade.find(new Long(productId));
                Calendar c = new GregorianCalendar();
                int quantityCheck = product.getQuantity();
                int checkk = Integer.parseInt(count);
                int productPrice = product.getPrice();
                int clientMoney = client.getMoney();
                if(checkk<1){
                    request.setAttribute("info","Значение должно быть больше 0");
                    request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                    break;
                }
                if (checkk > quantityCheck)
                {
                request.setAttribute("info", "На складе нету столько товара!</h1>");
                    request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                    break;
                }
                int summ1 = productPrice * checkk;
                if (clientMoney < summ1)
                {
                request.setAttribute("info", "Недостаточно денег у покупателя!</h1>");
                    request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                    break;
                }
                History history = new History(
                                        null, product, 
                                        client, c.getTime()
                                    );
                historyFacade.create(history);
                int custMoney = clientMoney -summ1;
                Client editcust = history.getClient();
                editcust.setMoney(custMoney);
                clientFacade.edit(editcust);
                Product editProd = history.getProduct();
                int finalProdQuantity = quantityCheck - checkk;
                editProd.setQuantity(finalProdQuantity);
                productFacade.edit(editProd);
//                List<History> listHistories = historyFacade.findAll();
                request.setAttribute("info", "Покупка добавлена");
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;  
                
                case "/showListTakeProducts":
                List<History> listHistories = historyFacade.findAll();
                request.setAttribute("listHistories", listHistories);
                request.getRequestDispatcher("/showListTakeProducts.jsp")
                        .forward(request, response);
                break;
                
                
                case "/showProductInfo":
                    String ProductId = request.getParameter("ProductId");
                    product = productFacade.find(new Long(ProductId));
                    request.setAttribute("product", product);
                    request.getRequestDispatcher("/showProductInfo.jsp")
                        .forward(request, response);
                    break;
                    
                case "/showClientInfo":
                    String ClientId = request.getParameter("ClientId");
                    client = clientFacade.find(new Long(ClientId));
                    request.setAttribute("client", client);
                    request.getRequestDispatcher("/showClientInfo.jsp")
                            .forward(request, response);
                    break;
                    
                case "/showAddCountProduct":
                    listProducts = productFacade.findAll();
                request.setAttribute("listProducts", listProducts);
                request.getRequestDispatcher("/showAddCountProduct.jsp")
                    .forward(request, response);
                    
                    break;
                    
                    
                case "/AddCountProduct":
                String productId1 = request.getParameter("productId1");
                String count1 = request.getParameter("count1");
                product = productFacade.find(new Long(productId1));
                int quantityCheck1 = product.getQuantity();
                int count2 = Integer.parseInt(count1);
                int sum1 = quantityCheck1 + count2;
                product.setQuantity(sum1);
                productFacade.edit(product);
                request.setAttribute("info", "Кол-во товара обновлено");
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                
                    break;
                    
                case "/showAddMoneyToClient":
                    listClients = clientFacade.findAll();
                request.setAttribute("listClients", listClients);
                request.getRequestDispatcher("/showAddMoneyToClient.jsp")
                    .forward(request, response);
                    
                    break;
                    
                    
                case "/AddMoneyToClient":
                String clientId1 = request.getParameter("clientId1");
                String money1 = request.getParameter("money1");
                client = clientFacade.find(new Long(clientId1));
                int quantityCheck2 = client.getMoney();
                int count3 = Integer.parseInt(money1);
                int sum2 = quantityCheck2 + count3;
                client.setMoney(sum2);
                clientFacade.edit(client);
                request.setAttribute("info", "Кол-во енег обновлено");
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                
                    break;    
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
