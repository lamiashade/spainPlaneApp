package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class Home_Controller implements Initializable {

    @FXML private BorderPane ui_borderPane;
    @FXML private Text ny_time2;
    @FXML private Text madrid_time2;
    @FXML private ScrollPane home_scroll_pane;

     /*
    Button on the the Home page
      */

    public void go_toENT(ActionEvent actionEvent) { changeScene("ent_page.fxml"); }

    public void go_toAPP(ActionEvent actionEvent) { changeScene("app_page.fxml"); }

    public void go_toSPAIN(ActionEvent actionEvent) { changeScene("spain_page.fxml"); }

    public void go_toSTATUS(ActionEvent actionEvent) {
        changeScene("status_page.fxml");
    }


      /*
    Button on the the Navigation Bar
      */


    public void nav_toHOME(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("home_page.fxml"));
        Scene home_page = new Scene(root);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.hide();
        window.setScene(home_page);
        window.show();

    }

    public void nav_toENT(ActionEvent actionEvent) { changeScene("ent_page.fxml");  }

    public void nav_toAPP(ActionEvent actionEvent) { changeScene("app_page.fxml");
    }

    public void nav_toSPAIN(ActionEvent actionEvent) { changeScene("spain_page.fxml");
    }

    public void nav_toSTATUS(ActionEvent actionEvent) { changeScene("status_page.fxml");
    }



    /*
    Function to change Scene
      */

    public void changeScene(String name){

        ui_borderPane.setCenter(null);
        Node scene = null;
        try {
            scene = FXMLLoader.load(getClass().getResource(name));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ui_borderPane.setCenter(scene);

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Hide Verticle and Horizontal scroll bar
        home_scroll_pane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        home_scroll_pane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        ZoneId zone1 = ZoneId.of("America/New_York");
        ZoneId zone2 = ZoneId.of("Europe/Madrid");


        initClock(ny_time2,zone1,"New York");
        initClock(madrid_time2,zone2,"Madrid");

    }


    /*
    Function to set Time
      */

    private void initClock(Text name, ZoneId timezone, String city) {
        LocalDateTime current = LocalDateTime.now(timezone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formatDateTime = current.format(formatter);
        name.setText(formatDateTime + " | " + city);
    }

}
