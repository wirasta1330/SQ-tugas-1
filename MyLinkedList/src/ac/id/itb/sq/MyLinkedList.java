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
public class MyLinkedList<E> {
    
    private Node head;
    private int size;
    
    public MyLinkedList() { }
    
    public void add(E element) {
        Node p = new Node();
        p.element = element;
        
        if (head == null) {
            head = p;
            System.out.println("Head terisi");
        } else {
            Node q = head;
            while (q.next != null) {
                q = q.next;
            }
            q.next = p;
            System.out.println("Elemen ke " + size + " terisi");
        }
        size++;
        System.out.println("Jumlah elemen " + size);
    }
    
    public void remove(int index) {
        // belum diimplementasikan, 
        // buat test kelas
        // tugas : asri
    }
    
    public int size() {
        // belum diimplementasikan, 
        // buat test kelas
        // tugas : pak ade
        return 0;
    }
    
    public E get(int index) {
        // belum diimplementasikan, 
        // buat test kelas
        // tugas : mas wendi
        return null;
    }
    
    public void print() {
        Node q = head;
        while (q != null) {
            System.out.println(q.element);
            q = q.next;
        }
        
        // buat test kelas
        // tugas : pak ade (maaf ditambah satu lagi, biar sama efortY dengan yang lain)
    }
    
}
