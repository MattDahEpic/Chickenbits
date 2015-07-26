package com.mattdahepic.anchickenbits.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;

public class ItemCookedChickenBit extends ItemFood {
    public static final String NAME = "cooked_chicken_bit";
    public ItemCookedChickenBit () {
        super(1,0.1F,true);
        this.setUnlocalizedName(NAME);
        this.setTextureName(NAME);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("anchickenbits:cooked_chicken_bit");
    }
}
