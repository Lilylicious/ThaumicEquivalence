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
		transTable = addShapedArcane("TRANSTABLE", new ItemStack(ObjHandler.transmuteStone), AspectLists.transTableCrafting, "DSD", "STS", "DSD", Character.valueOf('D'), Blocks.obsidian, Character.valueOf('S'), Blocks.stone, Character.valueOf('T'), ObjHandler.philosStone);
		covalenceLow = addShapedArcane("COVALENCE", new ItemStack(ObjHandler.covalence, 40, 0), AspectLists.covalenceLowCrafting, "XXX", "XXX", "XXA", 'X', new ItemStack(Blocks.cobblestone), 'A', new ItemStack(Items.coal, 1, 0));
	}

	private static void registerInfusionRecipes()
	{
		philoStone = addInfusion("PHILOSTONE", new ItemStack(ObjHandler.philosStone), 3, AspectLists.philoStoneCrafting, new ItemStack(Items.diamond, 1, OreDictionary.WILDCARD_VALUE), RecipeLists.philoStone);
		darkMatter = addInfusion("DARKMATTER", new ItemStack(ObjHandler.matter, 1, 0), 5, AspectLists.darkMatterCrafting, new ItemStack(ObjHandler.fuelBlock, 1, 2), RecipeLists.darkMatter);
		darkMatterAxe = addInfusion("DMAXE", new ItemStack(ObjHandler.dmAxe, 1), 2, AspectLists.dmAxeCrafting, new ItemStack(Items.diamond_axe, 1), RecipeLists.dmAxe);
		//TODO: Add diamond hammer for foci purposes
		darkMatterHammer = addInfusion("DMHAMMER", new ItemStack(ObjHandler.dmHammer, 1), 2, AspectLists.dmHammerCrafting, new ItemStack(Items.diamond_pickaxe, 1), RecipeLists.dmHammer);
		darkMatterHoe = addInfusion("DMHOE", new ItemStack(ObjHandler.dmHoe, 1), 2, AspectLists.dmHoeCrafting, new ItemStack(Items.diamond_hoe, 1), RecipeLists.dmHoe);
		//TODO: Add diamond shears for foci purposes
		darkMatterShears = addInfusion("DMSHEARS", new ItemStack(ObjHandler.dmShears, 1), 2, AspectLists.dmShearsCrafting, new ItemStack(Items.shears, 1), RecipeLists.dmShears);
		darkMatterShovel = addInfusion("DMSHOVEL", new ItemStack(ObjHandler.dmShovel, 1), 2, AspectLists.dmShovelCrafting, new ItemStack(Items.diamond_shovel, 1), RecipeLists.dmShovel);
		darkMatterSword = addInfusion("DMSWORD", new ItemStack(ObjHandler.dmSword, 1), 2, AspectLists.dmSwordCrafting, new ItemStack(Items.diamond_sword, 1), RecipeLists.dmSword);
		darkMatterPick = addInfusion("DMPICK", new ItemStack(ObjHandler.dmPick, 1), 2, AspectLists.dmPickCrafting, new ItemStack(Items.diamond_pickaxe, 1), RecipeLists.dmPick);
		darkMatterHelm = addInfusion("DMPICK", new ItemStack(ObjHandler.dmHelmet, 1), 3, AspectLists.dmHelmCrafting, new ItemStack(Items.diamond_helmet, 1), RecipeLists.dmHelm);
		darkMatterChest = addInfusion("DMPICK", new ItemStack(ObjHandler.dmChest, 1), 3, AspectLists.dmChestCrafting, new ItemStack(Items.diamond_chestplate, 1), RecipeLists.dmChest);
		darkMatterLegs = addInfusion("DMPICK", new ItemStack(ObjHandler.dmLegs, 1), 3, AspectLists.dmLegsCrafting, new ItemStack(Items.diamond_leggings, 1), RecipeLists.dmLegs);
		darkMatterBoots = addInfusion("DMPICK", new ItemStack(ObjHandler.dmFeet, 1), 3, AspectLists.dmFeetCrafting, new ItemStack(Items.diamond_boots, 1), RecipeLists.dmFeet);
		covalenceMed = addInfusion("COVALENCE", new ItemStack(ObjHandler.covalence, 40, 1), 0, AspectLists.covalenceMedCrafting, new ItemStack(ObjHandler.covalence, 1, 0), RecipeLists.covalenceMed);
		covalenceHigh = addInfusion("COVALENCE", new ItemStack(ObjHandler.covalence, 40, 2), 0, AspectLists.covalenceHighCrafting, new ItemStack(ObjHandler.covalence, 1, 1), RecipeLists.covalenceHigh);
		repairTalisman = addInfusion("REPAIRTALISMAN", new ItemStack(ObjHandler.repairTalisman, 1), 0, AspectLists.repairTalismanCrafting, new ItemStack(Items.paper), RecipeLists.repairTalismanCrafting);
		alchemicalChest = addInfusion("ALCHEMICALCHEST", new ItemStack(ObjHandler.alchChest, 1), 2, AspectLists.alchemicalChestCrafting, new ItemStack(Blocks.chest), RecipeLists.alchemicalChestCrafting);
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
	public static InfusionRecipe darkMatterAxe;
	public static InfusionRecipe darkMatterHammer;
	public static InfusionRecipe darkMatterHoe;
	public static InfusionRecipe darkMatterShears;
	public static InfusionRecipe darkMatterShovel;
	public static InfusionRecipe darkMatterSword;
	public static InfusionRecipe darkMatterPick;
	public static InfusionRecipe darkMatterHelm;
	public static InfusionRecipe darkMatterChest;
	public static InfusionRecipe darkMatterLegs;
	public static InfusionRecipe darkMatterBoots;
	public static InfusionRecipe covalenceMed;
	public static InfusionRecipe covalenceHigh;
	public static InfusionRecipe repairTalisman;
	public static InfusionRecipe alchemicalChest;


	//ShapelessArcane

	//ShapedArcane
	public static ShapedArcaneRecipe transTable;
	public static ShapedArcaneRecipe covalenceLow;


}
