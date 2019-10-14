/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectCombinar;

import java.util.Scanner;

//Realizar un algoritmo que lea una secuencia de 10 números como máximo y 
//los almacene en una estructura de tipo vector. El algoritmo debe devolver 
//el vector inverso.
//
//Ejemplo:
//V = { 8, 4, 2, 6, 0, 1, 7, 6, 6, 5 }
//Inverso:
//VI= { 5, 6, 6, 7, 1, 0, 6, 2, 4, 8 }


/**
 *
 * @author Felix Castro
 */
public class vectCombinar {
    public static void main(String[] args) {
        //por teclado y consola
        Scanner entrada = new Scanner(System.in);
        
        //definicion de variables, vectores
        int [] a;
        int [] b;
        int numElem;
        
        System.out.println("COMBINACION DE DOS VECTORES");
        System.out.println("------------------------------");
        
        //ingresamos cuantos numeros se van a guardar
        //el vector a y el vector b tendran el mismo numero de elementos
        System.out.println("Ingrese cuantos numeros nesecita guardar");
        numElem = entrada.nextInt();
                        
        //damos tamaño a los vectores
        a = new int[numElem];
        b = new int[numElem];
        
        System.out.println("------------------------------");
        
        //llenamos el vector a
        System.out.println("Llenado del vector a");
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+".Ingrese un numero");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("------------------------------");
        
        //imprimimos el vector a
        System.out.println("El vector a es");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        //pasamos el vector a al b
        //i para a
        //j para b
        int j = 0;
        for (int i = 0; i < numElem; i++) {
            b[j] = a[i];
            j++;
        }       
                
        System.out.println("------------------------------");
        
        //imprimimos el vector b
        for (int i = 0; i < numElem; i++) {
            System.out.println(b[numElem - i - 1]);
        }
        
        System.out.println();
    }
}
