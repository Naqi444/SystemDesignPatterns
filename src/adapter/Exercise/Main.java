package adapter.Exercise;

import adapter.Exercise.Gmail.GmailClient;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 4:53 PM
 */
public class Main {
    public static void main(String[] args) {
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter(new GmailClient()));
        emailClient.downloadEmails();
    }
}
