
package test;

import java.util.Scanner;

/*En funcion de una nota decir si es supenso de o a 5, aprobado de 5 a 6 , 
de 6 a 7 bien, notable 7 a 9, sobresaliente 9 y 10 por datos en teclado*/
public class NotasAlumnos {
         
      public static void main(String[] args) {
           
            Scanner entrada = new Scanner(System.in);  
                  
            System.out.println("Ejercicios de notas\n");
            
            //solicitamos al profesor la nota por teclado
            System.out.println("Por favor introduce la nota del alumno");           
            //al declarar hay que poner nextFloat          
            float notaAlumno=0;
            notaAlumno = entrada.nextFloat();
           
            //comprobamos la calificacion de la nota introducida
            if (notaAlumno >= 0 && notaAlumno <5 ){            
                System.out.println("El alumno ha suspendido");

            }else if (notaAlumno >= 5 && notaAlumno <6 ){
                System.out.println("El alumno ha aprobado");

            }else if(notaAlumno >= 6 && notaAlumno <7){
                  System.out.println("El alumno ha sacado un bien");
                  
            }else if(notaAlumno >= 7 && notaAlumno <9){
                 System.out.println("El alumno ha sacado un notable");
                 
            }else if (notaAlumno >=  9 && notaAlumno <=10){
                System.out.println("El alumno a sacado un sobresaliente");  
                
            }else if (notaAlumno <  0 || notaAlumno  > 10){
                System.out.println("La nota "+ notaAlumno+ "no es válida");         
        }       
    }
}
       
       

