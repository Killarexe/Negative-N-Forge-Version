
package net.killarexe.negativen.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.killarexe.negativen.itemgroup.NegativeNFoodItemGroup;
import net.killarexe.negativen.NegativenModElements;

@NegativenModElements.ModElement.Tag
public class CarrotsNItem extends NegativenModElements.ModElement {
	@ObjectHolder("negativen:carrots_n")
	public static final Item block = null;
	public CarrotsNItem(NegativenModElements instance) {
		super(instance, 611);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(NegativeNFoodItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(3).saturation(0.2f).build()));
			setRegistryName("carrots_n");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}