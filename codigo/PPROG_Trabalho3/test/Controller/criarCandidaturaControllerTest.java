/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main_Class.candidatura;
import Main_Class.centroDeEventos;
import Main_Class.evento;
import Utils.Data;
import java.util.Arrays;
import java.util.List;
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
public class criarCandidaturaControllerTest {
    
    private centroDeEventos ce;
    private evento eventoSelecionado;
    private candidatura candidaturaEvento;
    
    public criarCandidaturaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       ce = new centroDeEventos();
       eventoSelecionado = new evento("titulo1", "textoDescritivo1", new Data ("3000/12/30"), new Data ("3000/12/31"), "local1", new Data ("3000/11/30"), "exposicao");
       ce.createEvento(eventoSelecionado);
       candidaturaEvento = new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativoCandidatura", Data.dataAtual());
       eventoSelecionado.registaCandidatura(candidaturaEvento);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListaEventosSubmissaoActiva method, of class criarCandidaturaController.
     */
    @Test
    public void testGetListaEventosSubmissaoActiva() {
        System.out.println("getListaEventosSubmissaoActiva");
        centroDeEventos instance = new centroDeEventos();
        //create 2 events to return 1
        instance.createEvento (new evento("titulo1", "textoDescritivo1", new Data ("3000/12/30"), new Data ("3000/12/31"), "local1", new Data ("3000/11/30"), "exposicao"));
        instance.createEvento (new evento("titulo2", "textoDescritivo2", new Data ("2000/12/30"), new Data ("2000/12/30"), "local2", new Data ("2000/12/30"), "congresso"));
        List <evento> expResult = Arrays.asList(
                new evento("titulo1", "textoDescritivo1", new Data ("3000/12/30"), new Data ("3000/12/31"), "local1", new Data ("3000/11/30"), "exposicao")
        );
        List result = instance.getListaEventosSubmissaoActiva();
        assertEquals(expResult, result);
    }

    /**
     * Test of validaCandidatura method, of class criarCandidaturaController.
     */
    @Test
    public void testValidaCandidatura() {
        System.out.println("validaCandidatura");
        candidatura c = new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 12345678, "textoExplicativoCandidatura", Data.dataAtual());
        criarCandidaturaController instance = new criarCandidaturaController(new centroDeEventos());
        instance.selecionarEvento(new evento("titulo", "textoDescritivo", new Data("3000/12/30"), new Data("3000/12/31"), "local", new Data("3000/11/30"), "congresso"));
        boolean expResult = true;
        boolean result = instance.validaCandidatura(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaCandidatura method, of class criarCandidaturaController.
     */
    @Test
    public void testRegistaCandidatura() {
        System.out.println("registaCandidatura");
        candidatura c = new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 12345678, "textoExplicativoCandidatura", Data.dataAtual());
        criarCandidaturaController instance = new criarCandidaturaController(new centroDeEventos());
        instance.selecionarEvento(new evento("titulo", "textoDescritivo", new Data("3000/12/30"), new Data("3000/12/31"), "local", new Data("3000/11/30"), "congresso"));
        boolean expResult = true;
        boolean result = instance.registaCandidatura(c);
        assertEquals(expResult, result);
    }
    
}
