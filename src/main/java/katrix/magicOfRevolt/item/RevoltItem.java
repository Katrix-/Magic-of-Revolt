/**
 * This class was created by <Katrix>. It's distributed as
 * part of the Magic of Revolt Mod. Get the Source Code in github:
 * https://github.com/Katrix-/Magic-of-Revolt
 *
 * Magic of Revolt is Open Source and distributed under the
 * Botania license: https://github.com/Katrix-/Magic-of-Revolt/blob/master/LICENSE.md
 */
package katrix.magicOfRevolt.item;

import net.minecraft.item.Item;

public class RevoltItem {

	public static Item revoltStick;

	public static void preInit() {
		revoltStick = new ItemMagicStick();
	}
}
