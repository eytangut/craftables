
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftables.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class CraftablesModTabs {
	public static CreativeModeTab TAB_CRAFTABLES;

	public static void load() {
		TAB_CRAFTABLES = FabricItemGroupBuilder.create(new ResourceLocation("craftables", "craftables"))
				.icon(() -> new ItemStack(CraftablesModItems.ESSANCE)).build();
	}
}
