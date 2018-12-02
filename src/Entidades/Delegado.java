/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *
 * @author PCDOMILHAO
 */
public class Delegado extends Usuario {

	private String categoria;

	private List<Mandato> mandado;

	private List<Delegacia> delegacia;

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the mandado
     */
    public List<Mandato> getMandado() {
        return mandado;
    }

    /**
     * @param mandado the mandado to set
     */
    public void setMandado(List<Mandato> mandado) {
        this.mandado = mandado;
    }

    /**
     * @return the delegacia
     */
    public List<Delegacia> getDelegacia() {
        return delegacia;
    }

    /**
     * @param delegacia the delegacia to set
     */
    public void setDelegacia(List<Delegacia> delegacia) {
        this.delegacia = delegacia;
    }

}
