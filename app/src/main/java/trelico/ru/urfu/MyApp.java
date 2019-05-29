package trelico.ru.urfu;

import android.app.Application;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;
import com.stfalcon.chatkit.commons.ImageLoader;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.VKTokenExpiredHandler;

import trelico.ru.urfu.data_sources.local.Settings;

public class MyApp extends Application{

    public static final String D_TAG = "debug_tag";
    private ImageLoader imageLoader;
    public static MyApp INSTANCE;
    private Settings settings;

    @Override
    public void onCreate(){
        super.onCreate();
        INSTANCE = this;
        settings = new Settings(this);
        imageLoader = (imageView, url, payload) -> Picasso.get().load(url).into(imageView);
        VK.addTokenExpiredHandler(getTokenExpiredHandler());
        VK.initialize(this);
    }

    private VKTokenExpiredHandler getTokenExpiredHandler(){
        return () -> settings.setUserToken("");
    }

    public ImageLoader getImageLoader(){
        return imageLoader;
    }

    public Settings getSettings(){
        return settings;
    }
}
