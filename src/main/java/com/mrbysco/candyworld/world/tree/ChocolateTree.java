package com.mrbysco.candyworld.world.tree;

import com.mrbysco.candyworld.world.ModConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class ChocolateTree extends AbstractTreeGrower {
	@Nullable
	@Override
	protected @org.jetbrains.annotations.Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
		return ModConfiguredFeatures.CHOCOLATE_TREE.getHolder().orElse(null);
	}
}
