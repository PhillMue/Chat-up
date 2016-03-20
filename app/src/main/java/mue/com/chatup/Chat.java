package mue.com.chatup;

/**
 * Created by mue on 3/20/16.
 */
public class Chat {
    private String message;
    private String id;

    public Chat() {
    }

    public Chat(String message, String id) {
        this.message = message;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

