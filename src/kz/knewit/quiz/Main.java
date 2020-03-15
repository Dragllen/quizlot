package kz.knewit.quiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.nio.file.Paths;

public class Main  extends Application {
    public static void main(String[] args) {
//        DBService dbService = new DBService();
//        User user  = new User();
//
//        user.setName("Bla bla");
//        user.setPassword("Bla bla bla");
//        user.setLogin("bla");
//        dbService.createUser(user);
//
//        System.out.println("finish");
//        user.setLogin("bla bla");
//        dbService.updateUser(user);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL url = Paths.get("C:\\Users\\Acer\\IdeaProjects\\quizlot\\src\\kz\\knewit\\quiz\\jfx\\index.fxml").toUri().toURL();
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Shop");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
