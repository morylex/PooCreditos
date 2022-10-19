/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import entidades.SunatPlameTipoDocumentoid;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class SunatPlameTipoDocumentoidFacade extends AbstractFacade<SunatPlameTipoDocumentoid> implements SunatPlameTipoDocumentoidFacadeLocal {

    @PersistenceContext(unitName = "ConfigPersistence")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SunatPlameTipoDocumentoidFacade() {
        super(SunatPlameTipoDocumentoid.class);
    }
    
}
