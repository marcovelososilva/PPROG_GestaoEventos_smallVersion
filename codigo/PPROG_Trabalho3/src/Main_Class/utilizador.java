package Main_Class;

import java.io.Serializable;

public class utilizador implements Serializable{

	private String nome;
	private String email;
	private String username;
	private String password;

        public utilizador(String nome, String email, String username, String password) {
            this.nome = nome;
            this.email = email;
            this.username = username;
            this.password = password;
        }

        public utilizador() {
        }
        
        public String getNome() {
            return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    @Override
    public String toString() {
        return "Utilizador " + "Nome:" + nome + "; Email:" + email + "; Username: " + username;
    }
    
    public String utilizadorStringNome(){
        return nome;
    }

        
        
	public void setConfirmacaoUtilizador() {
		// TODO - implement utilizador.setConfirmacaoUtilizador
		throw new UnsupportedOperationException();
	}

	public void validaDadosUtilizadorInt() {
		// TODO - implement utilizador.validaDadosUtilizadorInt
		throw new UnsupportedOperationException();
	}

         @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        utilizador outroUtilizador = (utilizador) outroObjeto;
        return this.getUsername().equalsIgnoreCase(outroUtilizador.getUsername()) &&
                this.getEmail().equalsIgnoreCase(outroUtilizador.getEmail());
    }
}