package sample;

import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXScrollPane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.net.URL;
import java.util.ResourceBundle;

public class topics_culture_Controller implements Initializable {


    @FXML
    private JFXListView<javafx.scene.control.Label> topic_list_view;
    @FXML private Text topic_name;
    @FXML private JFXScrollPane scroll_pane;


    private String[] culture = new String[]{"Traditional Spanish Clothes", "Bullfights", "Flamenco", "Seville Fair", "Cathedrals"};
    private String[] culture_img = new String[]{"resources/sp_img.jpg", "resources/cloths_img.jpg", "resources/fl_img.jpg", "resources/sf_img.jpg", "resources/ct_img.jpg"};




    @Override
    public void initialize(URL location, ResourceBundle resources) {

            topic_name.setText("CULTRURE");

            topic_list_view.setExpanded(true);
            topic_list_view.depthProperty().set(5);

            for (int i = 0; i < 5; i++) {
                Image img = new Image(getClass().getResourceAsStream(culture_img[i]));

                ImageView imgv = new ImageView(img);
                Rectangle clip = new Rectangle();
                clip.setWidth(450);
                clip.setHeight(400);

                clip.setArcWidth(20);
                clip.setArcHeight(20);
                imgv.setClip(clip);

                // snapshot the rounded image.
                SnapshotParameters parameters = new SnapshotParameters();
                parameters.setFill(Color.TRANSPARENT);
                WritableImage image = imgv.snapshot(parameters, null);

                // remove the rounding clip so that our effect can show through.
                imgv.setClip(null);

                imgv.setImage(image);
                imgv.setPreserveRatio(true);

                Label lbl = new Label(culture[i], imgv);
                lbl.setAlignment(Pos.CENTER);
                lbl.setFont(Font.font("Arial",24));
                lbl.setContentDisplay(ContentDisplay.TOP);
                lbl.setPrefSize(674, 500);


                topic_list_view.getItems().add(lbl);

            }

    }
}