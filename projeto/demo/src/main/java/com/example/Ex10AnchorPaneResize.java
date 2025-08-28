package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Ex 10 — AnchorPane (redimensionamento)
 */
public class Ex10AnchorPaneResize {

    public static Scene getScene(Stage stage) {
        AnchorPane root = new AnchorPane();
        root.setPadding(new Insets(10));

        TextArea area = new TextArea();
        AnchorPane.setTopAnchor(area, 10.0);
        AnchorPane.setBottomAnchor(area, 50.0); // deixamos espaço para botão voltar
        AnchorPane.setLeftAnchor(area, 10.0);
        AnchorPane.setRightAnchor(area, 10.0);

        Button voltar = new Button("Voltar");
        AnchorPane.setBottomAnchor(voltar, 10.0);
        AnchorPane.setRightAnchor(voltar, 10.0);
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));

        root.getChildren().addAll(area, voltar);
        return new Scene(root, 700, 450);
    }
}
