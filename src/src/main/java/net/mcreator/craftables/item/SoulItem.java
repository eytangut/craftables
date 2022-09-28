
package net.mcreator.craftables.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.craftables.init.CraftablesModTabs;

public class SoulItem extends Item {
	public SoulItem() {
		super(new Item.Properties().tab(CraftablesModTabs.TAB_CRAFTABLES).stacksTo(48).fireResistant().rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0.45f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
