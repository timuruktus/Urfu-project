package trelico.ru.urfu.screens.chat;

import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.IUser;

import java.util.Date;

public class VkMessage implements IMessage{

    private String id;
    private String text;
    private IUser user;
    private Date createdAt;

    public VkMessage(String id, String text, IUser user, Date createdAt){
        this.id = id;
        this.text = text;
        this.user = user;
        this.createdAt = createdAt;
    }

    public VkMessage(){
    }

    public void setId(String id){
        this.id = id;
    }

    public void setText(String text){
        this.text = text;
    }

    public void setUser(IUser user){
        this.user = user;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    @Override
    public String getId(){
        return null;
    }

    @Override
    public String getText(){
        return null;
    }

    @Override
    public IUser getUser(){
        return null;
    }

    @Override
    public Date getCreatedAt(){
        return null;
    }
}
