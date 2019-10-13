/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectCombinar;

import java.util.Scanner;

//Leer por teclado dos vectores de 10 numeros enteros cada uno
//combinar los dos vectores en un tercer vector de la 
//forma 1 de a , 1 de b, 2 de a, 2 de b

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
        int [] c;
        
        System.out.println("COMBINACION DE DOS VECTORES");
        System.out.println("------------------------------");
        
        //ingresamos cuantos numeros se van a guardar
        //el vector a y el vector b tendran el mismo numero de elementos
        System.out.println("Ingrese cuantos numeros nesecita guardar");
        numElem = entrada.nextInt();
                        
        //damos tamaño a los vectores
        a = new int[numElem];
        b = new int[numElem];
        c = new int[numElem*2];
        
        System.out.println("------------------------------");
        
        //llenamos el vector a
        System.out.println("Llenado del vector a");
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+".Ingrese un numero");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("------------------------------");
        
        //llenamos el vector b
        System.out.println("Llenado del vector b");
        for (int i = 0; i < b.length; i++) {
            System.out.println((i+1)+".Ingrese un numero");
            b[i] = entrada.nextInt();
        }
        
        System.out.println("------------------------------");
        
        //imprimimos el vector a
        System.out.println("El vector a es");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        System.out.println("------------------------------");
        
        //imprimimos el vector b
        System.out.print("El vector b es");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        
        //combinamos el vector a y b en el vector c
        //i para a y b
        //j para c
        int j = 0;
        for (int i = 0; i < 5; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }       
                
        System.out.println("------------------------------");
        
        //imprimimos el vector c
        System.out.println("El vector c es:");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        
        System.out.println();
    }
}
