
public class Weapon {

	private String weapon_name;
	private int attack_max;
	private int attack_min;
	
	
	
	public Weapon(String weapon_name, int attack_max, int attack_min) {
		super();
		this.weapon_name = weapon_name;
		this.attack_max = attack_max;
		this.attack_min = attack_min;
	}
	
	
	public String getWeapon() {
		return weapon_name;
	}
	public void setWeapon(String name) {
		this.weapon_name = name;
	}
	public int getAttackMax() {
		return attack_max;
	}
	public void setAttackMax(int attack_max) {
		this.attack_max = attack_max;
	}
	public int getAttackMin() {
		return attack_min;
	}
	public void setAttackMin(int attack_min) {
		this.attack_min = attack_min;
	}


	@Override
	public String toString() {
		return "Weapon [weapon_name=" + weapon_name + ", attack_max=" + attack_max + ", attack_min=" + attack_min + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attack_max;
		result = prime * result + attack_min;
		result = prime * result + ((weapon_name == null) ? 0 : weapon_name.hashCode());
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
		if (attack_max != other.attack_max)
			return false;
		if (attack_min != other.attack_min)
			return false;
		if (weapon_name == null) {
			if (other.weapon_name != null)
				return false;
		} else if (!weapon_name.equals(other.weapon_name))
			return false;
		return true;
	}
	
	
	
}
