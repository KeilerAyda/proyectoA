/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Clientepormascota;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USUARIO
 */
public interface IMascotaporcliente {

    public abstract boolean guardarMascotaporcliente(Clientepormascota mascotaporcliente);
    public abstract ArrayList<Clientepormascota> listarMascotaporcliente();
    public abstract boolean actualizarMascotaporcliente(Clientepormascota mascotaporcliente);
    public abstract boolean eliminarMascotaporcliente(Clientepormascota mascotaporcliente);
    

}
