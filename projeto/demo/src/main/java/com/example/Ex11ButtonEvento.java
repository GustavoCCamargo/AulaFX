package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Ex 11 — Button + Evento: "Contar Cliques"
 */
public class Ex11ButtonEvento {

    public static Scene getScene(Stage stage) {
        Label label = new Label("Cliques: 0");
        Button contar = new Button("Contar Cliques");
        Button voltar = new Button("Voltar");
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));

        // Evento que incrementa contador
        final int[] contador = {0};
        contar.setOnAction(e -> {
            contador[0]++;
            label.setText("Cliques: " + contador[0]);
        });

        VBox vbox = new VBox(10, label, contar, voltar);
        vbox.setPadding(new Insets(20));
        return new Scene(vbox, 300, 180);
    }
}
