package trelico.ru.urfu.data_sources.remote;

public class ChatResponse{

    private String title;
    private String photo_200;

    public ChatResponse(String title, String photo_200){
        this.title = title;
        this.photo_200 = photo_200;
    }

    public ChatResponse(){
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getPhoto_200(){
        return photo_200;
    }

    public void setPhoto_200(String photo_200){
        this.photo_200 = photo_200;
    }
}
