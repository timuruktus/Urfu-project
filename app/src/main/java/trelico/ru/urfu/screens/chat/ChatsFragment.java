package trelico.ru.urfu.screens.chat;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.stfalcon.chatkit.commons.models.IDialog;
import com.stfalcon.chatkit.dialogs.DialogsList;
import com.stfalcon.chatkit.dialogs.DialogsListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import trelico.ru.urfu.MyApp;
import trelico.ru.urfu.R;


public class ChatsFragment extends MvpAppCompatFragment implements IChatsFragment{


    @BindView(R.id.dialogsList)
    DialogsList dialogsList;
    @InjectPresenter
    ChatsPresenter chatsPresenter;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    private View view;

    public ChatsFragment(){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_chats, container, false);
        ButterKnife.bind(this, view);
        DialogsListAdapter<IDialog> dialogsListAdapter = new DialogsListAdapter<>(MyApp.INSTANCE.getImageLoader());
        dialogsList.setAdapter(dialogsListAdapter);
        return view;
    }

    @OnClick(R.id.fab)
    public void onViewClicked(){
    }
}
