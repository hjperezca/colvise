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
public class secretaria extends Persona {
    public String cor;
    public String contra;
    public String usua;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUsua() {
        return usua;
    }

    public void setUsua(String usua) {
        this.usua = usua;
    }

    @Override
    public String toString() {
        
        return "secretaria{" + "cor=" + cor + ", contra=" + contra + ", usua=" + usua + "',ape=" + apell+"',nom=" + nom+"',dir=" + dir+"',ide=" + ide+"',f_nac=" + f_nac+"',tel=" + tel+ '}';
        
    }
    
    
    
}
