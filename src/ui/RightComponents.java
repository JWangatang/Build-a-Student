// Jonathan Wang
// ITP 368, Fall 2017
// Assignment 7
// jonathzw@usc.edu

package ui;

import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class RightComponents {

	private static double sleepPoints = 0, healthPoints = 0, gradesPoints = 0, socialLifePoints = 0;
	private static SimpleStringProperty sleepStringProperty = new SimpleStringProperty("Sleep: " + sleepPoints);
	private static SimpleStringProperty healthStringProperty = new SimpleStringProperty("Health: " + healthPoints);
	private static SimpleStringProperty gradesStringProperty = new SimpleStringProperty("Grades: " + gradesPoints);
	private static SimpleStringProperty socialLifeStringProperty = new SimpleStringProperty("Social Life: " + socialLifePoints);
	
	// TODO: add style to layout
	public static VBox getPane() {
		// Outermost box
		VBox vbox = new VBox();
		vbox.setSpacing(10);
		vbox.setPadding(new Insets(10, 10, 10, 10));

		
		// Build Your Own
		Label goalsLabel = new Label("Goals");
		goalsLabel.setFont(Constants.staticLabelFont);
		
		// Sleep
		Label sleepLabel = new Label();
		sleepLabel.textProperty().bind(sleepStringProperty);
		goalsLabel.setFont(Constants.labelFont);

				
		// Health
		Label healthLabel = new Label();
		healthLabel.textProperty().bind(healthStringProperty);
		goalsLabel.setFont(Constants.labelFont);

		
		// Grades
		Label gradesLabel = new Label();
		gradesLabel.textProperty().bind(gradesStringProperty);
		goalsLabel.setFont(Constants.labelFont);

				
		// Social Life
		Label socialLifeLabel = new Label();
		socialLifeLabel.textProperty().bind(socialLifeStringProperty);
		goalsLabel.setFont(Constants.labelFont);

		
		vbox.getChildren().addAll(goalsLabel, sleepLabel, healthLabel, gradesLabel, socialLifeLabel);
		
		return vbox;
	}
	
	// TODO: Setters and getters for top components
	
}
