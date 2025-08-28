package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Ex 1 — Conceito de Layouts.
 * StackPane centraliza o conteúdo por natureza — bom para itens únicos.
 */
public class Ex1Layouts {

    public static Scene getScene(Stage stage) {
        Label label = new Label(
                "Layouts em JavaFX organizam e alinham componentes.\n" +
                "Eles tornam a interface previsível, responsiva e fácil de manter."
        );
        label.setWrapText(true);

        StackPane root = new StackPane(label);
        root.setPadding(new Insets(20)); // margem interna
        // StackPane centraliza por padrão, adequado para mensagem curta.

        Scene scene = new Scene(root, 500, 200);
        // Voltar ao menu com clique duplo na cena (simples para demo)
        scene.setOnMouseClicked(e -> {
            if (e.getClickCount() == 2) stage.setScene(new Main().getMenuScene(stage));
        });
        return scene;
    }
}
