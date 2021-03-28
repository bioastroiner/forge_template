package com.bioast.modid.datagen;

import com.bioast.modid.datagen.providers.client.ModBlockStateProvider;
import com.bioast.modid.datagen.providers.client.ModItemModelProvider;
import com.bioast.modid.datagen.providers.server.loottables.ModLootTableProvider;
import com.bioast.modid.datagen.providers.server.recipes.ModRecipeProvider;
import com.bioast.modid.datagen.providers.server.tags.ModBlockTagsProvider;
import com.bioast.modid.datagen.providers.server.tags.ModItemTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

import static com.bioast.modid.core.ModName.MOD_ID;


@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
		
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		if (event.includeServer()) {
			// Loot & Recipe
            gen.addProvider(new ModLootTableProvider(gen));
            gen.addProvider(new ModRecipeProvider(gen));
			// Tags
			ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
			ModItemTagsProvider blockItemTags = new ModItemTagsProvider(gen, blockTags, existingFileHelper);
			gen.addProvider(blockTags);
			gen.addProvider(blockItemTags);
        }
        if (event.includeClient()) {
			// BlockState
            gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
			// ItemModel
			gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
        }
    }
}