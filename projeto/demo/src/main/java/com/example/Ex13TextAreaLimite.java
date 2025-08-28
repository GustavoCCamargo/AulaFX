package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Ex 13 — TextArea (limite 140 caracteres)
 */
public class Ex13TextAreaLimite {

    public static Scene getScene(Stage stage) {
        TextArea area = new TextArea();
        area.setWrapText(true);
        Label contador = new Label("0/140");
        Button voltar = new Button("Voltar");
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));

        area.textProperty().addListener((obs, oldText, newText) -> {
            if (newText.length() > 140) {
                area.setText(newText.substring(0, 140)); // bloqueia além do limite
            }
            contador.setText(area.getText().length() + "/140");
        });

        VBox vbox = new VBox(8, area, contador, voltar);
        vbox.setPadding(new Insets(12));
        return new Scene(vbox, 500, 320);
    }
}
