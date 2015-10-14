package lilylicious.thaumicequivalence.utils;

import moze_intel.projecte.gameObjs.ObjHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ItemApi;

public class RecipeLists
{
	private static ItemStack[] placeholder = new ItemStack[]{new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone)};
	public static ItemStack[] philoStone = new ItemStack[]{new ItemStack(Items.redstone), new ItemStack(Items.glowstone_dust), new ItemStack(Items.redstone), new ItemStack(Items.glowstone_dust), new ItemStack(Items.redstone), new ItemStack(Items.glowstone_dust), new ItemStack(Items.redstone), new ItemStack(Items.glowstone_dust)};
	public static ItemStack[] darkMatter = new ItemStack[]{ItemApi.getItem("itemResource", 16),ItemApi.getItem("itemShard", 6), ItemApi.getItem("itemResource", 16),ItemApi.getItem("itemShard", 6), ItemApi.getItem("itemResource", 16),ItemApi.getItem("itemShard", 6), ItemApi.getItem("itemResource", 16),ItemApi.getItem("itemShard", 6)};
	public static ItemStack[] dmAxe = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] dmHammer  = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] dmHoe  = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] dmShears  = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] dmShovel  = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] dmSword  = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] dmPick  = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] dmHelm = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] dmChest = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] dmLegs = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] dmFeet = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
	public static ItemStack[] covalenceMed =  new ItemStack[]{new ItemStack(Items.iron_ingot), new ItemStack(Items.coal), new ItemStack(Items.redstone), new ItemStack(Items.iron_ingot), new ItemStack(Items.coal), new ItemStack(Items.redstone)};
	public static ItemStack[] covalenceHigh = new ItemStack[]{new ItemStack(Items.gold_ingot), new ItemStack(Items.coal), new ItemStack(Items.redstone), new ItemStack(Items.gold_ingot), new ItemStack(Items.coal), new ItemStack(Items.redstone)};
	public static ItemStack[] repairTalismanCrafting = new ItemStack[]{new ItemStack(Items.string), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.covalence, 1, 0), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.covalence, 1, 0)};
	public static ItemStack[] alchemicalChestCrafting = new ItemStack[]{new ItemStack(Items.iron_ingot), new ItemStack(ObjHandler.covalence, 1, 0), new ItemStack(Items.iron_ingot), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(Items.iron_ingot), new ItemStack(ObjHandler.covalence, 1, 2)};
}
