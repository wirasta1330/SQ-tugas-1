/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.id.itb.sq;

/**
 *
 * @author edbert, asri wendi, ade
 */
public class MyLinkedList<E> {
    
    private Node<E> head;
    //private int size; tidak pernah dipake
    
    public MyLinkedList() { }
    
    /**
     * autor : Edbert
     * @param element 
     */
    public void add(E element) {
        Node<E> p = new Node();
        p.element = element;
        
        if (head == null) {
            head = p;
            System.out.println("Head terisi");
        } else {
            Node<E> q = head;
            while (q.next != null) {
                q = q.next;
            }
            q.next = p;
            System.out.println("Elemen ke " + (size() - 1) + " terisi");
        }
        //size++;
        System.out.println("Jumlah elemen " + size());
    }
    
    /**
     * autor : asri
     * Method untuk menghapus elemen dari list berdasarkan nilai index
     * Prekondistion : List tidak kosong
     * Cek index ada dalam list : jika ada maka hapus, 
     * jika tidak ada maka penghapusan tidak dilakukan
     * @param index 
     */
    public void remove(int index) {
        // cek index ada dalam list
        if (index < size() && index >= 0){
            // hapus jika ada
            Node<E> cursor = head;
            if (index == 0) {
                head = cursor.next;
                cursor.next = null;
            }else { // index > 0
                int count = 0;
                while (count != index-1) { // cari posisi index ke index-1 (node sebelumnya)
                    cursor = cursor.next;
                    count = count + 1;
                }
                Node<E> tempCursor = cursor.next;
                cursor.next = tempCursor.next;
                tempCursor.next = null;
            }            
        }
    }
    
    /**
     * autor : Ade
     * Method untuk menghitung jumlah elemen didalam List
     * @return jumlah elemen list
     */
    public int size() {       
        if (head == null) {
            return 0;
        }
        else {
            int jumlah = 0;
            Node node = head;
            do {
                jumlah++;
                node = node.next;
            }
            while(node != null);
            
            return jumlah;
        }
       
    }
    /**
     * autor : wendi
     * @param index
     * @return Elemen
     */
    public E get(int index) {
        if (head == null) {
            return null;
        } else {
            if (index < 0 || index >= size()) {
                return null;
            } else {
                if (index == 0) return head.element;
                
                Node<E> p = head;
                int i = 0;
                //boolean found = false;
                while (i < index) {
                    p = p.next;
                    i++;
                }
                return p.element;
            }
        }
    }
    
    public void print() {
        Node q = head;
        while (q != null) {
            System.out.println(q.element);
            q = q.next;
        }
    }
    
}
