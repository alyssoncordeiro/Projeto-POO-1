/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alysson Cordeiro
 */
public class Endereco {
    private int enderecoId;
    private String rua;
    private int numero;	
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(int enderecoId, String rua, int numero, String cep, String cidade, String estado) {
        this.enderecoId = enderecoId;
    	this.rua = rua;
    	this.numero = numero;
    	this.cep = cep;
    	this.cidade = cidade;
    	this.estado = estado;
    }
    
//gets e sets
    //-----------
    public int getenderecoId() {
        return this.enderecoId;
    }
    public void setenderecoId(int enderecoId) {
        this.enderecoId = enderecoId;
    }
    //-----------
    public String getrua() {
        return this.rua;
    }
    public void setrua(String rua) {
        this.rua = rua;
    }
    //----------
    public int getnumero(){
        return this.numero;
    }
    public void setnumero(int numero) {
        this.numero = numero;
    }
    //----------
    public String getcep(){
        return this.cep;
    }
    public void setcep(String cep) {
        this.cep = cep;
    }
    //---------
    public String getcidade() {
        return this.cidade;
    }
    public void setcidade(String cidade){
        this.cidade = cidade;
    }
    //---------
    public String getestado() {
        return this.estado;
    }
    public void setestado(String estado) {
        this.estado = estado;
    }
	
//Métodos
    public String toString() {
        return this.enderecoId + "\n" + this.rua + "\n" + this.numero + "\n" + this.cep + "\n" + this.cidade + "\n" + this.estado;
	}
	
    public static Endereco criar() {
        int idEnd,num;
        String rua, cep, cid, est; 		
    	
        System.out.println("Qual o id de seu endereco: ");
        idEnd = Leitura.lerInt();
    	
        System.out.println("Informe o nome da sua rua: ");
        rua = Leitura.lerString();
    		
        System.out.println("Informe o numero da sua casa: ");
        num = Leitura.lerInt();
    	
        System.out.println("Informe seu CEP: ");
        cep = Leitura.lerString();
    	
        System.out.println("Informe a Cidade: ");
        cid = Leitura.lerString();
    	
        System.out.println("Informe o estado: ");
        est = Leitura.lerString();
            
        Endereco ende = new Endereco(idEnd, rua, num, cep, cid, est);
        return ende;
    }
    
    public static Endereco pesquisarEndereco(Endereco endereco[], int id) {
        for(Endereco aendereco : endereco) {
            if(aendereco.getenderecoId() == id) {
                return aendereco;
            }
        }
        return null;
    }

}