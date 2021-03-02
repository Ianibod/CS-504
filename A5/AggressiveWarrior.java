
public class AggressiveWarrior extends Warrior {

	private AggressiveWarrior(int level) {

		this.level = level;

	}

	public static class Builder extends WarriorBuilder {

		public Builder(int level) {

			warrior = new AggressiveWarrior(level);
			warrior.attack = 3;
			warrior.defense = 2;

		}

	}

}
