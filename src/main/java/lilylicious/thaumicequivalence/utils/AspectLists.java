package lilylicious.thaumicequivalence.utils;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class AspectLists
{
	private static AspectList placeholderAspectList = new AspectList().add(Aspect.FIRE, 1);

	//Research
	public static AspectList basicEMCTheoryResearch = placeholderAspectList;
	public static AspectList philoStoneResearch = placeholderAspectList;
	public static AspectList transTableResearch =  placeholderAspectList;
	public static AspectList darkMatterResearch = placeholderAspectList;
	public static AspectList dmAxeResearch = placeholderAspectList;
	public static AspectList dmHammerResearch = placeholderAspectList;
	public static AspectList dmHoeResearch = placeholderAspectList;
	public static AspectList dmShearsResearch = placeholderAspectList;
	public static AspectList dmShovelResearch = placeholderAspectList;
	public static AspectList dmSwordResearch = placeholderAspectList;
	public static AspectList dmPickResearch = placeholderAspectList;
	public static AspectList dmHelmResearch = placeholderAspectList;
	public static AspectList dmChestResearch = placeholderAspectList;
	public static AspectList dmLegsResearch = placeholderAspectList;
	public static AspectList dmBootsResearch = placeholderAspectList;
	public static AspectList covalenceResearch = placeholderAspectList;
	public static AspectList repairResearch = placeholderAspectList;
	
	//Crafting
	public static AspectList philoStoneCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.ENERGY, 16);
	public static AspectList transTableCrafting = new AspectList().add(Aspect.ORDER, 15).add(Aspect.ENTROPY, 15);
	public static AspectList darkMatterCrafting = new AspectList().add(Aspect.EXCHANGE, 20).add(Aspect.ENERGY, 10).add(Aspect.DARKNESS, 10);
	public static AspectList dmAxeCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.TREE, 8);
	public static AspectList dmHammerCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.MINE, 8);
	public static AspectList dmHoeCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.HARVEST, 8);
	public static AspectList dmShearsCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.TOOL, 4);
	public static AspectList dmShovelCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.EARTH, 8);
	public static AspectList dmSwordCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.TOOL, 4).add(Aspect.ENERGY, 4);
	public static AspectList dmPickCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.TOOL, 8);
	public static AspectList dmFeetCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.ARMOR, 16).add(Aspect.METAL, 16);
	public static AspectList dmLegsCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.ARMOR, 24).add(Aspect.METAL, 16);
	public static AspectList dmChestCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.ARMOR, 32).add(Aspect.METAL, 16);
	public static AspectList dmHelmCrafting = new AspectList().add(Aspect.EXCHANGE, 16).add(Aspect.ARMOR, 16).add(Aspect.METAL, 16);
	public static AspectList covalenceLowCrafting =  new AspectList().add(Aspect.ORDER, 4).add(Aspect.ENTROPY, 4);
	public static AspectList covalenceMedCrafting = new AspectList().add(Aspect.EXCHANGE, 3);
	public static AspectList covalenceHighCrafting = new AspectList().add(Aspect.EXCHANGE, 5);
	public static AspectList repairTalismanCrafting = new AspectList().add(Aspect.EXCHANGE, 2).add(Aspect.TOOL, 2).add(Aspect.CRAFT, 2);
	public static AspectList alchemicalChestCrafting = new AspectList().add(Aspect.EXCHANGE, 5).add(Aspect.VOID, 5);
}
