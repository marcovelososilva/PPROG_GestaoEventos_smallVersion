package Main_Class;

import Utils.Data;
import java.util.ArrayList;
import java.util.List;

public class centroDeEventos {

	private final List<gestorDeEventos> ListaGestorEventos;
	private final List<utilizador> ListaUtilizadores;
	private final List<evento> ListaEventos;
	private final List<algoritmoAtribuicao> ListaAlgoritmos;

    public centroDeEventos() {
        ListaGestorEventos = new ArrayList<>();
        ListaUtilizadores = new ArrayList<>();
        ListaEventos = new ArrayList<>();
        ListaAlgoritmos = new ArrayList<>();
        ListaAlgoritmos.add(new Algoritmo1() );
        ListaAlgoritmos.add(new Algoritmo2() );
        ListaAlgoritmos.add(new Algoritmo3() );
    }

        
	/**
	 * 
	 * @param e
	 */
	public void validaEvento(evento e) {
		// TODO - implement centroDeEventos.validaEvento
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ge
	 */
	public void registaGestorEventos(gestorDeEventos ge) {
		// TODO - implement centroDeEventos.registaGestorEventos
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param e
	 */
	public void registaEvento(evento e) {
		// TODO - implement centroDeEventos.registaEvento
		throw new UnsupportedOperationException();
	}

	public void getUtilizadoresNaoConfirmados() {
		// TODO - implement centroDeEventos.getUtilizadoresNaoConfirmados
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param e
	 */
	public void getListaUtilizadoresEvento(evento e) {
		// TODO - implement centroDeEventos.getListaUtilizadoresEvento
		throw new UnsupportedOperationException();
	}

	public List getListaUtilizadores() {
		return ListaUtilizadores;
	}

	public List getListaEventosSubmissaoActiva() {
            List <evento> eventosActivos = new ArrayList<>();
            for (evento e : ListaEventos){
                Data hoje = Data.dataAtual();
                if ( (e.getDataLimiteSubmissaoCandidaturas().compareTo(hoje)) > -1){
                    eventosActivos.add(e);
                }
            }
            return eventosActivos;
	}

	/**
	 * 
	 * @param o
	 */
	public List getListaEventosOrganizadorDataSubmissaoFinalizada() {
            List <evento> eventosFinalizados = new ArrayList<>();
            for (evento e : ListaEventos){
                Data hoje = Data.dataAtual();
                if ( (e.getDataLimiteSubmissaoCandidaturas().compareTo(hoje)) < 0){
                    eventosFinalizados.add(e);
                }
            }
            return eventosFinalizados;
	}

	/**
	 * 
	 * @param o
	 */
	public void getListaEventosOrganizador(organizador o) {
		// TODO - implement centroDeEventos.getListaEventosOrganizador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fae
	 */
	public void getListaEventosFAE(fae fae) {
		// TODO - implement centroDeEventos.getListaEventosFAE
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param o
	 */
	public void getListaCongressosOrganizador(organizador o) {
		// TODO - implement centroDeEventos.getListaCongressosOrganizador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * 
	 */
	public List getAlgoritmosAtribuicao() {
            return ListaAlgoritmos;
	}

	public void criarGestorEventos(gestorDeEventos ge) {
		ListaGestorEventos.add(ge);
	}

	public void createEvento(evento e) {
		ListaEventos.add(e);
	}
        
        public List getListaEvento() {
            return ListaEventos;
	}

	/**
	 * 
	 * @param e
	 * @param u
	 */
	public void addUtilizadorFAE(evento e, utilizador u) {
		// TODO - implement centroDeEventos.addUtilizadorFAE
		throw new UnsupportedOperationException();
	}
        

	/**
	 * 
	 * @param u
	 */
	public void addOrganizador(utilizador u) {
		// TODO - implement centroDeEventos.addOrganizador
		throw new UnsupportedOperationException();
	}

	public void addGestorEventos() {
		// TODO - implement centroDeEventos.addGestorEventos
		throw new UnsupportedOperationException();
	}

	public void addRegistoUtilizadores(utilizador u) {
		ListaUtilizadores.add(u);
	}
        
        public void novoRegistoUtilizadorFicheiro (String nome, String email, String username, String password){
            utilizador user = new utilizador(nome, email, username, password);
            ListaUtilizadores.add(user);
        }
        
        public void novoRegistoEventoFicheiro (String titulo,String textoDescritivo,String dataInicio,String dataFim,String local,String dataLimiteSubmissaoCandidaturas,String tipo){
            evento event = new evento(titulo, textoDescritivo, new Data(dataInicio), new Data(dataFim), local, new Data(dataLimiteSubmissaoCandidaturas), tipo);
            ListaEventos.add(event);
        }

        public void novoRegistoFaeEmEventoFicheiro(String event, String user) {
            evento eventoEncontrado = encontrarEventoLista(event);
            if(eventoEncontrado.getTitulo() != null){
                utilizador userEncontrado = encontrarUtilizadorLista(user);
                if (userEncontrado.getUsername() != null){
                    eventoEncontrado.addUtilizadorFAE(userEncontrado);
                }
            }
        }
        public void novoRegistoCandidaturaEmEventoFicheiro(String event, String nomeEmpresa, String responsavelCandidatura, String morada, int telefone, String textoExplicativoCandidatura, String dataCandidatura) {
            evento eventoEncontrado = encontrarEventoLista(event);
            if(eventoEncontrado.getTitulo() != null){
                candidatura cand=new candidatura(nomeEmpresa, responsavelCandidatura, morada, telefone, textoExplicativoCandidatura, new Data(dataCandidatura));
                eventoEncontrado.registaCandidatura(cand);
            }
        }
        public void novoRegistoOrganizadorEmEventoFicheiro(String event, String user) {
            evento eventoEncontrado = encontrarEventoLista(event);
            if(eventoEncontrado.getTitulo() != null){
                utilizador userEncontrado = encontrarUtilizadorLista(user);
                if (userEncontrado.getUsername() != null){
                    eventoEncontrado.addUtilizadorOrganizador(userEncontrado);
                }
            }
        }

        public void novoRegistoGestorFicheiro(String user) {
            utilizador novoUserGestor = encontrarUtilizadorLista(user);
            if (novoUserGestor.getNome() != null){
                gestorDeEventos novoGestor = new gestorDeEventos(novoUserGestor);
                ListaGestorEventos.add(novoGestor);
            }
            
        }
        
        public void novoRegistoAtribuicoesFicheiro(String evento, String candidatura, Data dataCandidatura, String fae) {
            evento eventoSelecionado = encontrarEventoLista(evento);
            if(eventoSelecionado.getTitulo() != null){
                candidatura candidaturaSelecionada = encontrarCandidaturaEvento(candidatura, dataCandidatura, eventoSelecionado);
                if (candidaturaSelecionada.getNomeEmpresa() != null){
                    fae faeSelecionado = encontrarFAEEvento(fae, eventoSelecionado);
                    if (faeSelecionado.getUser() != null){
                        eventoSelecionado.addatribuicaoFicheiro(faeSelecionado, candidaturaSelecionada);
                    }  
                }
            }
            
        }

        
        private utilizador encontrarUtilizadorLista (String user){
            for (utilizador u : ListaUtilizadores){
                if (user.equalsIgnoreCase(u.getUsername())){
                    return u;
                }
            }
            return new utilizador();
        }
        
        private evento encontrarEventoLista (String event){
            for (evento e : ListaEventos){
                if (event.equalsIgnoreCase(e.getTitulo())){
                    return e;
                }
            }
            return new evento();
        }
        
        private candidatura encontrarCandidaturaEvento (String newCandidatura, Data newDataCandida, evento NewEvento){
            List<candidatura> listaCandidaturasEvento = NewEvento.getListaCandidatura();
            for (candidatura c : listaCandidaturasEvento){
                if (newCandidatura.equalsIgnoreCase(c.getNomeEmpresa()) && c.getDataCandidatura().equals(newDataCandida)){
                    return c;
                }
            }
            return new candidatura();
        }
        
        private fae encontrarFAEEvento (String newFAE, evento NewEvento){
            List<fae> listaFaeEvento = NewEvento.getListaFAE();
            for (fae f : listaFaeEvento){
                utilizador userFAE = f.getUser();
                String nomeUser = userFAE.getUsername();
                if (nomeUser.equalsIgnoreCase(newFAE)){
                    return f;
                }
            }
            return new fae();
        }

    public List<gestorDeEventos> getListaGestoresEventos() {
        return ListaGestorEventos;
    }

}