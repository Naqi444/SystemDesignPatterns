package composite;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 12:35 PM
 */
public class Shape implements Component {

    @Override
    public  void  render(){
        System.out.println("Rendering shape");
    }

    @Override
    public void move() {
        System.out.println("Moving shape");
    }
}

