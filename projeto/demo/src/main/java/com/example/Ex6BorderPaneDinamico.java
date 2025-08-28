package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Ex 6 — BorderPane (dinâmico)
 */
public class Ex6BorderPaneDinamico {

    public static Scene getScene(Stage stage) {
        BorderPane border = new BorderPane();

        // Top
        VBox top = new VBox();
        top.setPadding(new Insets(8));
        border.setTop(top);

        // Center default
        Label defaultCenter = new Label("Selecione uma opção no menu lateral.");
        defaultCenter.setPadding(new Insets(10));
        border.setCenter(defaultCenter);

        // Left: botões que trocam center
        Button b1 = new Button("Conteúdo A");
        Button b2 = new Button("Conteúdo B");
        Button b3 = new Button("Conteúdo C");
        Button voltar = new Button("Voltar");

        b1.setOnAction(e -> border.setCenter(new Label("Conteúdo A exibido")));
        b2.setOnAction(e -> border.setCenter(new Label("Conteúdo B exibido")));
        b3.setOnAction(e -> border.setCenter(new Label("Conteúdo C exibido")));
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));

        VBox left = new VBox(10, b1, b2, b3, voltar);
        left.setPadding(new Insets(10));
        border.setLeft(left);

        return new Scene(border, 700, 420);
    }
}
