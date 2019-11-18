import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Emner;
import model.Sporgsmaal;


public class LaeringsmaalController {

    private int qustion = 0;
    private int spm1 = 0;
    Emner emner = new Emner();
    Sporgsmaal q = new Sporgsmaal();
   private int spm = q.getAlleSporgsmaal().size();
    private int qustion2 = emner.getEmner().length;




    @FXML
    TextField emneTextField;

    @FXML
    TextArea spoergsmaalTextArea;

    @FXML
    //indlæser data
    private void indlaes() {
        if (qustion>=0 || qustion<=qustion2) {
            System.out.println(emner.getEmne(qustion));
            emneTextField.setText(emner.getEmne(qustion));
            if(spm1>=0 ||spm1<spm) {
            spoergsmaalTextArea.setText(q.getSporgsmaal(spm1) + "\n");}
        }

    }

    @FXML
    //går vidre til næste spørgsmål
    private void naeste() {
        if (spm1<spm-1) {
            qustion++;
            spm1++;
            indlaes();
        }
    }

    @FXML
    // går tilbage til forige spørgsmål
    private void forrige() {
        if (spm1>0 && qustion>0) {
            qustion--;
            spm1--;
            emneTextField.setText("");
            indlaes();
        }
    }

    @FXML
    // Gemmer indput.
    private void gem(){
        emner.setEmne(qustion, emneTextField.getText());
        q.setSporgsmaal(spm1, spoergsmaalTextArea.getText());
    }

}
