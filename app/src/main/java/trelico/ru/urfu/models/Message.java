package trelico.ru.urfu.models;

import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.IUser;

import java.util.Date;

public class Message implements IMessage{

    private String text;
    private String id;
    private IUser user;
    private Date createdAt;

    public Message(String text, String id, IUser user, Date createdAt){
        this.text = text;
        this.id = id;
        this.user = user;
        this.createdAt = createdAt;
    }

    public Message(){
    }

    public void setText(String text){
        this.text = text;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setUser(IUser user){
        this.user = user;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    @Override
    public String getId(){
        return id;
    }

    @Override
    public String getText(){
        return text;
    }

    @Override
    public IUser getUser(){
        return user;
    }

    @Override
    public Date getCreatedAt(){
        return createdAt;
    }
}
