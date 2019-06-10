 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.History;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class HistoryFacade extends AbstractFacade<History> {

    @PersistenceContext(unitName = "WebShop2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistoryFacade() {
        super(History.class);
    }
    public List<History> findTakeProducts() {
        try {
            return em.createQuery(
                    "SELECT history FROM History history WHERE history.endDate=NULL")
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }
    
}