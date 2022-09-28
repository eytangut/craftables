
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftables.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.craftables.item.SoulItem;
import net.mcreator.craftables.item.EssanceItem;
import net.mcreator.craftables.CraftablesMod;

public class CraftablesModItems {
	public static Item ESSANCE;
	public static Item SOUL;

	public static void load() {
		ESSANCE = Registry.register(Registry.ITEM, new ResourceLocation(CraftablesMod.MODID, "essance"), new EssanceItem());
		SOUL = Registry.register(Registry.ITEM, new ResourceLocation(CraftablesMod.MODID, "soul"), new SoulItem());
	}
}
