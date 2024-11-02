package ender.create_beverages.fluid;

import ender.create_beverages.CreateBeverages;
import ender.create_beverages.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static FlowableFluid STILL_APPLE_JUICE;
    public static FlowableFluid FLOWING_APPLE_JUICE;
    public static Block APPLE_JUICE_BLOCK;
    public static Item APPLE_JUICE_BUCKET;

    public static FlowableFluid STILL_LEMON_JUICE;
    public static FlowableFluid FLOWING_LEMON_JUICE;
    public static Block LEMON_JUICE_BLOCK;
    public static Item LEMON_JUICE_BUCKET;

    public static FlowableFluid STILL_MELON_JUICE;
    public static FlowableFluid FLOWING_MELON_JUICE;
    public static Block MELON_JUICE_BLOCK;
    public static Item MELON_JUICE_BUCKET;

    public static FlowableFluid STILL_GOLDEN_MELON_JUICE;
    public static FlowableFluid FLOWING_GOLDEN_MELON_JUICE;
    public static Block GOLDEN_MELON_JUICE_BLOCK;
    public static Item GOLDEN_MELON_JUICE_BUCKET;

    public static void register() {
        STILL_APPLE_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateBeverages.MOD_ID, "apple_juice_fluid"), new AppleJuiceFluid.Still() {
                });
        FLOWING_APPLE_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateBeverages.MOD_ID, "flowing_apple_juice"), new AppleJuiceFluid.Flowing());

        APPLE_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateBeverages.MOD_ID, "apple_juice_block"),
                new FluidBlock(ModFluids.STILL_APPLE_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        APPLE_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateBeverages.MOD_ID, "apple_juice_bucket"),
                new BucketItem(ModFluids.STILL_APPLE_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));


        STILL_LEMON_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateBeverages.MOD_ID, "lemon_juice_fluid"), new LemonJuiceFluid.Still() {
                });
        FLOWING_LEMON_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateBeverages.MOD_ID, "flowing_lemon_juice"), new LemonJuiceFluid.Flowing());

        LEMON_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateBeverages.MOD_ID, "lemon_juice_block"),
                new FluidBlock(ModFluids.STILL_LEMON_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        LEMON_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateBeverages.MOD_ID, "lemon_juice_bucket"),
                new BucketItem(ModFluids.STILL_LEMON_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));


        STILL_MELON_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateBeverages.MOD_ID, "melon_juice_fluid"), new MelonJuiceFluid.Still() {
                });
        FLOWING_MELON_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateBeverages.MOD_ID, "flowing_melon_juice"), new MelonJuiceFluid.Flowing());

        MELON_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateBeverages.MOD_ID, "melon_juice_block"),
                new FluidBlock(ModFluids.STILL_MELON_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        MELON_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateBeverages.MOD_ID, "melon_juice_bucket"),
                new BucketItem(ModFluids.STILL_MELON_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));


        STILL_GOLDEN_MELON_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateBeverages.MOD_ID, "golden_melon_juice_fluid"), new GoldenMelonJuiceFluid.Still() {
                });
        FLOWING_GOLDEN_MELON_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateBeverages.MOD_ID, "flowing_golden_melon_juice"), new GoldenMelonJuiceFluid.Flowing());

        GOLDEN_MELON_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateBeverages.MOD_ID, "golden_melon_juice_block"),
                new FluidBlock(ModFluids.STILL_GOLDEN_MELON_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        GOLDEN_MELON_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateBeverages.MOD_ID, "golden_melon_juice_bucket"),
                new BucketItem(ModFluids.STILL_GOLDEN_MELON_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}
