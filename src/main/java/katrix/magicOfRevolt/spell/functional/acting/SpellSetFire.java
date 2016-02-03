/**
 * This class was created by <Katrix>. It's distributed as
 * part of the Magic of Revolt Mod. Get the Source Code in github:
 * https://github.com/Katrix-/Magic-of-Revolt
 *
 * Magic of Revolt is Open Source and distributed under the
 * Botania license: https://github.com/Katrix-/Magic-of-Revolt/blob/master/LICENSE.md
 */
package katrix.magicOfRevolt.spell.functional.acting;

import katrix.magicOfRevolt.spell.object.SpellObject;
import katrix.magicOfRevolt.spell.object.primitive.SpellInt;
import katrix.magicOfRevolt.spell.object.primitive.SpellVoid;

public class SpellSetFire extends SpellEntityTarget {

	private SpellInt duration;

	@Override
	public SpellObject execute() {
		int durInt = duration.getInteger();
		if (target != null && durInt != 0) {
			target.getEntity().setFire(durInt);
		}
		else {
			fizzleParameters();
		}
		return SpellVoid.spell;
	}

	public SpellInt getDuration() {
		return duration;
	}

	public void setDuration(SpellInt duration) {
		int intDur = duration.getInteger();

		this.duration = duration;
		warmup = intDur / 2;
		mindCost = intDur * 10;
	}
}