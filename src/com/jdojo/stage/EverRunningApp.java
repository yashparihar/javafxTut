// EverRunningApp.java
package com.jdojo.stage;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;


public class EverRunningApp extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
            stage.setTitle("hello stage");
            Group root=new Group(new Button("btn"));
            
            Scene scene=new Scene(root,300,300);
            stage.setScene(scene);
            stage.setHeight(400);
            stage.show();
            //stage.close();
		// Do not write any code here
	}
}
