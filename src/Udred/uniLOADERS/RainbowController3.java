package Udred.uniLOADERS;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class RainbowController3 {

    public int counter = 0;
    public Label labelCounter;
    public ImageView imageViewUni;
    public Label labelCounter1;
    public Label labelCounter2;

    public void start(){

        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setContrast(0.75);
        colorAdjust.setHue(-1);
        imageViewUni.setEffect(colorAdjust);
        labelCounter.setEffect(colorAdjust);

        Timeline timelineImageHue = new Timeline();
        timelineImageHue.setCycleCount(Timeline.INDEFINITE);
        timelineImageHue.getKeyFrames().add(
                new KeyFrame(new Duration(25), new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent t) {
                        colorAdjust.setHue(colorAdjust.getHue()+0.01);

                        if(colorAdjust.getHue()>0.99){//30 divided by 0.01 equals 3000 so you take the duration and divide it be the opacity to get your transition time in milliseconds

                            timelineImageHue.stop();
                        }
                    }}));
        timelineImageHue.setDelay(Duration.seconds(2));
        timelineImageHue.play();

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        e -> advanceText()
                ),
                new KeyFrame(Duration.millis(50)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.setDelay(Duration.seconds(2));
        timeline.play();
    }

    public void advanceText() {
        labelCounter.setText(counter + "%");
        labelCounter1.setText(counter + "%");
        labelCounter2.setText(counter + "%");

        if (counter < 100)
        counter++;
    }
}
