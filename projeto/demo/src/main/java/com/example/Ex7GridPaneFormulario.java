package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Ex 7 — GridPane (formulário)
 */
public class Ex7GridPaneFormulario {

    public static Scene getScene(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(12));
        grid.setHgap(10);
        grid.setVgap(10);

        Label nomeL = new Label("Nome:");
        TextField nomeF = new TextField();
        Label emailL = new Label("E-mail:");
        TextField emailF = new TextField();
        Label telL = new Label("Telefone:");
        TextField telF = new TextField();
        Label cidadeL = new Label("Cidade:");
        TextField cidadeF = new TextField();

        grid.add(nomeL, 0, 0);
        grid.add(nomeF, 1, 0);
        grid.add(emailL, 0, 1);
        grid.add(emailF, 1, 1);
        grid.add(telL, 0, 2);
        grid.add(telF, 1, 2);
        grid.add(cidadeL, 0, 3);
        grid.add(cidadeF, 1, 3);

        Button salvar = new Button("Salvar");
        Button voltar = new Button("Voltar");
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));

        grid.add(salvar, 1, 4);
        grid.add(voltar, 0, 4);

        // GridPane é ótimo para formulários pois alinha colunas/linhas previsivelmente.
        return new Scene(grid, 520, 300);
    }
}
