/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Mandato;
import Entidades.Ocorrencia;
import Entidades.ConnectDB;
import Entidades.Evidencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author PCDOMILHAO
 */
public class GerBD {
    
    ConnectDB banco = new ConnectDB();
    
    public ArrayList<Ocorrencia> QueryTodasOcorrencias() throws SQLException{
        ResultSet res = null;
        ArrayList<Ocorrencia> oc = new ArrayList<>();
        
        try{
            banco.init();
            res = banco.getStatement().executeQuery("select * from Ocorrencia;");
        }
        
        catch(SQLException erro){
            erro.printStackTrace();
        }
        
        if(res != null){
            
            while(res.next()){
                Ocorrencia atual = new Ocorrencia();
                atual.setLocalDoCrime(res.getString(1));
                atual.setData(res.getString(2));
                atual.setHorario(res.getString(3));
                atual.setIdOcorrencia(res.getInt(4));
                oc.add(atual);
            }             
        }
        
        return oc;
    }
    
    public ArrayList<Evidencia> QueryEvidencias(int chave) throws SQLException{
        ResultSet res = null;
        ArrayList<Evidencia> ev = new ArrayList<>();
        
        try{
            banco.init();
            if(chave == 0)
                res = banco.getStatement().executeQuery("select * from Evidencia;");
            else{
                
                
                ResultSet aux = null;
                
                aux = banco.getStatement().executeQuery("select * from Ocorrencia_Evidencia where idOcorrencia =" + chave + ";");
                
                ArrayList<Integer> listaIdEvidencia = new ArrayList<>();
                if(aux != null){
                    while(aux.next()){
                        listaIdEvidencia.add(aux.getInt(2));
                    }
                }
                
                String query = "select * from Evidencia where idEvidencia in (";
                
                int j = 0;
                for(Integer i: listaIdEvidencia){
                    if(j != listaIdEvidencia.size() - 1)
                        query += i + ", ";
                    else
                        query += i;
                    j++;
                }
                
                query += ");";
                
                System.out.println(query);
                
                res = banco.getStatement().executeQuery(query);
                
            }
        }
        
        catch(SQLException erro){
            erro.printStackTrace();
        }
        
        if(res != null){
            
            while(res.next()){
                Evidencia atual = new Evidencia();
                atual.setIdEvidencia(res.getInt(1));
                atual.setTipo(res.getString(2));
                atual.setEnvolvimento(res.getString(3));
                atual.setProvidencia(res.getString(4));
                ev.add(atual);
            }             
        }
        
        return ev;
    }
    
    public void gerenciarOcorrencia(int idOcorrencia, Ocorrencia novasInformacoes) throws SQLException{
        
        
        try{
            banco.init();
            banco.getStatement().executeUpdate("update Ocorrencia set localDoCrime = \"" + novasInformacoes.getLocalDoCrime() + 
                    "\", data = \"" + novasInformacoes.getData() + "\", horario = \"" + novasInformacoes.getHorario() + 
                    "\" where idOcorrencia = " + novasInformacoes.getIdOcorrencia() + ";");
        }
        catch(SQLException erro){
            erro.printStackTrace();
        }
    }

    public Mandato expedirMandato(int idOcorrencia) throws SQLException{
	return null;
    }

    public void adicionarEvidencia(int idOcorrencia, Evidencia ev) throws SQLException{
        
        
        try{
            banco.init();
            banco.getStatement().executeUpdate("Insert into Evidencia Values (" + ev.getIdEvidencia() + ", '" + ev.getTipo() + "', '" 
                    + ev.getEnvolvimento() + "', '" + ev.getProvidencia() + "');");
            
            
            banco.getStatement().executeUpdate("Insert into Ocorrencia_Evidencia Values (" + idOcorrencia + ", " + ev.getIdEvidencia() + ");");
            
            
        }
        catch(SQLException erro){
            erro.printStackTrace();
        }
        
    }
    
    public Boolean autentica(String username, String password) throws SQLException{
        
        String senha = "";
        ResultSet res = null;
        
        try{
            banco.init();
            res = banco.getStatement().executeQuery("select * from Usuario where username =\"" + username + "\";");
        }
        
        catch(SQLException erro){
            erro.printStackTrace();
        }
        
        if(res != null){
            while(res.next()){
                senha = res.getString(4);
                //System.out.println(senha);
            }
        }
        
        return (senha == null ? password == null : senha.equals(password));
    }
}
