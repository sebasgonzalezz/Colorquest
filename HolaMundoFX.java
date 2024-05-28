import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HolaMundoFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crear un Label (etiqueta) con el texto "Hola, Mundo!"
        Label helloWorldLabel = new Label("Hola, Mundo!");

        // Crear un StackPane y agregar el Label al StackPane
        StackPane root = new StackPane();
        root.getChildren().add(helloWorldLabel);

        // Crear una escena con el StackPane como raíz y establecer el tamaño
        Scene scene = new Scene(root, 300, 200);

        // Establecer el título de la ventana
        primaryStage.setTitle("Hola Mundo en JavaFX");

        // Establecer la escena en el escenario principal
        primaryStage.setScene(scene);

        // Mostrar la ventana
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
