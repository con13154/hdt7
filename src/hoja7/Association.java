/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja7;

/**
 *
 * @author Konoha
 */
public class Association<K, V> {
    K key;
    V valor;
    
    
    public void addAsociation(K key, V valor){
        this.key = key;
        this.valor = valor;
    }
    
    public K getKey(){
        return this.key;
    }
    
    public V getValor(){
        return this.valor;
    }
}
