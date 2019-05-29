package trelico.ru.urfu.models;

import com.stfalcon.chatkit.commons.models.IUser;

public class User implements IUser{

    private String id;
    private String name;
    private String avatar;
    private String photo_50;

    public User(String id, String name, String avatar){
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    public User(String id, String name){
        this.id = id;
        this.name = name;
    }

    public User(){
    }

    public String getPhoto_50(){
        return photo_50;
    }

    public void setPhoto_50(String photo_50){
        this.photo_50 = photo_50;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAvatar(String avatar){
        this.avatar = avatar;
    }

    @Override
    public String getId(){
        return id;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getAvatar(){
        return avatar;
    }
}
