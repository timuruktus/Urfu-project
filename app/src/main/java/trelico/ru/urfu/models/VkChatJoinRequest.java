package trelico.ru.urfu.models;

import com.vk.api.sdk.requests.VKRequest;

import org.jetbrains.annotations.NotNull;

public class VkChatJoinRequest extends VKRequest<ChatJoinResponse>{

    public static final int MESSAGES_RETRIEVE_COUNT = 50;

    public VkChatJoinRequest(String link){
        super("messages.joinChatByInviteLink");
        addParam("offset", link);
    }
}
