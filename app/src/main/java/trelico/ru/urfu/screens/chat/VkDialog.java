package trelico.ru.urfu.screens.chat;

import com.stfalcon.chatkit.commons.models.IDialog;
import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.IUser;

import java.util.List;

public class VkDialog implements IDialog{

    private String id;
    private String dialogPhoto;
    private String dialogName;
    private List<? extends IUser> users;
    private IMessage lastMessage;
    private int unreadCount;

    public VkDialog(String id, String dialogPhoto, String dialogName, List<? extends IUser> users,
                    IMessage lastMessage, int unreadCount){
        this.id = id;
        this.dialogPhoto = dialogPhoto;
        this.dialogName = dialogName;
        this.users = users;
        this.lastMessage = lastMessage;
        this.unreadCount = unreadCount;
    }

    public VkDialog(){
    }

    @Override
    public String getId(){
        return id;
    }

    @Override
    public String getDialogPhoto(){
        return dialogPhoto;
    }

    @Override
    public String getDialogName(){
        return dialogName;
    }

    @Override
    public List<? extends IUser> getUsers(){
        return users;
    }

    @Override
    public IMessage getLastMessage(){
        return lastMessage;
    }

    @Override
    public void setLastMessage(IMessage message){
        lastMessage = message;
    }

    @Override
    public int getUnreadCount(){
        return unreadCount;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setDialogPhoto(String dialogPhoto){
        this.dialogPhoto = dialogPhoto;
    }

    public void setDialogName(String dialogName){
        this.dialogName = dialogName;
    }

    public void setUsers(List<? extends IUser> users){
        this.users = users;
    }

    public void setUnreadCount(int unreadCount){
        this.unreadCount = unreadCount;
    }
}
