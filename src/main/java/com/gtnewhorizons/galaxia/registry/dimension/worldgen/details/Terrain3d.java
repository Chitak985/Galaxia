package com.gtnewhorizons.galaxia.registry.dimension.worldgen.details;

import java.util.Random;

import com.gtnewhorizons.galaxia.registry.dimension.worldgen.TerrainModifierEntry;
import com.gtnewhorizons.galaxia.registry.dimension.worldgen.modifier.ModifierHandler;

public interface Terrain3d {

    void prepareFunctions(Random random);

    boolean preparedFunctions();

    void prepareTerrainCache(int chunkX, int chunkZ, ModifierHandler modifierHandler);

    boolean preparedTerrainCache(int chunkX, int chunkZ);

    int getHeight(int localX, int localZ);

    boolean isSolid(int localX, int localY, int localZ);

    TerrainModifierEntry getEntry();
}
