/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;


import dao.JugueteDao;
import entidades.Juguete;


import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.hibernate.HibernateException;

/**
 *
 * @author USUARIO
 */
@ManagedBean
@ViewScoped
public class JugueteBean implements Serializable {

    private Juguete juguete;
    private boolean banderaSelect=false;

     public JugueteBean() {
        this.juguete = new Juguete();

    }

    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    public boolean isBanderaSelect() {
        return banderaSelect;
    }

    public void setBanderaSelect(boolean banderaSelect) {
        this.banderaSelect = banderaSelect;
    }
    
    
   
    

  
    public String guardarJuguete() {
        try {

            JugueteDao jugueteDao = new JugueteDao();
            boolean respuesta = jugueteDao.guardarJuguete(juguete);
            System.out.println("re"+respuesta);
            if (respuesta) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se regidtro correctamente"));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se puedo registrar"));
            }
        } catch (HibernateException e) {
            ///transation.rollback();  -- regresa a la anterior
            System.out.println("Error::: " + e);
        }
        return "/RegistroJuguete";
    }

    public String actualizarJuguete() {
        try {
            JugueteDao jugueteDao = new JugueteDao();
            boolean respuesta = jugueteDao.actualizarJuguete(juguete);
            if (respuesta) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se actualizo correctamente"));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se puedo actualizar"));
            }
        } catch (HibernateException e) {
            ///transation.rollback();  -- regresa a la anterior
            System.out.println("Error::: " + e);
        }
        return "/RegistroJuguete";

    }

    public ArrayList<Juguete> listarJuguete() {
        ArrayList<Juguete> lista = new ArrayList<>();
        JugueteDao jugueteDao = new JugueteDao();
        lista = jugueteDao.listarJuguete();
        return lista;
    }

    public String eliminar() {
        JugueteDao jugueteDao = new JugueteDao();
        boolean respuesta = jugueteDao.eliminarJuguete(juguete);
        if (respuesta) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se elimino correctamente"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se puedo eliminar"));
        }
        return "/RegistroJuguete";
    }

  

}
