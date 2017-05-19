package Main_Class;

public class fae {

    private utilizador user;

    public fae() {
    }

    public fae(utilizador user) {
        this.user = user;
    }

    public utilizador getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "::FAE::" + "user=" + user + '}';
    }

    public String toStringUsername() {
        return "::FAE::" + " Username=" + user.getUsername();
    }  

    public String toStringNome(){
        return user.getNome();
    }
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        fae outroFAE = (fae) outroObjeto;
        return this.user.equals(outroFAE.user);
    }
}
