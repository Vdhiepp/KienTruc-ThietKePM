package Singleton.A4;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }
    public void vote(Candidate c){
        Election.getInstance().vote(c, name);
    }
}
