/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raindrop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

/**
 *
 * @author ik
 */
public class RainDrop extends Application {

    @Override
    public void start(Stage primaryStage) {
        int i;
        Pane root = new Pane();

        for (i = 0; i < 3200; i += 80) {
            CubicCurve cubicCurve = new CubicCurve();
            drop(i, cubicCurve);
            System.out.println("Hello");
            root.getChildren().add(cubicCurve);
        }
        Scene scene = new Scene(root, 320, 568);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void drop(int i, CubicCurve cubicCurve) {
        //Drawing a cubic curve 
        int y = (i / 320) * 80;
        //Setting properties to cubic curve
        int x = i - ((i / 320) * 320);
        System.out.println(x);
        cubicCurve.setStartX(0);
        cubicCurve.setStartY(0);
        cubicCurve.setControlX1(40);
        cubicCurve.setControlY1(140);
        cubicCurve.setControlX2(140);
        cubicCurve.setControlY2(140);
        cubicCurve.setEndX(0);
        cubicCurve.setEndY(0);
        cubicCurve.setTranslateX(x);
        cubicCurve.setTranslateY(y);

    }

}
