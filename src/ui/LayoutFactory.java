// Jonathan Wang
// ITP 368, Fall 2017
// Assignment 7
// jonathzw@usc.edu

package ui;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

// Factory Design Pattern
public class LayoutFactory {
	
	private static BorderPane borderPane;
	
	public static BorderPane generateLayout() {
		borderPane = new BorderPane();
		buildTop();
		buildBottom();
		buildRight();
		buildCenter();
		return borderPane;
	}
	
	private static void buildTop() {
		HBox topBox = TopComponents.getPane();
		borderPane.setTop(topBox);
	}
	
	private static void buildBottom() {
		HBox bottomBox = BottomComponents.getPane();
		borderPane.setBottom(bottomBox);
	}
	
	private static void buildRight() {
		VBox rightBox = RightComponents.getPane();
		borderPane.setRight(rightBox);
	}
	
	private static void buildCenter() {
		GridPane centerBox = CenterComponents.getPane();
		borderPane.setCenter(centerBox);
	}
}
