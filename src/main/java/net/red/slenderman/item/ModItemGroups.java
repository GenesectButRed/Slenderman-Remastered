package net.red.slenderman.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.red.slenderman.SlendermanRemastered;

public class ModItemGroups {
    public static final ItemGroup TITANIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SlendermanRemastered.MOD_ID, "titanium_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.slenderman"))
                    .icon(()-> new ItemStack(ModItems.TITANIUMINGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TITANIUMINGOT);

                    }).build());

    public static void registerItemGroups() {
        SlendermanRemastered.LOGGER.info("Registering Item Groups for " + SlendermanRemastered.MOD_ID);
    }
}
