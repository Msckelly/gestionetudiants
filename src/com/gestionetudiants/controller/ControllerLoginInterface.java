package com.gestionetudiants.controller;

import java.awt.Color;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class ControllerLoginInterface implements Initializable{
	
	private static final String USERNAME = "Admin" ;
	private static final String PASSWORD = "123" ;
	private String errorMessage = "" ;

	private static final String cheminTableauDeBord = "/view/dashbord.fxml" ;

    @FXML
    private Button loginBtnClose;

    @FXML
    private Label loginMessage;

    @FXML
    private TextField loginName;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Button loginSubmit;
    
    
    
    
    private boolean isFielFilled() {
    	
    	boolean isFielFilled = true ;
    	if(loginName.getText().trim().isEmpty()) {
    		isFielFilled = false ;
    		errorMessage = "Veuillez saisir un login !" ;
    	}
    	
    	if(loginPassword.getText().trim().equals("")) {
    		isFielFilled = false ;
    		if (loginMessage.equals("")) {
        		errorMessage = "Veuillez saisie un mot de passe !\n" ;
			}else {
				errorMessage += "\n Veuillez saisie un mot de passe !" ;
			}
    	}
    	
    	loginMessage.setText(errorMessage);
    	return isFielFilled;
    }
    
    
    private boolean isValid() {
    	boolean isValid = true ;
    	if(!loginName.getText().trim().equals(USERNAME)) {
    		 isValid = false ;
    		errorMessage += "Invalide login. Contactez l'administrateur! \n" ;
    	}
    	
    	if(!loginPassword.getText().trim().equals(PASSWORD)) {
    		if (errorMessage.equals("")) {
    			isValid = false ;
    			errorMessage = "Invalide mot de passe. Contactez l'administrateur! \n" ;
			}else {
				errorMessage += "\nInvalide mot de passe. Contactez l'administrateur!" ;
			}
    		
    	}
    	
    	
    	loginMessage.setText(errorMessage );
    	loginMessage.setTextFill(javafx.scene.paint.Color.RED);
    	return isValid ;
    }
    
    private void startTableauDeBord() {
    	try {
			Parent root = FXMLLoader.load(getClass().getResource(cheminTableauDeBord));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Probleme de lancement du tableau de bord !");
			System.out.println(e.getMessage());
		}
    }


    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		loginBtnClose.setOnMouseClicked(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		loginSubmit.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if (isFielFilled() && isValid()) {
					startTableauDeBord();
					((Node) (arg0.getSource())).getScene().getWindow().hide();
					
					System.out.println("Tout est ok"); 
				}else {
					System.out.println("probleme de connexion");
				}
			
			}
		});
		
	}


	
    
    

}
