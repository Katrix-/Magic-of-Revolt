/**
 * This class was created by <Katrix>. It's distributed as
 * part of the Magic of Revolt Mod. Get the Source Code in github:
 * https://github.com/Katrix-/Magic-of-Revolt
 *
 * Magic of Revolt is Open Source and distributed under the
 * Botania license: https://github.com/Katrix-/Magic-of-Revolt/blob/master/LICENSE.md
 */
package katrix.magicOfRevolt.spell.functional;

import katrix.magicOfRevolt.spell.Spell;
import katrix.magicOfRevolt.spell.SpellDummy;
import katrix.magicOfRevolt.spell.SpellException;
import katrix.magicOfRevolt.spell.object.primitive.SpellBoolean;
import net.minecraft.world.World;

public class SpellIf extends SpellFunctional {

	private static final int SPELL1_INDEX = 0;
	private static final int SPELL2_INDEX = 1;
	private static final int CONDITION_INDEX = 2;

	public SpellIf(World world) {
		super(world);
		setInput(new SpellDummy(world), SPELL1_INDEX);
		setInput(new SpellDummy(world), SPELL2_INDEX);
		setInput(new SpellDummy(world), CONDITION_INDEX);
	}

	@Override
	public void execute() throws SpellException {
		super.execute();
		boolean condition = this.<SpellBoolean>getVariable(CONDITION_INDEX).getBoolean();
		Spell spell1 = getInput(SPELL1_INDEX);
		Spell spell2 = getInput(SPELL2_INDEX);
		if(condition) {
			spell1.execute();
		}
		else {
			spell2.execute();
		}
		executeDone = true;
	}
}
