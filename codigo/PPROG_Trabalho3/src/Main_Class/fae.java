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

    public void setUser(utilizador user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "::FAE::" + "user=" + user + '}';
    }

    public String toStringUsername() {
        return "::FAE::" + " Username=" + user.getUsername();
    }  

}
