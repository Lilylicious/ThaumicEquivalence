package lilylicious.thaumicequivalence.recipes;

// Examples from: Thaumic Tinkerer

import lilylicious.thaumicequivalence.config.TEConfig;
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

		if (TEConfig.removeRecipes) RecipeHelper.removeRecipes();
	}

	private static void registerTableRecipes()
	{
		//shapelessPhiloStone = ThaumcraftApi.addShapelessArcaneCraftingRecipe("PHILOSTONE", new ItemStack(ObjHandler.philosStone), AspectLists.philoStoneCrafting, new ItemStack(Blocks.stone), new ItemStack(Items.diamond));
		//shapedPhiloStone = ThaumcraftApi.addArcaneCraftingRecipe("PHILOSTONE", new ItemStack(ObjHandler.philosStone), AspectLists.philoStoneCrafting, "XAX", "   ", "   ", 'X', new ItemStack(Blocks.stone), 'A', new ItemStack(Blocks.cobblestone));
		transTable =  addShapedArcane("TRANSTABLE", new ItemStack(ObjHandler.transmutationTablet), AspectLists.transTableCrafting, "XAX", "AXA", "XAX", 'X', new ItemStack(Blocks.stone), 'A', new ItemStack(Blocks.cobblestone));
	}

	private static void registerInfusionRecipes()
	{
		philoStone = addInfusion("PHILOSTONE", new ItemStack(ObjHandler.philosStone), 3, AspectLists.philoStoneCrafting, new ItemStack(Items.diamond, 1, OreDictionary.WILDCARD_VALUE), RecipeLists.philoStone);
		darkMatter = addInfusion("DARKMATTER", new ItemStack(ObjHandler.matter, 1, 0), 5, AspectLists.darkMatterCrafting, new ItemStack(ObjHandler.fuelBlock, 1, 2), RecipeLists.darkMatter);
		redMatterBlock = addInfusion("REDMATTER", new ItemStack(ObjHandler.matter, 1, 1), 8, AspectLists.redMatterBlockCrafting, new ItemStack(Items.emerald, 1, OreDictionary.WILDCARD_VALUE), RecipeLists.redMatter);
		darkMatterAxe = addInfusion("DMAXE", new ItemStack(ObjHandler.dmAxe, 1), 6, AspectLists.dmAxeCrafting, new ItemStack(Items.diamond_axe, 1), RecipeLists.dmAxe);
		darkMatterHammer = addInfusion("DMHAMMER", new ItemStack(ObjHandler.dmHammer, 1), 6, AspectLists.dmHammerCrafting, new ItemStack(Items.diamond_pickaxe, 1), RecipeLists.dmHammer);
		darkMatterHoe = addInfusion("DMHOE", new ItemStack(ObjHandler.dmHoe, 1), 6, AspectLists.dmHoeCrafting, new ItemStack(Items.diamond_hoe, 1), RecipeLists.dmHoe);
		darkMatterShears = addInfusion("DMSHEARS", new ItemStack(ObjHandler.dmShears, 1), 6, AspectLists.dmShearsCrafting, new ItemStack(Items.shears, 1), RecipeLists.dmShears);
		darkMatterShovel = addInfusion("DMSHOVEL", new ItemStack(ObjHandler.dmShovel, 1), 6, AspectLists.dmShovelCrafting, new ItemStack(Items.diamond_shovel, 1), RecipeLists.dmShovel);
		darkMatterSword = addInfusion("DMSWORD", new ItemStack(ObjHandler.dmSword, 1), 6, AspectLists.dmSwordCrafting, new ItemStack(Items.diamond_sword, 1), RecipeLists.dmSword);
		darkMatterPick = addInfusion("DMPICK", new ItemStack(ObjHandler.dmPick, 1), 6, AspectLists.dmPickCrafting, new ItemStack(Items.diamond_pickaxe, 1), RecipeLists.dmPick);
	}

	private static ShapedArcaneRecipe addShapedArcane(String research, ItemStack output, AspectList aspectList, Object... recipe)
	{
		RecipeHelper.items.add(output.getItem());
		return ThaumcraftApi.addArcaneCraftingRecipe(research, output, aspectList, recipe);

	}

	private static InfusionRecipe addInfusion(String research, ItemStack output, int instability, AspectList aspectList, ItemStack focus, ItemStack[] ingredients)
	{
		RecipeHelper.items.add(output.getItem());
		return ThaumcraftApi.addInfusionCraftingRecipe(research, output, instability, aspectList, focus, ingredients);

	}

	//InfusionRecipes
	public static InfusionRecipe philoStone;
	public static InfusionRecipe darkMatter;
	public static InfusionRecipe redMatterBlock;
	public static InfusionRecipe darkMatterAxe;
	public static InfusionRecipe darkMatterHammer; 
	public static InfusionRecipe darkMatterHoe;
	public static InfusionRecipe darkMatterShears;
	public static InfusionRecipe darkMatterShovel;
	public static InfusionRecipe darkMatterSword;
	public static InfusionRecipe darkMatterPick;
	
	//ShapelessArcane

	//ShapedArcane
	public static ShapedArcaneRecipe transTable;

}
