package Main_Class;

public class organizador {
    
    utilizador user;

    public organizador(utilizador user) {
        this.user = user;
    }

    public utilizador getUser() {
        return user;
    }
    
    @Override
    public String toString() {
        return "::ORGANIZADOR:: Username=" + user.getUsername();
    }
    
    
}