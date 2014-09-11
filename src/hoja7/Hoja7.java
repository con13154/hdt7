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

        ArrayList<Association> todoDiccionario = new ArrayList();
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
                Association separado = new Association();
                separado.addAsociation( vector[0].substring(1), vector[1].substring(0,vector[1].length()-1));

                todoDiccionario.add(separado);

            }

        }catch (IOException e) {
        e.printStackTrace();
        }
        
        System.out.println(todoDiccionario.size());
        System.out.println(todoDiccionario);
        BinaryTree diccionario = new BinaryTree();
        
        for (int x = 0; x < todoDiccionario.size(); x++){
            diccionario.addNode(todoDiccionario.get(x).getKey().toString(), todoDiccionario.get(x).getValor().toString());
        }
        
        
        
        System.out.println(diccionario);
        
        //Se trabaja el arbol binario de manera "in order"
        diccionario.inOrderTraverseTree(diccionario.root);
        
        
        //Yooo
        int contador = todoDiccionario.size();
        System.out.println(contador); 
       
       
        
        Iterator i = todoDiccionario.iterator();
        while(i.hasNext()){
            System.out.println("Elemento" + i.next());
        }
        
        File f1 = new File( "src/texto.txt" );
        BufferedReader entrada1;
        try {
            entrada1 = new BufferedReader( new FileReader( f1 ) );
            String linea1;
            linea1 = entrada1.readLine();
            System.out.println(linea1);
            /*for (int x=0; x < linea1.length(); x++) {
                if (linea1.charAt(x) = ' '){
                    
                    sCadenaSinBlancos += linea1.charAt(x);
                    contador1 = contador2
                }
            }
            System.out.println(sCadenaSinBlancos);*/
            String palabra = linea1.substring(0,3);
            System.out.println(palabra);
            String palabra1 = linea1.substring(4,8);
            System.out.println(palabra1);
            String palabra2 = linea1.substring(9,17);
            System.out.println(palabra2);
            String palabra3 = linea1.substring(18,26);
            System.out.println(palabra3);
            String palabra4 = linea1.substring(27,34);
            System.out.println(palabra4);
            String palabra5 = linea1.substring(35,42);
            System.out.println(palabra5);
            String palabra6 = linea1.substring(43,47);
            System.out.println(palabra6);
            String palabra7 = linea1.substring(48,64);
            System.out.println(palabra7);
            String palabra8 = linea1.substring(66,68);
            System.out.println(palabra8);
            String palabra9 = linea1.substring(69,76);
            System.out.println(palabra9);
            String palabra10 = linea1.substring(77,81);
            System.out.println(palabra10);
            String palabra11 = linea1.substring(82,88);
            System.out.println(palabra11);
            String palabra12 = linea1.substring(89,95);
            System.out.println(palabra12);
            
        }catch (IOException e) {
        e.printStackTrace();
        }   
        
         
    }
    
    
}

