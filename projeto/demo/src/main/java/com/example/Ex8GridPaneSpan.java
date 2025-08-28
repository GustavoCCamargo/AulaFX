package com.example;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Ex 8 — GridPane (span)
 */
public class Ex8GridPaneSpan {

    public static Scene getScene(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(12));
        grid.setHgap(10);
        grid.setVgap(10);

        Label obsLabel = new Label("Observações:");
        TextArea obsArea = new TextArea();
        obsArea.setPrefRowCount(6);

        grid.add(obsLabel, 0, 0);
        // TextArea ocupa duas colunas (colspan = 2)
        GridPane.setColumnSpan(obsArea, 2);
        grid.add(obsArea, 0, 1);

        Button salvar = new Button("Salvar");
        Button voltar = new Button("Voltar");
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));
        grid.add(salvar, 1, 2);
        grid.add(voltar, 0, 2);

        // Alinhar botão salvar à direita dentro de sua célula:
        GridPane.setHalignment(salvar, HPos.RIGHT);

        return new Scene(grid, 600, 320);
    }
}
