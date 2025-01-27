package domain;

public class User {

    private String name;
    private String coment;
    
    public User(String name, String coment) {
        this.name = name;
        this.coment = coment;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getComent() {
        return coment;
    }
    public void setComent(String coment) {
        this.coment = coment;
    }

}
