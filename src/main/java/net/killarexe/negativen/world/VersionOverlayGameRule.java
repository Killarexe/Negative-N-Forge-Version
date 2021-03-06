package net.killarexe.negativen.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.killarexe.negativen.NegativeNModElements;

import java.lang.reflect.Method;

@NegativeNModElements.ModElement.Tag
public class VersionOverlayGameRule extends NegativeNModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("versionOverlay", GameRules.Category.PLAYER,
			create(true));
	public VersionOverlayGameRule(NegativeNModElements instance) {
		super(instance, 991);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
