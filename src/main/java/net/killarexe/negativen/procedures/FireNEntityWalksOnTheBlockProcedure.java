package net.killarexe.negativen.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.killarexe.negativen.potion.OnFireNPotion;
import net.killarexe.negativen.NegativenModElements;
import net.killarexe.negativen.NegativenMod;

import java.util.Map;

@NegativenModElements.ModElement.Tag
public class FireNEntityWalksOnTheBlockProcedure extends NegativenModElements.ModElement {
	public FireNEntityWalksOnTheBlockProcedure(NegativenModElements instance) {
		super(instance, 597);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NegativenMod.LOGGER.warn("Failed to load dependency entity for procedure FireNEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(OnFireNPotion.potion, (int) 60, (int) 1));
	}
}
