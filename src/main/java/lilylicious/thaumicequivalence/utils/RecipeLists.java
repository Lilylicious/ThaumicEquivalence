package lilylicious.thaumicequivalence.utils;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ItemApi;

public class RecipeLists
{
	public static ItemStack[] placeholder = new ItemStack[]{new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone)};
	public static ItemStack[] philoStone = placeholder;
	public static ItemStack[] darkMatter = new ItemStack[]{ItemApi.getItem("itemResource", 16),ItemApi.getItem("itemShard", 6), ItemApi.getItem("itemResource", 16),ItemApi.getItem("itemShard", 6), ItemApi.getItem("itemResource", 16),ItemApi.getItem("itemShard", 6), ItemApi.getItem("itemResource", 16),ItemApi.getItem("itemShard", 6)};
	public static ItemStack[] redMatter = placeholder;
	public static ItemStack[] dmAxe = placeholder;
	public static ItemStack[] dmHammer  = placeholder;
	public static ItemStack[] dmHoe  = placeholder;
	public static ItemStack[] dmShears  = placeholder;
	public static ItemStack[] dmShovel  = placeholder;
	public static ItemStack[] dmSword  = placeholder;
	public static ItemStack[] dmPick  = placeholder;
}
