/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Utils.Data;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marco
 */
public class centroDeEventosTest {

    /**
     * Test of getListaUtilizadores method, of class centroDeEventos.
     */
    @Test
    public void testGetListaUtilizadores() {
        System.out.println("getListaUtilizadores");
        centroDeEventos instance = new centroDeEventos();
        instance.addRegistoUtilizadores(new utilizador("nome1", "email1", "username1", "password1"));
        List<utilizador> expResult = Arrays.asList(
                new utilizador("nome1", "email1", "username1", "password1")
        );
        List result = instance.getListaUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaEventosSubmissaoActiva method, of class centroDeEventos.
     */
    @Test
    public void testGetListaEventosSubmissaoActiva() {
        System.out.println("getListaEventosSubmissaoActiva");
        centroDeEventos instance = new centroDeEventos();
        //create 2 events to return 1
        instance.createEvento(new evento("titulo1", "textoDescritivo1", new Data("3000/12/30"), new Data("3000/12/31"), "local1", new Data("3000/11/30"), "exposicao"));
        instance.createEvento(new evento("titulo2", "textoDescritivo2", new Data("2000/12/30"), new Data("2000/12/30"), "local2", new Data("2000/12/30"), "congresso"));
        List<evento> expResult = Arrays.asList(
                new evento("titulo1", "textoDescritivo1", new Data("3000/12/30"), new Data("3000/12/31"), "local1", new Data("3000/11/30"), "exposicao")
        );
        List result = instance.getListaEventosSubmissaoActiva();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlgoritmosAtribuicao method, of class centroDeEventos.
     */
    @Test
    public void testGetAlgoritmosAtribuicao() {
        System.out.println("getAlgoritmosAtribuicao");
        centroDeEventos instance = new centroDeEventos();
        List<algoritmoAtribuicao> expResult = Arrays.asList(
                new Algoritmo1(), new Algoritmo2(), new Algoritmo3()
        );
        List result = instance.getAlgoritmosAtribuicao();
        assertEquals(expResult, result);
    }

    /**
     * Test of criarGestorEventos method, of class centroDeEventos.
     */
    @Test
    public void testCriarGestorEventos() {
        System.out.println("criarGestorEventos");
        gestorDeEventos ge = new gestorDeEventos(new utilizador("nome", "email", "username", "password"));
        centroDeEventos instance = new centroDeEventos();
        instance.criarGestorEventos(ge);
    }

    /**
     * Test of createEvento method, of class centroDeEventos.
     */
    @Test
    public void testCreateEvento() {
        System.out.println("createEvento");
        evento e = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        centroDeEventos instance = new centroDeEventos();
        instance.createEvento(e);
    }

    /**
     * Test of getListaEvento method, of class centroDeEventos.
     */
    @Test
    public void testGetListaEvento() {
        System.out.println("getListaEvento");
        centroDeEventos instance = new centroDeEventos();
        instance.createEvento(new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao"));
        List<evento> expResult = Arrays.asList(
                new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao")
        );
        List result = instance.getListaEvento();
        assertEquals(expResult, result);
    }

    /**
     * Test of addRegistoUtilizadores method, of class centroDeEventos.
     */
    @Test
    public void testAddRegistoUtilizadores() {
        System.out.println("addRegistoUtilizadores");
        utilizador u = new utilizador("nome", "email", "username", "password");
        centroDeEventos instance = new centroDeEventos();
        instance.addRegistoUtilizadores(u);
    }

    /**
     * Test of novoRegistoUtilizadorFicheiro method, of class centroDeEventos.
     */
    @Test
    public void testNovoRegistoUtilizadorFicheiro() {
        System.out.println("novoRegistoUtilizadorFicheiro");
        String nome = "nome";
        String email = "email";
        String username = "username";
        String password = "password";
        centroDeEventos instance = new centroDeEventos();
        instance.novoRegistoUtilizadorFicheiro(nome, email, username, password);
    }

    /**
     * Test of novoRegistoEventoFicheiro method, of class centroDeEventos.
     */
    @Test
    public void testNovoRegistoEventoFicheiro() {
        System.out.println("novoRegistoEventoFicheiro");
        String titulo = "aaa";
        String textoDescritivo = "bbb";
        String dataInicio = "2017/09/10";
        String dataFim = "2017/09/10";
        String local = "eee";
        String dataLimiteSubmissaoCandidaturas = "2017/09/10";
        String tipo = "aa";
        centroDeEventos instance = new centroDeEventos();
        instance.novoRegistoEventoFicheiro(titulo, textoDescritivo, dataInicio, dataFim, local, dataLimiteSubmissaoCandidaturas, tipo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of novoRegistoFaeEmEventoFicheiro method, of class centroDeEventos.
     */
    @Test
    public void testNovoRegistoFaeEmEventoFicheiro() {
        System.out.println("novoRegistoFaeEmEventoFicheiro");
        String event = "titulo";
        String user = "username";
        centroDeEventos instance = new centroDeEventos();
        instance.addRegistoUtilizadores(new utilizador("nome", "email", "username", "password"));
        instance.createEvento(new evento("titulo", "texto", Data.dataAtual(), Data.dataAtual(), "morada", Data.dataAtual(), "congresso"));
        instance.novoRegistoFaeEmEventoFicheiro(event, user);
    }

    /**
     * Test of novoRegistoCandidaturaEmEventoFicheiro method, of class
     * centroDeEventos.
     */
    @Test
    public void testNovoRegistoCandidaturaEmEventoFicheiro() {
        System.out.println("novoRegistoCandidaturaEmEventoFicheiro");
        String event = "evento";
        String nomeEmpresa = "empresa";
        String responsavelCandidatura = "responsavel";
        String morada = "morada";
        int telefone = 123456789;
        String textoExplicativoCandidatura = "texto";
        String dataCandidatura = "2017/09/09";
        centroDeEventos instance = new centroDeEventos();
        instance.novoRegistoCandidaturaEmEventoFicheiro(event, nomeEmpresa, responsavelCandidatura, morada, telefone, textoExplicativoCandidatura, dataCandidatura);
    }

    /**
     * Test of novoRegistoOrganizadorEmEventoFicheiro method, of class
     * centroDeEventos.
     */
    @Test
    public void testNovoRegistoOrganizadorEmEventoFicheiro() {
        System.out.println("novoRegistoOrganizadorEmEventoFicheiro");
        String event = "titulo";
        String user = "username";
        centroDeEventos instance = new centroDeEventos();
        instance.addRegistoUtilizadores(new utilizador("nome", "email", "username", "password"));
        instance.createEvento(new evento("titulo", "descritivo", new Data(), new Data(), "morada", new Data(), "exposicao"));
        instance.novoRegistoOrganizadorEmEventoFicheiro(event, user);
    }

    /**
     * Test of novoRegistoGestorFicheiro method, of class centroDeEventos.
     */
    @Test
    public void testNovoRegistoGestorFicheiro() {
        System.out.println("novoRegistoGestorFicheiro");
        String user = "username";
        centroDeEventos instance = new centroDeEventos();
        instance.addRegistoUtilizadores(new utilizador("nome", "email", "username", "password"));
        instance.novoRegistoGestorFicheiro(user);
    }

    /**
     * Test of novoRegistoAtribuicoesFicheiro method, of class centroDeEventos.
     */
    @Test
    public void testNovoRegistoAtribuicoesFicheiro() {
        System.out.println("novoRegistoAtribuicoesFicheiro");
        String evento = "evento";
        String candidatura = "candidatura";
        Data dataCandidatura = Data.dataAtual();
        String fae = "username";
        centroDeEventos instance = new centroDeEventos();
        evento e = new evento("titulo", "textoExplicativo", Data.dataAtual(), Data.dataAtual(), "morada", Data.dataAtual(), "exposicao");
        instance.createEvento(e);
        utilizador u = new utilizador("nome", "email", "username", "password");
        instance.addRegistoUtilizadores(u);
        e.addUtilizadorFAE(u);
        candidatura c = new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativo", Data.dataAtual());
        e.registaCandidatura(c);
        instance.novoRegistoAtribuicoesFicheiro(evento, candidatura, dataCandidatura, fae);
    }

    /**
     * Test of novoRegistoDecisoesFicheiro method, of class centroDeEventos.
     */
    @Test
    public void testNovoRegistoDecisoesFicheiro() {
        System.out.println("novoRegistoDecisoesFicheiro");
        String evento = "titulo";
        String candidatura = "candidatura";
        Data dataCandidatura = Data.dataAtual();
        String fae = "username";
        Boolean decisaoFavoravel = true;
        String textoExplicativo = "sim";
        centroDeEventos instance = new centroDeEventos();
        evento e = new evento("titulo", "textoExplicativo", Data.dataAtual(), Data.dataAtual(), "morada", Data.dataAtual(), "exposicao");
        instance.createEvento(e);
        utilizador u = new utilizador("nome", "email", "username", "password");
        instance.addRegistoUtilizadores(u);
        e.addUtilizadorFAE(u);
        candidatura c = new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativo", Data.dataAtual());
        e.registaCandidatura(c);
        instance.novoRegistoDecisoesFicheiro(evento, candidatura, dataCandidatura, fae, decisaoFavoravel, textoExplicativo);
    }

    /**
     * Test of getListaGestoresEventos method, of class centroDeEventos.
     */
    @Test
    public void testGetListaGestoresEventos() {
        System.out.println("getListaGestoresEventos");
        centroDeEventos instance = new centroDeEventos();
        instance.criarGestorEventos(new gestorDeEventos(new utilizador("nome", "email", "username", "password")));
        List<gestorDeEventos> expResult = Arrays.asList(
                new gestorDeEventos(new utilizador("nome", "email", "username", "password"))
        );
        List<gestorDeEventos> result = instance.getListaGestoresEventos();
        assertEquals(expResult, result);
    }

}
