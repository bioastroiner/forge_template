package com.bioast.modid.datagen.providers.client;

import com.bioast.modid.common.core.Ref;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Ref.id(), exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //simpleBlock(ModBlocks.SILVER_BLOCK.get());
        //simpleBlock(ModBlocks.SILVER_ORE.get());
    }
}