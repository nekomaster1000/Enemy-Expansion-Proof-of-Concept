
package net.mcreator.enemyexpproofofconcept.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.enemyexpproofofconcept.entity.FrigidZombieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FrigidZombieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FrigidZombieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcrawlingfrigid(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("enemyexpproofofconcept:textures/entities/frigid_zombie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcrawlingfrigid extends EntityModel<Entity> {
		private final ModelRenderer All;
		private final ModelRenderer Body;
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer RightArm;
		private final ModelRenderer RightArm_r1;
		private final ModelRenderer LeftArm;
		private final ModelRenderer LeftArm_r1;

		public Modelcrawlingfrigid() {
			textureWidth = 64;
			textureHeight = 64;
			All = new ModelRenderer(this);
			All.setRotationPoint(0.0F, 23.0F, 9.0F);
			setRotationAngle(All, 1.0472F, 0.0F, 0.0F);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -12.0F, 0.0F);
			All.addChild(Body);
			Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -12.0F, 0.0F);
			All.addChild(head);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, -1.0472F, 0.0F, 0.0F);
			head_r1.setTextureOffset(0, 32).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.2F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, -10.0F, 0.0F);
			All.addChild(RightArm);
			RightArm_r1 = new ModelRenderer(this);
			RightArm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightArm.addChild(RightArm_r1);
			setRotationAngle(RightArm_r1, -2.1817F, 0.0F, 0.0F);
			RightArm_r1.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, -10.0F, 0.0F);
			All.addChild(LeftArm);
			LeftArm_r1 = new ModelRenderer(this);
			LeftArm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftArm.addChild(LeftArm_r1);
			setRotationAngle(LeftArm_r1, -2.1817F, 0.0F, 0.0F);
			LeftArm_r1.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			All.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
