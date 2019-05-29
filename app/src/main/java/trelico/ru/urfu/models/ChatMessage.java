package trelico.ru.urfu.models;

import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.IUser;

import java.util.Date;

public class ChatMessage{

    private long date;
    private long fromId;
    private long id;
    private long out;
    private long peerId;
    private String text;

    public ChatMessage(){
    }

    public ChatMessage(int count, long date, long fromId, long id, long out, long peerId, String text){
        this.date = date;
        this.fromId = fromId;
        this.id = id;
        this.out = out;
        this.peerId = peerId;
        this.text = text;
    }

    public long getDate(){
        return date;
    }

    public void setDate(long date){
        this.date = date;
    }

    public long getFromId(){
        return fromId;
    }

    public void setFromId(long fromId){
        this.fromId = fromId;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getOut(){
        return out;
    }

    public void setOut(long out){
        this.out = out;
    }

    public long getPeerId(){
        return peerId;
    }

    public void setPeerId(long peerId){
        this.peerId = peerId;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }
}
