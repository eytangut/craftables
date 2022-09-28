
package net.mcreator.craftables.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.craftables.init.CraftablesModTabs;

public class EssanceItem extends Item {
	public EssanceItem() {
		super(new Item.Properties().tab(CraftablesModTabs.TAB_CRAFTABLES).stacksTo(48).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
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
