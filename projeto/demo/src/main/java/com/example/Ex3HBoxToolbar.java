package com.example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Ex 3 — HBox (toolbar)
 * HBox organiza elementos horizontalmente, ideal para toolbars.
 */
public class Ex3HBoxToolbar {

    public static Scene getScene(Stage stage) {
        Button novo = new Button("Novo");
        Button abrir = new Button("Abrir");
        Button salvar = new Button("Salvar");
        Button voltar = new Button("Voltar");

        novo.setOnAction(e -> System.out.println("Novo clicado"));
        abrir.setOnAction(e -> System.out.println("Abrir clicado"));
        salvar.setOnAction(e -> System.out.println("Salvar clicado"));
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));

        HBox hbox = new HBox(15, novo, abrir, salvar, voltar);
        hbox.setPadding(new Insets(12));
        hbox.setAlignment(Pos.CENTER); // espaçamento uniforme
        return new Scene(hbox, 500, 120);
    }
}
