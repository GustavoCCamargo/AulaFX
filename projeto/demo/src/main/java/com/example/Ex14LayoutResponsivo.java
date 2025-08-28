package com.example;

import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Ex 14 — Layout responsivo: troca entre VBox e HBox dependendo da widthProperty()
 */
public class Ex14LayoutResponsivo {

    public static Scene getScene(Stage stage) {
        // Conteúdo que será colocado em VBox ou HBox conforme largura
        Label a = new Label("Componente A");
        Label b = new Label("Componente B");
        Label c = new Label("Componente C");

        VBox vbox = new VBox(10, a, b, c);
        vbox.setPadding(new Insets(12));

        HBox hbox = new HBox(10, a, b, c);
        hbox.setPadding(new Insets(12));

        // Iniciamos com VBox se largura menor que 600
        VBox rootVBox = new VBox();
        rootVBox.getChildren().add(vbox);

        Scene scene = new Scene(rootVBox, 640, 300);

        // Listener que troca a vista conforme width
        ChangeListener<Number> listener = (obs, oldW, newW) -> {
            double w = newW.doubleValue();
            rootVBox.getChildren().clear();
            if (w < 600) {
                rootVBox.getChildren().add(vbox);
            } else {
                rootVBox.getChildren().add(hbox);
            }
        };

        scene.widthProperty().addListener(listener);

        // Botão voltar - fica sempre visível em rodapé do rootVBox
        javafx.scene.control.Button voltar = new javafx.scene.control.Button("Voltar");
        voltar.setOnAction(e -> stage.setScene(new Main().getMenuScene(stage)));
        rootVBox.getChildren().add(voltar);

        // Inicializa layout adequadamente
        if (scene.getWidth() < 600) {
            rootVBox.getChildren().set(0, vbox);
        } else {
            rootVBox.getChildren().set(0, hbox);
        }

        return scene;
    }
}
