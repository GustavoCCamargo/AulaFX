package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Main — menu para abrir cada exercício.
 * Coloque este arquivo em src/main/java/com/example/Main.java
 */
public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage stage) {
        this.primaryStage = stage;
        stage.setTitle("Exercícios JavaFX - Menu");
        stage.setScene(getMenuScene(stage));
        stage.setWidth(500);
        stage.setHeight(600);
        stage.show();
    }

    /**
     * Retorna a Scene do menu principal. Usado por cada exercício para voltar.
     */
    public Scene getMenuScene(Stage stage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-alignment: center;");

        // Usamos FlowPane para organizar os botões em múltiplas colunas se necessário
        FlowPane buttons = new FlowPane();
        buttons.setHgap(10);
        buttons.setVgap(10);

        for (int i = 1; i <= 14; i++) {
            Button btn = new Button("Exercício " + i);
            btn.setMinWidth(120);
            int ex = i;
            btn.setOnAction(e -> {
                Scene scene;
                switch (ex) {
                    case 1: scene = Ex1Layouts.getScene(stage); break;
                    case 2: scene = Ex2VBoxLogin.getScene(stage); break;
                    case 3: scene = Ex3HBoxToolbar.getScene(stage); break;
                    case 4: scene = Ex4VBoxHBox.getScene(stage); break;
                    case 5: scene = Ex5BorderPaneEsqueleto.getScene(stage); break;
                    case 6: scene = Ex6BorderPaneDinamico.getScene(stage); break;
                    case 7: scene = Ex7GridPaneFormulario.getScene(stage); break;
                    case 8: scene = Ex8GridPaneSpan.getScene(stage); break;
                    case 9: scene = Ex9StackPaneSobreposicao.getScene(stage); break;
                    case 10: scene = Ex10AnchorPaneResize.getScene(stage); break;
                    case 11: scene = Ex11ButtonEvento.getScene(stage); break;
                    case 12: scene = Ex12TextFieldValidacao.getScene(stage); break;
                    case 13: scene = Ex13TextAreaLimite.getScene(stage); break;
                    case 14: scene = Ex14LayoutResponsivo.getScene(stage); break;
                    default: scene = getMenuScene(stage); break;
                }
                stage.setScene(scene);
            });
            buttons.getChildren().add(btn);
        }

        root.getChildren().addAll(buttons);
        return new Scene(root);
    }

    public static void main(String[] args) {
        launch(args);
    }
}


