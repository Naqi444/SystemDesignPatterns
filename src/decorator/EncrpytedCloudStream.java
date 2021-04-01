package decorator;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 5:04 PM
 */
public class EncrpytedCloudStream implements Stream{

    private Stream stream;

    public EncrpytedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    public String encrypt(String data){
        return ("/*-//+$$$%23");
    }
}
