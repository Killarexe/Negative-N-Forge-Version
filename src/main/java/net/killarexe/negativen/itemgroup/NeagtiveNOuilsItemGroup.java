
package net.killarexe.negativen.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.killarexe.negativen.item.PiocheenDiamantNItem;
import net.killarexe.negativen.NegativenModElements;

@NegativenModElements.ModElement.Tag
public class NeagtiveNOuilsItemGroup extends NegativenModElements.ModElement {
	public NeagtiveNOuilsItemGroup(NegativenModElements instance) {
		super(instance, 271);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabneagtivenouils") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PiocheenDiamantNItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}