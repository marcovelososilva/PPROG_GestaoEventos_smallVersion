package Main_Class;

public class gestorDeEventos {
    utilizador user;
    
    public gestorDeEventos(utilizador user) {
        this.user = user;
    }

    public utilizador getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "::Gestor de Eventos:: Username=" + user.getUsername();
    }
    
    
}