/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.id.itb.sq;

import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edbert
 */
public class MyLinkedListTest {
    
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public MyLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void tearDown() {
        System.setOut(null);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void addSatuElemenTest() {
        MyLinkedList<Orang> myll = new MyLinkedList<>();
        myll.add(new Orang("Aston"));
        String[] temp = outContent.toString().split(System.getProperty("line.separator"));
        assertEquals("Head terisi", temp[0]);
        assertEquals("Jumlah elemen 1", temp[1]);
    }
    
    @Test
    public void addDuaElemenTest() {
        MyLinkedList<Orang> myll = new MyLinkedList<>();
        myll.add(new Orang("Aston"));
        myll.add(new Orang("Aceng"));
        String[] temp = outContent.toString().split(System.getProperty("line.separator"));
        assertEquals("Head terisi", temp[0]);
        assertEquals("Jumlah elemen 1", temp[1]);
        assertEquals("Elemen ke 1 terisi", temp[2]);
        assertEquals("Jumlah elemen 2", temp[3]);
    }
    
    @Test
    public void removeFirstElemen(){
        MyLinkedList<Orang> ll = new MyLinkedList<>();
        ll.add(new Orang("Aston"));
        ll.add(new Orang("Aa Eca"));
        ll.add(new Orang("Aceng"));
        ll.remove(0);
        assertEquals(2, ll.size()); // cek jumlah elemen
        assertEquals("Aa Eca", ll.get(0).name); // cek elemen pertama
        assertEquals("Aceng", ll.get(1).name); // cek elemen kedua
    }
    
    @Test
    public void removeMiddleElemen(){
        MyLinkedList<Orang> ll = new MyLinkedList<>();
        ll.add(new Orang("Aston"));
        ll.add(new Orang("Aa Eca"));
        ll.add(new Orang("Aceng"));
        ll.remove(1);
        assertEquals(2, ll.size()); // cek jumlah elemen
        assertEquals("Aston", ll.get(0).name); // cek elemen pertama
        assertEquals("Aceng", ll.get(1).name); // cek elemen kedua
    }
    
    @Test
    public void removeLastElemen(){
        MyLinkedList<Orang> ll = new MyLinkedList<>();
        ll.add(new Orang("Aston"));
        ll.add(new Orang("Aa Eca"));
        ll.add(new Orang("Aceng"));
        ll.remove(2);
        assertEquals(2, ll.size()); // cek jumlah elemen
        assertEquals("Aston", ll.get(0).name); // cek elemen pertama
        assertEquals("Aa Eca", ll.get(1).name); // cek elemen kedua
    }
    
    @Test
    public void removeindexOutOfBoundElemenPositif(){
        MyLinkedList<Orang> ll = new MyLinkedList<>();
        ll.add(new Orang("Aston"));
        ll.add(new Orang("Aa Eca"));
        ll.add(new Orang("Aceng"));
        ll.remove(3);
        assertEquals(3, ll.size()); // cek jumlah elemen
        assertEquals("Aston", ll.get(0).name); // cek elemen pertama
        assertEquals("Aa Eca", ll.get(1).name); // cek elemen kedua
        assertEquals("Aceng", ll.get(2).name); // cek elemen ketiga
    }
    
    @Test
    public void removeindexOutOfBoundElemenNegatif(){
        MyLinkedList<Orang> ll = new MyLinkedList<>();
        ll.add(new Orang("Aston"));
        ll.add(new Orang("Aa Eca"));
        ll.add(new Orang("Aceng"));
        ll.remove(-1);
        assertEquals(3, ll.size()); // cek jumlah elemen
        assertEquals("Aston", ll.get(0).name); // cek elemen pertama
        assertEquals("Aa Eca", ll.get(1).name); // cek elemen kedua
        assertEquals("Aceng", ll.get(2).name); // cek elemen ketiga
    }
    
    @Test
    public void sizeTest() {
        MyLinkedList<Orang> myll = new MyLinkedList<>();
        assertEquals(0, myll.size());
        
        // test dengan 2 elemen baru
        myll.add(new Orang("Asep"));
        myll.add(new Orang("Yudi"));
        assertEquals(2, myll.size());
        
        // test ditambah lagi 2 elemen baru
        myll.add(new Orang("Jajang"));
        myll.add(new Orang("Maman"));
        assertEquals(4, myll.size());
                
        // tes remove satu elemen
        myll.remove(3);
        assertEquals(3, myll.size());
        
        // tes remove semua elemen
        myll.remove(0);
        myll.remove(0);
        myll.remove(0);
       assertEquals(0, myll.size());
    }
    
    @Test
    public void printTest() {
        MyLinkedList<Orang> myll = new MyLinkedList<>();
        
        // add 2 elemen
        myll.add(new Orang("Asep"));
        myll.add(new Orang("Yudi"));
        myll.print();
        String[] temp = outContent.toString().split(System.getProperty("line.separator"));
        assertEquals("Head terisi", temp[0]);
        assertEquals("Jumlah elemen 1", temp[1]);
        
        // remove
         
        // add
        
        // remove
        
    }
    
    @Test
    public void getTest() {
        MyLinkedList<Orang> myll = new MyLinkedList<>();
        Orang o1 = new Orang("Cecep");
        myll.add(o1);
        Orang o2 = new Orang("Acep");
        myll.add(o2);
        Orang o3 = new Orang("Encep");
        myll.add(o3);
        
        assertEquals(o1,myll.get(0));
        assertEquals(o2,myll.get(1));        
        assertEquals(o3,myll.get(2));        
    }
    
}
