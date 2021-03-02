
public class DefensiveWarrior extends Warrior {

	private DefensiveWarrior(int level) {

		this.level = level;

	}

	public static class Builder extends WarriorBuilder {

		public Builder(int level) {

			warrior = new DefensiveWarrior(level);
			warrior.attack = 2;
			warrior.defense = 3;

		}

	}

}
