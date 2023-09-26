/*
 
 */
package com.mycompany.simuladorbodega;
import java.util.Scanner;



public class login {
    String user = "generic name";       
    int password;
    /*
 Consideré al usuario como un dato ya dado por el sistema...
 La contraseña será la forma por la cual se valida si es un trabajador o no.
 La contraseña será el mismo para todo operario. (1234)
 */
   
    public void mostrar(){   /* Este método le pide al usuario ingresar la contraseña
        por consola, y verifica si es correcta o no.
 
 */
        System.out.println("------------------Ingreso-----------------");   
        System.out.println("Es necesario digitar contraseña:");
        
        System.out.println("usuario:  "+ user);
        
        
        Scanner teclado = new Scanner(System.in);
        int clave = teclado.nextInt();
        System.out.println("contraseña:  "+ clave);
        if(clave == 1234){
            System.out.println("Ingreso exitoso");
        
        
        } 
        else{
            System.out.println("Intente de nuevo");
        
        }
                
                
        }
      
    
    }
    

