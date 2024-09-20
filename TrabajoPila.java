/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopila;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author German
 */
public class TrabajoPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        *Menu de opciones
        1. llenar Pila
        2. Listar Pila
        3. Verficar pila vacia
        4. Agregar un elementoa a la pila
        */
        //definición de variables
        
        int opcion;
        int elemento;
        boolean salir=true;
        //llamar a la función de ingreso de datos por telado
        Scanner leer=new Scanner(System.in);
        //====================================
        //espacio es para agregar la clase PILA
        
        //==============================
        //imprimir menu
        
        while(salir){
            System.out.println("****Menu de opciones****");
            System.out.println("1. LLenar Pla");
            System.out.println("2. Listar Pila");
            System.out.println("3. Verificar pila vacia");
            System.out.println("10. Salir");
            
            try{
                System.out.print("Ingrese opcion: ");
                opcion=leer.nextInt();
                
                //estructura de control segun ingreso de usuario
                 switch(opcion){
                     case 1:
                         
                      break;
                      
                      default:
                          System.out.println("==================");
                          System.out.println("La opcion ingresada es incorrecta, por favor ingrese nuevamente");
                          System.out.println("==================");
                      break;
                 }
                
            }catch(InputMismatchException e ){
                //validar que solo ingrese numeros
                System.out.println("Error, debe ingresar solo numero");
                leer.next();
            }
        }
        
    }
    
}
