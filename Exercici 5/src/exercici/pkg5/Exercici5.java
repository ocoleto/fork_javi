/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici.pkg5;

/**
 *
 * @author Oscar
 */
public class Exercici5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int conte[]= {30, 40, 50,60, 32, 56, 100, 3};
        int i=0;
        int j=0;
        int mesura = conte.length;
        int aux=0;
        int suma=0;
        int menor=0;
        
        for (i=0; i<mesura; i++){
            suma = suma + conte[i];
           if(aux<conte[i]){
                aux=conte[i];
           }else{
               menor=conte[i];
           }
        }
        
        System.out.println("La suma total es "+suma+" y el numero més gran es "+aux+" El menor es es "+menor);
        
                
    }
}
