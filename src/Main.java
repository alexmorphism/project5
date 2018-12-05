
	
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
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	Pane pane;
	
	@Override
	public void start(Stage primaryStage) {
		Stage window = primaryStage;
		//Pane is being use to draw rooms and players
		pane = new Pane();
		Button addPlayerBtn = new Button("Add Players");
		Button movePlayerBtn = new Button("Move Players");
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
		Player p1 = new Player("Player1", 1, w1, 150, 100, Color.DARKBLUE);
		Player p2 = new Player("Player2", 1, w1, 400, 100, Color.DARKCYAN);
		Player p3 = new Player("Player3", 1, w1, 800, 100, Color.DARKGREEN);
		Player p4 = new Player("Player4", 1, w1, 1050, 100, Color.DARKMAGENTA);
		Player p5 = new Player("Player5", 1, w1, 150, 500, Color.BLACK);
		Player p6 = new Player("Player6", 1, w1, 400, 500, Color.DARKRED);
		Player p7 = new Player("Player7", 1, w1, 800, 500, Color.DARKVIOLET);
		Player p8 = new Player("Player8", 1, w1, 1050, 500, Color.DARKGOLDENROD);
		
		Player p9  = new Player("Player", 1, w1, 150, 250, Color.DARKBLUE);
		Player p10 = new Player("Player2", 1, w1, 400, 250, Color.DARKCYAN);
		Player p11 = new Player("Player3", 1, w1, 800, 250, Color.DARKGREEN);
		Player p12 = new Player("Player4", 1, w1, 1050, 250, Color.DARKMAGENTA);
		Player p13 = new Player("Player5", 1, w1, 150, 650, Color.BLACK);
		Player p14 = new Player("Player6", 1, w1, 400, 650, Color.DARKRED);
		Player p15 = new Player("Player7", 1, w1, 800, 650, Color.DARKVIOLET);
		Player p16 = new Player("Player8", 1, w1, 1050, 650, Color.DARKGOLDENROD);
		
		FightRoom fr1 = new FightRoom(0, 0, 600, 375, "Room-1", Color.BLACK);
		FightRoom fr2 = new FightRoom(600, 0, 600, 375, "Room-2", Color.BLACK);
		FightRoom fr3 = new FightRoom(0, 375, 600, 375, "Room-3", Color.BLACK);
		FightRoom fr4 = new FightRoom(600, 375, 600, 375, "Room-4", Color.BLACK);

		//**************LISTENERS*****************//
		addPlayerBtn.setOnAction(e->{
			pane.getChildren().add(drawCharacter(p1));
			pane.getChildren().add(drawCharacter(p2));
			pane.getChildren().add(drawCharacter(p3));
			pane.getChildren().add(drawCharacter(p4));
			pane.getChildren().add(drawCharacter(p5));
			pane.getChildren().add(drawCharacter(p6));
			pane.getChildren().add(drawCharacter(p7));
			pane.getChildren().add(drawCharacter(p8));
			pane.getChildren().add(drawCharacter(p9));
			pane.getChildren().add(drawCharacter(p10));
			pane.getChildren().add(drawCharacter(p11));
			pane.getChildren().add(drawCharacter(p12));
			pane.getChildren().add(drawCharacter(p13));
			pane.getChildren().add(drawCharacter(p14));
			pane.getChildren().add(drawCharacter(p15));
			pane.getChildren().add(drawCharacter(p16));
		});
		
		movePlayerBtn.setOnAction(e->{
			
		});
		
		//draw Fighting rooms
		pane.getChildren().add(drawFightRoom(fr1));
		pane.getChildren().add(drawFightRoom(fr2));
		pane.getChildren().add(drawFightRoom(fr3));
		pane.getChildren().add(drawFightRoom(fr4));

		//Horizontal Box contains the buttons
		HBox hbox = new HBox();
		hbox.getChildren().add(addPlayerBtn);
		hbox.getChildren().add(movePlayerBtn);
		
		//Vertical Box "root" contains the Menu Bar, HBox and Pane.
		VBox root = new VBox();
		root.getChildren().add(menuBar);
		root.getChildren().add(hbox);
		root.getChildren().add(pane);
		
		Scene scene = new Scene(root, 1200, 800);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setScene(scene);
		window.show();
	}
	
	/*
	 * Draws a character in the canvas based on the player information.
	 */
	public Group drawCharacter(Player p){
		Group g = new Group();
		Label label = new Label(p.toString());
		label.setLayoutX(p.getXloc()-20);
		label.setLayoutY(p.getYloc()-30);
		//ProgressBar pb = new ProgressBar();
		//pb.setProgress(p.getHealth());
		//pb.setLayoutX(p.getXloc()-15);
		//pb.setLayoutY(p.getYloc()-50);
		Ellipse head = new Ellipse(10, 10);
		head.setFill(p.getColor());
		head.setLayoutX(p.getXloc());
		head.setLayoutY(p.getYloc());
		g.getChildren().addAll(head, label);
		return g;
	}
	
	/*
	 * Draw fighting rooms
	 */
	public Group drawFightRoom(FightRoom fr){
		Group g = new Group();
		Rectangle r = new Rectangle(fr.getWidth()-5, fr.getLength()-5);
		r.setFill(Color.TRANSPARENT);
		r.setStroke(fr.getColor());
		r.setStrokeWidth(5);
		r.setLayoutX(fr.getX());
		r.setLayoutY(fr.getY()+3);
		g.getChildren().add(r);
		return g;
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
}
