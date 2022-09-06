
package net.mcreator.enemyexpproofofconcept.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.enemyexpproofofconcept.entity.PebbleEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PebbleRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PebbleEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelpebble(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("enemyexpproofofconcept:textures/entities/pebble.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelpebble extends EntityModel<Entity> {
		private final ModelRenderer all;
		private final ModelRenderer upperbody;
		private final ModelRenderer spine;
		private final ModelRenderer upperbody_r1;
		private final ModelRenderer head;
		private final ModelRenderer neck_r1;
		private final ModelRenderer head_r1;
		private final ModelRenderer antennal;
		private final ModelRenderer antennal_r1;
		private final ModelRenderer antennar;
		private final ModelRenderer antennar_r1;
		private final ModelRenderer arml;
		private final ModelRenderer armr;
		private final ModelRenderer bodylower;
		private final ModelRenderer legl;
		private final ModelRenderer legr;
		private final ModelRenderer arml2;
		private final ModelRenderer armr2;

		public Modelpebble() {
			textureWidth = 64;
			textureHeight = 64;
			all = new ModelRenderer(this);
			all.setRotationPoint(0.0F, 24.0F, 5.0F);
			upperbody = new ModelRenderer(this);
			upperbody.setRotationPoint(0.0F, -10.0F, -5.0F);
			all.addChild(upperbody);
			setRotationAngle(upperbody, -0.7854F, 0.0F, 0.0F);
			upperbody.setTextureOffset(0, 17).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 5.0F, 5.0F, 0.0F, false);
			spine = new ModelRenderer(this);
			spine.setRotationPoint(0.0F, -6.0F, -1.0F);
			upperbody.addChild(spine);
			upperbody_r1 = new ModelRenderer(this);
			upperbody_r1.setRotationPoint(0.0F, 6.0F, 1.0F);
			spine.addChild(upperbody_r1);
			setRotationAngle(upperbody_r1, -0.3927F, 0.0F, 0.0F);
			upperbody_r1.setTextureOffset(24, 55).addBox(-2.0F, -3.9F, -2.75F, 4.0F, 4.0F, 5.0F, -0.1F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -1.0F, -4.0F);
			upperbody.addChild(head);
			neck_r1 = new ModelRenderer(this);
			neck_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(neck_r1);
			setRotationAngle(neck_r1, 2.0071F, 0.0F, 0.0F);
			neck_r1.setTextureOffset(9, 57).addBox(-2.0F, -3.0F, -0.5F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.7854F, 0.0F, 0.0F);
			head_r1.setTextureOffset(3, 6).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			antennal = new ModelRenderer(this);
			antennal.setRotationPoint(1.8F, 1.2F, -6.5F);
			head.addChild(antennal);
			antennal_r1 = new ModelRenderer(this);
			antennal_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			antennal.addChild(antennal_r1);
			setRotationAngle(antennal_r1, 1.5708F, -0.3491F, 0.0F);
			antennal_r1.setTextureOffset(43, 55).addBox(0.0F, -8.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.05F, false);
			antennar = new ModelRenderer(this);
			antennar.setRotationPoint(-1.8F, 1.2F, -6.5F);
			head.addChild(antennar);
			antennar_r1 = new ModelRenderer(this);
			antennar_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			antennar.addChild(antennar_r1);
			setRotationAngle(antennar_r1, 1.5708F, 0.3491F, 0.0F);
			antennar_r1.setTextureOffset(43, 55).addBox(-1.0F, -8.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.05F, true);
			arml = new ModelRenderer(this);
			arml.setRotationPoint(3.0F, 1.0F, -1.0F);
			head.addChild(arml);
			setRotationAngle(arml, 2.3562F, 0.0F, 0.48F);
			arml.setTextureOffset(0, 57).addBox(0.0F, -5.0F, -5.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			arml.setTextureOffset(0, 50).addBox(0.0F, -2.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			armr = new ModelRenderer(this);
			armr.setRotationPoint(-3.0F, 1.0F, -1.0F);
			head.addChild(armr);
			setRotationAngle(armr, 2.3562F, 0.0F, -0.48F);
			armr.setTextureOffset(0, 57).addBox(-2.0F, -5.0F, -5.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
			armr.setTextureOffset(0, 50).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
			bodylower = new ModelRenderer(this);
			bodylower.setRotationPoint(0.0F, -10.0F, -5.0F);
			all.addChild(bodylower);
			setRotationAngle(bodylower, 1.5708F, 0.0F, 0.0F);
			bodylower.setTextureOffset(0, 28).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 5.0F, 5.0F, 0.0F, false);
			legl = new ModelRenderer(this);
			legl.setRotationPoint(2.0F, 2.5F, -5.0F);
			bodylower.addChild(legl);
			legl.setTextureOffset(0, 39).addBox(-2.0F, -2.5F, -5.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			legr = new ModelRenderer(this);
			legr.setRotationPoint(-2.0F, 2.5F, -5.0F);
			bodylower.addChild(legr);
			legr.setTextureOffset(0, 39).addBox(-3.0F, -2.5F, -5.0F, 5.0F, 5.0F, 5.0F, 0.0F, true);
			arml2 = new ModelRenderer(this);
			arml2.setRotationPoint(5.0F, 0.0F, -2.0F);
			bodylower.addChild(arml2);
			setRotationAngle(arml2, 0.0F, 0.0F, -0.7854F);
			arml2.setTextureOffset(0, 57).addBox(-2.0F, -5.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			armr2 = new ModelRenderer(this);
			armr2.setRotationPoint(-5.0F, 0.0F, -2.0F);
			bodylower.addChild(armr2);
			setRotationAngle(armr2, 0.0F, 0.0F, 0.7854F);
			armr2.setTextureOffset(0, 57).addBox(0.0F, -5.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			all.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleZ = f3 / (180F / (float) Math.PI);
		}
	}

}
