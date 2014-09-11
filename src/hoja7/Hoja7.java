/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List; 
import java.util.*;

/**
 *
 * @author konoha
 */
public class Hoja7 {
    

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<ArrayList> todoDiccionario = new ArrayList();
        // TODO code application logic here
        File f = new File( "src/diccionario.txt" );
        BufferedReader entrada;
        try {
        entrada = new BufferedReader( new FileReader( f ) );
        String linea;
        
        
       
        
        linea = entrada.readLine();
        
       
            while(entrada.ready()){
                linea = entrada.readLine();

                String vector[] = linea.split(",");
                ArrayList separado = new ArrayList();
                separado.add(0, vector[0].substring(1));
                separado.add(1, vector[1].substring(0,vector[1].length()-1));

                todoDiccionario.add(separado);

            }

        }catch (IOException e) {
        e.printStackTrace();
        }
        
        System.out.println(todoDiccionario.size());
        System.out.println(todoDiccionario);
        BinaryTree diccionario = new BinaryTree();
        
        for (int x = 0; x < todoDiccionario.size(); x++){
            diccionario.addNode(todoDiccionario.get(x).get(0).toString(), todoDiccionario.get(x).get(1).toString());
        }
        
        
        
        System.out.println(diccionario);   
        System.out.println(diccionario.findName("come"));
         
    }
    
    
}

