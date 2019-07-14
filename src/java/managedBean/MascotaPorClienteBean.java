/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import dao.ClienteDao;
import dao.MascotaDao;
import dao.MascotaporclienteDao;
import entidades.Cliente;
import entidades.Clientepormascota;
import entidades.ClientepormascotaId;
import entidades.Mascota;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.hibernate.HibernateException;

/**
 *
 * @author USUARIO
 */
@ManagedBean
@ViewScoped
public class MascotaPorClienteBean {

    private ArrayList listaclientes;
    private int idCliente;

    private ArrayList listamascotas;
    private int idMascota;

    private Clientepormascota clientepormascota;
    private ClientepormascotaId clientepormascotaId;

    public MascotaPorClienteBean() {
        listaclientes = new ArrayList();
        clientepormascota = new Clientepormascota();
        clientepormascotaId = new ClientepormascotaId();
        listarCombos();
    }

    public void listarCombos() {
        ClienteDao clienteDao = new ClienteDao();
        MascotaDao mascotadao = new MascotaDao();
        listaclientes = clienteDao.listarCliente();
        listamascotas = mascotadao.listarMascotas();

    }

    public String guardar() {

        MascotaporclienteDao Dao = new MascotaporclienteDao();
        clientepormascotaId.setClienteIdCliente(idCliente);
        clientepormascotaId.setMascotaIdMascota(idMascota);
        clientepormascota.setId(clientepormascotaId);
        Dao.guardarMascotaporcliente(clientepormascota);

        return "/RegistroMascotaPorCliente";
    }

    public ArrayList getListaclientes() {
        return listaclientes;
    }

    public void setListaclientes(ArrayList listaclientes) {
        this.listaclientes = listaclientes;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList getListamascotas() {
        return listamascotas;
    }

    public void setListamascotas(ArrayList listamascotas) {
        this.listamascotas = listamascotas;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public Clientepormascota getClientepormascota() {
        return clientepormascota;
    }

    public void setClientepormascota(Clientepormascota clientepormascota) {
        this.clientepormascota = clientepormascota;
    }


}
