package ender.create_beverages.item;

import ender.create_beverages.CreateBeverages;
import ender.create_beverages.fluid.ModFluids;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup JUICE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(CreateBeverages.MOD_ID, "apple_juice"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.apple_juice"))
                    .icon(() -> new ItemStack(ModItems.APPLE_JUICE)).entries((displayContext, entries) -> {


                        entries.add(ModItems.APPLE_JUICE);
                        entries.add(ModItems.LEMON_JUICE);
                        entries.add(ModItems.LEMON);
                        entries.add(ModItems.MELON_JUICE);
                        entries.add(ModItems.BERRY_JUICE);
                        entries.add(ModItems.PHANTOM_JUICE);
                        entries.add(ModItems.GOLDEN_MELON_JUICE);
                        entries.add(ModFluids.APPLE_JUICE_BUCKET);
                        entries.add(ModFluids.LEMON_JUICE_BUCKET);
                        entries.add(ModFluids.MELON_JUICE_BUCKET);
                        entries.add(ModFluids.GOLDEN_MELON_JUICE_BUCKET);
                        entries.add(ModFluids.BERRY_JUICE_BUCKET);
                        entries.add(ModFluids.PHANTOM_JUICE_BUCKET);







                    }).build());



    public static void registerItemGroups() {
        CreateBeverages.LOGGER.info("Registering Item Groups for " + CreateBeverages.MOD_ID);
    }
}
