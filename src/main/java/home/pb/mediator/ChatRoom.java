package home.pb.mediator;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(MUser MUser, String message){
        System.out.println(new Date().toString() + " [" + MUser.getName() +"] : " + message);
    }
}
