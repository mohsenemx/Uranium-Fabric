package net.mohsenemx.uranium.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mohsenemx.uranium.UraniumMod;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(UraniumMod.MOD_ID, "uranium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.uranium"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);

                    }).build());

    public static void registerItemGroups() {
        UraniumMod.LOGGER.info("Registering Item Groups for " + UraniumMod.MOD_ID);
    }
}
