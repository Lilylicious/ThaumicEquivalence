package lilylicious.thaumicequivalence.research;

import lilylicious.thaumicequivalence.TECore;
import lilylicious.thaumicequivalence.recipes.ThaumicRecipes;
import lilylicious.thaumicequivalence.utils.AspectLists;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

public class TEResearch
{

	private static ResearchItem philoStone;
	private static ResearchItem basicEMCTheory;
	private static ResearchItem transmutationTablet;
	private static ResearchItem darkMatter;
	private static ResearchItem darkMatterAxe;
	private static ResearchItem darkMatterHammer;
	private static ResearchItem darkMatterHoe;
	private static ResearchItem darkMatterShears;
	private static ResearchItem darkMatterShovel;
	private static ResearchItem darkMatterSword;
	private static ResearchItem darkMatterPick;
	private static ResearchItem darkMatterHelm;
	private static ResearchItem darkMatterChest;
	private static ResearchItem darkMatterLegs;
	private static ResearchItem darkMatterBoots;



	public static void registerResearch()
	{
		//Adds research tab
		ResearchCategories.registerCategory("TE_CATEGORY", new ResourceLocation(TECore.MODID.toLowerCase(), "TODO: RESEARCH ICON"), new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));


	 		// ^ -row, v +row, < -col, > +col



		//Root parent. Ints= Column, row, complexity
		basicEMCTheory = new ResearchItem("BASICEMC", "TE_CATEGORY", AspectLists.placeholderAspectList, 0, 0, 0, new ResourceLocation("projecte", "textures/items/philosopher's_stone.png"));
		basicEMCTheory.setPages(new ResearchPage("te.research_page.BASICEMC.1")).setAutoUnlock().registerResearchItem();

		philoStone = new ResearchItem("PHILOSTONE", "TE_CATEGORY", AspectLists.placeholderAspectList, -2, -1, 1, new ResourceLocation("projecte", "textures/items/philosopher's_stone.png"));
		philoStone.setPages(new ResearchPage("te.research_page.PHILOSTONE.1"), new ResearchPage(ThaumicRecipes.philoStone)).setParents(new String[]{"BASICEMC"}).setParentsHidden("INFUSION").registerResearchItem();

		transmutationTablet = new ResearchItem("TRANSTABLE", "TE_CATEGORY", AspectLists.placeholderAspectList, -4, -3, 1, new ResourceLocation("projecte", "textures/items/transmute_tablet.png"));
		transmutationTablet.setPages(new ResearchPage("te.research_page.TRANSTABLE.1"), new ResearchPage(ThaumicRecipes.transTable)).setParents(new String[]{"PHILOSTONE"}).setConcealed().registerResearchItem();

		darkMatter = new ResearchItem("DARKMATTER", "TE_CATEGORY", AspectLists.placeholderAspectList, -6, -7, 2, new ResourceLocation("projecte", "textures/items/matter/dark.png"));
		darkMatter.setPages(new ResearchPage("te.research_page.DARKMATTER.1"), new ResearchPage(ThaumicRecipes.darkMatter)).setParents(new String[]{"TRANSTABLE"}).setConcealed().registerResearchItem();

		darkMatterAxe = new ResearchItem("DMAXE", "TE_CATEGORY", AspectLists.placeholderAspectList, -8, -10, 3, new ResourceLocation("projecte", "textures/items/dm_tools/axe.png"));
		darkMatterAxe.setPages(new ResearchPage("te.research_page.DMAXE.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();

		darkMatterHammer = new ResearchItem("DMHAMMER", "TE_CATEGORY", AspectLists.placeholderAspectList, -9, -9, 3, new ResourceLocation("projecte", "textures/items/dm_tools/hammer.png"));
		darkMatterHammer.setPages(new ResearchPage("te.research_page.DMHAMMER.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();

		darkMatterHoe = new ResearchItem("DMHOE", "TE_CATEGORY", AspectLists.placeholderAspectList, -9, -8, 3, new ResourceLocation("projecte", "textures/items/dm_tools/hoe.png"));
		darkMatterHoe.setPages(new ResearchPage("te.research_page.DMHOE.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();

		darkMatterShears = new ResearchItem("DMSHEARS", "TE_CATEGORY", AspectLists.placeholderAspectList, -10, -7, 3, new ResourceLocation("projecte", "textures/items/dm_tools/shears.png"));
		darkMatterShears.setPages(new ResearchPage("te.research_page.DMSHEARS.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();

		darkMatterShovel = new ResearchItem("DMSHOVEL", "TE_CATEGORY", AspectLists.placeholderAspectList, -9, -6, 3, new ResourceLocation("projecte", "textures/items/dm_tools/shovel.png"));
		darkMatterShovel.setPages(new ResearchPage("te.research_page.DMSHOVEL.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();

		darkMatterSword = new ResearchItem("DMSWORD", "TE_CATEGORY", AspectLists.placeholderAspectList, -9, -5, 3, new ResourceLocation("projecte", "textures/items/dm_tools/sword.png"));
		darkMatterSword.setPages(new ResearchPage("te.research_page.DMSWORD.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();

		darkMatterPick = new ResearchItem("DMPICK", "TE_CATEGORY", AspectLists.placeholderAspectList, -8, -4, 3, new ResourceLocation("projecte", "textures/items/dm_tools/pickaxe.png"));
		darkMatterPick.setPages(new ResearchPage("te.research_page.DMPICK.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();

		darkMatterHelm = new ResearchItem("DMHELM", "TE_CATEGORY", AspectLists.placeholderAspectList, -4, -9, 3, new ResourceLocation("projecte", "textures/items/dm_armor/head.png"));
		darkMatterHelm.setPages(new ResearchPage("te.research_page.DMCHEST.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();

		darkMatterChest = new ResearchItem("DMCHEST", "TE_CATEGORY", AspectLists.placeholderAspectList, -3, -8, 3, new ResourceLocation("projecte", "textures/items/dm_armor/chest.png"));
		darkMatterChest.setPages(new ResearchPage("te.research_page.DMCHEST.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();

		darkMatterLegs = new ResearchItem("DMLEGS", "TE_CATEGORY", AspectLists.placeholderAspectList, -3, -6, 3, new ResourceLocation("projecte", "textures/items/dm_armor/legs.png"));
		darkMatterLegs.setPages(new ResearchPage("te.research_page.DMCHEST.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();

		darkMatterBoots = new ResearchItem("DMBOOTS", "TE_CATEGORY", AspectLists.placeholderAspectList, -4, -5, 3, new ResourceLocation("projecte", "textures/items/dm_armor/feet.png"));
		darkMatterBoots.setPages(new ResearchPage("te.research_page.DMCHEST.1")).setParents(new String[]{"DARKMATTER"}).setConcealed().registerResearchItem();
	}


}
