package trelico.ru.urfu.models;

import com.vk.api.sdk.requests.VKRequest;

public class VkGetChatHistoryRequest extends VKRequest<ChatHistoryResponse>{

    public static final int DEFAULT_CHAT_COUNT = 50;

    public VkGetChatHistoryRequest(int offset, long chatId){
        super("messages.getHistory");
        addParam("count", DEFAULT_CHAT_COUNT);
        addParam("offset", offset);
        addParam("peer_id", chatId);
    }
}
