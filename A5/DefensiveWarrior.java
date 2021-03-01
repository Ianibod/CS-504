
public class DefensiveWarrior extends Warrior {

	private int level;
	private int attack;
	private int defense;

	private DefensiveWarrior(int level) {

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

		private DefensiveWarrior defensiveWarrior;

		public Builder(int level) {

			defensiveWarrior = new DefensiveWarrior(level);
			defensiveWarrior.attack = 2;
			defensiveWarrior.defense = 3;

		}

		public Builder attack(int attack) {

			defensiveWarrior.attack = attack;
			return this;

		}

		public Builder defense(int defense) {

			defensiveWarrior.defense = defense;
			return this;

		}

		public DefensiveWarrior build() {

			validate(defensiveWarrior);
			return defensiveWarrior;

		}

		private void validate(DefensiveWarrior defensiveWarrior) {

			boolean errorOccurred = false;
			String levelErrorMessage = "", attackErrorMessage = "", defenseErrorMessage = "";

			if (defensiveWarrior.level < 0) {
				levelErrorMessage = "Level must be greater than 0. ";
				errorOccurred = true;
			}

			if (defensiveWarrior.attack < 0) {
				attackErrorMessage = "Attack must be greater than 0. ";
				errorOccurred = true;
			}

			if (defensiveWarrior.defense < 0) {
				defenseErrorMessage = "Defense must be greater than 0. ";
				errorOccurred = true;
			}

			if (errorOccurred) {

				throw new IllegalStateException(levelErrorMessage + attackErrorMessage + defenseErrorMessage);

			}
		}

	}

}
