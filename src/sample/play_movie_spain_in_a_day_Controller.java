package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class play_movie_spain_in_a_day_Controller implements Initializable {


    @FXML private MediaView play_media;
    @FXML private AnchorPane play_movie_pane;

    private MediaPlayer mediaPlayer;

    private static final String MEDIA_URL = "resources/Spain_in_a_day_vid.mp4";

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        mediaPlayer = new MediaPlayer(new Media(this.getClass().getResource(MEDIA_URL).toExternalForm()));
        mediaPlayer.setAutoPlay(true);

        play_media.setMediaPlayer(mediaPlayer);


    }

    @FXML
    void play_btn(ActionEvent event) {
        mediaPlayer.play();

    }

    @FXML
    void pause_btn(ActionEvent event) {
        mediaPlayer.pause();
    }

    @FXML
    void stop_btn(ActionEvent event) {
        mediaPlayer.stop();
    }
    @FXML
    void media_close(ActionEvent event) throws IOException {
        mediaPlayer.stop();

        play_movie_pane.getChildren().clear();
        Node scene = null;
        try {
            scene = FXMLLoader.load(getClass().getResource("ent_page.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        play_movie_pane.getChildren().setAll(scene);

    }
}
