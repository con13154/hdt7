
/*
Universidad del Valle de Guatemala 
Autores: Erick de Mata, 13648
         Luis Orellana 13140
         Isa Contreras 13154
Archivo: Association.java
Realiza la asociacion entre la palabra en ingles y la de espa;ol
*/ 


package hoja7;

public class Association<K, V> {
    K key;
    V valor;
    
    //Agrega ambas palabras, creando asociacion
    public void addAsociation(K key, V valor){
        this.key = key;
        this.valor = valor;
    }
    //Regresa la palabra en ingles
    public K getKey(){
        return this.key;
    }
    //Regresa palabra en espa;ol
    public V getValor(){
        return this.valor;
    }
}
