/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alysson Cordeiro
 */
import java.io.*;

public class Leitura {

    static int lerInt;
    static String lerString;
    static Double lerDouble;

    public static String lerString() {
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader obj = new BufferedReader(isr);
    	String aux = "";
    	try {
    		aux = obj.readLine();
    	} catch(IOException e) {
    		System.out.println("Deu erro!!!");
    	}
    	return aux;
    }

    public static int lerInt() {
     	return Integer.parseInt(lerString());
    }
    
    public static double lerDouble() {
        return Double.parseDouble(lerString());
    }

}
