// IDSelectorTest.java
package com.jdojo.style;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class IDSelectorTest extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		Button openBtn = new Button("Open");
		Button saveBtn = new Button("Save");

		Button closeBtn = new Button("Close");
		closeBtn.setId("closeButton");

		HBox root = new HBox();
		root.getChildren().addAll(openBtn, saveBtn, closeBtn);

		Scene scene = new Scene(root);
		scene.getStylesheets().add("resources/css/idselector.css");

		stage.setScene(scene);
		stage.setTitle("Using ID selectors");
		stage.show();
	}
}
