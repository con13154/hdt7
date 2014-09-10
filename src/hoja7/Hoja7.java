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
        BinaryTree<ArrayList> a1 = new BinaryTree<>(todoDiccionario.get(7)) ;
        BinaryTree<ArrayList> a2 = new BinaryTree<>(todoDiccionario.get(6),a1,null);
        BinaryTree<ArrayList> a3 = new BinaryTree<>(todoDiccionario.get(5)) ;
        BinaryTree<ArrayList> a4 = new BinaryTree<>(todoDiccionario.get(4),a2,a3); 
        BinaryTree<ArrayList> a5 = new BinaryTree<>(todoDiccionario.get(3)) ;
        BinaryTree<ArrayList> a6 = new BinaryTree<>(todoDiccionario.get(2)) ;
        BinaryTree<ArrayList> a7 = new BinaryTree<>(todoDiccionario.get(1),a5,a6) ;
        BinaryTree<ArrayList> afinal = new BinaryTree<>(todoDiccionario.get(0),a4,a7);
        
        System.out.println(afinal);   
      
        List<ArrayList> inList = new LinkedList<>();
		afinal.inorder(inList);
		System.out.println("INORDER" + inList);
        
        //ArrayList lista = [];
        //inList.toArray();
        Iterator i = inList.iterator();
        while(i.hasNext()){
            System.out.println("Elemento" + i.next());
        }
        
        String sCadenaSinBlancos = "";
        File f1 = new File( "src/texto.txt" );
        BufferedReader entrada1;
        try {
            entrada1 = new BufferedReader( new FileReader( f1 ) );
            String linea1;
            while(entrada1.ready()){
                linea1 = entrada1.readLine();
                System.out.println(linea1);
                for (int x=0; x < linea1.length(); x++) {
                    if (linea1.charAt(x) != ' '){
                        sCadenaSinBlancos += linea1.charAt(x);
                        i = inList.iterator();
                        while(i.hasNext()){
                            System.out.println(i.next());
                            if(i.next().equals(sCadenaSinBlancos)){
                                System.out.println("Son iguales");
                            }    
                        }
                    }
                }
            System.out.println(sCadenaSinBlancos);
            }
        }catch (IOException e) {
        e.printStackTrace();
        }        
    }
    
    
}

