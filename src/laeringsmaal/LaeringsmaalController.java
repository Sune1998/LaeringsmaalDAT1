import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Emner;
import model.Sporgsmaal;


public class LaeringsmaalController {

    private int i1 = 0;
    private int j1 = 0;
    Emner emner = new Emner();
    Sporgsmaal q = new Sporgsmaal();
   private int j2 = q.getAlleSporgsmaal().size();
    private int i2 = emner.getEmner().length;




    @FXML
    TextField emneTextField;

    @FXML
    TextArea spoergsmaalTextArea;

    @FXML
    private void indlaes() {
        if (i1>=0 || i1<=i2) {
            System.out.println(emner.getEmne(i1));
            emneTextField.setText(emner.getEmne(i1));
            if(j1>=0 ||j1<j2) {
            spoergsmaalTextArea.setText(q.getSporgsmaal(i1) + "\n");}
        }

    }

    @FXML
    private void naeste() {
        if (j1<j2-1) {
            i1++;
            j1++;
            indlaes();
        }
    }

    @FXML
    private void forrige() {
        if (j1<0 && i1<0) {
            i1--;
            j1--;
            emneTextField.setText("");
            indlaes();
        }
    }

    @FXML
    private void gem() {
        emner.setEmne(i1, emneTextField.getText());
        q.setSporgsmaal(j1, spoergsmaalTextArea.getText());
    }

}
