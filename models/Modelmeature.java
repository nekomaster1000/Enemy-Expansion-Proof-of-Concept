// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmeature extends EntityModel<Entity> {
	private final ModelRenderer waist;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm_r1;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg_r1;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg_r1;

	public Modelmeature() {
		textureWidth = 64;
		textureHeight = 32;

		waist = new ModelRenderer(this);
		waist.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -2.0F, 0.0F);
		waist.addChild(body);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(hat);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-2.0F, -2.0F, -2.0F);
		body.addChild(rightArm);

		rightArm_r1 = new ModelRenderer(this);
		rightArm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightArm.addChild(rightArm_r1);
		setRotationAngle(rightArm_r1, -0.7854F, 0.0F, 0.7854F);
		rightArm_r1.setTextureOffset(40, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(2.0F, -2.0F, -2.0F);
		body.addChild(leftArm);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, -0.7854F, 0.0F, -0.7854F);
		leftArm_r1.setTextureOffset(40, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.0F, -2.0F, 2.0F);
		body.addChild(rightLeg);

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, 0.7854F, 0.0F, 0.7854F);
		rightLeg_r1.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.0F, -2.0F, 2.0F);
		body.addChild(leftLeg);

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, 0.7854F, 0.0F, -0.7854F);
		leftLeg_r1.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		waist.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}