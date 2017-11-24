package Alysson;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alysson Cordeiro
 * Daniel Medeiros da proenca
 * Gabriel dos Santos Souza
 */
public class Utilitarios {
    float custB = 0;
    float custD = 0;
    float custA = 0;
    float custN = 0;
    public static float custobasico(float custB) {
        return custB += 100.0;
    }
    public static float custoDependente(float custD) {
        return custD += 40.0;
    }
    
    public static float custoAcademia(float custA) {
        return custA += 90.0;
    }
    
    public static float custoNatacao(float custN) {
        return custN += 60.0;
    }
    }
