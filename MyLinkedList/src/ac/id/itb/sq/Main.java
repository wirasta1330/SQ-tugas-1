/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.id.itb.sq;

/**
 *
 * @author wirasta1330
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList<Orang> ll = new MyLinkedList<>();
        ll.add(new Orang("Aston"));
        ll.add(new Orang("Aa Eca"));
        ll.add(new Orang("Aceng"));
        ll.print();
    }
    
}
