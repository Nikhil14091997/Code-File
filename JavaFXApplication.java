import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;


public class JavaFXApplication extends Application
{
    public static void main (String args[])
    {
        System.out.println("\n Launching JavaFX Application");
        
        
        // always start the javafx program by calling the launch() method
        launch(args);
        
    }
    public void init()
    {
        System.out.println("\n Inside the init() method!!");
        
    }
    public void start(Stage mystage)
    {
        System.out.println("\n Inside the start() method and overriding it");
        mystage.setTitle("Understanding JavaFX Skeleton");
        
        FlowPane rootnode = new FlowPane();
        
        Scene myscene = new Scene(rootnode,250,250);
        
        mystage.setScene(myscene);
        
        mystage.show();
    }
    public void stop()
    {
        System.out.println("\n insude stop method");
    }
}
