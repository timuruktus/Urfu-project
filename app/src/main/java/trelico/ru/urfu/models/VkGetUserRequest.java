package trelico.ru.urfu.models;

import com.vk.api.sdk.requests.VKRequest;

public class VkGetUserRequest extends VKRequest<ChatJoinResponse>{

    public VkGetUserRequest(String userId){
        super("users.get");
        addParam("user_ids", userId);
    }
}
