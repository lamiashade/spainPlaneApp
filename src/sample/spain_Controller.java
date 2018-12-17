package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class spain_Controller implements Initializable {

    @FXML private BorderPane spain_border_pane;
    @FXML private JFXButton first_start_btn;
    @FXML private AnchorPane spain_pane;

    @FXML
    void food_tile(ActionEvent event) {
        changeScene("topic_page.fxml");

    }

    @FXML
    void culture_tile(ActionEvent event) {
        changeScene("topic_culture_page.fxml");
    }

    @FXML
    void urban_tile(ActionEvent event) {
        changeScene("topic_urban_page.fxml");
    }

    @FXML
    void hotel_tile(ActionEvent event) {
        changeScene("topic_hotels_page.fxml");
    }

    @FXML
    void food_btn(ActionEvent event) {
        changeScene("topic_page.fxml");
    }

    @FXML
    void culture_btn(ActionEvent event) {
        changeScene("topic_culture_page.fxml");
    }

    @FXML
    void urban_btn(ActionEvent event) {
        changeScene("topic_urban_page.fxml");
    }

    @FXML
    void hotels_btn(ActionEvent event) {
        changeScene("topic_hotels_page.fxml");
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void changeScene(String name){

        spain_border_pane.setCenter(null);
        Node scene = null;
        try {
            scene = FXMLLoader.load(getClass().getResource(name));
        } catch (IOException e) {
            e.printStackTrace();
        }

        spain_border_pane.setCenter(scene);
    }
}
