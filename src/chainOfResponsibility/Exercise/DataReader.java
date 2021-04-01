package chainOfResponsibility.Exercise;

public class DataReader {
    private Handler handler;
    public DataReader(Handler handler) {
        this.handler = handler;
    }

    public void handle(Data data){
        handler.handle(data);
    }

}
