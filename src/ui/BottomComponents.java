// Jonathan Wang
// ITP 368, Fall 2017
// Assignment 7
// jonathzw@usc.edu

package ui;

import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class BottomComponents {
	
	private static String descriptionString = "Let's get started!";
	private static SimpleStringProperty descriptionProperty = new SimpleStringProperty(descriptionString);
	
	public static HBox getPane() {
		HBox hbox = new HBox();
		hbox.setSpacing(20);
		hbox.setPadding(new Insets(10, 10, 10, 10));
		
		// Buttons: Build and Reset
		VBox buttonBox = new VBox();
		buttonBox.setSpacing(5);

		Button buildButton = new Button("Build");
		buildButton.setDisable(true);
		Button resetButton = new Button("Reset");
		buttonBox.getChildren().addAll(buildButton, resetButton);
		
		// Text
		Text studentDescription = new Text();
		studentDescription.textProperty().bind(descriptionProperty);
		studentDescription.setFont(Constants.textFont);
		
		
		hbox.getChildren().addAll(buttonBox, studentDescription);
		
		return hbox;
	}
	
	// TODO: getters/setters for student description.
}
