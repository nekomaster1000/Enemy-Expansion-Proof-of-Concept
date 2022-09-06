// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgoblin extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer torso;
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer earleft;
	private final ModelRenderer earleft_r1;
	private final ModelRenderer earright;
	private final ModelRenderer earright_r1;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public Modelgoblin() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, -7.0F, 0.0F);
		bone.addChild(torso);
		torso.setTextureOffset(0, 38).addBox(-3.0F, -8.9F, -2.0F, 6.0F, 5.0F, 4.0F, 0.4F, false);
		torso.setTextureOffset(24, 0).addBox(-3.0F, -3.25F, -2.0F, 6.0F, 4.0F, 4.0F, 0.3F, false);
		torso.setTextureOffset(14, 16).addBox(-3.0F, -9.0F, -2.0F, 6.0F, 8.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -9.0F, 0.0F);
		torso.addChild(head);
		head.setTextureOffset(32, 32).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.2F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, -3.5F, -4.0F);
		head.addChild(nose);
		nose.setTextureOffset(33, 8).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		earleft = new ModelRenderer(this);
		earleft.setRotationPoint(4.0F, -3.0F, 0.0F);
		head.addChild(earleft);

		earleft_r1 = new ModelRenderer(this);
		earleft_r1.setRotationPoint(1.0F, -1.0F, 0.0F);
		earleft.addChild(earleft_r1);
		setRotationAngle(earleft_r1, 0.0F, 0.0F, 0.48F);
		earleft_r1.setTextureOffset(46, 2).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		earright = new ModelRenderer(this);
		earright.setRotationPoint(-4.0F, -3.0F, 0.0F);
		head.addChild(earright);

		earright_r1 = new ModelRenderer(this);
		earright_r1.setRotationPoint(-1.0F, -1.0F, 0.0F);
		earright.addChild(earright_r1);
		setRotationAngle(earright_r1, 0.0F, 0.0F, -0.48F);
		earright_r1.setTextureOffset(46, 2).addBox(0.0F, -4.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, true);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(3.0F, -8.5F, 0.0F);
		torso.addChild(leftarm);
		leftarm.setTextureOffset(34, 16).addBox(0.0F, -0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		leftarm.setTextureOffset(20, 39).addBox(0.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.1F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-3.0F, -8.5F, 0.0F);
		torso.addChild(rightarm);
		rightarm.setTextureOffset(34, 16).addBox(-3.0F, -0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, true);
		rightarm.setTextureOffset(20, 39).addBox(-3.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.1F, true);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(1.0F, -7.0F, 0.0F);
		bone.addChild(leftleg);
		leftleg.setTextureOffset(0, 16).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-1.0F, -7.0F, 0.0F);
		bone.addChild(rightleg);
		rightleg.setTextureOffset(0, 16).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}