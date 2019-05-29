package trelico.ru.urfu.models;

import java.util.ArrayList;

public class ChatHistoryResponse{


    private int count;
    private ArrayList<ChatMessage> items;
    private ArrayList<Message> messages;

    public ChatHistoryResponse(int count, ArrayList<ChatMessage> items){
        this.count = count;
        this.items = items;
    }

    public ChatHistoryResponse(int count, ArrayList<ChatMessage> items, ArrayList<Message> messages){
        this.count = count;
        this.items = items;
        this.messages = messages;
    }

    public ChatHistoryResponse(){
    }

    public ArrayList<Message> getMessages(){
        return messages;
    }

    public void setMessages(ArrayList<Message> messages){
        this.messages = messages;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

    public ArrayList<ChatMessage> getItems(){
        return items;
    }

    public void setItems(ArrayList<ChatMessage> items){
        this.items = items;
    }
}
