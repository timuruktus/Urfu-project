package trelico.ru.urfu.screens.news;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import trelico.ru.urfu.R;
import trelico.ru.urfu.utils.NavigationManager;


public class NewsFragment extends Fragment{


    @BindView(R.id.fab)
    FloatingActionButton fab;
    private View view;


    public NewsFragment(){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_news, container, false);
        ButterKnife.bind(this, view);
        fab.setOnClickListener(v -> {
            NavigationManager navigationManager = (NavigationManager) getActivity();
            navigationManager.navigateTo(R.id.interestedFragment);
        });
        return view;
    }

}
