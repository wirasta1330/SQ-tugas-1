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
        myll.remove(4);
        assertEquals(3, myll.size());
        
        // tes remove semua elemen
        myll.remove(1);
        myll.remove(1);
        myll.remove(1);
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
}
