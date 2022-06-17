package calculadoraimc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController {
Float peso, altura, imc;
    
    @FXML
    private Button button;

    @FXML
    private TextField cxpeso;

    @FXML
    private Label label;

    @FXML
    private Label label1;

    @FXML
    private TextField cxaltura;

    @FXML
    private TextArea cxresult;

    @FXML
    void calcular(ActionEvent event) {
        peso=Float.valueOf(cxpeso.getText());
        altura=Float.valueOf(cxaltura.getText());
        imc=peso/(altura*altura);
        cxresult.setText(verificaIMC(imc));
        
    }

    private String verificaIMC(Float imc) {
    String result;
        
        if (imc <= 18.5 )
            result="MAGREZA"+"\n Seu IMC é de "+imc+".";
        
            
        else if (imc > 18.6 & imc <=24.9 )
            result="PESO NORMAL"+"\n Seu IMC é de "+imc+".";
           
            
        else if (imc > 25 & imc <=29.9 )
            result="SOBREPESO"+"\n Seu IMC é de "+imc+".";
        
        else if (imc > 30 & imc <=34.9 )
            result="OBESIDADE GRAU I"+"\n Seu IMC é de "+imc+".";
        
        else if (imc > 35 & imc <=39.9 )
            result="OBESIDADE GRAU II"+"\n Seu IMC é de "+imc+".";
        
        else 
            result="OBESIDADE GRAU III"+"\n Seu IMC é de "+imc+".";
            
        
        return result;
    }

}
