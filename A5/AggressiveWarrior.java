
public class AggressiveWarrior extends Warrior {

	private int level;
	private int attack;
	private int defense;

	private AggressiveWarrior(int level) {

		this.level = level;

	}

	@Override
	public int getLevel() {

		return level;

	}

	@Override
	public int getAttack() {

		return attack;

	}

	@Override
	public int getDefense() {

		return defense;

	}

	public static class Builder {

		private AggressiveWarrior aggressiveWarrior;

		public Builder(int level) {

			aggressiveWarrior = new AggressiveWarrior(level);
			aggressiveWarrior.attack = 3;
			aggressiveWarrior.defense = 2;

		}

		public Builder attack(int attack) {

			aggressiveWarrior.attack = attack;
			return this;

		}

		public Builder defense(int defense) {

			aggressiveWarrior.defense = defense;
			return this;

		}

		public AggressiveWarrior build() {

			validate(aggressiveWarrior);
			return aggressiveWarrior;

		}

		private void validate(AggressiveWarrior aggressiveWarrior) {

			boolean errorOccurred = false;
			String levelErrorMessage = "", attackErrorMessage = "", defenseErrorMessage = "";

			if (aggressiveWarrior.level < 0) {
				levelErrorMessage = "Level must be greater than 0. ";
				errorOccurred = true;
			}

			if (aggressiveWarrior.attack < 0) {
				attackErrorMessage = "Attack must be greater than 0. ";
				errorOccurred = true;
			}

			if (aggressiveWarrior.defense < 0) {
				defenseErrorMessage = "Defense must be greater than 0. ";
				errorOccurred = true;
			}

			if (errorOccurred) {

				throw new IllegalStateException(levelErrorMessage + attackErrorMessage + defenseErrorMessage);

			}

		}

	}

}
