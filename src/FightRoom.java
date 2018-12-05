import javafx.scene.paint.Color;

public class FightRoom {
	private String roomName;
	private int x;
	private int y;
	private int width;
	private int length;
	private Color color;
	
	public FightRoom(int x, int y, int width, int length, String name, Color c){
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
		this.roomName = name;
		this.color = c;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setColor(Color c){
		this.color = c;
	}

	
	
	@Override
	public String toString() {
		return "Room name: " + roomName + "\nX location: " + x + "\nY location: " + y + "\nWidth: " + width + "\nLength: " + length +
				"\nColor: " + color;
	}

	
	
}
