package decorator;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 5:06 PM
 */
public class Main {
    public static void main(String[] args) {
        storeCreditCard(new CompressedCloudStream(new EncrpytedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-12354-224");
    }
}
