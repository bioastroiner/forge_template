package com.bioast.modid.common.core;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Ref {
    public static String id() {
        return ID;
    }

    public static final String ID = "modid PLACEHOLDER";

    public static String ver() {
        return "0.1a";
    }

    public static Logger out(){
        return LogManager.getLogger();
    }

    public static <T extends IForgeRegistryEntry<T>> DeferredRegister<T> reg(T of) {
        return null;
    }
}
