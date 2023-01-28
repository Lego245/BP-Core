package com.7appdev.planeteercore.registries;

import com.7appdev.planeteercore.PlaneteerCore;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksRegistry {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PlaneteerCore.MODID);

    /**
     * Decorations
     */
    //

    // Cobalt Blocks
    public static RegistryObject<Block> COBALT_BLOCK_RAW = BLOCKS.register("cobalt_block_raw", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_RAW_WALL = BLOCKS.register("cobalt_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_RAW_SLAB = BLOCKS.register("cobalt_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_RAW_STAIR = BLOCKS.register("cobalt_block_raw_stairs", () -> { return new StairBlock(() -> COBALT_BLOCK_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_WALL = BLOCKS.register("cobalt_block_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_SLAB = BLOCKS.register("cobalt_block_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_STAIR = BLOCKS.register("cobalt_block_stairs", () -> { return new StairBlock(() -> COBALT_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});

    // Lead Blocks
    public static RegistryObject<Block> LEAD_BLOCK_RAW = BLOCKS.register("lead_block_raw", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_RAW_WALL = BLOCKS.register("lead_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_RAW_SLAB = BLOCKS.register("lead_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_RAW_STAIR = BLOCKS.register("lead_block_raw_stairs", () -> { return new StairBlock(() -> LEAD_BLOCK_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_WALL = BLOCKS.register("lead_block_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_SLAB = BLOCKS.register("lead_block_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_STAIR = BLOCKS.register("lead_block_stairs", () -> { return new StairBlock(() -> LEAD_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});

    // Tin Blocks
    public static RegistryObject<Block> TIN_BLOCK_RAW = BLOCKS.register("tin_block_raw", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_RAW_WALL = BLOCKS.register("tin_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_RAW_SLAB = BLOCKS.register("tin_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_RAW_STAIR = BLOCKS.register("tin_block_raw_stairs", () -> { return new StairBlock(() -> TIN_BLOCK_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_WALL = BLOCKS.register("tin_block_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_SLAB = BLOCKS.register("tin_block_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_STAIR = BLOCKS.register("tin_block_stairs", () -> { return new StairBlock(() -> TIN_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    
    // Uranium Blocks
    public static RegistryObject<Block> URANIUM_BLOCK_RAW = BLOCKS.register("uranium_block_raw", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_RAW_WALL = BLOCKS.register("uranium_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_RAW_SLAB = BLOCKS.register("uranium_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_RAW_STAIR = BLOCKS.register("uranium_block_raw_stairs", () -> { return new StairBlock(() -> URANIUM_BLOCK_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_WALL = BLOCKS.register("uranium_block_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_SLAB = BLOCKS.register("uranium_block_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_STAIR = BLOCKS.register("uranium_block_stairs", () -> { return new StairBlock(() -> URANIUM_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});

    // Zinc Blocks
    public static RegistryObject<Block> ZINC_BLOCK_RAW = BLOCKS.register("zinc_block_raw", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_RAW_WALL = BLOCKS.register("zinc_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_RAW_SLAB = BLOCKS.register("zinc_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_RAW_STAIR = BLOCKS.register("zinc_block_raw_stairs", () -> { return new StairBlock(() -> ZINC_BLOCK_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_WALL = BLOCKS.register("zinc_block_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_SLAB = BLOCKS.register("zinc_block_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_STAIR = BLOCKS.register("zinc_block_stairs", () -> { return new StairBlock(() -> ZINC_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});

    /**
     * Ores
     */

    //Mars Ores
    public static RegistryObject<Block> MARS_COPPER_ORE = BLOCKS.register("mars_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_LEAD_ORE = BLOCKS.register("mars_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_TIN_ORE = BLOCKS.register("mars_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_URANIUM_ORE = BLOCKS.register("mars_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_ZINC_ORE = BLOCKS.register("mars_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_COBALT_ORE = BLOCKS.register("mars_cobalt_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_COAL_ORE = BLOCKS.register("mars_coal_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});

    //Venus Ores
    public static RegistryObject<Block> VENUS_COPPER_ORE = BLOCKS.register("venus_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_LEAD_ORE = BLOCKS.register("venus_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_TIN_ORE = BLOCKS.register("venus_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_URANIUM_ORE = BLOCKS.register("venus_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_ZINC_ORE = BLOCKS.register("venus_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_COBALT_ORE = BLOCKS.register("venus_cobalt_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});

    //Moon Ores
    public static RegistryObject<Block> MOON_COPPER_ORE = BLOCKS.register("moon_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_LEAD_ORE = BLOCKS.register("moon_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_TIN_ORE = BLOCKS.register("moon_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_URANIUM_ORE = BLOCKS.register("moon_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_ZINC_ORE = BLOCKS.register("moon_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_COBALT_ORE = BLOCKS.register("moon_cobalt_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_COAL_ORE = BLOCKS.register("moon_coal_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});

    //Mercury Ores
    public static RegistryObject<Block> MERCURY_COPPER_ORE = BLOCKS.register("mercury_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_LEAD_ORE = BLOCKS.register("mercury_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_TIN_ORE = BLOCKS.register("mercury_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_URANIUM_ORE = BLOCKS.register("mercury_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_ZINC_ORE = BLOCKS.register("mercury_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_COBALT_ORE = BLOCKS.register("mercury_cobalt_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_COAL_ORE = BLOCKS.register("mercury_coal_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});

    //Glacio Ores
    public static RegistryObject<Block> GLACIO_LEAD_ORE = BLOCKS.register("glacio_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GLACIO_TIN_ORE = BLOCKS.register("glacio_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GLACIO_URANIUM_ORE = BLOCKS.register("glacio_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GLACIO_ZINC_ORE = BLOCKS.register("glacio_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GLACIO_COBALT_ORE = BLOCKS.register("glacio_cobalt_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});
 
    //Deepslate Ores
    public static RegistryObject<Block> DEEPSLATE_LITHUM_ORE = BLOCKS.register("deepslate_lithum_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops());});

}
