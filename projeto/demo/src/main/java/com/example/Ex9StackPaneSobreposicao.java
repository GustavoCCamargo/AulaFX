package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Ex 9 — StackPane (sobreposição)
 * Observação: se não quiser imagem, a linha de Image pode ser comentada.
 */
public class Ex9StackPaneSobreposicao {

    public static Scene getScene(Stage stage) {
        StackPane root = new StackPane();
        root.setPadding(new Insets(10));

        // Tentar carregar imagem local em resources/com/example/background.jpg
        try {
            Image img = new Image(Ex9StackPaneSobreposicao.class.getResourceAsStream("/com/example/background.jpg"));
            ImageView iv = new ImageView(img);
            iv.setFitWidth(800);
            iv.setPreserveRatio(true);
            root.getChildren().add(iv);
        } catch (Exception ex) {
            // se não houver imagem, apenas ignore; o StackPane funciona sem ela
        }

        Rectangle rect = new Rectangle(500, 120);
        rect.setArcWidth(12);
        rect.setArcHeight(12);
        rect.setFill(Color.rgb(0, 0, 0, 0.45)); // semitransparente

        Label titulo = new Label("Título Sobreposto");
        titulo.setTextFill(Color.WHITE);
        titulo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        titulo.setEffect(new DropShadow(3, Color.BLACK));

        Button voltar = new Button("Voltar");
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));

        // Ordem: imagem (fundo) → retângulo → label
        root.getChildren().addAll(rect, titulo, voltar);
        StackPane.setMargin(voltar, new javafx.geometry.Insets(180, 0, 0, 0));

        return new Scene(root, 800, 400);
    }
}
