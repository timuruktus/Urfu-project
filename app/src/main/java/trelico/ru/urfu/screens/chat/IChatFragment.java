package trelico.ru.urfu.screens.chat;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

import java.util.ArrayList;

import trelico.ru.urfu.models.ChatMessage;

public interface IChatFragment extends MvpView{


    @StateStrategyType(OneExecutionStateStrategy.class)
    void showMessages(ArrayList<ChatMessage> messages);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void startLoading();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void stopLoading();
}
