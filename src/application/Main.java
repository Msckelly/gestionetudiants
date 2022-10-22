package application;
	
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;

import com.gestionetudiants.ImpRepository.ProfesseurImpRepository;
import com.gestionetudiants.entities.GestionprofesseurEntities;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			ProfesseurImpRepository prImpRepository = new ProfesseurImpRepository();
			
			List<GestionprofesseurEntities> list = prImpRepository.getAllProfesseur();
			if(list != null )
				System.out.println(list.get(0).getNci());
			else
				System.out.println("Probleme de recuperation des donnees de la base");
			 
			
			Parent parentroot = FXMLLoader.load(getClass().getResource("/view/loginInterface.fxml"));
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
	
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm() );
			primaryStage.setScene(new Scene(parentroot));
			primaryStage.setResizable(false);
			//primaryStage.initStyle(StageStyle.UNDECORATED);
			Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			primaryStage.show();
			
			primaryStage.setX((dimension.width / 2) - (primaryStage.getWidth()/2)) ;
			primaryStage.setY((dimension.height / 2) - (primaryStage.getHeight()/2)) ;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
