
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

import net.mcreator.enemyexpproofofconcept.entity.EquestrianzombieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EquestrianzombieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EquestrianzombieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelequestrian_zombie(), 0.6f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("enemyexpproofofconcept:textures/entities/equestrian_zombie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelequestrian_zombie extends EntityModel<Entity> {
		private final ModelRenderer Rider;
		private final ModelRenderer riderlegright_r1;
		private final ModelRenderer riderlegleft_r1;
		private final ModelRenderer riderarmright_r1;
		private final ModelRenderer riderarmleft_r1;
		private final ModelRenderer riderbody_r1;
		private final ModelRenderer riderhead_r1;
		private final ModelRenderer Body;
		private final ModelRenderer Saddle;
		private final ModelRenderer TailA;
		private final ModelRenderer Leg1A;
		private final ModelRenderer Leg2A;
		private final ModelRenderer Leg3A;
		private final ModelRenderer Leg4A;
		private final ModelRenderer HeadSaddle;
		private final ModelRenderer Head;
		private final ModelRenderer Ear1;
		private final ModelRenderer Ear2;
		private final ModelRenderer MuleEarL;
		private final ModelRenderer MuleEarR;
		private final ModelRenderer Neck;
		private final ModelRenderer Bag1;
		private final ModelRenderer Bag2;
		private final ModelRenderer SaddleMouthL;
		private final ModelRenderer SaddleMouthR;
		private final ModelRenderer SaddleMouthLine;
		private final ModelRenderer SaddleMouthLineR;

		public Modelequestrian_zombie() {
			textureWidth = 64;
			textureHeight = 128;
			Rider = new ModelRenderer(this);
			Rider.setRotationPoint(0.0F, 10.0F, 0.0F);
			setRotationAngle(Rider, 0.2182F, 0.0F, 0.0F);
			riderlegright_r1 = new ModelRenderer(this);
			riderlegright_r1.setRotationPoint(-2.0F, -8.0F, 7.0F);
			Rider.addChild(riderlegright_r1);
			setRotationAngle(riderlegright_r1, -1.0527F, 0.5517F, 0.0481F);
			riderlegright_r1.setTextureOffset(4, 17).addBox(-1.0F, 3.5F, -2.5F, 3.0F, 12.0F, 3.0F, 0.0F, true);
			riderlegleft_r1 = new ModelRenderer(this);
			riderlegleft_r1.setRotationPoint(2.0F, -8.0F, 7.0F);
			Rider.addChild(riderlegleft_r1);
			setRotationAngle(riderlegleft_r1, -1.0527F, -0.5517F, -0.0481F);
			riderlegleft_r1.setTextureOffset(4, 17).addBox(-2.0F, 3.5F, -2.5F, 3.0F, 12.0F, 3.0F, 0.0F, false);
			riderarmright_r1 = new ModelRenderer(this);
			riderarmright_r1.setRotationPoint(-4.0F, -17.0F, 6.0F);
			Rider.addChild(riderarmright_r1);
			setRotationAngle(riderarmright_r1, -1.0489F, 0.0317F, -0.3733F);
			riderarmright_r1.setTextureOffset(40, 17).addBox(-2.4511F, -1.8203F, -0.983F, 3.0F, 12.0F, 3.0F, 0.0F, true);
			riderarmleft_r1 = new ModelRenderer(this);
			riderarmleft_r1.setRotationPoint(4.0F, -17.0F, 6.0F);
			Rider.addChild(riderarmleft_r1);
			setRotationAngle(riderarmleft_r1, -1.0489F, -0.0317F, 0.3733F);
			riderarmleft_r1.setTextureOffset(40, 17).addBox(-0.5489F, -1.8203F, -0.983F, 3.0F, 12.0F, 3.0F, 0.0F, false);
			riderbody_r1 = new ModelRenderer(this);
			riderbody_r1.setRotationPoint(0.0F, -7.0F, 6.0F);
			Rider.addChild(riderbody_r1);
			setRotationAngle(riderbody_r1, -0.2182F, 0.0F, 0.0F);
			riderbody_r1.setTextureOffset(16, 16).addBox(-4.0F, -11.25F, -3.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			riderhead_r1 = new ModelRenderer(this);
			riderhead_r1.setRotationPoint(0.0F, -19.0F, 8.0F);
			Rider.addChild(riderhead_r1);
			setRotationAngle(riderhead_r1, -0.2182F, 0.0F, 0.0F);
			riderhead_r1.setTextureOffset(0, 0).addBox(-4.0F, -6.9664F, -4.5237F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 11.0F, 9.0F);
			Body.setTextureOffset(0, 96).addBox(-5.0F, -8.0F, -20.0F, 10.0F, 10.0F, 22.0F, 0.0F, false);
			Saddle = new ModelRenderer(this);
			Saddle.setRotationPoint(0.0F, -9.0F, -7.0F);
			Body.addChild(Saddle);
			Saddle.setTextureOffset(26, 64).addBox(-5.0F, 1.0F, -5.5F, 10.0F, 9.0F, 9.0F, 0.5F, false);
			TailA = new ModelRenderer(this);
			TailA.setRotationPoint(0.0F, 4.0F, 11.0F);
			setRotationAngle(TailA, 0.5236F, 0.0F, 0.0F);
			TailA.setTextureOffset(42, 100).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, false);
			Leg1A = new ModelRenderer(this);
			Leg1A.setRotationPoint(3.0F, 13.0F, 9.0F);
			Leg1A.setTextureOffset(48, 85).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, true);
			Leg2A = new ModelRenderer(this);
			Leg2A.setRotationPoint(-3.0F, 13.0F, 9.0F);
			Leg2A.setTextureOffset(48, 85).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			Leg3A = new ModelRenderer(this);
			Leg3A.setRotationPoint(3.0F, 13.0F, -9.0F);
			Leg3A.setTextureOffset(48, 85).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, true);
			Leg4A = new ModelRenderer(this);
			Leg4A.setRotationPoint(-3.0F, 13.0F, -9.0F);
			Leg4A.setTextureOffset(48, 85).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			HeadSaddle = new ModelRenderer(this);
			HeadSaddle.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(HeadSaddle, 0.5236F, 0.0F, 0.0F);
			HeadSaddle.setTextureOffset(19, 64).addBox(-2.0F, -16.0F, -5.0F, 4.0F, 5.0F, 2.0F, 0.25F, false);
			HeadSaddle.setTextureOffset(0, 64).addBox(-3.0F, -16.0F, -3.0F, 6.0F, 5.0F, 7.0F, 0.25F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -4.0F, -11.0F);
			setRotationAngle(Head, 0.5236F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 77).addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(0, 89).addBox(-2.0F, -5.0F, -11.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);
			Ear1 = new ModelRenderer(this);
			Ear1.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(Ear1, 0.5236F, 0.0F, 0.0873F);
			Ear1.setTextureOffset(19, 80).addBox(-0.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, 0.0F, true);
			Ear2 = new ModelRenderer(this);
			Ear2.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(Ear2, 0.5236F, 0.0F, -0.0873F);
			Ear2.setTextureOffset(19, 80).addBox(-1.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			MuleEarL = new ModelRenderer(this);
			MuleEarL.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(MuleEarL, 0.5236F, 0.0F, 0.2618F);
			MuleEarL.setTextureOffset(0, 76).addBox(-3.0F, -22.0F, 2.99F, 2.0F, 7.0F, 1.0F, 0.0F, true);
			MuleEarR = new ModelRenderer(this);
			MuleEarR.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(MuleEarR, 0.5236F, 0.0F, -0.2618F);
			MuleEarR.setTextureOffset(0, 76).addBox(1.0F, -22.0F, 2.99F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			Neck = new ModelRenderer(this);
			Neck.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(Neck, 0.5236F, 0.0F, 0.0F);
			Neck.setTextureOffset(0, 99).addBox(-2.0F, -11.0F, -3.0F, 4.0F, 12.0F, 7.0F, 0.0F, false);
			Neck.setTextureOffset(56, 100).addBox(-1.0F, -16.0F, 4.01F, 2.0F, 16.0F, 2.0F, 0.0F, false);
			Bag1 = new ModelRenderer(this);
			Bag1.setRotationPoint(-5.0F, 3.0F, 11.0F);
			setRotationAngle(Bag1, 0.0F, -1.5708F, 0.0F);
			Bag1.setTextureOffset(26, 85).addBox(-9.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, 0.0F, false);
			Bag2 = new ModelRenderer(this);
			Bag2.setRotationPoint(5.0F, 3.0F, 11.0F);
			setRotationAngle(Bag2, 0.0F, 1.5708F, 0.0F);
			Bag2.setTextureOffset(26, 85).addBox(1.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, 0.0F, true);
			SaddleMouthL = new ModelRenderer(this);
			SaddleMouthL.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(SaddleMouthL, 0.5236F, 0.0F, 0.0F);
			SaddleMouthL.setTextureOffset(29, 69).addBox(2.0F, -14.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			SaddleMouthR = new ModelRenderer(this);
			SaddleMouthR.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(SaddleMouthR, 0.5236F, 0.0F, 0.0F);
			SaddleMouthR.setTextureOffset(29, 69).addBox(-3.0F, -14.0F, -6.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			SaddleMouthLine = new ModelRenderer(this);
			SaddleMouthLine.setRotationPoint(0.0F, 7.0F, -8.0F);
			SaddleMouthLine.setTextureOffset(32, 66).addBox(3.1F, -10.0F, -11.5F, 0.0F, 3.0F, 16.0F, 0.0F, false);
			SaddleMouthLineR = new ModelRenderer(this);
			SaddleMouthLineR.setRotationPoint(0.0F, 7.0F, -8.0F);
			SaddleMouthLineR.setTextureOffset(32, 66).addBox(-3.1F, -10.0F, -11.5F, 0.0F, 3.0F, 16.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Rider.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			TailA.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Leg1A.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Leg2A.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Leg3A.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Leg4A.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			HeadSaddle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Ear1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Ear2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			MuleEarL.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			MuleEarR.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Neck.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Bag1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Bag2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			SaddleMouthL.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			SaddleMouthR.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			SaddleMouthLine.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			SaddleMouthLineR.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Leg1A.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.riderhead_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.riderhead_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Leg3A.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Leg2A.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.Leg4A.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
