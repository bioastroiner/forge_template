package com.bioast.modid.core;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistryEntry;

public final class Ref {
    public static String modid() {
        return ModName.MOD_ID;
    }

    public static String version() {
        return "1.0";
    }

    public static <T extends IForgeRegistryEntry<T>> DeferredRegister<T> reg(T of) {
        return null;
    }
}
