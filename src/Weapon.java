import java.util.ArrayList;

public class Weapon {

	private String weaponName;
	private int attackVal;
	private ArrayList<Weapon> weaponList;

	
	public Weapon(String name, int val) {
		weaponName = name;
		attackVal = val;
	}
	
	public void add(Weapon w){
		weaponList.add(w);
	}
	
	public Weapon getWeapon(int i){
		return weaponList.get(i);
	}
	
	public String getWeapon() {
		return weaponName;
	}
	public void setWeapon(String name) {
		this.weaponName = name;
	}


	@Override
	public String toString() {
		return "Weapon name = " + weaponName + "\n Attack val" + attackVal;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attackVal;
		result = prime * result + ((weaponName == null) ? 0 : weaponName.hashCode());
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
		Weapon other = (Weapon) obj;
		if (attackVal != other.attackVal)
			return false;
		if (weaponName == null) {
			if (other.weaponName != null)
				return false;
		} else if (!weaponName.equals(other.weaponName))
			return false;
		return true;
	}

	
	
	
}
