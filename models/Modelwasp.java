// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwasp extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer head;
	private final ModelRenderer antenna;
	private final ModelRenderer body;
	private final ModelRenderer torso;
	private final ModelRenderer leftwing;
	private final ModelRenderer rightwing;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer tail;
	private final ModelRenderer stinger;

	public Modelwasp() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, -2.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -15.0F, -1.0F);
		all.addChild(head);
		setRotationAngle(head, -0.1745F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-2.5F, -0.9848F, -4.1736F, 5.0F, 6.0F, 4.0F, 0.0F, false);

		antenna = new ModelRenderer(this);
		antenna.setRotationPoint(0.0F, 1.0152F, -4.1736F);
		head.addChild(antenna);
		antenna.setTextureOffset(8, 41).addBox(-2.5F, -2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
		antenna.setTextureOffset(0, 41).addBox(2.501F, -2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -16.0F, -3.0F);
		all.addChild(body);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(torso);
		setRotationAngle(torso, 0.7854F, 0.0F, 0.0F);
		torso.setTextureOffset(0, 12).addBox(-3.0F, 1.2929F, -0.2929F, 6.0F, 8.0F, 5.0F, 0.1F, false);

		leftwing = new ModelRenderer(this);
		leftwing.setRotationPoint(0.0F, 5.0F, 4.75F);
		torso.addChild(leftwing);
		setRotationAngle(leftwing, 0.0F, -0.7854F, 0.0F);
		leftwing.setTextureOffset(0, 59).addBox(0.0F, -3.0F, 0.0F, 12.0F, 5.0F, 0.0F, 0.0F, false);

		rightwing = new ModelRenderer(this);
		rightwing.setRotationPoint(0.0F, 5.0F, 4.75F);
		torso.addChild(rightwing);
		setRotationAngle(rightwing, 0.0F, 0.7854F, 0.0F);
		rightwing.setTextureOffset(40, 59).addBox(-12.0F, -3.0F, 0.0F, 12.0F, 5.0F, 0.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(3.0F, 6.5F, 1.9F);
		torso.addChild(leftarm);
		setRotationAngle(leftarm, 0.4363F, -0.2182F, 0.0F);
		leftarm.setTextureOffset(0, 35).addBox(0.2633F, -2.5486F, -6.4491F, 0.0F, 1.0F, 8.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 35).addBox(0.2633F, -0.0486F, -7.9491F, 0.0F, 1.0F, 8.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 36).addBox(0.2633F, 1.7014F, -5.9491F, 0.0F, 1.0F, 5.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-3.0F, 6.5F, 1.9F);
		torso.addChild(rightarm);
		setRotationAngle(rightarm, 0.4363F, 0.2182F, 0.0F);
		rightarm.setTextureOffset(0, 35).addBox(-0.2633F, -2.5486F, -6.4491F, 0.0F, 1.0F, 8.0F, 0.0F, true);
		rightarm.setTextureOffset(0, 35).addBox(-0.2633F, -0.0486F, -7.9491F, 0.0F, 1.0F, 8.0F, 0.0F, true);
		rightarm.setTextureOffset(0, 36).addBox(-0.2633F, 1.7014F, -5.9491F, 0.0F, 1.0F, 5.0F, 0.0F, true);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 9.0F, 0.0F);
		torso.addChild(tail);
		setRotationAngle(tail, -1.1781F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 26).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		stinger = new ModelRenderer(this);
		stinger.setRotationPoint(0.0F, 9.7F, 3.0F);
		tail.addChild(stinger);
		setRotationAngle(stinger, -1.1781F, 0.0F, 0.0F);
		stinger.setTextureOffset(22, 12).addBox(0.0F, -0.2F, -2.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		all.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftwing.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.rightwing.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}