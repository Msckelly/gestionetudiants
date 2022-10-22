package com.gestionetudiants.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class ControllerDashbord {

    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane bp;

    @FXML
    void deconnexion(MouseEvent event) {

    	System.exit(0);
    }

    @FXML
    void gestionetudiants(MouseEvent event) {
    	loadPage("gestionetudiants");
    }

    @FXML
    void gestionprofesseurs(MouseEvent event) {
    	loadPage("gestionprofesseurs");
    }

    @FXML
    void tableauddebord(MouseEvent event) {
    	bp.setCenter(ap);
    }

    @FXML
    void vuegeneral(MouseEvent event) {
    	loadPage("vueGenerale");
    }

    @FXML
    void inscription(MouseEvent event) {
    	loadPage("inscriptionUser");
    }
    
    private void loadPage(String page) {
    	Parent root = null ;
    	try {
			root = FXMLLoader.load(getClass().getResource("/view/"+page+".fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	bp.setCenter(root);
    }

}
