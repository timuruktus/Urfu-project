package trelico.ru.urfu.screens.login;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.auth.VKAccessToken;
import com.vk.api.sdk.auth.VKAuthCallback;
import com.vk.api.sdk.auth.VKScope;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import trelico.ru.urfu.MyApp;
import trelico.ru.urfu.R;
import trelico.ru.urfu.data_sources.local.Settings;
import trelico.ru.urfu.utils.NavigationManager;

import static trelico.ru.urfu.MyApp.D_TAG;


public class LoginFragment extends MvpAppCompatFragment{


    @BindView(R.id.button)
    Button button;
    @BindView(R.id.imageView)
    ImageView imageView;
    private View view;

    public LoginFragment(){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onResume(){
        super.onResume();
        if(VK.isLoggedIn()){
            Log.d(D_TAG, "isUserLoggedIn in LoginFragment");
            NavigationManager navigationManager = (NavigationManager) getActivity();
            navigationManager.navigateWithPopTo(R.id.newsFragment, R.id.newsFragment, true);
        }
    }

    @OnClick(R.id.button)
    public void onViewClicked(){
        ArrayList<VKScope> vkScopes = new ArrayList<>();
        vkScopes.add(VKScope.OFFLINE);
        VK.login(getActivity(), vkScopes);
    }


}
