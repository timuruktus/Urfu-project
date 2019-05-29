package trelico.ru.urfu.screens.chat;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.stfalcon.chatkit.messages.MessageInput;
import com.stfalcon.chatkit.messages.MessagesList;
import com.stfalcon.chatkit.messages.MessagesListAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import trelico.ru.urfu.R;
import trelico.ru.urfu.models.ChatMessage;


public class ChatFragment extends MvpAppCompatFragment implements IChatFragment{


    @InjectPresenter
    ChatPresenter chatPresenter;
    @BindView(R.id.messagesList)
    MessagesList messagesList;
    @BindView(R.id.input)
    MessageInput input;
    private View view;
    private long chatId;
    private final static String CHAT_ID = "chatId";

    public ChatFragment(){
        // Required empty public constructor
    }

    /**
     *
     * @param chatId - chat id WITHOUT 2000000000
     * @return
     */
    public ChatFragment getInstance(long chatId){
        ChatFragment chatFragment = new ChatFragment();
        Bundle bundle = new Bundle();
        bundle.putLong(CHAT_ID, chatId);
        chatFragment.setArguments(bundle);
        return chatFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_chat, container, false);
        ButterKnife.bind(this, view);
        if(getArguments() != null){
            chatId = getArguments().getLong(CHAT_ID);
//            chatPresenter.openChat(chatId);
        }
//        initAdapter();
        return view;
    }

    @Override
    public void showMessages(ArrayList<ChatMessage> messages){

    }

    @Override
    public void startLoading(){

    }

    @Override
    public void stopLoading(){

    }


//    private void initAdapter(){
//        MessagesListAdapter<Message> adapter = new MessagesListAdapter<>(senderId, imageLoader);
//        messagesList.setAdapter(adapter);
//    }

}
