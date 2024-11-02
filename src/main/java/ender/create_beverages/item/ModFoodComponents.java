package ender.create_beverages.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent APPLE_JUICE = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1f).alwaysEdible().build();



    public static final FoodComponent LEMON_JUICE = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6400), 1f).alwaysEdible().build();



    public static final FoodComponent LEMON = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200), 0.5f).build();




    public static final FoodComponent MELON_JUICE = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6400), 1f).alwaysEdible().build();

    public static final FoodComponent STRONG_MELON_JUICE = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 12800), 1f).alwaysEdible().build();

}