package ender.create_beverages;

import ender.create_beverages.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class CreateBeveragesClient implements ClientModInitializer {

        @Override
        public void onInitializeClient() {

            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_APPLE_JUICE, ModFluids.FLOWING_APPLE_JUICE,
                    new SimpleFluidRenderHandler(
                            new Identifier("minecraft:block/water_still"),
                            new Identifier("minecraft:block/water_flow"),
                            0xFF0000
                    ));

            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                    ModFluids.STILL_APPLE_JUICE, ModFluids.FLOWING_APPLE_JUICE);





            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LEMON_JUICE, ModFluids.FLOWING_LEMON_JUICE,
                    new SimpleFluidRenderHandler(
                                new Identifier("minecraft:block/water_still"),
                                new Identifier("minecraft:block/water_flow"),
                                0xFEF250
                    ));

            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                    ModFluids.STILL_LEMON_JUICE, ModFluids.FLOWING_LEMON_JUICE);




            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MELON_JUICE, ModFluids.FLOWING_MELON_JUICE,
                    new SimpleFluidRenderHandler(
                            new Identifier("minecraft:block/water_still"),
                            new Identifier("minecraft:block/water_flow"),
                            0xFF0000
                    ));

            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                    ModFluids.STILL_MELON_JUICE, ModFluids.FLOWING_MELON_JUICE);



            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GOLDEN_MELON_JUICE, ModFluids.FLOWING_GOLDEN_MELON_JUICE,
                    new SimpleFluidRenderHandler(
                            new Identifier("minecraft:block/water_still"),
                            new Identifier("minecraft:block/water_flow"),
                            0xFEF250
                    ));

            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                    ModFluids.STILL_GOLDEN_MELON_JUICE, ModFluids.FLOWING_GOLDEN_MELON_JUICE);
            }
    }

