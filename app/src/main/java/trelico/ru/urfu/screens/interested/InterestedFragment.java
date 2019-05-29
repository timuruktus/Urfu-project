package trelico.ru.urfu.screens.interested;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.vk.api.sdk.VK;
import com.vk.api.sdk.VKApiCallback;
import com.vk.api.sdk.exceptions.VKApiExecutionException;

import org.jetbrains.annotations.NotNull;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import trelico.ru.urfu.MyApp;
import trelico.ru.urfu.R;
import trelico.ru.urfu.data_sources.local.Settings;
import trelico.ru.urfu.data_sources.remote.WebApi;
import trelico.ru.urfu.models.ChatJoinResponse;
import trelico.ru.urfu.models.VkChatJoinRequest;

import static trelico.ru.urfu.MyApp.D_TAG;
import static trelico.ru.urfu.data_sources.remote.WebApi.CREATION;
import static trelico.ru.urfu.data_sources.remote.WebApi.FITNESS;
import static trelico.ru.urfu.data_sources.remote.WebApi.FOOTBALL;
import static trelico.ru.urfu.data_sources.remote.WebApi.LANGUAGES;
import static trelico.ru.urfu.data_sources.remote.WebApi.MUSIC;
import static trelico.ru.urfu.data_sources.remote.WebApi.PHOTO;
import static trelico.ru.urfu.data_sources.remote.WebApi.SPORT;
import static trelico.ru.urfu.data_sources.remote.WebApi.TURCLUB;
import static trelico.ru.urfu.data_sources.remote.WebApi.VOLLEYBALL;

/**
 * A simple {@link Fragment} subclass.
 */
public class InterestedFragment extends Fragment{


    @BindView(R.id.fintessButton)
    Button fintessButton;
    @BindView(R.id.footballButton)
    Button footballButton;
    @BindView(R.id.languagesButton)
    Button languagesButton;
    @BindView(R.id.musicButton)
    Button musicButton;
    @BindView(R.id.photoButton)
    Button photoButton;
    @BindView(R.id.sportButton)
    Button sportButton;
    @BindView(R.id.turclubButton)
    Button turclubButton;
    @BindView(R.id.volleyballButton)
    Button volleyballButton;
    @BindView(R.id.interestedTitle)
    TextView interestedTitle;
    @BindView(R.id.creationButton)
    Button creationButton;
    private View view;
    private Settings settings;

    public InterestedFragment(){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_interested, container, false);
        ButterKnife.bind(this, view);
        settings = MyApp.INSTANCE.getSettings();
        return view;
    }

    @OnClick(R.id.fintessButton)
    public void onFintessButtonClicked(){
        VK.execute(new VkChatJoinRequest(FITNESS), getChatJoinResponse(FITNESS));
    }

    @OnClick(R.id.footballButton)
    public void onFootballButtonClicked(){
        VK.execute(new VkChatJoinRequest(FOOTBALL), getChatJoinResponse(FOOTBALL));
    }

    @OnClick(R.id.languagesButton)
    public void onLanguagesButtonClicked(){
        VK.execute(new VkChatJoinRequest(LANGUAGES), getChatJoinResponse(LANGUAGES));
    }

    @OnClick(R.id.musicButton)
    public void onMusicButtonClicked(){
        VK.execute(new VkChatJoinRequest(MUSIC), getChatJoinResponse(MUSIC));
    }

    @OnClick(R.id.photoButton)
    public void onPhotoButtonClicked(){
        VK.execute(new VkChatJoinRequest(PHOTO), getChatJoinResponse(PHOTO));
    }

    @OnClick(R.id.sportButton)
    public void onSportButtonClicked(){
        VK.execute(new VkChatJoinRequest(SPORT), getChatJoinResponse(SPORT));
    }

    @OnClick(R.id.turclubButton)
    public void onTurclubButtonClicked(){
        VK.execute(new VkChatJoinRequest(TURCLUB), getChatJoinResponse(TURCLUB));
    }

    @OnClick(R.id.volleyballButton)
    public void onVolleyballButtonClicked(){
        VK.execute(new VkChatJoinRequest(VOLLEYBALL), getChatJoinResponse(VOLLEYBALL));
    }

    @OnClick(R.id.creationButton)
    public void onCreationButtonClicked(){
        VK.execute(new VkChatJoinRequest(CREATION), getChatJoinResponse(CREATION));
    }

    private VKApiCallback<ChatJoinResponse> getChatJoinResponse(String inviteLink){
        return new VKApiCallback<ChatJoinResponse>(){
            @Override
            public void success(ChatJoinResponse chatJoinResponse){
                Log.d(D_TAG, "onSuccessChatJoin");
                openChat(inviteLink);
            }

            @Override
            public void fail(@NotNull VKApiExecutionException e){
                if(e.getCode() == WebApi.ALREADY_JOINED_ERROR_CODE){
                    Log.d(D_TAG, "onFailureChatJoin");
                    openChat(inviteLink);
                }
            }
        };
    }

    private void openChat(String inviteLink){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(inviteLink));
        startActivity(i);
    }
}
