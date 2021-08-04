package view_controller;

/** This is an event driven program with a graphical user interface 
 * to play the game of Boggle. This code begins as the boilerplate
 * code that is needed to start any JavaFX application.  It also
 * has a recommended GridPane as the backing pane to store the
 * DiceTray on the left and a GridPane with three elements on the right.
 *
 * @author YOUR NAME and Rick Mercer
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BoggleGUI extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  private GridPane window = new GridPane();
  private TextArea board = new TextArea("");

  public void start(Stage stage) {
    setUpWindow();
    Scene scene = new Scene(window, 500, 300);
    stage.setScene(scene);
    stage.show();
  }

  private void setUpWindow() {
    window = new GridPane();
    board = new TextArea("");
    board.setMaxWidth(200);
    window.add(board, 1, 1);
  }
}
