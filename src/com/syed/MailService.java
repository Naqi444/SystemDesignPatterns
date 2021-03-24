package com.syed;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 6:47 PM
 */
public class MailService {

    public void sendEmail(){
        connect();
        disconnect();
        authenticate();

    }

    private void connect(){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private  void authenticate(){
        System.out.println("Authenticate");
    }
}
