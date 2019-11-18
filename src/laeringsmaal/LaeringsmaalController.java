import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Emner;
import model.Sporgsmaal;


public class LaeringsmaalController {

    private int i1 = 0;
    Emner emner = new Emner();
    Sporgsmaal q = new Sporgsmaal();
    private int j = q.getAlleSporgsmaal().size();



    @FXML
    TextField emneTextField;

    @FXML
    TextArea spoergsmaalTextArea;

    @FXML
    private void indlaes() {
        if (i1>=0 || i1>=10) {
            System.out.println(emner.getEmne(i1));
            emneTextField.setText(emner.getEmne(i1)1);
            spoergsmaalTextArea.setText(q.getSporgsmaal(i1) + "\n");
        }
    }

    @FXML
    private void naeste() {
        i1++;
        indlaes();
    }

    @FXML
    private void forrige() {
        i1--;
        emneTextField.setText("");
        indlaes();
    }

}
