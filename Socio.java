
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alysson Cordeiro
 */
public class Socio {
	private int socioId;
	private String cpf;
	private String nome;
	//private Endereco endereco;
	private Calendar dataNasc;
	//private Matricula matriculas;
	
	// os 2 privates eu nao entendi
	
    public Socio(int socio, String c, String n, Calendar dat) {
    	this.socioId = socio;
    	this.cpf = c;
    	this.nome = n;
    	this.dataNasc = dat;
    }
    
    public int getSocioId() {
    	return this.socioId;
    }
    
    public void setSocioId(int socioId) {
    	this.socioId = socioId;
    }
    
    public String getCpf() {
    	return this.cpf;
    }
    
    public void setCpf(String cpf) {
    	this.cpf = cpf;
    }
    
    public String getNome() {
    	return this.nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public Calendar getDataNasc() {
    	return this.dataNasc;
    }
    
    public void setDataNasc(Calendar dataNasc) {
    	this.dataNasc = dataNasc;
    }
    
    public String toString() {
    	return this.socioId + " | " + this.cpf + " | " + this.nome + " | " + this.dataNasc + " | ";
    }
    
    public static Socio criar(Endereco[] enderecos) {
            return null;
        
    }
}