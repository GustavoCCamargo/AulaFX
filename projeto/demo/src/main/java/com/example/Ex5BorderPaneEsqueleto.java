package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Ex 5 — BorderPane (esqueleto)
 */
public class Ex5BorderPaneEsqueleto {

    public static Scene getScene(Stage stage) {
        BorderPane border = new BorderPane();

        // Top: toolbar
        Button novo = new Button("Novo");
        Button abrir = new Button("Abrir");
        Button salvar = new Button("Salvar");
        VBox top = new VBox(new javafx.scene.layout.HBox(10, novo, abrir, salvar));
        top.setPadding(new Insets(10));
        border.setTop(top);

        // Left: menu vertical
        VBox menu = new VBox(10, new Button("Opção 1"), new Button("Opção 2"), new Button("Opção 3"), new Button("Opção 4"));
        menu.setPadding(new Insets(10));
        border.setLeft(menu);

        // Center: área de trabalho (placeholder)
        Label center = new Label("Área de trabalho — aqui o conteúdo principal aparece");
        center.setPadding(new Insets(10));
        border.setCenter(center);

        // Bottom: barra de status
        Label status = new Label("Status: Pronto");
        status.setPadding(new Insets(8));
        border.setBottom(status);

        // Voltar (adicionamos dentro do top para fácil acesso)
        Button voltar = new Button("Voltar");
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));
        top.getChildren().add(voltar);

        return new Scene(border, 800, 450);
    }
}
