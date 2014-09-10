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


        // TODO code application logic here
        File f = new File( "src/diccionario.txt" );
        BufferedReader entrada;
        try {
        entrada = new BufferedReader( new FileReader( f ) );
        String linea;
        
        ArrayList<ArrayList> todoDiccionario = new ArrayList();
       
        
        linea = entrada.readLine();
        
       
        while(entrada.ready()){
            linea = entrada.readLine();
          
            String vector[] = linea.split(",");
            ArrayList separado = new ArrayList();
            separado.add(0, vector[0].substring(1));
            separado.add(1, vector[1].substring(0,vector[1].length()-1));

            
            
           
            todoDiccionario.add(separado);
           
           
            
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
        /* List<ArrayList> imprimirArbol = new LinkedList<ArrayList>();
        diccionarioArbol.inorder(imprimirArbol);
           System.out.println(imprimirArbol);
        System.out.println(diccionarioArbol);*/
        }catch (IOException e) {
        e.printStackTrace();
        }
        
        /*/Create a tree by building it up

		/BinaryTree<String> leftChild = new BinaryTree<String>("bear",
				new BinaryTree<String>("ant"), new BinaryTree<String>("cat"));
		BinaryTree<String> tree= new BinaryTree<String>("cow", leftChild,
				new BinaryTree<String>("dog"));

                
		// Some tests of methods
		System.out.println("tree: \n" + tree); 
		System.out.println("Size of tree = " + tree.size());
		System.out.println("Height of tree = " + tree.height());
		System.out.println("Fringe of tree =" + tree.fringe());

		// Build a tree from traversals
		List<String> preList = new LinkedList<String>();
		tree.preorder(preList);
		System.out.println("Preorder traversal of the tree =" + preList);

		List<String> inList = new LinkedList<String>();
		tree.inorder(inList);
		System.out.println("Inorder traversal of the tree =" + inList);

		List<String> postList = new LinkedList<String>();
		tree.postorder(postList);
		System.out.println("Postorder traversal of the tree =" + postList);

		BinaryTree<String> tree1 = BinaryTree.reconstructTree(preList, inList);
		System.out.println("tree1: \n" + tree1); 
		System.out.println("tree and tree1 are equal? " + tree.equals(tree1));

		tree1.setValue("cougar");
		System.out.println("tree: \n" + tree); 
		System.out.println("modified tree1: \n" + tree1); 
		System.out.println("tree and tree1 are equal? " + tree.equals(tree1));

		BinaryTree<String> tree2= BinaryTree.reconstructTree(preList, inList);
		tree2.getLeft().setLeft(null);
		System.out.println("tree2: \n" + tree2); 
		System.out.println("Size of tree2 = " + tree2.size());
		System.out.println("Height of tree2 = " + tree2.height());
		System.out.println("Fringe of tree2 =" + tree2.fringe());
		System.out.println("tree and tree2 are equal? " + tree.equals(tree2));*/
                
    }
    
     
    
}


