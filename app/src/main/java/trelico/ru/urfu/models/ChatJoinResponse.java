package trelico.ru.urfu.models;

public class ChatJoinResponse{

    private int chatId;

    public ChatJoinResponse(int chatId){
        this.chatId = chatId;
    }

    public ChatJoinResponse(){
    }

    public int getChatId(){
        return chatId;
    }

    public void setChatId(int chatId){
        this.chatId = chatId;
    }
}
