package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private int width  = 288; // 283;
    private int height = 412; // 438;

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//        primaryStage.setMinWidth(width);
//        primaryStage.setMinHeight(height);
//        primaryStage.setMaxWidth(width);
//        primaryStage.setMaxHeight(height);
//        primaryStage.setMaximized(false);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, width, height));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
