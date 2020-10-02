/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas4;

import java.util.Scanner;

/**
 *
 * @author Ana Karen
 */
public class Pilas4 {

    /**
     * @param args the command line arguments
     */
    
    char pilaABC[] = new char [26];
    int tope = 0;
   
    /*Se crea la clase para llenar la pila*/
    public void llenarpila(){
        char letra = 'A';
        for (int i=0; i<26; i++){
            pilaABC[tope]=letra;
            tope++; 
            letra++;
        }
        
    }
   
    public void mostraspila(){
        int k= 0;
        for (int i=tope-1; i>=0; i--){
            System.out.print(" "+pilaABC[k]);
            k++;
        }
    }
     public void desornerarpila(){
      int i=0, cantidad = 26;
        int j=0, k=0;
        int arreglo[] = new int [cantidad];
        arreglo[i]= (int)(Math.random() * 26);
        for(i=0; i<cantidad; i++){
            arreglo[i]= (int) (Math.random() * 26);
            for(j=0; j<i; j++){
                if(arreglo[i]==arreglo[j]){
                    i--;
                }
            }
        }
        for(k=0; k<cantidad; k++){
            int numeroaleatorio= arreglo[k];
            System.out.print(" "+pilaABC[numeroaleatorio]);
            
        }
    }
    public void eliminarpila(){
        tope--;
        System.out.println("dato eliminado");
    }
    public void agregarpila(){
        pilaABC[tope]='&';
        tope++;
        System.out.println("dato agregado");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Pilas4 p = new Pilas4();
        Scanner sc = new Scanner(System.in);
        int opt;
        do{
            System.out.println("\n1 llenar\n"
            + "2 mostrar\n"
            + "3 eliminar\n"
            + "4 agregar\n"
            + "5 ordenar\n"
            + "6 salir");
            switch(opt=sc.nextInt()){
                case 1:
                    p.llenarpila();
                    break;
                case 2:
                    p.desornerarpila();
                    break;
                case 3:
                    p.eliminarpila();
                    break;
                case 4:
                    p.agregarpila();
                    break;
                case 5:
                    p.mostraspila();
                    break;
            }
        } while(opt !=6);
    }
    
    
}
