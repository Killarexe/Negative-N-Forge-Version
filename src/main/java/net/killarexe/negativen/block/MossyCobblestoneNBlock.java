
package net.killarexe.negativen.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.killarexe.negativen.itemgroup.NegativeNDecorationBlocksItemGroup;
import net.killarexe.negativen.NegativenModElements;

import java.util.List;
import java.util.Collections;

@NegativenModElements.ModElement.Tag
public class MossyCobblestoneNBlock extends NegativenModElements.ModElement {
	@ObjectHolder("negativen:mossy_cobblestone_n")
	public static final Block block = null;
	public MossyCobblestoneNBlock(NegativenModElements instance) {
		super(instance, 114);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(NegativeNDecorationBlocksItemGroup.tab))
				.setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1.25f, 10f).setLightLevel(s -> 0)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).setNeedsPostProcessing((bs, br, bp) -> true)
					.setEmmisiveRendering((bs, br, bp) -> true));
			setRegistryName("mossy_cobblestone_n");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(CobblestoneNBlock.block, (int) (1)));
		}
	}
}
