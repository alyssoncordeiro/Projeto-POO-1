import java.util.Calendar;

/**
 * @(#)Matricula.java
 *
 *
 * @author Alysson de Almeida Cordeiro
 * @version 1.00 2017/11/5
 */


public class Matricula {
	private int matriculaId;
	private Modalidade modalidade;
	private Calendar dataInicio;
	private Calendar dataTermino;
	
    public Matricula(int mat, Calendar datI, Calendar daT) {
    	this.matriculaId = mat;
    	this.dataInicio = datI;
    	this.dataTermino = daT;
    }
    
    public int getMatriculaId() {
    	return this.matriculaId;
    }
    
    public void setMatriculaId(int matriculaId) {
    	this.matriculaId = matriculaId;
    }
    
    public Calendar getDataInicio() {
    	return this.dataInicio;
    }
    
    public void setDataInicio(Calendar dataInicio) {
    	this.dataInicio = dataInicio;
    }
    
    public Calendar getDataTermino() {
    	return this.dataTermino;
    }
    
    public void setDataTermino(Calendar dataTermino) {
    	this.dataTermino = dataTermino;
    }
    
    public String toString() {
    	return this.matriculaId + " | " + this.dataInicio + " | " + this.dataTermino + " | ";
    } 
}