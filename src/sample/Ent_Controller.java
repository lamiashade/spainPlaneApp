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



    public void spain_in_a_day_btn(ActionEvent actionEvent) {
        changeScene("start_movie_spain_in_a_day_page.fxml");
    }

    public void broken_embraces_btn(ActionEvent actionEvent) {
        changeScene("start_movie_page.fxml");
    }

    public void espana_1936_btn(ActionEvent actionEvent) {
        changeScene("start_movie_espana_1936_page.fxml");
    }



    @FXML
    void tv_btn(ActionEvent event) {

    }

    @FXML
    void movies_btn(ActionEvent event) {

    }


    @FXML
    void classic_movie_btn(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

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
