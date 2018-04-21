// CircleTest.java
package com.jdojo.shape;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleTest extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		// centerX=0, centerY=0, radius=40, fill=LIGHTGRAY, stroke=null
		Circle c1 = new Circle(0, 0, 40);
		c1.setFill(Color.LIGHTGRAY);
	
		// centerX=10, centerY=10, radius=40. fill=YELLOW, stroke=BLACK
		Circle c2 = new Circle(10, 10, 40, Color.YELLOW);
		c2.setStroke(Color.BLACK);
		c2.setStrokeWidth(2.0);

		HBox root = new HBox(c1, c2);
		root.setSpacing(10);	
		root.setStyle("-fx-padding: 10;" + 
		              "-fx-border-style: solid inside;" + 
		              "-fx-border-width: 2;" +
		              "-fx-border-insets: 5;" + 
		              "-fx-border-radius: 5;" + 
		              "-fx-border-color: blue;");

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Using Circle");
		stage.show();	
	}
}
