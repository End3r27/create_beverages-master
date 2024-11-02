package ender.create_beverages.item;

import ender.create_beverages.CreateBeverages;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    public static final Item APPLE_JUICE = registerItem("apple_juice", new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_JUICE).maxCount(1)));
    public static final Item LEMON_JUICE = registerItem("lemon_juice", new Item(new FabricItemSettings().food(ModFoodComponents.LEMON_JUICE).maxCount(1)));

    public static final Item MELON_JUICE = registerItem("melon_juice", new Item(new FabricItemSettings().food(ModFoodComponents.MELON_JUICE).maxCount(1)));

    public static final Item GOLDEN_MELON_JUICE = registerItem("golden_melon_juice", new Item(new FabricItemSettings().food(ModFoodComponents.STRONG_MELON_JUICE).maxCount(1)));

    public static final Item LEMON = registerItem("lemon", new Item(new FabricItemSettings().food(ModFoodComponents.LEMON)));









    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateBeverages.MOD_ID, name), item);
    }



    public static void registerModItems() {
        CreateBeverages.LOGGER.info("Regìstering Mod Items for " + CreateBeverages.MOD_ID);


    }
}
