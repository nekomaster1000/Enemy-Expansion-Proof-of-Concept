// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeltarantula extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body0;
	private final ModelRenderer body1;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg5;
	private final ModelRenderer leg6;
	private final ModelRenderer leg7;

	public Modeltarantula() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, -3.0F);
		head.setTextureOffset(32, 42).addBox(-4.0F, -4.0F, -9.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		body0 = new ModelRenderer(this);
		body0.setRotationPoint(0.0F, 15.0F, 0.0F);
		body0.setTextureOffset(0, 49).addBox(-4.0F, -4.0F, -5.0F, 8.0F, 8.0F, 7.0F, 0.0F, false);

		body1 = new ModelRenderer(this);
		body1.setRotationPoint(0.0F, 13.5F, 1.0F);
		body1.setTextureOffset(0, 0).addBox(-8.0F, -6.0F, 0.0F, 16.0F, 12.0F, 16.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-6.0F, 15.25F, 6.0F);
		setRotationAngle(leg0, 0.0F, 0.7854F, -0.7854F);
		leg0.setTextureOffset(0, 41).addBox(-15.0F, -2.9F, -1.0F, 16.0F, 4.0F, 4.0F, 0.0F, true);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(6.0F, 15.25F, 6.0F);
		setRotationAngle(leg1, 0.0F, -0.7854F, 0.7854F);
		leg1.setTextureOffset(0, 41).addBox(-1.0F, -2.9F, -1.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-7.0F, 14.75F, 3.0F);
		setRotationAngle(leg2, 0.0F, 0.2618F, -0.6109F);
		leg2.setTextureOffset(0, 41).addBox(-15.0F, -2.75F, -1.0F, 16.0F, 4.0F, 4.0F, 0.0F, true);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(6.0F, 14.75F, 3.0F);
		setRotationAngle(leg3, 0.0F, -0.2618F, 0.6109F);
		leg3.setTextureOffset(0, 41).addBox(-1.0F, -2.75F, -1.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-4.0F, 14.5F, 0.0F);
		setRotationAngle(leg4, 0.0F, -0.2618F, -0.6109F);
		leg4.setTextureOffset(0, 41).addBox(-15.0F, -3.0F, -1.0F, 16.0F, 4.0F, 4.0F, 0.0F, true);

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(4.0F, 14.5F, 0.0F);
		setRotationAngle(leg5, 0.0F, 0.2618F, 0.6109F);
		leg5.setTextureOffset(0, 41).addBox(-1.0F, -3.0F, -1.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(-3.0F, 14.5F, -3.0F);
		setRotationAngle(leg6, 0.0F, -0.7854F, -0.7854F);
		leg6.setTextureOffset(0, 41).addBox(-15.0F, -2.9F, -1.0F, 16.0F, 4.0F, 4.0F, 0.0F, true);

		leg7 = new ModelRenderer(this);
		leg7.setRotationPoint(3.0F, 14.5F, -3.0F);
		setRotationAngle(leg7, 0.0F, 0.7854F, 0.7854F);
		leg7.setTextureOffset(0, 41).addBox(-1.0F, -2.9F, -1.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg5.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg6.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg7.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg5.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leg6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg7.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}