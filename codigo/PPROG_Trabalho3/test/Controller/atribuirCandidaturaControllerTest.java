/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main_Class.*;
import Utils.Data;
import java.util.*;
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
public class atribuirCandidaturaControllerTest {
    
    public atribuirCandidaturaControllerTest() {
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
     * Test of getAlgoritmosAtribuicao method, of class atribuirCandidaturaController.
     */
    @Test
    public void testGetAlgoritmosAtribuicao() {
        System.out.println("getAlgoritmosAtribuicao");
        evento e = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        atribuirCandidaturaController instance = new atribuirCandidaturaController(new centroDeEventos());
        List <algoritmoAtribuicao> expResult = Arrays.asList( 
                new Algoritmo1(),
                new Algoritmo2(),
                new Algoritmo3()
        );
        List result = instance.getAlgoritmosAtribuicao(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidatura method, of class atribuirCandidaturaController.
     */
    @Test
    public void testGetListaCandidatura() {
        System.out.println("getListaCandidatura");
        evento e = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        e.registaCandidatura(new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativoCandidatura", Data.dataAtual()));
        atribuirCandidaturaController instance = new atribuirCandidaturaController(new centroDeEventos());
        List <candidatura> expResult = Arrays.asList( 
                new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativoCandidatura", Data.dataAtual())
        );
        List result = instance.getListaCandidatura(e);
        assertEquals(expResult, result);
    }
}
