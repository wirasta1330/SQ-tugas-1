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
}
