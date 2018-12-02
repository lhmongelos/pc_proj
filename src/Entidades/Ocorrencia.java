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
public class Ocorrencia {
    private int idOcorrencia;
    
    private String localDoCrime;

    private String data;

    private String horario;

    private List<Cidadao> cidadão;

    private List<Evidencia> evidência;

    private Delegado delegado;

    private List<Usuario> usuário;

    /**
     * @return the localDoCrime
     */
    public String getLocalDoCrime() {
        return localDoCrime;
    }

    /**
     * @param localDoCrime the localDoCrime to set
     */
    public void setLocalDoCrime(String localDoCrime) {
        this.localDoCrime = localDoCrime;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the cidadão
     */
    public List<Cidadao> getCidadão() {
        return cidadão;
    }

    /**
     * @param cidadão the cidadão to set
     */
    public void setCidadão(List<Cidadao> cidadão) {
        this.cidadão = cidadão;
    }

    /**
     * @return the evidência
     */
    public List<Evidencia> getEvidência() {
        return evidência;
    }

    /**
     * @param evidência the evidência to set
     */
    public void setEvidência(List<Evidencia> evidência) {
        this.evidência = evidência;
    }

    /**
     * @return the delegado
     */
    public Delegado getDelegado() {
        return delegado;
    }

    /**
     * @param delegado the delegado to set
     */
    public void setDelegado(Delegado delegado) {
        this.delegado = delegado;
    }

    /**
     * @return the usuário
     */
    public List<Usuario> getUsuário() {
        return usuário;
    }

    /**
     * @param usuário the usuário to set
     */
    public void setUsuário(List<Usuario> usuário) {
        this.usuário = usuário;
    }

    /**
     * @return the idOcorrencia
     */
    public int getIdOcorrencia() {
        return idOcorrencia;
    }

    /**
     * @param idOcorrencia the idOcorrencia to set
     */
    public void setIdOcorrencia(int idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }
}
