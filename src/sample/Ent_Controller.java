package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Ent_Controller implements Initializable {


    @FXML private AnchorPane ent_pane;
    @FXML public   String movie_name = null;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    void got_btn(ActionEvent event) {

        changeScene("start_movie_got_page.fxml");

    }

    @FXML
    void tv_btn(ActionEvent event) {

    }

    @FXML
    void movies_btn(ActionEvent event) {

    }

    @FXML
    void lotr_btn(ActionEvent event) {

        changeScene("start_movie_page.fxml");

    }

    @FXML
    void moon_light_btn(ActionEvent event) {
        changeScene("start_movie_moonlight_page.fxml");

    }

    @FXML
    void classic_movie_btn(ActionEvent event) {

    }

      /*
    Function to change Scene
      */

    public void changeScene(String name){

        ent_pane.getChildren().clear();
        Node scene = null;
        try {
            scene = FXMLLoader.load(getClass().getResource(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ent_pane.getChildren().setAll(scene);

    }
}
