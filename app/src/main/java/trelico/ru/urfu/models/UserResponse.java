package trelico.ru.urfu.models;

public class UserResponse{

    private int id;
    private String firstName;
    private String secondName;

    public UserResponse(int id, String firstName, String secondName){
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public UserResponse(){
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
}
