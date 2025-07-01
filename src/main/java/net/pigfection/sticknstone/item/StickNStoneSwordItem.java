package net.pigfection.sticknstone.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.client.api.SimplySwordsClientAPI;
import net.sweenus.simplyswords.item.SimplySwordsSwordItem;

import java.util.List;

public class StickNStoneSwordItem extends SimplySwordsSwordItem {

    public StickNStoneSwordItem(ToolMaterial toolMaterial, Settings settings, String... repairIngredient) {
        super(toolMaterial, settings, repairIngredient);
    }

    @Override
    protected void generateDynamicTooltip(ItemStack itemStack, TooltipContext tooltipContext, List<Text> tooltip, TooltipType type) {

        SimplySwordsClientAPI.generateDynamicTooltip(itemStack, tooltipContext, tooltip, type,
                SimplySwords.MOD_ID,
                "oracle_index:books/sticknstone/weapon-types",
                "oracle_index:books/simplyswords/unique-weapons",
                "oracle_index:books/simplyswords/runic-powers",
                null
        );
    }

}
