package com.mycompany.barrasbrancas;

import com.mycompany.controllers.ContasController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    private Label label;
    @FXML
    private TextField txtMediaSigai;
    @FXML
    private TextField txtTotalEcts;
    @FXML
    private TextField txtMediaPortal;
    @FXML
    private Button btnSubmeter;
    @FXML
    private Button btnLimpar;
    @FXML
    private TextField txtEctsCadeira;
    @FXML
    private Label lbInfo;
    
    private ContasController contasController = new ContasController();
    @FXML
    private Label lblNota;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void submeter(ActionEvent event) {
        try{
            lbInfo.setText("");
            double mediaSigai = Double.parseDouble(txtMediaSigai.getText());
            int totalEcts = Integer.parseInt(txtTotalEcts.getText());
            double mediaPortal = Double.parseDouble(txtMediaPortal.getText());
            int ectsCadeira = Integer.parseInt(txtEctsCadeira.getText());
            
            this.contasController.newContas(mediaPortal, totalEcts, mediaSigai, ectsCadeira);
            lblNota.setText("A nota do exame é: " + contasController.getNotaASaber());
        }
        catch(Exception e) {
            lbInfo.setText("Campos inválidos.");
        }
    }

    @FXML
    private void limpar(ActionEvent event) {
        txtMediaSigai.setText("");
        txtTotalEcts.setText("");
        txtMediaPortal.setText("");
        txtEctsCadeira.setText("");
        lblNota.setText("");
    }
}
