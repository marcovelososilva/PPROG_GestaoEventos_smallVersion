/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

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
public class eventoTest {
    
    public eventoTest() {
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
     * Test of toString method, of class evento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        String expResult = "\nEVENTO:" + "\nTitulo: titulo,\nTexto Descritivo: textoDescritivo,\n"
                + "Data de Inicio: " + Data.dataAtual() + ",\nData de Fim: " + Data.dataAtual() + ",\n"
                + "Local: local,\nData Limite de Submissão de Candidaturas: " + Data.dataAtual() + ",\n"
                + "Tipo de Evento: exposicao\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of toStringComFaeOrganizador method, of class evento.
     */
    @Test
    public void testToStringComFaeOrganizador() {
        System.out.println("toStringComFaeOrganizador");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        String expResult = "\nEVENTO:" + "\nTitulo: titulo,\nTexto Descritivo: textoDescritivo,\n"
                + "Data de Inicio: " + Data.dataAtual() + ",\nData de Fim: " + Data.dataAtual() + ",\n"
                + "Local: local,\nData Limite de Submissão de Candidaturas: " + Data.dataAtual() + ",\n"
                + "Tipo de Evento: exposicao\n"
                + "Organizadores: " + converterListaEmString(listaOrganizadores) + "\n"
                + "FAE: " + converterListaEmString(listaFAE) + "\n"
                + "Candidaturas: " + converterListaEmString(listaCandidaturas) + "\n"
                + "Atribuições: " + converterListaEmString(listaAtribuicao) + "\n";
        String result = instance.toStringComFaeOrganizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitulo method, of class evento.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        String expResult = "titulo";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitulo method, of class evento.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "coiso";
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.setTitulo(titulo);
        assertEquals("ok", instance.getTitulo(), titulo);
    }

    /**
     * Test of getTextoDescritivo method, of class evento.
     */
    @Test
    public void testGetTextoDescritivo() {
        System.out.println("getTextoDescritivo");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        String expResult = "textoDescritivo";
        String result = instance.getTextoDescritivo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTextoDescritivo method, of class evento.
     */
    @Test
    public void testSetTextoDescritivo() {
        System.out.println("setTextoDescritivo");
        String textoDescritivo = "coiso";
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.setTextoDescritivo(textoDescritivo);
        assertEquals("ok", instance.getTextoDescritivo(), textoDescritivo);
    }

    /**
     * Test of getDataInicio method, of class evento.
     */
    @Test
    public void testGetDataInicio() {
        System.out.println("getDataInicio");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        Data expResult = Data.dataAtual();
        Data result = instance.getDataInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataInicio method, of class evento.
     */
    @Test
    public void testSetDataInicio() {
        System.out.println("setDataInicio");
        Data dataInicio = new Data("2000/01/01");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.setDataInicio(dataInicio);
    }

    /**
     * Test of getDataFim method, of class evento.
     */
    @Test
    public void testGetDataFim() {
        System.out.println("getDataFim");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        Data expResult = Data.dataAtual();
        Data result = instance.getDataFim();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataFim method, of class evento.
     */
    @Test
    public void testSetDataFim() {
        System.out.println("setDataFim");
        Data dataFim = new Data("2000/01/01");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.setDataFim(dataFim);
    }

    /**
     * Test of getLocal method, of class evento.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        String expResult = "local";
        String result = instance.getLocal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocal method, of class evento.
     */
    @Test
    public void testSetLocal() {
        System.out.println("setLocal");
        String local = "coisinho";
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.setLocal(local);
    }

    /**
     * Test of getDataLimiteSubmissaoCandidaturas method, of class evento.
     */
    @Test
    public void testGetDataLimiteSubmissaoCandidaturas() {
        System.out.println("getDataLimiteSubmissaoCandidaturas");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        Data expResult = Data.dataAtual();
        Data result = instance.getDataLimiteSubmissaoCandidaturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataLimiteSubmissaoCandidaturas method, of class evento.
     */
    @Test
    public void testSetDataLimiteSubmissaoCandidaturas() {
        System.out.println("setDataLimiteSubmissaoCandidaturas");
        Data dataLimiteSubmissaoCandidaturas = new Data("2000/01/01");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.setDataLimiteSubmissaoCandidaturas(dataLimiteSubmissaoCandidaturas);
    }

    /**
     * Test of getTipo method, of class evento.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        EventType expResult = new exposicao();
        EventType result = instance.getTipo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipo method, of class evento.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        EventType tipo = new congresso();
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.setTipo(tipo);;
    }

    /**
     * Test of getListaFAE method, of class evento.
     */
    @Test
    public void testGetListaFAE() {
        System.out.println("getListaFAE");
        evento instance = new evento ("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.addUtilizadorFAE(new utilizador("nome", "email", "username", "password"));
        List <fae> expResult = Arrays.asList(
                new fae(new utilizador ("nome", "email", "username", "password"))
        );
        List result = instance.getListaFAE();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidatura method, of class evento.
     */
    @Test
    public void testGetListaCandidatura() {
        System.out.println("getListaCandidatura");
        evento e = new evento ("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        evento instance = e;
        e.registaCandidatura(new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativoCandidatura", Data.dataAtual()));
        List <candidatura> expResult = Arrays.asList(
                new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativoCandidatura", Data.dataAtual())
        );
        List result = instance.getListaCandidatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of registaAtribuicao method, of class evento.
     */
    @Test
    public void testRegistaAtribuicao() {
        System.out.println("registaAtribuicao");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        atribuicao a = new atribuicao();
        instance.registaAtribuicao(a);
    }

    /**
     * Test of getListaCandidaturas method, of class evento.
     */
    @Test
    public void testGetListaCandidaturas() {
        System.out.println("getListaCandidaturas");
        fae FEA = new fae (new utilizador("nome", "email", "username", "password"));
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        List <utilizador> expResult = Arrays.asList(
                new utilizador("nome1", "email1", "username1", "password1")
        );
        List result = instance.getListaCandidaturas(FEA);
        assertEquals(expResult, result);
    }

    /**
     * Não dá para fazer teste uma vez que apenas cria uma candidatura e não a devolve
     * porque é uma instancia privada no evento ou seja não tenho acesso para alterar e não se consegue verificar junto de outra.
     */
    
    @Test
    public void testSelecionaEventoCriaCandidatura() {
        System.out.println("selecionaEventoCriaCandidatura");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        candidatura expResult = new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativoCandidatura", Data.dataAtual());
        candidatura result = instance.selecionaEventoCriaCandidatura();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of registaCandidatura method, of class evento.
     */
    @Test
    public void testRegistaCandidatura() {
        System.out.println("registaCandidatura");
        candidatura c = new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456780, "textoExplicativoCandidatura", Data.dataAtual());
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        boolean expResult = true;
        boolean result = instance.registaCandidatura(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaCandidatura method, of class evento.
     */
    @Test
    public void testValidaCandidatura() {
        System.out.println("validaCandidatura");
        candidatura c = new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativoCandidatura", Data.dataAtual());
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        boolean expResult = true;
        boolean result = instance.validaCandidatura(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of addUtilizadorFAE method, of class evento.
     */
    @Test
    public void testAddUtilizadorFAE() {
        System.out.println("addUtilizadorFAE");
        utilizador u = new utilizador("nome", "email", "username", "password");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.addUtilizadorFAE(u);
    }

    /**
     * Test of addUtilizadorOrganizador method, of class evento.
     */
    @Test
    public void testAddUtilizadorOrganizador() {
        System.out.println("addUtilizadorOrganizador");
        utilizador u = new utilizador("nome", "email", "username", "password");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.addUtilizadorOrganizador(u);
    }

    /**
     * Test of addAtribuicaoFicheiro method, of class evento.
     */
    @Test
    public void testAddAtribuicaoFicheiro() {
        System.out.println("addAtribuicaoFicheiro");
        fae faeSelecionado = new fae(new utilizador("nome", "email", "username", "password"));
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        candidatura c = new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativoCandidatura", Data.dataAtual());
        instance.registaCandidatura(c);
        candidatura candidaturaSelecionada = c;
        instance.addAtribuicaoFicheiro(faeSelecionado, candidaturaSelecionada);
    }

    /**
     * NÃO percebi porque não está a funcionar, tenho que olhar para isto de olhos frescos
     */
    @Test
    public void testGetListaAtribuicoes() {
        System.out.println("getListaAtribuicoes");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        candidatura c = new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativoCandidatura", Data.dataAtual());
        instance.registaCandidatura(c);
        atribuicao a = new atribuicao();
        a.setFAEeCandidatura(new fae(new utilizador("nome", "email", "username", "password")), c);
        
        atribuicao atriResultado = new atribuicao();
        atriResultado.setFAEeCandidatura(new fae(new utilizador("nome", "email", "username", "password")), 
                new candidatura("nomeEmpresa", "responsavelCandidatura", "morada", 123456789, "textoExplicativoCandidatura", Data.dataAtual()));
        List <atribuicao> expResult = Arrays.asList(atriResultado);
        
        List result = instance.getListaAtribuicoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaOrganizadores method, of class evento.
     */
    @Test
    public void testGetListaOrganizadores() {
        System.out.println("getListaOrganizadores");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        instance.addUtilizadorOrganizador(new utilizador("nome", "email", "username", "password"));
        List <organizador> expResult = Arrays.asList(
                new organizador(new utilizador("nome", "email", "username", "password"))
        );
        List<organizador> result = instance.getListaOrganizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class evento.
     */
    @Test
    public void testEqualsTrue() {
        System.out.println("equals");
        Object outroObjeto = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class evento.
     */
    @Test
    public void testEqualsFalse() {
        System.out.println("equals");
        Object outroObjeto = new evento("titulo1", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        evento instance = new evento("titulo", "textoDescritivo", Data.dataAtual(), Data.dataAtual(), "local", Data.dataAtual(), "exposicao");
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
}
