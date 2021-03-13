publi class ModBlockLootTables extends BlockLootTables {
        @Override
        protected void addTables() {
            //registerDropSelfLootTable(ModBlocks.SILVER_BLOCK.get());
            //registerDropSelfLootTable(ModBlocks.SILVER_ORE.get());
        }

        @Override // for validation so it only chekcs our mod
        protected Iterable<Block> getKnownBlocks() {
            return Registration.BLOCKS.getEntries().stream()
                    .map(RegistryObject::get)
                    .collect(Collectors.toList());
        }
    }