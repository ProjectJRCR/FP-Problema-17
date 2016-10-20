/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema17;
import java.util.*;
/**
 * Este programa calcula el maximo comun divisor de dos números
 * @author JorgeRicardo
 */
public class Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //num1 y num2 son los números que diste y div es el maximo comun divisor
    int num1,num2,div;
    num1=pedirNum("Escribe un número ");
    num2=pedirNum("Escribe otro número:");
    div=calcular(num1,num2);
    mostrarResultado(num1,num2,div);
    }
    public static int pedirNum(String num){
    int n; //aqui pido los dos numeros
    Scanner teclado=new Scanner(System.in);
    System.out.println(num);
    n=teclado.nextInt();
    return n;
    }
    public static int calcular(int a,int b){
        
        int c=0,m;
        m=a;
        if(m>b)//aqui checo cual de los dos números es el mas pequeño
            m=b;
        for (int i=1;i<=m;i++){/*se sale cuando es mayor que el numero 
            mas pequeño de los dos*/
           //i es el divisor entre el que divido a y b
            if (a%i==0&&b%i==0)
                c=i;//
        }
        return c;
   }
    
    public static void mostrarResultado(int a,int b,int c){//mostrar resultado
        System.out.println("el maximo comundivisor de "+a+" y "+b+" es "+c);
    }
}
