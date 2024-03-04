package net.pigfection.woodnstone.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pigfection.woodnstone.WoodNStone;

public class ModItems {

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {


    }

public static final Item WOODEN_LONGSWORD = registerItem("wooden_longsword",
            new SwordItem(ToolMaterials.WOOD,3,-2.4f, new FabricItemSettings()));

    public static final Item STONE_LONGSWORD = registerItem("stone_longsword",
            new SwordItem(ToolMaterials.STONE,3,-2.4f, new FabricItemSettings()));

    public static final Item WOODEN_TWINBLADE = registerItem("wooden_twinblade",
            new SwordItem(ToolMaterials.WOOD,3,-2f, new FabricItemSettings()));

    public static final Item STONE_TWINBLADE = registerItem("stone_twinblade",
            new SwordItem(ToolMaterials.STONE,3,-2f, new FabricItemSettings()));

    public static final Item WOODEN_RAPIER = registerItem("wooden_rapier",
            new SwordItem(ToolMaterials.WOOD,2,-1.8f, new FabricItemSettings()));

    public static final Item STONE_RAPIER = registerItem("stone_rapier",
            new SwordItem(ToolMaterials.STONE,2,-1.8f, new FabricItemSettings()));

    public static final Item WOODEN_KATANA = registerItem("wooden_katana",
            new SwordItem(ToolMaterials.WOOD,3,-2f, new FabricItemSettings()));

    public static final Item STONE_KATANA = registerItem("stone_katana",
            new SwordItem(ToolMaterials.STONE,3,-2f, new FabricItemSettings()));

    public static final Item WOODEN_SAI = registerItem("wooden_sai",
            new SwordItem(ToolMaterials.WOOD,0,-1.5f, new FabricItemSettings()));

    public static final Item STONE_SAI = registerItem("stone_sai",
            new SwordItem(ToolMaterials.STONE,0,-1.5f, new FabricItemSettings()));

    public static final Item WOODEN_SPEAR = registerItem("wooden_spear",
            new SwordItem(ToolMaterials.WOOD,3,-2.7f, new FabricItemSettings()));

    public static final Item STONE_SPEAR = registerItem("stone_spear",
            new SwordItem(ToolMaterials.STONE,3,-2.7f, new FabricItemSettings()));

    public static final Item WOODEN_GLAIVE = registerItem("wooden_glaive",
            new SwordItem(ToolMaterials.WOOD,3,-2.6f, new FabricItemSettings()));

    public static final Item STONE_GLAIVE = registerItem("stone_glaive",
            new SwordItem(ToolMaterials.STONE,3,-2.6f, new FabricItemSettings()));

    public static final Item WOODEN_WARGLAIVE = registerItem("wooden_warglaive",
            new SwordItem(ToolMaterials.WOOD,3,-2.2f, new FabricItemSettings()));

    public static final Item STONE_WARGLAIVE = registerItem("stone_warglaive",
            new SwordItem(ToolMaterials.STONE,3,-2.2f, new FabricItemSettings()));

    public static final Item WOODEN_CUTLASS = registerItem("wooden_cutlass",
            new SwordItem(ToolMaterials.WOOD,3,-2f, new FabricItemSettings()));

    public static final Item STONE_CUTLASS = registerItem("stone_cutlass",
            new SwordItem(ToolMaterials.STONE,3,-2f, new FabricItemSettings()));

    public static final Item WOODEN_CLAYMORE = registerItem("wooden_claymore",
            new SwordItem(ToolMaterials.WOOD,5,-2.8f, new FabricItemSettings()));

    public static final Item STONE_CLAYMORE = registerItem("stone_claymore",
            new SwordItem(ToolMaterials.STONE,5,-2.8f, new FabricItemSettings()));

    public static final Item WOODEN_GREATHAMMER = registerItem("wooden_greathammer",
            new SwordItem(ToolMaterials.WOOD,7,-3.2f, new FabricItemSettings()));

    public static final Item STONE_GREATHAMMER = registerItem("stone_greathammer",
            new SwordItem(ToolMaterials.STONE,7,-3.2f, new FabricItemSettings()));

    public static final Item WOODEN_GREATAXE = registerItem("wooden_greataxe",
            new SwordItem(ToolMaterials.WOOD,6,-0.9f, new FabricItemSettings()));

    public static final Item STONE_GREATAXE = registerItem("stone_greataxe",
            new SwordItem(ToolMaterials.STONE,6,-0.9f, new FabricItemSettings()));

    public static final Item WOODEN_CHAKRAM = registerItem("wooden_chakram",
            new SwordItem(ToolMaterials.WOOD,2,-3f, new FabricItemSettings()));

    public static final Item STONE_CHAKRAM = registerItem("stone_chakram",
            new SwordItem(ToolMaterials.STONE,2,-3f, new FabricItemSettings()));

    public static final Item WOODEN_SCYTHE = registerItem("wooden_scythe",
            new SwordItem(ToolMaterials.WOOD,4,-2.7f, new FabricItemSettings()));

    public static final Item STONE_SCYTHE = registerItem("stone_scythe",
            new SwordItem(ToolMaterials.STONE,4,-2.7f, new FabricItemSettings()));

    public static final Item WOODEN_HALBERD = registerItem("wooden_halberd",
            new SwordItem(ToolMaterials.WOOD,6,-2.8f, new FabricItemSettings()));

    public static final Item STONE_HALBERD = registerItem("stone_halberd",
            new SwordItem(ToolMaterials.STONE,6,-2.8f, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WoodNStone.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WoodNStone.LOGGER.info("Registering Mod Items for " + WoodNStone.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToIngredientItemGroup);
    }
}
