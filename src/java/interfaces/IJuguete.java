/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Juguete;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public interface IJuguete {
     public abstract boolean guardarJuguete(Juguete juguete);
    public abstract ArrayList<Juguete> listarJuguete();
    public abstract boolean actualizarJuguete(Juguete juguete);
    public abstract boolean eliminarJuguete(Juguete juguete);
    
}
