package test.three;

public abstract class AbstractMonster {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defender;
	
	protected AbstractMonster() {}
	protected AbstractMonster(String name, int hp, int attack, int defender) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defender = defender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefender() {
		return defender;
	}
	public void setDefender(int defender) {
		this.defender = defender;
	}
	
}
