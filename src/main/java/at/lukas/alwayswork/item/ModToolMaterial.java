package at.lukas.alwayswork.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    MITHRIL(5, 1000, 7.7f, 8.8f, 26,
            () -> Ingredient.ofItems(ModItems.MITHRIL_INGOT)),
    INFERNITE(6, 1250, 10.1f, 9.9f, 26,
            () -> Ingredient.ofItems(ModItems.INFERNITE_INGOT)),
    ENDERALD(6, 1250, 10.1f, 9.9f, 26,
            () -> Ingredient.ofItems(ModItems.ENDERALD)),
    VIBRANIUM(7, 1750, 14.14f, 10.1f, 26,
                 () -> Ingredient.ofItems(ModItems.VIBRANIUM_INGOT))


    ;


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
