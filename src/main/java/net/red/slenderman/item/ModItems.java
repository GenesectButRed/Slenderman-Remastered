package net.red.slenderman.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.red.slenderman.SlendermanRemastered;

public class ModItems {
    public static final Item TITANIUMINGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    entries.add(TITANIUMINGOT);
    }

    private static Item registerItem(String name, Item item){
     return Registry.register(Registries.ITEM, new Identifier(SlendermanRemastered.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SlendermanRemastered.LOGGER.info("Registering Mod Items for " + SlendermanRemastered.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
