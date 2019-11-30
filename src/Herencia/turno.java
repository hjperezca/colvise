/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Heiner Perez
 */
public class turno extends Persona{
    public String id_turno;
    public String diurno;
    public String nocturno;

    public String getId_turno() {
        return id_turno;
    }

    public void setId_turno(String id_turno) {
        this.id_turno = id_turno;
    }

    public String getDiurno() {
        return diurno;
    }

    public void setDiurno(String diurno) {
        this.diurno = diurno;
    }

    public String getNocturno() {
        return nocturno;
    }

    public void setNocturno(String nocturno) {
        this.nocturno = nocturno;
    }
    
}
