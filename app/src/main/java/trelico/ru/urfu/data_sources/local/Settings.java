package trelico.ru.urfu.data_sources.local;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;

import java.util.ArrayList;

public class Settings{

    private static SharedPreferences sharedPreferences;
    private static final String APP_PREFERENCES = "mySettings";
    private static final String USER_TOKEN = "token";

    public Settings(Context context) {
        sharedPreferences = context.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
    }

    public boolean isUserLoggedIn(){
        return !getStringValue(USER_TOKEN).trim().isEmpty();
    }

    public String getUserToken(){
        return getStringValue(USER_TOKEN);
    }

    public void setUserToken(String token){
        writeStringValue(USER_TOKEN, token);
    }

    public void saveIdToChat(String inviteLink, long chatId ){
        writeLongValue(inviteLink, chatId);
    }

    public void setNewsSubscribe(String inviteLink, boolean subscribe){
        writeBooleanValue(inviteLink, subscribe);
    }

    public boolean isSubscribedToNews(String inviteLink){
        return getBooleanValue(inviteLink, false);
    }

    /**
     * if there is no chat id, return 0
     * @param inviteLink
     * @return
     */
    public long getIdToChat(String inviteLink){
        return getLongValue(inviteLink);
    }

    /**
     * UNDER THIS LINE- 1-LVL METHODS
     * 1-lvl methods is used to write and read data from SharedReference.
     */

    private static void writeStringValue(String path, String value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(path, value);
        editor.apply();
    }

    private static void writeLongValue(String path, long value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(path, value);
        editor.apply();
    }

    private static void writeBooleanValue(String path, boolean value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(path, value);
        editor.apply();
    }

    private static String getStringValue(String path){
        return getStringValue(path, "");
    }

    private static String getStringValue(String path, String defaultValue){
        return sharedPreferences.getString(path, defaultValue);
    }

    private static long getLongValue(String path){
        return getLongValue(path, 0);
    }

    private static long getLongValue(String path, long defaultValue){
        return sharedPreferences.getLong(path, defaultValue);
    }

    private static boolean getBooleanValue(String path){
        return getBooleanValue(path, false);
    }

    private static boolean getBooleanValue(String path, boolean defaultValue){
        return sharedPreferences.getBoolean(path, defaultValue);
    }
}
