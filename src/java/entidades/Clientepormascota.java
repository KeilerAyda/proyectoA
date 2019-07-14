package entidades;
// Generated 12/07/2019 10:27:26 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clientepormascota generated by hbm2java
 */
public class Clientepormascota  implements java.io.Serializable {


     private ClientepormascotaId id;
     private Cliente cliente;
     private Mascota mascota;
     private char estado;
     private Set atencions = new HashSet(0);

    public Clientepormascota() {
    }

	
    public Clientepormascota(ClientepormascotaId id, Cliente cliente, Mascota mascota, char estado) {
        this.id = id;
        this.cliente = cliente;
        this.mascota = mascota;
        this.estado = estado;
    }
    public Clientepormascota(ClientepormascotaId id, Cliente cliente, Mascota mascota, char estado, Set atencions) {
       this.id = id;
       this.cliente = cliente;
       this.mascota = mascota;
       this.estado = estado;
       this.atencions = atencions;
    }
   
    public ClientepormascotaId getId() {
        return this.id;
    }
    
    public void setId(ClientepormascotaId id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Mascota getMascota() {
        return this.mascota;
    }
    
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set getAtencions() {
        return this.atencions;
    }
    
    public void setAtencions(Set atencions) {
        this.atencions = atencions;
    }




}


