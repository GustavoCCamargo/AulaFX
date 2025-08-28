package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Ex 12 — TextField (validação apenas números)
 */
public class Ex12TextFieldValidacao {

    public static Scene getScene(Stage stage) {
        Label aviso = new Label("Apenas números");
        TextField campo = new TextField();
        campo.setPromptText("Digite apenas dígitos (0-9)");
        campo.textProperty().addListener((obs, oldText, newText) -> {
            if (!newText.matches("\\d*")) {
                // substitui pelo texto filtrado (apenas dígitos)
                campo.setText(newText.replaceAll("[^\\d]", ""));
            }
        });

        var voltar = new javafx.scene.control.Button("Voltar");
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));

        VBox vbox = new VBox(10, aviso, campo, voltar);
        vbox.setPadding(new Insets(16));
        return new Scene(vbox, 360, 160);
    }
}
