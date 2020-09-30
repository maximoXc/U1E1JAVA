/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenadorjava;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Maximo
 */
public class Ordenar {
    public void lectura( String Archivo ){
        
        //Texto correcto a validar.
        String[] correcto = {"este","texto","no","concuerda","por","que","esta","mal"};
        String aux;
        
        try{
            FileReader reader = new FileReader( Archivo );
            BufferedReader buffer = new BufferedReader( reader );
            
                String temporal = "";
            
                    while( temporal!=null ){
                    temporal = buffer.readLine();
                
                    String a;
                    a = temporal;
                
                    String []array = a.split(" ");
                
                    System.out.println("Texto antes de acomodar");
                    for(int i=0 ; i < array.length ; i++ ){
                        System.out.print(" " + array[i] );
                    }
                  
                
                
                    System.out.println("\nTexto acomodado");
                    // Se realiza acomodo burbuja de strings
                    for(int j=0 ; j < array.length  ; j++ ){
                        for (int k=0 ; k < array.length -1 ; k++ ){
                            if(!array[k].equalsIgnoreCase(correcto[k])){
                            aux = array[k];
                            array[k] = array[k+1];
                            array[k+1] = aux;
                            }  
                        }
                        System.out.print(" "+array[j]);
                    }  
                    
                
                if( temporal == null ){    
                    break;
                    }
                    
                };
                
            
            
            }catch(Exception e){
                System.out.println("\n"+e.getMessage());
        };
    }
}
