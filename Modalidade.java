/**
 * @(#)Text2.java
 *
 *
 * @author 
 * @version 1.00 2017/11/5
 */

public class Modalidade {
    private int modalidadeId;
    private String nome;
    private double preco;
    private int frequenciaSemanal;
	
    public Modalidade(int mod, String n, double p, int freq) {
        this.modalidadeId = mod;
    	this.nome = n;
    	this.preco = p;
    	this.frequenciaSemanal = freq;
    }
    
    public int getModalidadeId() {
    	return this.modalidadeId;
    }
    
    public void setModalidadeId(int modalidadeId) {
    	this.modalidadeId = modalidadeId;
    }
    
    public String getNome() {
    	return this.nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public double getPreco() {
    	return this.preco;
    }
    
    public void setPreco(double preco) {
    	this.preco = preco;
    }
    
    public int getFrequenciaSemanal() {
    	return this.frequenciaSemanal;
    }
    
    public void setFrequenciaSemanal(int frequenciaSemanal) {
    	this.frequenciaSemanal = frequenciaSemanal;
    }
    
    public String toString() {
        return this.modalidadeId + " | " + this.nome + " | " + this.preco + " | " + this.frequenciaSemanal + " | ";
    }
    
    public static Modalidade criar() {
        int idMod, freqSem;
        String nome;
        double preco;
        
        System.out.println("Informe o ID da modalidade: ");
        idMod = Leitura.lerInt();
        
        System.out.println("Informe o nome da Modalidade: ");
        nome = Leitura.lerString();
        
        System.out.println("Informe o preco da modalidade: ");
        preco = Leitura.lerDouble();
        
        System.out.println("Informe a frequencia semanal: ");
        freqSem = Leitura.lerInt();
        
        Modalidade mod = new Modalidade(idMod, nome, preco, freqSem);
        return mod;
    }
    
    public static Modalidade pesquisarModalidade(Modalidade modalidade[], int id) {
        for(Modalidade amodalidade : modalidade) {
            if(amodalidade.getModalidadeId() == id) {
                return amodalidade;
            }
        }
        return null;
    }
}