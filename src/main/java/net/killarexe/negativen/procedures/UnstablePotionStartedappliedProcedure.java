package net.killarexe.negativen.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.killarexe.negativen.NegativenModElements;
import net.killarexe.negativen.NegativenMod;

import java.util.Map;

@NegativenModElements.ModElement.Tag
public class UnstablePotionStartedappliedProcedure extends NegativenModElements.ModElement {
	public UnstablePotionStartedappliedProcedure(NegativenModElements instance) {
		super(instance, 504);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NegativenMod.LOGGER.warn("Failed to load dependency entity for procedure UnstablePotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (10); index0++) {
			entity.attackEntityFrom(DamageSource.MAGIC, (float) 1);
		}
	}
}
