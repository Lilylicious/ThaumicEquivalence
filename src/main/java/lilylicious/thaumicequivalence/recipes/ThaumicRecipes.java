package lilylicious.thaumicequivalence.recipes;

// Examples from: Thaumic Tinkerer

import lilylicious.thaumicequivalence.utils.AspectLists;
import lilylicious.thaumicequivalence.utils.RecipeHelper;
import lilylicious.thaumicequivalence.utils.RecipeLists;
import moze_intel.projecte.gameObjs.ObjHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
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
		//shapelessPhiloStone = ThaumcraftApi.addShapelessArcaneCraftingRecipe("PHILOSTONE", new ItemStack(ObjHandler.philosStone), AspectLists.philoStoneCrafting, new ItemStack(Blocks.stone), new ItemStack(Items.diamond));
		//shapedPhiloStone = ThaumcraftApi.addArcaneCraftingRecipe("PHILOSTONE", new ItemStack(ObjHandler.philosStone), AspectLists.philoStoneCrafting, "XAX", "   ", "   ", 'X', new ItemStack(Blocks.stone), 'A', new ItemStack(Blocks.cobblestone));

	}

	private static void registerInfusionRecipes()
	{
		philoStone = addInfusion("PHILOSTONE", new ItemStack(ObjHandler.philosStone), 3, AspectLists.philoStoneCrafting, new ItemStack(Items.diamond, 1, OreDictionary.WILDCARD_VALUE), RecipeLists.philoStone);
		darkMatterBlock = addInfusion("MATTERBLOCKS", new ItemStack(ObjHandler.matterBlock, 1, 0), 3, AspectLists.philoStoneCrafting, new ItemStack(Items.redstone, 1, OreDictionary.WILDCARD_VALUE), RecipeLists.darkMatter);
		redMatterBlock = addInfusion("MATTERBLOCKS", new ItemStack(ObjHandler.matterBlock, 1, 1), 3, AspectLists.philoStoneCrafting, new ItemStack(Items.emerald, 1, OreDictionary.WILDCARD_VALUE), RecipeLists.redMatter);

	}

	private static InfusionRecipe addInfusion(String research, ItemStack output, int instability, AspectList aspectList, ItemStack focus, ItemStack[] ingredients)
	{
		RecipeHelper.items.add(output.getItem());
		return ThaumcraftApi.addInfusionCraftingRecipe(research, output, instability, aspectList, focus, ingredients);

	}

	public static InfusionRecipe philoStone;
	public static InfusionRecipe darkMatterBlock;
	public static InfusionRecipe redMatterBlock;

	public static ShapelessArcaneRecipe shapelessPhiloStone;

	public static ShapedArcaneRecipe shapedPhiloStone;

}
