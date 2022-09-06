// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsenior_zombie extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer head;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelsenior_zombie() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 6.0F, 2.0F);

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.4363F, 0.0F, 0.0F);
		Body_r1.setTextureOffset(0, 0).addBox(-8.0F, -20.0F, -5.0F, 16.0F, 20.0F, 8.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -17.0F, -10.0F);
		Body.addChild(head);
		head.setTextureOffset(0, 58).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-8.0F, -15.0F, -9.0F);
		Body.addChild(RightArm);
		RightArm.setTextureOffset(29, 29).addBox(-6.0F, -2.0F, -2.0F, 6.0F, 20.0F, 8.0F, 0.0F, false);
		RightArm.setTextureOffset(58, 31).addBox(-5.0F, 18.0F, 0.0F, 4.0F, 15.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(58, 25).addBox(-5.0F, 18.0F, -2.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(8.0F, -15.0F, -9.0F);
		Body.addChild(LeftArm);

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.829F, 0.0F, 0.0F);
		LeftArm_r1.setTextureOffset(0, 29).addBox(0.0F, -2.0F, -2.0F, 6.0F, 20.0F, 8.0F, 0.0F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.5F, 6.0F, 0.0F);
		RightLeg.setTextureOffset(51, 51).addBox(-5.4F, 0.0F, -2.0F, 8.0F, 18.0F, 7.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.5F, 6.0F, 0.0F);
		LeftLeg.setTextureOffset(49, 0).addBox(-2.6F, 0.0F, -2.0F, 8.0F, 18.0F, 7.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}