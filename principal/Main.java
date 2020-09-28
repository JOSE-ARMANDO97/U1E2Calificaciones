
package principal;

import Logia.LogicaU1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main extends LogicaU1  {
    public static void main(String args[]){
        Scanner lectura=new Scanner(System.in);
       String respuesta ;
       int op=0;
    LogicaU1 H =new LogicaU1();
   H.PedirCalificacion();
    do{
        try{
        System.out.println("==============BIENVENIDO AL MENU DE ACCIONES=================="+"\n"
                  
                  + "PROMEDIO DE CLASE INGRESE 1"+"\n"
                  
                  + "PROMEDIO DE LOS PRIMEROS 5 ALUMNOS  INGRESE 2"+"\n"
                  
                  + "PROMEDIO DE LOS 5 ULTIMOS ALUMNOS INGRESE 3 "+"\n"
                
                  + " SALIR INGRES 4");
         op=lectura.nextInt();
       
        }catch(InputMismatchException a){
            
            System.out.println("\nOPCION NO VALIDA FABOR DE VERIFICAR "+a.getMessage());
        
        }
 
        
          switch(op){
              case 1:
                  System.out.println("EL PROMEDIO DE LA CLASE ES:"+H.promedioClase());
                 break;
              case 2:
                 System.out.println("EL PROMEDIO DE LOS 5 PRIMEROS ES:"+H.promedPrimero());
                 break;
              case 3:
                  System.out.println("EL PROMEDIO DE LOD 5 ULTIOMOS ALUNOS ES:"+H.promedUltimos());
                  break;
              case 4:
                  System.out.println("INGRES NO PARA SALIR DEFINITIVAMENTE Y SI PARA CONTINUAR... ");
                 break;
           
          }System.out.println("QUIERES CONTINUAR INGRSE SI /NO");
              
           respuesta= lectura.next();
       
           respuesta=respuesta.toUpperCase();
          
    }while(!respuesta.equals("NO"));
    
    } 
   }
