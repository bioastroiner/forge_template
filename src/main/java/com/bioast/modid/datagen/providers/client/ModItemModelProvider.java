public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //withExistingParent("silver_block", modLoc("block/silver_block"));
        //withExistingParent("silver_ore", modLoc("block/silver_ore"));

        //ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        //builder(itemGenerated, "silver_ingot");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}