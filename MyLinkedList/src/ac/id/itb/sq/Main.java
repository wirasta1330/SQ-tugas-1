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
         MyLinkedList<Orang> myll = new MyLinkedList<>();
        
        // add 2 elemen
        myll.add(new Orang("Asep"));
        myll.add(new Orang("Yudi"));
        myll.print();
        
        myll.remove(myll.size()-1);
        myll.print();
    }
    
}
