package visitor.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:01 AM
 */
public class Main {
    public static void main(String[] args) {
        var wavFile = WavFile.read("myfile.wav");
        wavFile.filter(new NoiseReduction());
        wavFile.filter(new Reverb());
        wavFile.filter(new Normalize());
    }
}
