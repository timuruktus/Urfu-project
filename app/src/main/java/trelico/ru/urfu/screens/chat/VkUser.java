package trelico.ru.urfu.screens.chat;

import com.stfalcon.chatkit.commons.models.IUser;

public class VkUser implements IUser{

    private String id;
    private String name;
    private String avatar;

    public VkUser(String id, String name, String avatar){
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    public VkUser(){
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

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAvatar(String avatar){
        this.avatar = avatar;
    }
}
