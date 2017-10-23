/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moklet.bank;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author IRFANHI_
 */
public class FXMLDocumentController implements Initializable {
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private Label label;

    @FXML
    private JFXPasswordField editpin;

    @FXML
    private JFXButton satu;

    @FXML
    private JFXButton dua;

    @FXML
    private JFXButton tiga;

    @FXML
    private JFXButton empat;

    @FXML
    private JFXButton lima;

    @FXML
    private JFXButton enam;

    @FXML
    private JFXButton tujuh;

    @FXML
    private JFXButton delapan;

    @FXML
    private JFXButton sembilan;

    @FXML
    private JFXButton c;

    @FXML
    private JFXButton nol;

    @FXML
    private JFXButton ok;

 @FXML
    void tekan0(ActionEvent event) {
           pin +="0";
           editpin.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
           pin +="1";
             editpin.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
            pin +="2";
             editpin.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
            pin +="3";
             editpin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
            pin +="4";
             editpin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
            pin +="5";
            editpin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
         pin +="6";
             editpin.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
         pin +="7";
            editpin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
         pin +="8";
             editpin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
         pin +="9";
            editpin.setText(pin);
    }

    
    @FXML
    void tekanc(ActionEvent event) {
            pin+= "";
          editpin.setText(pin);
    }
    
    

    @FXML
    void tekannol(ActionEvent event) {
  pin +="0";
            editpin.setText(pin);
    }

    @FXML
    void tekanok(ActionEvent event) {
if (pin.equals(PIN)){
                try {
                    ( (Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLDocument2.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 830, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
                } catch(IOException e){
                    System.out.println("Failed to create new Window."+e);
                }
            }else{
                kesempatan -=1;
                JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa" + kesempatan + "kesempatan lagi!");
                editpin.setText("");
                pin ="";
                if(kesempatan == 0){
                    System.exit(0);
                }
                }}
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
