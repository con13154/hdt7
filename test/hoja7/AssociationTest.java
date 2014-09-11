/*
Universidad del Valle de Guatemala 
Autores: Erick de Mata, 13648
         Luis Orellana 13140
         Isa Contreras 13154
Archivo: AssociationTest.java
Prueba unitaria para agregar y obtener una asociacion 
*/
package hoja7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssociationTest {
    
    public AssociationTest() {
    }
   
    //Prueba unitaria donde le damos un valor a key y a valor, 
    //ya que el metodo es GetValor esperamos obtener solamente la palabra en ingles
    
    @Test
    public void testGetValor() {
        System.out.println("INSERTAR y BUSCAR ASOCIACIÓN");
        Association instance = new Association(); //Instanciación
        Object key ="Casa"; //Palabra español
        Object valor = "House";  //Traducción ingles
        instance.addAsociation(key, valor);
        
        Object expResult = "House"; //La palabra esperada en ingles 
        Object result = instance.getValor();
        
        assertEquals(expResult, result); //Comparación

    }
    
}
