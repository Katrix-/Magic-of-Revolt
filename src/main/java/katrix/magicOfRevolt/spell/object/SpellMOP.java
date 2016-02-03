/**
 * This class was created by <Katrix>. It's distributed as
 * part of the Magic of Revolt Mod. Get the Source Code in github:
 * https://github.com/Katrix-/Magic-of-Revolt
 *
 * Magic of Revolt is Open Source and distributed under the
 * Botania license: https://github.com/Katrix-/Magic-of-Revolt/blob/master/LICENSE.md
 */
package katrix.magicOfRevolt.spell.object;

import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class SpellMOP extends SpellObject {

	private MovingObjectPosition mop;

	public SpellMOP(World world) {
		super(world);
	}

	private SpellMOP(SpellMOP vector) {
		super(vector);
		this.mop = vector.mop;
	}

	@Override
	public SpellMOP copy() {
		return new SpellMOP(this);
	}

	public MovingObjectPosition getMOP() {
		return mop;
	}

	public SpellMOP setMOP(MovingObjectPosition mop) {
		this.mop = mop;
		return this;
	}
}