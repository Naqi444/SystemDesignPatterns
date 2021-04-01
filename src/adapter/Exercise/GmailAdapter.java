package adapter.Exercise;

import adapter.Exercise.Gmail.GmailClient;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 4:58 PM
 */
public class GmailAdapter implements EmailProvider{
        private GmailClient gmailClient;

        public GmailAdapter(GmailClient gmailClient)
        {
            this.gmailClient = gmailClient;
        }

        @Override
        public void downloadEmails()
        {
            gmailClient.connect();
            gmailClient.getEmails();
            gmailClient.disconnect();
        }
}