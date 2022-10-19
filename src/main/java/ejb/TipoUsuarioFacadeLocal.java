/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejb;

import entidades.TipoUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface TipoUsuarioFacadeLocal {

    void create(TipoUsuario tipoUsuario);

    void edit(TipoUsuario tipoUsuario);

    void remove(TipoUsuario tipoUsuario);

    TipoUsuario find(Object id);

    List<TipoUsuario> findAll();

    List<TipoUsuario> findRange(int[] range);

    int count();
    
}
