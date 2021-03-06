/**
 * This class was created by <Katrix>. It's distributed as
 * part of the Magic of Revolt Mod. Get the Source Code in github:
 * https://github.com/Katrix-/Magic-of-Revolt
 *
 * Magic of Revolt is Open Source and distributed under the
 * Botania license: https://github.com/Katrix-/Magic-of-Revolt/blob/master/LICENSE.md
 */
package katrix.magicOfRevolt.spell.variable;

import katrix.magicOfRevolt.spell.ISpellVariable;
import katrix.magicOfRevolt.spell.Spell;
import katrix.magicOfRevolt.spell.SpellDummy;
import katrix.magicOfRevolt.spell.SpellException;
import katrix.magicOfRevolt.spell.object.SpellRay;
import katrix.magicOfRevolt.spell.object.SpellVector;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SpellRaytrace extends Spell implements ISpellVariable<SpellRaytrace, SpellRay> {

	private static final int VEC1_INDEX = 0;
	private static final int VEC2_INDEX = 1;

	public SpellRaytrace(World world) {
		super(world);
		setInput(new SpellDummy(world), VEC1_INDEX);
		setInput(new SpellDummy(world), VEC2_INDEX);
	}

	@Override
	public SpellRay getVariable() throws SpellException {
		Vec3d vec1 = this.<SpellVector>getVariable(VEC1_INDEX).getVector();
		Vec3d vec2 = this.<SpellVector>getVariable(VEC2_INDEX).getVector();
		Vec3d tempVec1 = new Vec3d(vec1.xCoord, vec1.yCoord, vec1.zCoord);
		Vec3d tempVec2 = new Vec3d(vec2.xCoord, vec2.yCoord, vec2.zCoord);
		return new SpellRay(world).setRay(world.rayTraceBlocks(tempVec1, tempVec2, false, false, true));
	}

	@Override
	public SpellRaytrace getSpell() {
		return this;
	}
}
