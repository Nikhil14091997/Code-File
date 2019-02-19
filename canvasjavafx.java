import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.shape.*;
import javafx.scene.canvas.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;

class canvasjavafx extends Application
{
	GraphicsContext gc;
	Color[] colors= {Color.RED, Color.BLUE, Color.GREEN, Color.BLACK};
	int colorIdx = 0;

	public static void main(String[] args)
	{
		launch(args);

	}

	public void start(Stage myStage)
	{
		myStage.setTitle("Draw directly to the canvas");

		FlowPane rootnode = new FlowPane();
		rootnode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootnode,450,450);
		myStage.setScene(myScene);
		Canvas myCanvas = new Canvas(450,450);
		gc = myCanvas.getGraphicsContext2D();

		Button b = new Button("Change Color");
		b.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae)
			{
				gc.setStroke(colors[colorIdx]);
				gc.setFill(colors[colorIdx]);

				gc.strokeLine(0,0,200,200);
				gc.fillText("This is drawn on the canvas",60,50);
				gc.fillRect(100,320,300,40);

				// cahnge the color
				colorIdx++;
				if(colorIdx == colors.length)
					colorIdx = 0;

			}
		});

		gc.strokeLine(0,0,200,200);
				gc.strokeLine(0,0,200,200);
				gc.fillRect(100,320,300,40);
				gc.fillOval(100,100,200,200);
				gc.fillText("This is drawn on the canvas",60,50);
				gc.fillRect(100,320,300,40);


		gc.setFont(new Font(20));

		rootnode.getChildren().addAll(myCanvas, b);

		myStage.show();
	}
}