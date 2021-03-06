/**
 * This class was created by <Katrix>. It's distributed as
 * part of the Magic of Revolt Mod. Get the Source Code in github:
 * https://github.com/Katrix-/Magic-of-Revolt
 *
 * Magic of Revolt is Open Source and distributed under the
 * Botania license: https://github.com/Katrix-/Magic-of-Revolt/blob/master/LICENSE.md
 */
package katrix.magicOfRevolt.net;

import katrix.magicOfRevolt.client.gui.GuiHexagonSpellCreation;
import katrix.magicOfRevolt.container.ContainerHexagonSpellCreation;
import katrix.magicOfRevolt.lib.LibGuiID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		switch(id) {
			case LibGuiID.SPELLSLINGER_CREATION: {
				return new GuiHexagonSpellCreation(player, world, new BlockPos(x, y, z));
			}
			default:
				return null;
		}
	}

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		switch(id) {
			case LibGuiID.SPELLSLINGER_CREATION: {
				return new ContainerHexagonSpellCreation(player, world, new BlockPos(x, y, z));
			}
			default:
				return null;
		}
	}
}
