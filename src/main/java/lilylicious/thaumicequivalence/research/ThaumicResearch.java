package lilylicious.thaumicequivalence.research;

import lilylicious.thaumicequivalence.TECore;
import lilylicious.thaumicequivalence.recipes.ThaumicRecipes;
import lilylicious.thaumicequivalence.utils.AspectLists;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

public class ThaumicResearch
{
	public static void registerResearch()
	{
		//Adds research tab
		ResearchCategories.registerCategory("TE_CATEGORY", new ResourceLocation(TECore.MODID.toLowerCase(), "TODO: RESEARCH ICON"), new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));


		// ^ -row, v +row, < -col, > +col


		//Root parent. Ints= Column, row, complexity
		new ResearchItem("BASICEMC", "TE_CATEGORY", AspectLists.basicEMCTheoryResearch, 0, 0, 0, new ResourceLocation("projecte", "textures/items/philosophers_stone.png")).setPages(new ResearchPage("te.research_page.BASICEMC.1")).setAutoUnlock().setRound().registerResearchItem();


		//Left tree
		{
			new ResearchItem("PHILOSTONE", "TE_CATEGORY", AspectLists.philoStoneResearch, -2, -1, 1, new ResourceLocation("projecte", "textures/items/philosophers_stone.png")).setPages(new ResearchPage("te.research_page.PHILOSTONE.1"), new ResearchPage(ThaumicRecipes.philoStone)).setParents(new String[]{"BASICEMC"}).setParentsHidden("INFUSION").registerResearchItem();
			new ResearchItem("TRANSTABLE", "TE_CATEGORY", AspectLists.transTableResearch, -4, -2, 1, new ResourceLocation("projecte", "textures/items/transmute_tablet.png")).setPages(new ResearchPage("te.research_page.TRANSTABLE.1"), new ResearchPage(ThaumicRecipes.transTable)).setParents(new String[]{"PHILOSTONE"}).setConcealed().registerResearchItem();
			new ResearchItem("DARKMATTER", "TE_CATEGORY", AspectLists.darkMatterResearch, -6, -7, 2, new ResourceLocation("projecte", "textures/items/matter/dark.png")).setPages(new ResearchPage("te.research_page.DARKMATTER.1"), new ResearchPage(ThaumicRecipes.darkMatter)).setParents(new String[]{"TRANSTABLE"}).setConcealed().registerResearchItem();
			new ResearchItem("DMAXE", "TE_CATEGORY", AspectLists.dmAxeResearch, -10, -9, 3, new ResourceLocation("projecte", "textures/items/dm_tools/axe.png")).setPages(new ResearchPage("te.research_page.DMAXE.1"), new ResearchPage(ThaumicRecipes.darkMatterAxe)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
			new ResearchItem("DMHAMMER", "TE_CATEGORY", AspectLists.dmHammerResearch, -9, -9, 3, new ResourceLocation("projecte", "textures/items/dm_tools/hammer.png")).setPages(new ResearchPage("te.research_page.DMHAMMER.1"), new ResearchPage(ThaumicRecipes.darkMatterHammer)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
			new ResearchItem("DMHOE", "TE_CATEGORY", AspectLists.dmHoeResearch, -8, -8, 3, new ResourceLocation("projecte", "textures/items/dm_tools/hoe.png")).setPages(new ResearchPage("te.research_page.DMHOE.1"), new ResearchPage(ThaumicRecipes.darkMatterHoe)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
			new ResearchItem("DMSHEARS", "TE_CATEGORY", AspectLists.dmShearsResearch, -8, -7, 3, new ResourceLocation("projecte", "textures/items/dm_tools/shears.png")).setPages(new ResearchPage("te.research_page.DMSHEARS.1"), new ResearchPage(ThaumicRecipes.darkMatterShears)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
			new ResearchItem("DMSHOVEL", "TE_CATEGORY", AspectLists.dmShovelResearch, -8, -6, 3, new ResourceLocation("projecte", "textures/items/dm_tools/shovel.png")).setPages(new ResearchPage("te.research_page.DMSHOVEL.1"), new ResearchPage(ThaumicRecipes.darkMatterShovel)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
			new ResearchItem("DMSWORD", "TE_CATEGORY", AspectLists.dmSwordResearch, -9, -5, 3, new ResourceLocation("projecte", "textures/items/dm_tools/sword.png")).setPages(new ResearchPage("te.research_page.DMSWORD.1"), new ResearchPage(ThaumicRecipes.darkMatterSword)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
			new ResearchItem("DMPICK", "TE_CATEGORY", AspectLists.dmPickResearch, -10, -5, 3, new ResourceLocation("projecte", "textures/items/dm_tools/pickaxe.png")).setPages(new ResearchPage("te.research_page.DMPICK.1"), new ResearchPage(ThaumicRecipes.darkMatterPick)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
			new ResearchItem("DMHELM", "TE_CATEGORY", AspectLists.dmHelmResearch, -4, -9, 3, new ResourceLocation("projecte", "textures/items/dm_armor/head.png")).setPages(new ResearchPage("te.research_page.DMHEAD.1"), new ResearchPage(ThaumicRecipes.darkMatterHelm)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
			new ResearchItem("DMCHEST", "TE_CATEGORY", AspectLists.dmChestResearch, -3, -8, 3, new ResourceLocation("projecte", "textures/items/dm_armor/chest.png")).setPages(new ResearchPage("te.research_page.DMCHEST.1"), new ResearchPage(ThaumicRecipes.darkMatterChest)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
			new ResearchItem("DMLEGS", "TE_CATEGORY", AspectLists.dmLegsResearch, -3, -6, 3, new ResourceLocation("projecte", "textures/items/dm_armor/legs.png")).setPages(new ResearchPage("te.research_page.DMLEGS.1"), new ResearchPage(ThaumicRecipes.darkMatterLegs)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
			new ResearchItem("DMBOOTS", "TE_CATEGORY", AspectLists.dmBootsResearch, -4, -5, 3, new ResourceLocation("projecte", "textures/items/dm_armor/feet.png")).setPages(new ResearchPage("te.research_page.DMFEET.1"), new ResearchPage(ThaumicRecipes.darkMatterBoots)).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
		}

		//Right tree
		{
			new ResearchItem("COVALENCE", "TE_CATEGORY", AspectLists.covalenceResearch, 2, -1, 1, new ResourceLocation("projecte", "textures/items/covalence_dust/medium.png")).setPages(new ResearchPage("te.research_page.COVALENCE.1"), new ResearchPage(ThaumicRecipes.covalenceLow), new ResearchPage(ThaumicRecipes.covalenceMed), new ResearchPage(ThaumicRecipes.covalenceHigh)).setParents(new String[]{"BASICEMC"}).setConcealed().registerResearchItem();
			new ResearchItem("REPAIRTALISMAN", "TE_CATEGORY", AspectLists.repairResearch, 4, -2, 1, new ResourceLocation("projecte", "textures/items/repair_talisman.png")).setPages(new ResearchPage("te.research_page.REPAIRTALISMAN.1"), new ResearchPage(ThaumicRecipes.repairTalisman)).setParents(new String[]{"COVALENCE"}).setConcealed().registerResearchItem();
		}
	}


}
