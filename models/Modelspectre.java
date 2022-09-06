// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelspectre extends EntityModel<Entity> {
	private final ModelRenderer All;
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer hornr_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public Modelspectre() {
		textureWidth = 64;
		textureHeight = 64;

		All = new ModelRenderer(this);
		All.setRotationPoint(0.0F, 24.0F, 0.0F);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -24.0F, 0.0F);
		All.addChild(Body);
		setRotationAngle(Body, 0.4363F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 40).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 20.0F, 4.0F, 0.2F, false);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 16.0F, 4.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -24.0F, 0.0F);
		All.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		hornr_r1 = new ModelRenderer(this);
		hornr_r1.setRotationPoint(-2.0F, -5.0F, -4.0F);
		Head.addChild(hornr_r1);
		setRotationAngle(hornr_r1, 0.7854F, 0.0F, 0.0F);
		hornr_r1.setTextureOffset(0, 49).addBox(-1.0F, -7.5F, -0.5F, 1.0F, 8.0F, 2.0F, 0.0F, false);
		hornr_r1.setTextureOffset(0, 49).addBox(4.0F, -7.5F, -0.5F, 1.0F, 8.0F, 2.0F, 0.0F, true);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-4.0F, -21.0F, 0.0F);
		All.addChild(RightArm);
		setRotationAngle(RightArm, -1.2217F, 0.0873F, 0.3491F);
		RightArm.setTextureOffset(0, 16).addBox(-2.766F, -1.1084F, -2.2935F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(42, 16).addBox(-3.766F, -1.1084F, -2.2935F, 4.0F, 12.0F, 5.0F, 0.2F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(4.0F, -21.0F, 0.0F);
		All.addChild(LeftArm);
		setRotationAngle(LeftArm, -1.2217F, -0.0873F, -0.3491F);
		LeftArm.setTextureOffset(0, 16).addBox(0.766F, -1.1084F, -2.2935F, 2.0F, 12.0F, 2.0F, 0.0F, true);
		LeftArm.setTextureOffset(42, 16).addBox(-0.234F, -1.1084F, -2.2935F, 4.0F, 12.0F, 5.0F, 0.2F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		All.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}