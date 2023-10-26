package at.lukas.alwayswork.item;

import at.lukas.alwayswork.AlwaysWork;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    MITHRIL("mithril", 100, new int[] { 3, 8, 6, 3 }, 19, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.4f, () -> Ingredient.ofItems(ModItems.MITHRIL_INGOT)),
    INFERNITE("infernite", 100, new int[] { 3, 8, 6, 3 }, 19, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.6f, () -> Ingredient.ofItems(ModItems.INFERNITE_INGOT)),
    ENDERALD("enderald", 100, new int[] { 3, 8, 6, 3 }, 19, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.6f, () -> Ingredient.ofItems(ModItems.ENDERALD)),
    VIBRANIUM("vibranium", 200, new int[] { 3, 8, 6, 3 }, 19, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.9f, () -> Ingredient.ofItems(ModItems.VIBRANIUM_INGOT))
    ;



    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return AlwaysWork.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
