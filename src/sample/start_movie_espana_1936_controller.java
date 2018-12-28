package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class start_movie_espana_1936_controller implements Initializable {

    @FXML private ImageView movie_background_img = null;
    @FXML private AnchorPane movie_pane;

    public String image_string  = "moon";


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        if(image_string.equals("moon")){

            Image im = new Image(getClass().getResource("resources/espana_1936.jpg").toExternalForm());
            setPicture(im);
        }

    }


    public void setPicture(Image img) {
        movie_background_img.setImage(img);

    }

    @FXML
    void go_toplayMovie(ActionEvent event) {

        movie_pane.getChildren().clear();
        Node scene = null;
        try {
            scene = FXMLLoader.load(getClass().getResource("play_movie_espana_1936.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        movie_pane.getChildren().setAll(scene);

    }

    @FXML
    void media_close(ActionEvent event) {

        movie_pane.getChildren().clear();
        Node scene = null;
        try {
            scene = FXMLLoader.load(getClass().getResource("ent_page.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        movie_pane.getChildren().setAll(scene);

    }
}
