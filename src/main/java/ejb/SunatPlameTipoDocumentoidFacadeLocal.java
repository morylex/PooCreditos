/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejb;

import entidades.SunatPlameTipoDocumentoid;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface SunatPlameTipoDocumentoidFacadeLocal {

    void create(SunatPlameTipoDocumentoid sunatPlameTipoDocumentoid);

    void edit(SunatPlameTipoDocumentoid sunatPlameTipoDocumentoid);

    void remove(SunatPlameTipoDocumentoid sunatPlameTipoDocumentoid);

    SunatPlameTipoDocumentoid find(Object id);

    List<SunatPlameTipoDocumentoid> findAll();

    List<SunatPlameTipoDocumentoid> findRange(int[] range);

    int count();
    
}
