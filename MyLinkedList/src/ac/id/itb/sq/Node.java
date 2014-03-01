/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.id.itb.sq;

/**
 *
 * @author edbert
 */
public class Node<E> {
    
    public E element;
    public Node<E> next;
    
    public Node() { }
    
    public Node(E element) {
        this.element = element;
    }
    
}
