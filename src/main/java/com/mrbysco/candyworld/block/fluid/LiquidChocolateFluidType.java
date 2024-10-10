package com.mrbysco.candyworld.block.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidType;

import java.util.function.Consumer;

public class LiquidChocolateFluidType extends FluidType {

    public static final ResourceLocation FLUID_STILL = new ResourceLocation("candyworld:fluid/liquid_chocolate_still");
    public static final ResourceLocation FLUID_FLOWING = new ResourceLocation("candyworld:fluid/liquid_chocolate_flow");

    public LiquidChocolateFluidType(Properties properties) {
        super(properties);
    }

    @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
        consumer.accept(new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return FLUID_STILL;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return FLUID_FLOWING;
            }
        });
    }
}
