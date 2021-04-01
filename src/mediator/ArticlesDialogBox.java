package mediator;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 11:19 PM
 */
public class ArticlesDialogBox  {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox(){
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article1 1");
        System.out.println(("TextBox:" + titleTextBox.getContent()));
        System.out.println("Button:"+saveButton.isEnabled());
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content==null|| content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
