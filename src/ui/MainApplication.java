// Jonathan Wang
// ITP 368, Fall 2017
// Assignment 7
// jonathzw@usc.edu

package ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
				
		BorderPane borderPane = LayoutFactory.generateLayout();
		Scene scene = new Scene(borderPane, 700, 700);
		
		primaryStage.setTitle("Build Your Own College Student");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
