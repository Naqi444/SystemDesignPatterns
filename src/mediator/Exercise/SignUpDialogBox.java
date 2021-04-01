package mediator.Exercise;


/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/27/2021 12:38 AM
 */
public class SignUpDialogBox {

    private CheckBox checkBox = new CheckBox();
    private TextBox username = new TextBox();
    private TextBox password = new TextBox();
    private Button button = new Button();

    public SignUpDialogBox(){
        username.addEventHandler(this::controlChanged);
        password.addEventHandler(this::controlChanged);
        checkBox.addEventHandler(this::controlChanged);
    }

    private void controlChanged(){
        button.setEnabled(isFormValid());
    }

    private boolean isFormValid(){
        return !username.isEmpty() && !password.isEmpty() && checkBox.isChecked();
    }

    public void simulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Initially: " + button.isEnabled());

        // The user enters their username, the button is still disabled
        username.setContent("username");
        System.out.println("After setting the username: " + button.isEnabled());

        // The user enters their password, the button is still disabled
        password.setContent("password");
        System.out.println("After setting the password: " + button.isEnabled());

        // The agrees to the terms, the button becomes enabled
        checkBox.setChecked(true);
        System.out.println("After agreeing to terms: " + button.isEnabled());

        // The user removes the password, the button becomes disabled
        password.setContent("");
        System.out.println("After removing the password: " + button.isEnabled());

        // The user enters the password again, the button becomes enabled
        password.setContent("password");
        System.out.println("After re-setting the password: " + button.isEnabled());
    }
}
