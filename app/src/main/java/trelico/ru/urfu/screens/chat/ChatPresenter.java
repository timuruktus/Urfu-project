package trelico.ru.urfu.screens.chat;

import android.widget.Toast;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.stfalcon.chatkit.commons.models.IUser;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.VKApiCallback;
import com.vk.api.sdk.auth.VKAccessToken;
import com.vk.api.sdk.auth.VKAuthCallback;
import com.vk.api.sdk.exceptions.VKApiExecutionException;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Date;

import trelico.ru.urfu.MyApp;
import trelico.ru.urfu.R;
import trelico.ru.urfu.data_sources.remote.WebApi;
import trelico.ru.urfu.models.ChatHistoryResponse;
import trelico.ru.urfu.models.ChatJoinResponse;
import trelico.ru.urfu.models.ChatMessage;
import trelico.ru.urfu.models.Message;
import trelico.ru.urfu.models.User;
import trelico.ru.urfu.models.UserResponse;
import trelico.ru.urfu.models.VkGetChatHistoryRequest;
import trelico.ru.urfu.models.VkGetUserRequest;
import trelico.ru.urfu.utils.NavigationManager;

@InjectViewState
public class ChatPresenter extends MvpPresenter<IChatFragment>{

//
//
//    void openChat(long chatId){
//        VK.execute(new VkGetChatHistoryRequest(0, 2000000000 + chatId), getChatHistoryResponse());
//    }
//
//    private VKApiCallback<ChatHistoryResponse> getChatHistoryResponse(){
//        return new VKApiCallback<ChatHistoryResponse>(){
//            @Override
//            public void success(ChatHistoryResponse chatHistoryResponse){
//                String id = chatHistoryResponse.get
//                ArrayList<Message> messages = new ArrayList<>();
//                ArrayList<ChatMessage> items = chatHistoryResponse.getItems();
//                for(ChatMessage item : items){
//                    Message message = new Message();
//                    User user = new User();
//                    user.setAvatar("");
//                    user.setId(item.getFromId() + "");
//                    user.setName(VK.execute(new VkGetUserRequest()););
//
//                    message.setId(0 + "");
//                    message.setText(item.getText());
//                    message.setCreatedAt(new Date(item.getDate()));
//                    message.setUser();
//                }
//                VK.execute(new VkGetUserRequest(), nextCallback(chatHistoryResponse));
//            }
//
//            @Override
//            public void fail(@NotNull VKApiExecutionException e){
//            }
//        };
//    }
//
//    public VKApiCallback<UserResponse> nextCallback(ChatHistoryResponse chatHistoryResponse){
//        return new VKApiCallback<UserResponse>(){
//
//            @Override
//            public void success(UserResponse userResponse){
//
//            }
//
//            @Override
//            public void fail(@NotNull VKApiExecutionException e){
//
//            }
//        };
//    }
}
