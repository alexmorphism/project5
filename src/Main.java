
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Stage window = primaryStage;
		
		Button addPlayerBtn = new Button("Add Players");
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

		Weapon w1 = new Weapon("Knife", 25);
		Player p1 = new Player("p1", 100, w1, 150, 100);
		Player p2 = new Player("p2", 100, w1, 400, 100);
		Player p3 = new Player("p3", 100, w1, 800, 100);
		Player p4 = new Player("p4", 100, w1, 1050, 100);
		Player p5 = new Player("p5", 100, w1, 150, 500);
		Player p6 = new Player("p6", 100, w1, 400, 500);
		Player p7 = new Player("p7", 100, w1, 800, 500);
		Player p8 = new Player("p8", 100, w1, 1050, 500);
		
		FightRoom fr1 = new FightRoom(0, 0, 600, 400, "Room-1", Color.WHITE);
		FightRoom fr2 = new FightRoom(600, 0, 600, 400, "Room-2", Color.WHITE);
		FightRoom fr3 = new FightRoom(0, 400, 600, 400, "Room-3", Color.WHITE);
		FightRoom fr4 = new FightRoom(600, 400, 600, 400, "Room-4", Color.WHITE);
		
		//Canvas canvas = new Canvas(1200,825);
	
		//GraphicsContext gc = canvas.getGraphicsContext2D();
		/*
		//draw rooms
		drawFightRoom(gc, fr1);
		drawFightRoom(gc, fr2);
		drawFightRoom(gc, fr3);
		drawFightRoom(gc, fr4);
		//draw characters
		drawCharacter(gc, p1);
		drawCharacter(gc, p2);
		drawCharacter(gc, p3);
		drawCharacter(gc, p4);
		drawCharacter(gc, p5);
		drawCharacter(gc, p6);
		drawCharacter(gc, p7);
		drawCharacter(gc, p8);
		
		*/
		ProgressBar pb = new ProgressBar();
		pb.setProgress(0.45);
		pb.setLayoutX(100);
		pb.setLayoutY(100);
		
		Pane pane = new Pane();
		pane.getChildren().add(pb);
		
		HBox hbox = new HBox();
		hbox.getChildren().add(addPlayerBtn);
		VBox root = new VBox();
		root.getChildren().add(menuBar);
		root.getChildren().add(hbox);
		root.getChildren().add(pane);
		Scene scene = new Scene(root, 1200, 825);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setScene(scene);
		window.show();
	}
	
	/*
	 * Draws a character in the canvas based on the player information.
	 */
	public void drawCharacter(GraphicsContext gc, Player p){
		
		gc.fillOval(p.getXloc(), p.getYloc(), 30, 30);
		gc.fillText(p.toString(), p.getXloc(), p.getYloc() -10);
	}
	
	/*
	 * Draw fighting rooms on canvas.
	 */
	public void drawFightRoom(GraphicsContext gc, FightRoom fr){
		gc.strokeRect(fr.getX(), fr.getY(), fr.getWidth(), fr.getLength());
		gc.fillText(fr.getRoomName(), fr.getX()+300, fr.getY() + 20);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
//	Image ninja = new Image("file:/Users/alexandrecastro/project5/ninja.png");
//	ImageView iview1 = new ImageView(ninja);
//	iview1.setFitHeight(100);
//	iview1.setFitWidth(50);
//	iview1.setX(200);
//	iview1.setY(100);
//	iview1.setPreserveRatio(false);
	
//	TilePane tile1 = new TilePane();
//	tile1.setHgap(30);
//	tile1.setVgap(30);
//	tile1.setPadding(new Insets(5,5,5,30));
	
	

// ******* Creates Rectangles *******//
//Rectangle r1 = new Rectangle(550,350);
//r1.setFill(Color.DARKGRAY);
//r1.setX(90);
//Rectangle r2 = new Rectangle(50,50);
//r2.setFill(Color.LIGHTGRAY);
//StackPane stack = new StackPane(r1);
/////	

}
