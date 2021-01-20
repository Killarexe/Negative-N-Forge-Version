package net.killarexe.negativen.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.killarexe.negativen.item.WheatNSeedItem;
import net.killarexe.negativen.item.BeetrootSeedItem;
import net.killarexe.negativen.NegativenModElements;
import net.killarexe.negativen.NegativenMod;

import java.util.Random;
import java.util.Map;

@NegativenModElements.ModElement.Tag
public class GrassNPlantDestroyedByPlayerProcedure extends NegativenModElements.ModElement {
	public GrassNPlantDestroyedByPlayerProcedure(NegativenModElements instance) {
		super(instance, 738);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NegativenMod.LOGGER.warn("Failed to load dependency x for procedure GrassNPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NegativenMod.LOGGER.warn("Failed to load dependency y for procedure GrassNPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NegativenMod.LOGGER.warn("Failed to load dependency z for procedure GrassNPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NegativenMod.LOGGER.warn("Failed to load dependency world for procedure GrassNPlantDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double Random = 0;
		Random = (double) Math.random();
		if (((Random) <= 0.66)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(WheatNSeedItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if (((Random) <= 0.33)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(BeetrootSeedItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
