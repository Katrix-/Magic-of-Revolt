/**
 * This class was created by <Katrix>. It's distributed as
 * part of the Magic of Revolt Mod. Get the Source Code in github:
 * https://github.com/Katrix-/Magic-of-Revolt
 *
 * Magic of Revolt is Open Source and distributed under the
 * Botania license: https://github.com/Katrix-/Magic-of-Revolt/blob/master/LICENSE.md
 */
package katrix.magicOfRevolt.spell;

import net.minecraft.world.World;

public class SpellDummy extends Spell {

	public SpellDummy(World world) {
		super(world);
		executeDone = true;
	}

	@Override
	public boolean isWarmupComplete() {
		return true;
	}

	@Override
	public boolean isExecuteComplete() {
		return true;
	}
}
