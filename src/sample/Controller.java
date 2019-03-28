package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller {
    public TextField upis;
    public Label labela;

    public void ispis(ActionEvent actionEvent) {


        String recenica="";
        recenica = upis.getText();


        String najduza="";

        for(String rijec : recenica.split(" ") ){

            if(rijec.length() > najduza.length())

                najduza = rijec;
        }
        String novi;
        novi=recenica.replaceAll(najduza,(najduza.toUpperCase()));
        labela.setText(novi);




    }

   }
