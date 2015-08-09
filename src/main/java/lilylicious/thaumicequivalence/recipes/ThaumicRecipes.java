package lilylicious.thaumicequivalence.recipes;

// Examples from: Thaumic Tinkerer

import lilylicious.thaumicequivalence.utils.AspectLists;
import moze_intel.projecte.gameObjs.ObjHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.crafting.ShapelessArcaneRecipe;

public class ThaumicRecipes
{


	public static void registerRecipes()
	{
		registerTableRecipes();
		registerInfusionRecipes();
	}

	private static void registerTableRecipes()
	{
		shapelessPhiloStone = ThaumcraftApi.addShapelessArcaneCraftingRecipe("Philosopher's Stone", new ItemStack(ObjHandler.philosStone), AspectLists.philoStoneCrafting, new ItemStack(Blocks.stone), new ItemStack(Items.diamond));
		shapedPhiloStone = ThaumcraftApi.addArcaneCraftingRecipe("Philosopher's Stone", new ItemStack(ObjHandler.philosStone), AspectLists.philoStoneCrafting, "XAX", "   ", "   ", 'X', new ItemStack(Blocks.stone), 'A', new ItemStack(Blocks.cobblestone));

	}

	private static void registerInfusionRecipes()
	{
		philoStone = ThaumcraftApi.addInfusionCraftingRecipe("Philosopher's Stone", new ItemStack(ObjHandler.philosStone), 3, AspectLists.philoStoneCrafting, new ItemStack(Items.diamond, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[]{new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone)});
		darkMatterBlock = ThaumcraftApi.addInfusionCraftingRecipe("Matter Blocks", new ItemStack(ObjHandler.matterBlock, 1, 0), 3, AspectLists.philoStoneCrafting, new ItemStack(Items.redstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[]{new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone)});
		redMatterBlock = ThaumcraftApi.addInfusionCraftingRecipe("Matter Blocks", new ItemStack(ObjHandler.matterBlock, 1, 1), 3, AspectLists.philoStoneCrafting, new ItemStack(Items.emerald, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[]{new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone)});
	}

	public static InfusionRecipe philoStone;
	public static InfusionRecipe darkMatterBlock;
	public static InfusionRecipe redMatterBlock;

	public static ShapelessArcaneRecipe shapelessPhiloStone;

	public static ShapedArcaneRecipe shapedPhiloStone;

}
