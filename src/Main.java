
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
		
		
		Canvas canvas = new Canvas(1200,800);
	
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.fillRect(0, 350, 1200, 40);
		gc.fillRect(600, 0, 40, 1200);
		//room-1
		gc.fillText("Room-1", 250, 30);
		drawCharacter(gc, p1);
		drawCharacter(gc, p2);
		//room-2
		gc.fillText("Room-2", 900, 30);
		drawCharacter(gc, p3);
		drawCharacter(gc, p4);
		//room-3
		gc.fillText("Room-3", 250, 410);
		drawCharacter(gc, p5);
		drawCharacter(gc, p6);
		//room-4
		gc.fillText("Room-4", 900, 410);
		drawCharacter(gc, p7);
		drawCharacter(gc, p8);
		
		VBox root = new VBox();
		root.getChildren().add(menuBar);
		root.getChildren().add(canvas);
		
		
		Scene scene = new Scene(root, 1200, 800);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setScene(scene);
		window.show();
		
	}
	
	public void drawCharacter(GraphicsContext gc, Player p){
		gc.fillOval(p.getXloc(), p.getYloc(), 30, 30);
		gc.fillText(p.toString(), p.getXloc(), p.getYloc() -10);
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
