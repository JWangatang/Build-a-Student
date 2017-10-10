// Jonathan Wang
// ITP 368, Fall 2017
// Assignment 7
// jonathzw@usc.edu

package ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CenterComponents {
	
	private static final String [] 
			// TODO: Add more here
			rowNames = {
				"Major and Minors", 
				"Exercise (times per week)",
				"Diet",
				"Sleep",
				"Clubs", 
				"Parties" },
			
			// TODO: More extensive list.
			majors = {
				"Engineering",
				"Business",
				"Humanities",
				"Arts",
				"Science" },
			diets = {
				"Meal Plan", 
				"Eat Out",
				"Cook"
			};
	
	public static GridPane getPane() {
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(5); grid.setVgap(10);
		grid.setAlignment(Pos.CENTER_LEFT);
		
		makeRows(grid);
		
		return grid;
	} 
	
	private static void makeRows(GridPane grid) {
		// Make row names
		for (int i=0; i<rowNames.length; i++) {
			Label rowLabel = new Label(rowNames[i]);
			rowLabel.setFont(Constants.staticLabelFont);
			grid.add(rowLabel, 0, i);
		}
		
		// Make individual rows (sets off a chain of function calls)
		makeRow0(grid);
	}
	
	
	private static void makeRow0(GridPane grid) {
		VBox vbox = new VBox();
		for (String major : majors) {
			CheckBox majorCheckBox = new CheckBox(major);
			vbox.getChildren().add(majorCheckBox);
		}
		
		grid.add(vbox, 1, 0);
		makeRow1(grid);
	}
	
	private static void makeRow1(GridPane grid) {
		Slider slider = new Slider(0, 7, 0);
		slider.setBlockIncrement(1);
		slider.showTickLabelsProperty();
		slider.showTickMarksProperty();
		grid.add(slider, 1, 1);
		makeRow2(grid);
	}

	private static void makeRow2(GridPane grid) {
		GridPane dietGrid = new GridPane();
		for (int i=0; i<diets.length; i++) {
			CheckBox dietBox = new CheckBox(diets[i]);
			dietGrid.add(dietBox, 0, i);
			Slider dietSlider = new Slider(0, 3, 0);
			dietGrid.add(dietSlider, 1, i);
		}
		grid.add(dietGrid, 1, 2);
		makeRow3(grid);
	}
	
	private static void makeRow3(GridPane grid) {

		Spinner<Integer> spinner = new Spinner<Integer>(0, 24, 0);
		grid.add(spinner, 1, 3);

		makeRow4(grid);
	}
	
	private static void makeRow4(GridPane grid) {
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		
		Label numClubsLabel = new Label ("# of clubs joined: ");
		TextField numClubs = new TextField();
		numClubs.setPrefColumnCount(2);
		Label numHoursLabel = new Label ("Average # of hours per week: ");
		TextField numHours = new TextField();
		numHours.setPrefColumnCount(2);
		
		hbox.getChildren().addAll(numClubsLabel, numClubs, numHoursLabel, numHours);

		grid.add(hbox, 1, 4);

		makeRow5(grid);
	}

	private static void makeRow5(GridPane grid) {
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		Label partyLabel = new Label ("Days per week: ");
		Spinner<Integer> spinner = new Spinner<Integer>(0, 7, 0);
		hbox.getChildren().addAll(partyLabel, spinner);
		
		grid.add(hbox, 1, 5);
		
		//makeRow6(grid);
	}
	
	// TODO: Add more rows here
	
}
