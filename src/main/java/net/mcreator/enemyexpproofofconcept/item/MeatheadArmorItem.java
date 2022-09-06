
package net.mcreator.enemyexpproofofconcept.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.enemyexpproofofconcept.EnemyexpproofofconceptModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@EnemyexpproofofconceptModElements.ModElement.Tag
public class MeatheadArmorItem extends EnemyexpproofofconceptModElements.ModElement {
	@ObjectHolder("enemyexpproofofconcept:meathead_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("enemyexpproofofconcept:meathead_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("enemyexpproofofconcept:meathead_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("enemyexpproofofconcept:meathead_armor_boots")
	public static final Item boots = null;

	public MeatheadArmorItem(EnemyexpproofofconceptModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.TURTLE_HELMET));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "meathead_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new Modelmeathat().head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "enemyexpproofofconcept:textures/entities/meathat.png";
			}
		}.setRegistryName("meathead_armor_helmet"));
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelmeathat extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer rightArm_r1;
		private final ModelRenderer leftArm_r1;
		private final ModelRenderer rightLeg_r1;
		private final ModelRenderer leftLeg_r1;

		public Modelmeathat() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.1F, false);
			rightArm_r1 = new ModelRenderer(this);
			rightArm_r1.setRotationPoint(-2.0F, -2.0F, -2.0F);
			head.addChild(rightArm_r1);
			setRotationAngle(rightArm_r1, -0.7854F, 0.0F, 0.7854F);
			rightArm_r1.setTextureOffset(40, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			leftArm_r1 = new ModelRenderer(this);
			leftArm_r1.setRotationPoint(2.0F, -2.0F, -2.0F);
			head.addChild(leftArm_r1);
			setRotationAngle(leftArm_r1, -0.7854F, 0.0F, -0.7854F);
			leftArm_r1.setTextureOffset(40, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, true);
			rightLeg_r1 = new ModelRenderer(this);
			rightLeg_r1.setRotationPoint(-1.0F, -2.0F, 2.0F);
			head.addChild(rightLeg_r1);
			setRotationAngle(rightLeg_r1, 0.7854F, 0.0F, 0.7854F);
			rightLeg_r1.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			leftLeg_r1 = new ModelRenderer(this);
			leftLeg_r1.setRotationPoint(1.0F, -2.0F, 2.0F);
			head.addChild(leftLeg_r1);
			setRotationAngle(leftLeg_r1, 0.7854F, 0.0F, -0.7854F);
			leftLeg_r1.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
