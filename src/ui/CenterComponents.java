// Jonathan Wang
// ITP 368, Fall 2017
// Assignment 7
// jonathzw@usc.edu

package ui;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class CenterComponents {
	public static VBox getPane() {
		VBox vbox = new VBox();
		vbox.setSpacing(10);
		vbox.setPadding(new Insets(10, 10, 10, 10));
		
		
		
		return vbox;
	}
}
