@Mod.EventBusSubscriber(modid = modid, bus = Mod.EventBusSubscriber.Bus.MOD)
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