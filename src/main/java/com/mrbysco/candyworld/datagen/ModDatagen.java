package com.mrbysco.candyworld.datagen;

import com.mrbysco.candyworld.datagen.assets.CandyItemModelProvider;
import com.mrbysco.candyworld.datagen.assets.CandyLanguageProvider;
import com.mrbysco.candyworld.datagen.assets.CandyStateProvider;
import com.mrbysco.candyworld.datagen.data.CandyRecipes;
import com.mrbysco.candyworld.datagen.data.LootGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDatagen {
	@SubscribeEvent
	public static void gatherData(final GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput output = generator.getPackOutput();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

		generator.addProvider(event.includeServer(), new CandyItemModelProvider(output, existingFileHelper));
		generator.addProvider(event.includeServer(), new CandyLanguageProvider(output));
		generator.addProvider(event.includeServer(), new CandyStateProvider(output, existingFileHelper));
		generator.addProvider(event.includeServer(), new CandyRecipes(output));
		generator.addProvider(event.includeServer(), new LootGenerator(output, lookupProvider));
	}
}
