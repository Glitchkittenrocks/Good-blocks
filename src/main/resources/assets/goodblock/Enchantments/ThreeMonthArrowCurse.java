package net.hhdsjgit.goodblock.enchantment;

import net.minecraft.world.item.enchant.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchant.EnchantmentCatagory;

public class ThreeMonthArrow extends Enchantment {
       
  public ThreeMonthArrow() {
    super(Enchantment.Rarity.VERY_RARE, EnchantmentCatergory.Bow, new EquipmentSlot[] {EquipmentSlot.MAINHAND});

  }

   @Override
   public int getMaxLevel() {
    return 1;
   }

  
}

