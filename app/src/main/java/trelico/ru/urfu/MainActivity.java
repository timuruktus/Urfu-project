package trelico.ru.urfu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.vk.api.sdk.VK;
import com.vk.api.sdk.auth.VKAccessToken;
import com.vk.api.sdk.auth.VKAuthCallback;

import org.jetbrains.annotations.NotNull;

import trelico.ru.urfu.utils.NavigationManager;

import static trelico.ru.urfu.MyApp.D_TAG;

public class MainActivity extends AppCompatActivity implements NavigationManager{


    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navController = Navigation.findNavController(this, R.id.navHostFragment);
    }

    @Override
    public void navigateTo(int resId){
        if(navController.getCurrentDestination() != navController.getGraph().findNode(resId)){
            navController.navigate(resId);
        }
    }

    @Override
    public void navigateWithPopTo(int fragmentIdToNavigate, int fragmentIdToPop, boolean inclusive){
        NavOptions.Builder builder = new NavOptions.Builder().setPopUpTo(fragmentIdToPop, inclusive);
        NavOptions options = builder.build();
        navController.navigate(fragmentIdToNavigate, null, options);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        Log.d(D_TAG, "requestCode=" + requestCode + ", resultCode=" +
                resultCode + ", isDataNull=" + (data == null) + "");
        try{
            VK.onActivityResult(requestCode, resultCode, data, getVkAuthCallback());
        }catch(NumberFormatException ex){
            ex.printStackTrace();
            getVkAuthCallback().onLoginFailed(0);
        }
    }

    private VKAuthCallback getVkAuthCallback(){
        return new VKAuthCallback(){
            @Override
            public void onLogin(@NotNull VKAccessToken vkAccessToken){
                Log.d(D_TAG, "onLogin");
                MyApp.INSTANCE.getSettings().setUserToken(vkAccessToken.getAccessToken());
                navigateTo(R.id.newsFragment);
            }

            @Override
            public void onLoginFailed(int i){
                Log.d(D_TAG, "onLoginFailed");
                Toast.makeText(getApplicationContext(), "Неудачная авторизация", Toast.LENGTH_SHORT).show();
            }
        };
    }
}
