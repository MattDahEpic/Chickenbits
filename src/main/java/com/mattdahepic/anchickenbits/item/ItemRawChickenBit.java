package com.mattdahepic.anchickenbits.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemRawChickenBit extends ItemFood {
    public static final String NAME = "raw_chicken_bit";
    public ItemRawChickenBit () {
        super(1,0.15F,true);
        this.setUnlocalizedName(NAME);
        this.setTextureName(NAME);
        this.setPotionEffect(Potion.hunger.id,30,0,0.4F);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("anchickenbits:raw_chicken_bit");
    }
}
