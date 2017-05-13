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
public class gestorDeEventosTest {
    
    public gestorDeEventosTest() {
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
     * Test of getUser method, of class gestorDeEventos.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        gestorDeEventos instance = new gestorDeEventos(new utilizador("nome", "email", "username", "password"));
        utilizador expResult = instance.getUser();
        utilizador result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class gestorDeEventos.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        gestorDeEventos instance = new gestorDeEventos(new utilizador("nome", "email", "username", "password"));
        String expResult = "::Gestor de Eventos:: Username=username";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class gestorDeEventos.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = new utilizador("nome", "email", "username", "password");
        gestorDeEventos instance = new gestorDeEventos(new utilizador("nome", "email", "username", "password"));
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
}
