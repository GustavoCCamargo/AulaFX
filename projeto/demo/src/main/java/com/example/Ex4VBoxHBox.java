package com.example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Ex 4 — VBox + HBox
 */
public class Ex4VBoxHBox {

    public static Scene getScene(Stage stage) {
        // Toolbar (reaproveita HBox ideia)
        Button novo = new Button("Novo");
        Button abrir = new Button("Abrir");
        Button salvar = new Button("Salvar");
        HBox toolbar = new HBox(10, novo, abrir, salvar);
        toolbar.setPadding(new Insets(10));
        toolbar.setAlignment(Pos.CENTER_LEFT);

        Label conteudo = new Label("Conteúdo textual abaixo da toolbar. Ajuste padding e spacing para separar visualmente.");
        conteudo.setWrapText(true);

        Button voltar = new Button("Voltar");
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));

        VBox vbox = new VBox(12, toolbar, conteudo, voltar);
        vbox.setPadding(new Insets(16));
        vbox.setAlignment(Pos.TOP_LEFT);

        return new Scene(vbox, 600, 300);
    }
}
