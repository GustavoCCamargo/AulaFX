package com.example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Ex 2 — VBox (login)
 */
public class Ex2VBoxLogin {

    public static Scene getScene(Stage stage) {
        Label userLabel = new Label("Usuário:");
        TextField userField = new TextField();
        Label passLabel = new Label("Senha:");
        PasswordField passField = new PasswordField();
        Button entrar = new Button("Entrar");
        Button voltar = new Button("Voltar");

        entrar.setOnAction(e -> {
            // Validacão mínima: campos não vazios
            if (userField.getText().isEmpty() || passField.getText().isEmpty()) {
                System.out.println("Preencha usuário e senha.");
            } else {
                System.out.println("Tentativa de login: " + userField.getText());
            }
        });

        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));

        VBox vbox = new VBox(8, userLabel, userField, passLabel, passField, entrar, voltar);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER); // centraliza vertical/horizontalmente
        vbox.setMinWidth(360);

        return new Scene(vbox, 420, 300);
    }
}
