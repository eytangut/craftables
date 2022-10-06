
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftables.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.craftables.item.WmultiItem;
import net.mcreator.craftables.item.SoulItem;
import net.mcreator.craftables.item.SmultiItem;
import net.mcreator.craftables.item.NmultiItem;
import net.mcreator.craftables.item.ImultiItem;
import net.mcreator.craftables.item.GmultiItem;
import net.mcreator.craftables.item.EssanceItem;
import net.mcreator.craftables.item.DmultiItem;
import net.mcreator.craftables.CraftablesMod;

public class CraftablesModItems {
	public static Item ESSANCE;
	public static Item SOUL;
	public static Item WMULTI;
	public static Item SMULTI;
	public static Item IMULTI;
	public static Item GMULTI;
	public static Item DMULTI;
	public static Item NMULTI;

	public static void load() {
		ESSANCE = Registry.register(Registry.ITEM, new ResourceLocation(CraftablesMod.MODID, "essance"), new EssanceItem());
		SOUL = Registry.register(Registry.ITEM, new ResourceLocation(CraftablesMod.MODID, "soul"), new SoulItem());
		WMULTI = Registry.register(Registry.ITEM, new ResourceLocation(CraftablesMod.MODID, "wmulti"), new WmultiItem());
		SMULTI = Registry.register(Registry.ITEM, new ResourceLocation(CraftablesMod.MODID, "smulti"), new SmultiItem());
		IMULTI = Registry.register(Registry.ITEM, new ResourceLocation(CraftablesMod.MODID, "imulti"), new ImultiItem());
		GMULTI = Registry.register(Registry.ITEM, new ResourceLocation(CraftablesMod.MODID, "gmulti"), new GmultiItem());
		DMULTI = Registry.register(Registry.ITEM, new ResourceLocation(CraftablesMod.MODID, "dmulti"), new DmultiItem());
		NMULTI = Registry.register(Registry.ITEM, new ResourceLocation(CraftablesMod.MODID, "nmulti"), new NmultiItem());
	}
}
