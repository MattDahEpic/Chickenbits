package com.mattdahepic.anchickenbits;

import com.mattdahepic.anchickenbits.item.ItemCookedChickenBit;
import com.mattdahepic.anchickenbits.item.ItemRawChickenBit;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(name = ANChickenBits.NAME,version = ANChickenBits.VERSION,modid = ANChickenBits.MODID)
public class ANChickenBits {
    @Mod.Instance(ANChickenBits.MODID)
    public static ANChickenBits instance;

    public static final String NAME = "Approaching Nirvana's Chicken Bits";
    public static final String VERSION = "@VERSION@";
    public static final String MODID = "anchickenbits";

    public static Item raw_chicken_bit;
    public static Item cooked_chicken_bit;

    @Mod.EventHandler
    public static void preInit (FMLPreInitializationEvent event) {
        FMLCommonHandler.instance().bus().register(instance);
    }
    @Mod.EventHandler
    public static void init (FMLInitializationEvent event) {
        //register items
        raw_chicken_bit = new ItemRawChickenBit();
        cooked_chicken_bit = new ItemCookedChickenBit();
        GameRegistry.registerItem(raw_chicken_bit,ItemRawChickenBit.NAME);
        GameRegistry.registerItem(cooked_chicken_bit,ItemCookedChickenBit.NAME);
        //recipes
        GameRegistry.addShapelessRecipe(new ItemStack(raw_chicken_bit,0,2),Items.chicken); //raw chicken to raw bits
        GameRegistry.addShapelessRecipe(new ItemStack(Items.chicken,0,1),raw_chicken_bit,raw_chicken_bit); //raw bits to raw chicken
        GameRegistry.addShapelessRecipe(new ItemStack(cooked_chicken_bit,0,6),Items.cooked_chicken); //cooked chicken to cooked bits
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cooked_chicken,0,1), cooked_chicken_bit, cooked_chicken_bit, cooked_chicken_bit, cooked_chicken_bit, cooked_chicken_bit, cooked_chicken_bit); //cooked bits to cooked chicken
        GameRegistry.addSmelting(raw_chicken_bit,new ItemStack(cooked_chicken_bit),0.3F);
    }
    @Mod.EventHandler
    public static void postInit (FMLInitializationEvent event) {}
}
