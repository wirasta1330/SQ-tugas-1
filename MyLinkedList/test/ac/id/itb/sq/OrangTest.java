/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.id.itb.sq;

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
public class OrangTest {
    
    public OrangTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void orangTest1() {
        Orang orang = new Orang();
        orang.name = "Amir";
        assertEquals("Nama: Amir", orang.toString());
    }
    
    @Test
    public void orangTest2() {
        Orang orang = new Orang("Neli");
        assertEquals("Nama: Neli", orang.toString());
    }
}
