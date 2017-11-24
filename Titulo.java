/**
 * @(#)Text3.java
 *
 *
 * @author Alysson de Almeida Cordeiro
 * @version 1.00 2017/11/1
 */


public class Titulo {
	private int socioId;
	private Socio titular;
        private Mensalidade mensalidades[];
	
    public Titulo(int soc) {
    	this.socioId = soc;
    }
    
    public int getSocioId() {
    	return this.socioId;
    }
    
    public void setSocioId(int socioId) {
    	this.socioId = socioId;
    }
    
    public String toString() {
    	return this.socioId + "\n";
    }
    
    public static Titulo criar(Endereco endereco[]) {
        return ;
    }
    
    public static Titulo pesquisarTitulo(int id, Titulo titulo[]) {
        return ;
    }
    
    public Mensalidade calcularMesalidade() {
        return ;
    }
    
    public boolean pagarMensalidade(int mes) {
        return true/false;
    }
}