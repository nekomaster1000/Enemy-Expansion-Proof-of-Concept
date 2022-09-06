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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}