package net.pigfection.woodnstone.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pigfection.woodnstone.WoodNStone;

public class ModItemGroups {
    public static final ItemGroup WAS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WoodNStone.MOD_ID, "wooden_chakram"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.woodnstone"))
                    .icon(() -> new ItemStack(ModItems.WOODEN_CHAKRAM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_LONGSWORD);
                        entries.add(ModItems.WOODEN_TWINBLADE);
                        entries.add(ModItems.WOODEN_RAPIER);
                        entries.add(ModItems.WOODEN_KATANA);
                        entries.add(ModItems.WOODEN_SAI);
                        entries.add(ModItems.WOODEN_SPEAR);
                        entries.add(ModItems.WOODEN_GLAIVE);
                        entries.add(ModItems.WOODEN_WARGLAIVE);
                        entries.add(ModItems.WOODEN_CUTLASS);
                        entries.add(ModItems.WOODEN_CLAYMORE);
                        entries.add(ModItems.WOODEN_GREATHAMMER);
                        entries.add(ModItems.WOODEN_GREATAXE);
                        entries.add(ModItems.WOODEN_CHAKRAM);
                        entries.add(ModItems.WOODEN_SCYTHE);
                        entries.add(ModItems.WOODEN_HALBERD);
                        entries.add(ModItems.STONE_LONGSWORD);
                        entries.add(ModItems.STONE_TWINBLADE);
                        entries.add(ModItems.STONE_RAPIER);
                        entries.add(ModItems.STONE_KATANA);
                        entries.add(ModItems.STONE_SAI);
                        entries.add(ModItems.STONE_SPEAR);
                        entries.add(ModItems.STONE_GLAIVE);
                        entries.add(ModItems.STONE_WARGLAIVE);
                        entries.add(ModItems.STONE_CUTLASS);
                        entries.add(ModItems.STONE_CLAYMORE);
                        entries.add(ModItems.STONE_GREATHAMMER);
                        entries.add(ModItems.STONE_GREATAXE);
                        entries.add(ModItems.STONE_CHAKRAM);
                        entries.add(ModItems.STONE_SCYTHE);
                        entries.add(ModItems.STONE_HALBERD);


                    }).build());

    public static void registerItemGroups() {
        WoodNStone.LOGGER.info("Registering Item Groups for " + WoodNStone.MOD_ID);
    }
}
