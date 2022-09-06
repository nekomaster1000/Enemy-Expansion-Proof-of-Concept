package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.enemyexpproofofconcept.EnemyexpproofofconceptMod;

import java.util.Map;

public class SprinterzombieEntityIsHurtProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EnemyexpproofofconceptMod.LOGGER.warn("Failed to load dependency entity for procedure SprinterzombieEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 80, (int) 1, (false), (false)));
	}
}
