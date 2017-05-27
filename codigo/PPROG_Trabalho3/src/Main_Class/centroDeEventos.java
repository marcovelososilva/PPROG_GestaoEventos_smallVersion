package Main_Class;

import Utils.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class centroDeEventos implements Serializable {

    private final List<gestorDeEventos> ListaGestorEventos;
    private final List<utilizador> ListaUtilizadores;
    private final List<evento> ListaEventos;
    private final List<algoritmoAtribuicao> ListaAlgoritmos;

    /**
     * construtor sem parametros
     */
    public centroDeEventos() {
        ListaGestorEventos = new ArrayList<>();
        ListaUtilizadores = new ArrayList<>();
        ListaEventos = new ArrayList<>();
        ListaAlgoritmos = new ArrayList<>();
        ListaAlgoritmos.add(new Algoritmo1());
        ListaAlgoritmos.add(new Algoritmo2());
        ListaAlgoritmos.add(new Algoritmo3());
    }

    /**
     * get lista de utilizadores
     * @return 
     */
    public List getListaUtilizadores() {
        return ListaUtilizadores;
    }
    
    /**
     * get a lista de gestores de eventos
     * @return 
     */
    public List<gestorDeEventos> getListaGestoresEventos() {
        return ListaGestorEventos;
    }

    /**
     * get lista de eventos que contem a submissao activa
     * @return
     */
    public List getListaEventosSubmissaoActiva() {
        List<evento> eventosActivos = new ArrayList<>();
        for (evento e : ListaEventos) {
            Data hoje = Data.dataAtual();
            if ((e.getDataLimiteSubmissaoCandidaturas().compareTo(hoje)) > -1) {
                eventosActivos.add(e);
            }
        }
        return eventosActivos;
    }

    /**
     * Mostra eventos que tem a data submissao caducada e este ainda nao
     * finalizou
     *
     * @param o - ORGANIZADOR do qual se pretende obter a lista de eventos com a
     * submissão finalizada.
     * @return List - eventosFinalizados - Lista de eventos de um ORGANIZADOR
     * que tem a data de submissão finalizada.
     */
    public List getListaEventosOrganizadorDataSubmissaoFinalizada(organizador OrganizadorEvento) {
        List<evento> eventosFinalizados = new ArrayList<>();
        for (evento e : ListaEventos) {
            Data hoje = Data.dataAtual();
            if ((e.getDataLimiteSubmissaoCandidaturas().compareTo(hoje)) < 0
                    && e.getDataFim().compareTo(hoje) > 0) {
                List<organizador> listaDeOrganizadores = e.getListaOrganizadores();
                for (organizador o : listaDeOrganizadores) {
                    if (o.equals(OrganizadorEvento)) {
                        eventosFinalizados.add(e);
                        break;
                    }
                }
            }
        }
        return eventosFinalizados;
    }

    /**
     * Mostra eventos que tem a data submissao caducada e este ainda nao
     * finalizou
     *
     * @param fae - FAE do qual se pretende obter a lista de eventos com a
     * submissão finalizada.
     * @return List - eventosFinalizados - Lista de eventos de um FAE que tem a
     * data de submissão finalizada.
     */
    public List getListaEventosFAEDataSubmissaoFinalizada(fae FAEEvento) {
        List<evento> eventosFinalizados = new ArrayList<>();
        for (evento e : ListaEventos) {
            Data hoje = Data.dataAtual();
            if ((e.getDataLimiteSubmissaoCandidaturas().compareTo(hoje)) < 0
                    && e.getDataFim().compareTo(hoje) > 0 && e.getListaAtribuicoes().size() > 0) {
                List<fae> listaDeFae = e.getListaFAE();
                for (fae lfae : listaDeFae) {
                    if (lfae.equals(FAEEvento)) {
                        eventosFinalizados.add(e);
                        break;
                    }
                }
            }
        }
        return eventosFinalizados;
    }

    /**
     * Devolve a lista de algoritmos que temos no programa;
     *
     * @return List - Lista de Algoritmos
     */
    public List getAlgoritmosAtribuicao() {
        return ListaAlgoritmos;
    }

    /**
     * adiciona um gestor de eventos à lista de gestores de eventos, utilizador
     * previamente validado e testado.
     *
     * @param ge - GESTOR DE EVENTOs - um utilizador com papel de gestor de
     * eventos
     */
    public void criarGestorEventos(gestorDeEventos ge) {
        ListaGestorEventos.add(ge);
    }

    /**
     * adiciona à lista de eventos um evento previamente criado validado e
     * testado
     *
     * @param e - EVENTO - recebe um evento para adicionar à lista de eventos
     */
    public void createEvento(evento e) {
        ListaEventos.add(e);
    }

    /**
     * devolve a lista de eventos do centro de eventos
     *
     * @return List - lista dos eventos
     */
    public List getListaEvento() {
        return ListaEventos;
    }

    /**
     * adiciona à lista de utilizadores um utilizador previamente criado
     * validade e testado
     *
     * @param u - UTILIZADOR - recebe um utilizador para adicionar à lista de
     * utilizadores
     */
    public void addRegistoUtilizadores(utilizador u) {
        ListaUtilizadores.add(u);
    }

    /**
     * método responsavel pela instânciação de utilizadores aquando da leitura
     * apartir de ficheiro
     *
     * @param nome - NOME -String que contem o nome do utilizador
     * @param email - EMAIL - String que contem o email do utilizador
     * @param username - USERNAME - String que contem o username do utilizador
     * @param password - PASSWORD - String que contem a password do utilizador
     */
    public void novoRegistoUtilizadorFicheiro(String nome, String email, String username, String password) {
        utilizador user = new utilizador(nome, email, username, password);
        ListaUtilizadores.add(user);
    }

    /**
     * método responsavel pela instânciação de eventos aquando da leitura
     * apartir de ficheiro
     *
     * @param titulo - TITULO - String que contem o titulo do evento
     * @param textoDescritivo - TEXTO DESCRITIVO - String que contem o texto
     * descritivo do evento
     * @param dataInicio - DATA DE INICIO - Data que contem a data de inicio do
     * evento
     * @param dataFim - DATA DE FIM - Data que contem a data de fim do evento
     * @param local - LOCAL - String que contem o local do evento
     * @param dataLimiteSubmissaoCandidaturas - DATA LIMITE - Data que contem a
     * data limite de submissao de candidaturas do evento
     * @param tipo - TIPO DE EVENTO - EventoType que contem o tipo de evento que
     * se trata
     */
    public void novoRegistoEventoFicheiro(String titulo, String textoDescritivo, String dataInicio, String dataFim, String local, String dataLimiteSubmissaoCandidaturas, String tipo) {
        evento event = new evento(titulo, textoDescritivo, new Data(dataInicio), new Data(dataFim), local, new Data(dataLimiteSubmissaoCandidaturas), tipo);
        ListaEventos.add(event);
    }

    /**
     * metodo que cria o fae, utilizado para a inicialização através de ficheiro
     * @param event - EVENTO - evento que contem o evento
     * @param user - UTILIZADOR - utilizador que contem o utilizador que terá
     * papel de FAE num evento
     */
    public void novoRegistoFaeEmEventoFicheiro(String event, String user) {
        evento eventoEncontrado = encontrarEventoLista(event);
        if (eventoEncontrado.getTitulo() != null) {
            utilizador userEncontrado = encontrarUtilizadorLista(user);
            if (userEncontrado.getUsername() != null) {
                eventoEncontrado.addUtilizadorFAE(userEncontrado);
            }
        }
    }

    /**
     * metodo que cria o evento, utilizado para a inicialização através de ficheiro
     * @param event
     * @param nomeEmpresa
     * @param responsavelCandidatura
     * @param morada
     * @param telefone
     * @param textoExplicativoCandidatura
     * @param dataCandidatura 
     */
    public void novoRegistoCandidaturaEmEventoFicheiro(String event, String nomeEmpresa, String responsavelCandidatura, String morada, int telefone, String textoExplicativoCandidatura, String dataCandidatura) {
        evento eventoEncontrado = encontrarEventoLista(event);
        if (eventoEncontrado.getTitulo() != null) {
            candidatura cand = new candidatura(nomeEmpresa, responsavelCandidatura, morada, telefone, textoExplicativoCandidatura, new Data(dataCandidatura));
            eventoEncontrado.registaCandidatura(cand);
        }
    }

    /**
     * metodo que cria o organizador, utilizado para a inicialização através de ficheiro
     * @param event
     * @param user 
     */
    public void novoRegistoOrganizadorEmEventoFicheiro(String event, String user) {
        evento eventoEncontrado = encontrarEventoLista(event);
        if (eventoEncontrado.getTitulo() != null) {
            utilizador userEncontrado = encontrarUtilizadorLista(user);
            if (userEncontrado.getUsername() != null) {
                eventoEncontrado.addUtilizadorOrganizador(userEncontrado);
            }
        }
    }

    /**
     * metodo que cria o gestor de evento, utilizado para a inicialização através de ficheiro
     * @param user 
     */
    public void novoRegistoGestorFicheiro(String user) {
        utilizador novoUserGestor = encontrarUtilizadorLista(user);
        if (novoUserGestor.getNome() != null) {
            gestorDeEventos novoGestor = new gestorDeEventos(novoUserGestor);
            ListaGestorEventos.add(novoGestor);
        }

    }

    /**
     * metodo que cria a atribuicao, utilizado para a inicialização através de ficheiro
     * @param evento
     * @param candidatura
     * @param dataCandidatura
     * @param fae 
     */
    public void novoRegistoAtribuicoesFicheiro(String evento, String candidatura, Data dataCandidatura, String fae) {
        evento eventoSelecionado = encontrarEventoLista(evento);
        if (eventoSelecionado.getTitulo() != null) {
            candidatura candidaturaSelecionada = encontrarCandidaturaEvento(candidatura, dataCandidatura, eventoSelecionado);
            if (candidaturaSelecionada.getNomeEmpresa() != null) {
                fae faeSelecionado = encontrarFAEEvento(fae, eventoSelecionado);
                if (faeSelecionado.getUser() != null) {
                    eventoSelecionado.addAtribuicaoFicheiro(faeSelecionado, candidaturaSelecionada);
                }
            }
        }

    }

    /**
     * metodo que cria a decisao, utilizado para a inicialização através de ficheiro
     * @param evento
     * @param candidatura
     * @param dataCandidatura
     * @param fae
     * @param decisaoFavoravel
     * @param textoExplicativo 
     */
    public void novoRegistoDecisoesFicheiro(String evento, String candidatura, Data dataCandidatura, String fae, Boolean decisaoFavoravel, String textoExplicativo) {
        evento eventoSelecionado = encontrarEventoLista(evento);
        if (eventoSelecionado.getTitulo() != null) {
            candidatura candidaturaSelecionada = encontrarCandidaturaEvento(candidatura, dataCandidatura, eventoSelecionado);
            if (candidaturaSelecionada.getNomeEmpresa() != null) {
                fae faeSelecionado = encontrarFAEEvento(fae, eventoSelecionado);
                if (faeSelecionado.getUser().getNome() != null){
                    candidaturaSelecionada.addDecisaoFicheiro(textoExplicativo, decisaoFavoravel, faeSelecionado);
                }                    
            }
        }
    }

    /**
     * metodo que encontra um utilizador atraves de uma string fornecida na lista desse objecto
     * @param user
     * @return 
     */
    private utilizador encontrarUtilizadorLista(String user) {
        for (utilizador u : ListaUtilizadores) {
            if (user.equalsIgnoreCase(u.getUsername())) {
                return u;
            }
        }
        return new utilizador();
    }

    /**
     * metodo que encontra um evento atraves de uma string fornecida na lista desse objecto
     * @param event
     * @return 
     */
    private evento encontrarEventoLista(String event) {
        for (evento e : ListaEventos) {
            if (event.equalsIgnoreCase(e.getTitulo())) {
                return e;
            }
        }
        return new evento();
    }

    /**
     * metodo que encontra uma candidatura atraves de uma string fornecida na lista desse objecto
     * @param newCandidatura
     * @param newDataCandida
     * @param NewEvento
     * @return 
     */
    private candidatura encontrarCandidaturaEvento(String newCandidatura, Data newDataCandida, evento NewEvento) {
        List<candidatura> listaCandidaturasEvento = NewEvento.getListaCandidatura();
        for (candidatura c : listaCandidaturasEvento) {
            if (newCandidatura.equalsIgnoreCase(c.getNomeEmpresa()) && c.getDataCandidatura().equals(newDataCandida)) {
                return c;
            }
        }
        return new candidatura();
    }

    /**
     * metodo que encontra um FAE atraves de uma string fornecida na lista desse objecto
     * @param newFAE
     * @param NewEvento
     * @return 
     */
    private fae encontrarFAEEvento(String newFAE, evento NewEvento) {
        List<fae> listaFaeEvento = NewEvento.getListaFAE();
        for (fae f : listaFaeEvento) {
            utilizador userFAE = f.getUser();
            String nomeUser = userFAE.getUsername();
            if (nomeUser.equalsIgnoreCase(newFAE)) {
                return f;
            }
        }
        return new fae();
    }

}