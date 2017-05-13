/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marco
 */
public class organizadorTest {
    
    public organizadorTest() {
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

    /**
     * Test of getUser method, of class organizador.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        organizador instance = new organizador(new utilizador("nome1", "email1", "username1", "password1"));
        utilizador expResult = new utilizador("nome1", "email1", "username1", "password1");
        utilizador result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class organizador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        organizador instance = new organizador(new utilizador("nome2", "email2", "username2", "password2"));
        String expResult = "::ORGANIZADOR:: Username=username2";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
