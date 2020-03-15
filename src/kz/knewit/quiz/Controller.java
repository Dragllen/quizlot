package kz.knewit.quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

public class Controller {

    @FXML
    private AnchorPane Scene;

    @FXML
    private Button signInIndex;

    @FXML
    private Button logInIndex;



    @FXML
    private TextField LoginLogIn;

    @FXML
    private PasswordField PasswordLogIn;

    @FXML
    private Button ButtonLogIn;



    @FXML
    private TextField LoginSignIn;

    @FXML
    private TextField NameSignIn;

    @FXML
    private PasswordField PasswordSignIn;

    @FXML
    private Button ButtonSignIn;

    @FXML
    void logInIndexClick (ActionEvent event) throws IOException{
        System.out.println("Logging in");
        URL url = Paths.get("C:\\Users\\Acer\\IdeaProjects\\quizlot\\src\\kz\\knewit\\quiz\\jfx\\log.fxml").toUri().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        javafx.scene.Scene sc = new Scene(root);
        stage.setScene(sc);
    }

    @FXML
    void signInIndexClick (ActionEvent event) throws IOException{
        System.out.println("Signing in");
        URL url = Paths.get("C:\\Users\\Acer\\IdeaProjects\\quizlot\\src\\kz\\knewit\\quiz\\jfx\\sign.fxml").toUri().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        javafx.scene.Scene sc = new Scene(root);
        stage.setScene(sc);
    }

    @FXML
    void ButtonSignInClick (ActionEvent event) throws IOException{
        DBService dbService = new DBService();
        User user  = new User();
        user.setName(NameSignIn.getText());
        user.setPassword(PasswordSignIn.getText());
        user.setLogin(LoginSignIn.getText());
        dbService.createUser(user);
    }

    @FXML
    void ButtonLogInClick (ActionEvent event) throws IOException{
        System.out.println(LoginLogIn.getText());
        System.out.println(PasswordLogIn.getText());
    }
}
