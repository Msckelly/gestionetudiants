package com.gestionetudiants.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControllerGestionProfesseurs {
    @FXML
    private VBox menucontent;

    @FXML
    void ajoutprof(MouseEvent event) {
    	loadPage("popupAjoutProfesseur");
    }
    
    private void loadPage(String page) {
    	Parent root = null ;
    	try {
    		
			root = FXMLLoader.load(getClass().getResource("/custompopup/"+page+".fxml"));
			
			Stage stage = new Stage();
			stage.setTitle("Ajout des professeurs");
			stage.setScene(new Scene(root));
			stage.show();
 			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
}
