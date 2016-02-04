/**
 * This class was created by <Katrix>. It's distributed as
 * part of the Magic of Revolt Mod. Get the Source Code in github:
 * https://github.com/Katrix-/Magic-of-Revolt
 *
 * Magic of Revolt is Open Source and distributed under the
 * Botania license: https://github.com/Katrix-/Magic-of-Revolt/blob/master/LICENSE.md
 */
package katrix.magicOfRevolt.spell.functional.acting;

import katrix.magicOfRevolt.spell.ISpellVariable;
import katrix.magicOfRevolt.spell.object.SpellBlockPos;

public abstract class SpellBlockPosTarget extends SpellActing implements ISpellTarget<SpellBlockPos> {

	protected ISpellVariable<?, SpellBlockPos> target;
	private static final int TARGET_INDEX = 0;

	@Override
	public ISpellVariable<?, SpellBlockPos> getTarget() {
		return target;
	}

	@Override
	public void setTarget(ISpellVariable<?, SpellBlockPos> target) {
		this.target = target;
		inputs.set(TARGET_INDEX, target.getSpell());
	}
}
