package controller;

import entity.Client;
import entity.Product;
import java.io.IOException;
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
})
public class Controller extends HttpServlet {

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
        product.setName("Колбоса");
        product.setQuantity(10);
        product.setPrice(2);
        request.setAttribute("product", product); // Создание переменной book в контексте обработки jsp
        request.getRequestDispatcher("/index.jsp")
                .forward(request, response); // Формирование ответа браузеру
        break;
        
            case "/client": 
        Client client = new Client(); //Инициация объекта книги
        client.setId(2);
        client.setName("Дмитрий");
        client.setSurname("Иванов");
        client.setMoney(200);
        client.setPhone(3724290);
        request.setAttribute("client", client); // Создание переменной book в контексте обработки jsp
        request.getRequestDispatcher("/index.jsp")
                .forward(request, response); // Формирование ответа браузеру
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