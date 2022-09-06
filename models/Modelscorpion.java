// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscorpion extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer torso;
	private final ModelRenderer stinger;
	private final ModelRenderer stinger_r1;
	private final ModelRenderer stringertorso;
	private final ModelRenderer stringertorso_r1;
	private final ModelRenderer stingerhead;
	private final ModelRenderer stingerhead_r1;
	private final ModelRenderer arml;
	private final ModelRenderer armr;
	private final ModelRenderer l3;
	private final ModelRenderer r3;
	private final ModelRenderer l2;
	private final ModelRenderer r2;
	private final ModelRenderer l1;
	private final ModelRenderer r1;

	public Modelscorpion() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 16.0F, -1.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(body);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, -5.0F);
		body.addChild(head);
		head.setTextureOffset(30, 13).addBox(-5.0F, -3.0F, -6.0F, 10.0F, 8.0F, 7.0F, 0.02F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, -1.0F, -1.0F);
		body.addChild(torso);
		torso.setTextureOffset(0, 20).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 10.0F, 0.0F, false);

		stinger = new ModelRenderer(this);
		stinger.setRotationPoint(0.0F, 0.0F, 6.0F);
		torso.addChild(stinger);

		stinger_r1 = new ModelRenderer(this);
		stinger_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
		stinger.addChild(stinger_r1);
		setRotationAngle(stinger_r1, 0.7854F, 0.0F, 0.0F);
		stinger_r1.setTextureOffset(0, 0).addBox(-3.0F, -1.636F, -0.5355F, 6.0F, 5.0F, 12.0F, 0.0F, false);

		stringertorso = new ModelRenderer(this);
		stringertorso.setRotationPoint(0.0F, -8.0F, 5.0F);
		stinger.addChild(stringertorso);

		stringertorso_r1 = new ModelRenderer(this);
		stringertorso_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		stringertorso.addChild(stringertorso_r1);
		setRotationAngle(stringertorso_r1, 2.3562F, 0.0F, 0.0F);
		stringertorso_r1.setTextureOffset(28, 29).addBox(-2.0F, -1.4142F, 0.0F, 4.0F, 3.0F, 9.0F, 0.0F, false);

		stingerhead = new ModelRenderer(this);
		stingerhead.setRotationPoint(0.0F, -6.5F, -6.5F);
		stringertorso.addChild(stingerhead);

		stingerhead_r1 = new ModelRenderer(this);
		stingerhead_r1.setRotationPoint(0.0F, -0.5F, 0.5F);
		stingerhead.addChild(stingerhead_r1);
		setRotationAngle(stingerhead_r1, 2.3562F, 0.0F, 0.0F);
		stingerhead_r1.setTextureOffset(29, 47).addBox(-2.0F, -6.1F, -0.2F, 4.0F, 7.0F, 2.0F, 0.02F, false);

		arml = new ModelRenderer(this);
		arml.setRotationPoint(4.0F, 3.0F, -6.0F);
		all.addChild(arml);
		setRotationAngle(arml, 0.2967F, 0.1745F, 0.5236F);
		arml.setTextureOffset(25, 0).addBox(-1.32F, -1.7834F, -2.438F, 10.0F, 3.0F, 6.0F, 0.0F, false);
		arml.setTextureOffset(46, 29).addBox(5.68F, -1.7834F, -6.438F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		armr = new ModelRenderer(this);
		armr.setRotationPoint(-4.0F, 3.0F, -6.0F);
		all.addChild(armr);
		setRotationAngle(armr, 0.2967F, -0.1745F, -0.5236F);
		armr.setTextureOffset(25, 0).addBox(-8.68F, -1.7834F, -2.438F, 10.0F, 3.0F, 6.0F, 0.0F, true);
		armr.setTextureOffset(46, 29).addBox(-8.68F, -1.7834F, -6.438F, 3.0F, 2.0F, 4.0F, 0.0F, true);

		l3 = new ModelRenderer(this);
		l3.setRotationPoint(4.0F, 1.0F, 2.0F);
		all.addChild(l3);
		setRotationAngle(l3, 0.0F, -0.7854F, 0.7854F);
		l3.setTextureOffset(29, 42).addBox(-1.0F, -1.0F, -1.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);

		r3 = new ModelRenderer(this);
		r3.setRotationPoint(-4.0F, 1.0F, 2.0F);
		all.addChild(r3);
		setRotationAngle(r3, 0.0F, 0.7854F, -0.7854F);
		r3.setTextureOffset(29, 42).addBox(-11.0F, -1.0F, -1.0F, 12.0F, 2.0F, 2.0F, 0.0F, true);

		l2 = new ModelRenderer(this);
		l2.setRotationPoint(4.0F, 1.0F, 1.0F);
		all.addChild(l2);
		setRotationAngle(l2, 0.0F, -0.2618F, 0.6109F);
		l2.setTextureOffset(0, 45).addBox(-1.0F, -1.0F, -1.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);

		r2 = new ModelRenderer(this);
		r2.setRotationPoint(-4.0F, 1.0F, 1.0F);
		all.addChild(r2);
		setRotationAngle(r2, 0.0F, 0.2618F, -0.6109F);
		r2.setTextureOffset(0, 45).addBox(-11.0F, -1.0F, -1.0F, 12.0F, 2.0F, 2.0F, 0.0F, true);

		l1 = new ModelRenderer(this);
		l1.setRotationPoint(4.0F, 1.0F, 0.0F);
		all.addChild(l1);
		setRotationAngle(l1, 0.0F, 0.2618F, 0.6109F);
		l1.setTextureOffset(0, 40).addBox(-1.0F, -1.0F, -1.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);

		r1 = new ModelRenderer(this);
		r1.setRotationPoint(-4.0F, 1.0F, 0.0F);
		all.addChild(r1);
		setRotationAngle(r1, 0.0F, -0.2618F, -0.6109F);
		r1.setTextureOffset(0, 40).addBox(-11.0F, -1.0F, -1.0F, 12.0F, 2.0F, 2.0F, 0.0F, true);
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
		this.r2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.r3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.l1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.l2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.l3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.r1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}