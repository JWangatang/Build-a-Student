// Jonathan Wang
// ITP 368, Fall 2017
// Assignment 7
// jonathzw@usc.edu

package ui;

import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class TopComponents {
	
	private static double timePoints = 100.0;
	private static SimpleStringProperty timeStringProperty = new SimpleStringProperty("Time: " + timePoints);

	private static double moneyPoints = 100.0;
	private static SimpleStringProperty moneyStringProperty = new SimpleStringProperty("Money: " + moneyPoints);

	
	public static HBox getPane() {
		// Outermost box
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.setPadding(new Insets(10, 10, 10, 10));
		
		// Build Your Own
		Label appNameLabel = new Label("Build-A-Student: College Edition");
		appNameLabel.setFont(Constants.staticLabelFont);
		appNameLabel.setPadding(new Insets(0, 30, 0, 0));
		
		// Time
		Label timeLabel = new Label();
		timeLabel.textProperty().bind(timeStringProperty);
		timeLabel.setFont(Constants.labelFont);
				
		// Money
		Label moneyLabel = new Label();
		moneyLabel.textProperty().bind(moneyStringProperty);
		moneyLabel.setFont(Constants.labelFont);
		
		hbox.getChildren().addAll(appNameLabel, timeLabel, moneyLabel);
		
		return hbox;
	}
	
	// TODO: Setters and getters for top components
}
