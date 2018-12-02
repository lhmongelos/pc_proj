/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author PCDOMILHAO
 */
public class Evidencia {
    
    private int idEvidencia;
    
    private String tipo;

    private String envolvimento;

    private String providencia;

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the envolvimento
     */
    public String getEnvolvimento() {
        return envolvimento;
    }

    /**
     * @param envolvimento the envolvimento to set
     */
    public void setEnvolvimento(String envolvimento) {
        this.envolvimento = envolvimento;
    }

    /**
     * @return the providencia
     */
    public String getProvidencia() {
        return providencia;
    }

    /**
     * @param providencia the providencia to set
     */
    public void setProvidencia(String providencia) {
        this.providencia = providencia;
    }

    /**
     * @return the idEvidencia
     */
    public int getIdEvidencia() {
        return idEvidencia;
    }

    /**
     * @param idEvidencia the idEvidencia to set
     */
    public void setIdEvidencia(int idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

}
