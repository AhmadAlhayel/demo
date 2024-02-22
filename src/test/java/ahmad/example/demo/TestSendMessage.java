package ahmad.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestSendMessage {

    private static SendMessage msg;
    @BeforeAll
    public static void sendMessage(){
        msg=new SendMessage();
    }
    @Test
    public void checkMessage() {

        assertEquals(msg.sendMessage(), "Message from Messenger");
    }

    @Test
    public void checkWrongMessage() {

        assertNotEquals(msg.sendMessage(), "ello World");
    }


}
