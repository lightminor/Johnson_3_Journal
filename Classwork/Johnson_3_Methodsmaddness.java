package johnson_3_Challenge1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author LightMajor
 */
public class Johnson_3_Challenge1 extends Application {
    
    
    
     
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public  void start(Stage primaryStage ){
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();  
        Canvas canvas = new Canvas(500,450);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawBackground(gc);
        drawFace(gc);
        drawEye1(gc);
        drawEye2(gc);
        drawPupil1(gc);
        drawPupil2(gc);
        drawInnerpupil1(gc);
        drawInnerpupil2(gc);
        root.getChildren().add(canvas); drawMouth(gc);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
      private void drawBackground(GraphicsContext gc) {
            gc.setFill(Color.DARKBLUE);
            gc.setStroke(Color.DARKBLUE);
            gc.setLineWidth(1);
            gc.fillRect(0, 0, 500, 450);
            gc.strokeRect(0, 0, 500, 450);
      }
              
        private void drawHouse(GraphicsContext gc) {
            gc.fillText("My House", 42 , 42);
    
    
        }
        private void drawFace(GraphicsContext gc) {
            gc.setFill(Color.BISQUE);
            gc.setStroke(Color.BISQUE);
            gc.setLineWidth(5);
            gc.fillOval(125, 50, 250, 275);
        
        }
        
        private void drawEye1(GraphicsContext gc) {
            gc.setFill(Color.WHITE);
            gc.setStroke(Color.BLACK);
            gc.setLineWidth(2);
            gc.fillOval(180, 135, 45, 30);
            gc.strokeOval(180, 135, 45, 30);
               
            
        }
        private void drawEye2(GraphicsContext gc) {
            gc.setFill(Color.WHITE);
            gc.setStroke(Color.BLACK);
            gc.setLineWidth(2);
            gc.fillOval(270, 135, 45, 30);
            gc.strokeOval(270, 135, 45, 30);
        }     
            private void drawPupil1(GraphicsContext gc) {
            gc.setFill(Color.GREEN);
            gc.setStroke(Color.GREEN);
            gc.setLineWidth(2);
            gc.fillOval(282, 142, 20, 15);
            gc.strokeOval(282, 142, 20, 15);
               
            
        }
        private void drawPupil2(GraphicsContext gc) {
            gc.setFill(Color.GREEN);
            gc.setStroke(Color.GREEN);
            gc.setLineWidth(2);
            gc.fillOval(192, 143, 20, 15);
            gc.strokeOval(192, 143, 20, 15);
               
            
        }
        private void drawInnerpupil1(GraphicsContext gc) {
            gc.setFill(Color.BLACK);
            gc.setStroke(Color.BLACK);
            gc.setLineWidth(2);
            gc.fillOval(199, 147, 5, 5);
            gc.strokeOval(199, 147, 5, 5);
               
            
        }
        private void drawInnerpupil2(GraphicsContext gc) {
            gc.setFill(Color.BLACK);
            gc.setStroke(Color.BLACK);
            gc.setLineWidth(2);
            gc.fillOval(289, 146, 5, 5);
            gc.strokeOval(289, 146, 5, 5);
               
            
        }
               
           private void drawMouth(GraphicsContext gc) {
            gc.setFill(Color.RED);
            gc.setStroke(Color.PINK);
            gc.setLineWidth(10);
            gc.strokeOval(210, 210, 70, 40);
            gc.fillOval(210,210,70,40);
            
           }
           
           
}

