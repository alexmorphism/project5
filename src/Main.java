
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Stage window = primaryStage;
		
		// ****** Game menus **********//
		MenuBar menuBar = new MenuBar();
		Menu menuGame = new Menu("_Game");
		// Menu items
		MenuItem menuItemNewGame = new MenuItem("_New Game");
		MenuItem menuItemQuitGame = new MenuItem("_Quit Game");
		MenuItem menuItemExit = new MenuItem("_Exit");
		// add menu items to the "Game" menu
		menuGame.getItems().addAll(menuItemNewGame,menuItemQuitGame,menuItemExit);
		
		Menu menuOptions = new Menu("_Options");

		// add "Game" and "Options" menu to a menu bar.
		menuBar.getMenus().addAll(menuGame, menuOptions);
		//*******Game menu ends************//
		
		
		// ******* Creates Rectangles *******//
		Rectangle r1 = new Rectangle(100,100);
		r1.setFill(Color.DARKGRAY);
		Rectangle r2 = new Rectangle(50,50);
		r2.setFill(Color.LIGHTGRAY);
		StackPane stack = new StackPane(r1, r2);
		
		
		VBox root = new VBox();
		root.getChildren().add(menuBar);
		root.getChildren().add(stack);
		Scene scene = new Scene(root, 800, 600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setScene(scene);
		window.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
