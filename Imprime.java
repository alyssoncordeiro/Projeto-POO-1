/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alysson Cordeiro
 */
public class Imprime {
    public static void main(String args[]) {
        
        //criar as observacoes que o professor pediu;
        Endereco ende = Endereco.criar();
        Modalidade mod = Modalidade.criar();
        
        System.out.println(ende);
        System.out.println(mod);
    }
}
