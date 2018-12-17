package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private Text madrid_time;
    @FXML private Text ny_time;

    /*
    Button on the the welcome page
      */

    public void go_toHome_en(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("home_page.fxml"));
        Scene home_page = new Scene(root);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.hide();
        window.setScene(home_page);
        window.show();

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ZoneId zone1 = ZoneId.of("America/New_York");
        ZoneId zone2 = ZoneId.of("Europe/Madrid");


        initClock(ny_time,zone1,"New York");
        initClock(madrid_time,zone2,"Madrid");

    }


    private void initClock(Text name,ZoneId timezone, String city) {
        LocalDateTime current = LocalDateTime.now(timezone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formatDateTime = current.format(formatter);
        name.setText(formatDateTime + " | " + city);
    }

    private void play_audio(){

    }
}
