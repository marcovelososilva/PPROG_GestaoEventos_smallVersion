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

//    /**
//     * Não consigo fazer este teste pois etou a criar uma candidatura nova
//     * e não consigo fazer o equals com outra criada se ponho que é igual a null ele não deixa pois quer compara os dados
//     * se ponho a comparar com um novo não deixa pois o metodo EQUALS reescrito não consegue comparar pois não NULLS
//     */
//    @Test
//    public void testSelecionarEvento() {
//        System.out.println("selecionarEvento");
//        evento e = new evento("titulo1", "textoDescritivo1", new Data ("3000/12/30"), new Data ("3000/12/31"), "local1", new Data ("3000/11/30"), "exposicao");
//        criarCandidaturaController instance = new criarCandidaturaController(new centroDeEventos());
//        candidatura expResult = new candidatura();
//        candidatura result = instance.selecionarEvento(e);
//        assertNull(result);
//        assertEquals(expResult, result);
//    }

    /**
     * Não dá para fazer o teste a este porque, ao fazer set dos dados da candidatura fá-lo à instância
     * que existe em private, logo não consigo ter acesso á referencia que existe dentro do controller
     */
//    @Test
//    public void testSetDadosCandidatura() {
//        System.out.println("setDadosCandidatura");
//        
//        criarCandidaturaController instance = new criarCandidaturaController(new centroDeEventos());
//        evento e = new evento("titulo1", "textoDescritivo1", new Data ("3000/12/30"), new Data ("3000/12/31"), "local1", new Data ("3000/11/30"), "exposicao");
//        instance.selecionarEvento(e);
//        
//        String nomeEmpresa = "empresa1";
//        String responsavelCandidatura = "responsavel2";
//        String morada = "morada3";
//        int telefone = 1234556789;
//        String textoExplicativoCandidatura = "explicativo4";
//        
//        instance.setDadosCandidatura(nomeEmpresa, responsavelCandidatura, morada, telefone, textoExplicativoCandidatura);
//        candidatura expResult = new candidatura("empresa1", "responsavel2", "morada3", 123456789, "explicativo4", Data.dataAtual());
//        
//        assertEquals(e.getListaCandidatura().get(0), expResult);
//    }


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
