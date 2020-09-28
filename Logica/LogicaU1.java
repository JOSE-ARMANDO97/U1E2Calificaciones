package Logia;

import java.util.InputMismatchException;
import java.util.Scanner;
public class LogicaU1 {
    private double promedio;
  

   String[] nombre={
       "ACEVEDO CAMPOS ARIAGNA",
       "AMBROCIO PEREZ MICHAEL HAZIEL",
       "AMBROSIO HERNANDEZ VIANEY CELERINA",
       "CAMPOS CASASANERO JUAN PABLO",
       "DIAZ DE JESUS MARIANA DAZZLING",
       "DIAZ ROSAS ALEXIS EFREN",
       "DOMINGUEZ CAZALES JENNIFER IRLANDA",
       "ELIGIO RAMOS MONSERRAT",
       "FLORES MALDONADO LILIANA",
       "GOMEZ ARAGON EDGAR OMAR",
       "GUTIERREZ VALLE SAMARA",
       "JUAREZ RAMOS ALEXIS MANUEL",
       "LEYVA SILVA ROGELIO JESUS",
       "MARTINEZ DE LOS SANTOS ISABEL",
       "MARTINEZ RAYO IRIS MADAI"};
 
  
    Scanner lectura = new Scanner(System.in);
      
      
 
 int No_control[]={
     18680056,
     19680091,
     19680092,
     19680113,
     19680133,
     17680136,
     18680108,
     19680957,
     19680144,
     19690156,
     19680162,
     19680958,
     19680177,
     18680163,
     18680165};
     
    double Calificacion[] =new double[nombre.length];
  
    public void PedirCalificacion(){
        
    for(int i=0; i<Calificacion.length; i++){
        try{
      do{
               System.out.print("INGRESE CALIFICACION FINAL"+"["+(i+1)+"] NUMERO DE CONTROL:"+No_control[i]
                       + " "+"NOMBRE:" + nombre[i] + " "+"=");
               
               Calificacion[i]=lectura.nextDouble();
               System.out.println();
                   
      }while(Calificacion[i]<=0||Calificacion[i]>=100);
     }catch(InputMismatchException a){
      System.out.println("VERIFIQUE DE NUEVO PORFABOR"+a.getMessage());
        }
    }
  }
  
public  double promedioClase (){
 double aux = 0;
    
    for( int i=0;i<Calificacion.length;i++){
      aux+=Calificacion[i];
    }
    promedio=aux/Calificacion.length;
   return promedio;
 }
public double promedPrimero(){
    double aux=0;
for( int i=0;i<5;i++){
     System.out.print("CALIFICACION FINAL"+"["+(i+1)+"] NUMERO DE CONTROL:"+No_control[i]
        + " "+"NOMBRE:" + nombre[i] + " "+"="+Calificacion[i]);
        System.out.println();
      aux+=Calificacion[i];
      promedio=aux/5;
    }
 
   return promedio;
 
 }
public double promedUltimos(){
 double aux=0;
for( int i=Calificacion.length-1;i>=10 ;i--){
      System.out.print("CALIFICACION FINAL"+"["+(i+1)+"] NUMERO DE CONTROL:"+No_control[i]
        + " "+"NOMBRE:" + nombre[i] + " "+"="+Calificacion[i]);
        aux+=Calificacion[i];
        System.out.println();      
    }
promedio=aux/5;
return promedio;
  }
}
