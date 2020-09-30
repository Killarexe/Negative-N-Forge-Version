
package net.killarexe.negativen.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.killarexe.negativen.itemgroup.NegativeNRedstoneNItemGroup;
import net.killarexe.negativen.NegativenModElements;

@NegativenModElements.ModElement.Tag
public class RedstoneNItem extends NegativenModElements.ModElement {
	@ObjectHolder("negativen:redstone_n")
	public static final Item block = null;
	public RedstoneNItem(NegativenModElements instance) {
		super(instance, 689);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NegativeNRedstoneNItemGroup.tab).maxStackSize(64));
			setRegistryName("redstone_n");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}