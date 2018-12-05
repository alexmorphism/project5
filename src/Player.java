import javafx.scene.paint.Color;

public class Player {

	private String character;
	private double health;
	private Weapon weapon;
	private int xLoc;
	private int yLoc;
	private Color color;
	
	public Player(String character, double health, Weapon weapon, int x, int y, Color color) {
		this.character = character;
		this.health = health;
		this.weapon = weapon;
		this.xLoc = x;
		this.yLoc = y;
		this.color = color;
	}

	public Color getColor(){
		return color;
	}
	
	public void setColor(Color c){
		color = c;
	}
	
	public int getXloc(){
		return xLoc;
	}
	
	public int getYloc(){
		return yLoc;
	}
	
	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return character + ", " + getWeapon().getWeapon();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((character == null) ? 0 : character.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(health);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((weapon == null) ? 0 : weapon.hashCode());
		result = prime * result + xLoc;
		result = prime * result + yLoc;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (character == null) {
			if (other.character != null)
				return false;
		} else if (!character.equals(other.character))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(health) != Double
				.doubleToLongBits(other.health))
			return false;
		if (weapon == null) {
			if (other.weapon != null)
				return false;
		} else if (!weapon.equals(other.weapon))
			return false;
		if (xLoc != other.xLoc)
			return false;
		if (yLoc != other.yLoc)
			return false;
		return true;
	}




	
	
	
}
