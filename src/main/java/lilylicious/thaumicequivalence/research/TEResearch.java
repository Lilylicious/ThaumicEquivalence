package lilylicious.thaumicequivalence.research;

import lilylicious.thaumicequivalence.TECore;
import lilylicious.thaumicequivalence.recipes.ThaumicRecipes;
import moze_intel.projecte.gameObjs.ObjHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.common.config.ConfigResearch;

public class TEResearch
{

	private static ResearchItem PhiloStone;
	private static ResearchItem MatterBlocks;


	public static void registerResearch()
	{


		//Adds research tab
		ResearchCategories.registerCategory("TE_CATEGORY", new ResourceLocation(TECore.MODID.toLowerCase(), "TODO: RESEARCH ICON"), new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));

		// Repeat for more researches
		PhiloStone = new ResearchItem("Philosopher's Stone", "TE_CATEGORY", new AspectList().add(Aspect.EXCHANGE, 4).add(Aspect.AIR, 15), -2, 2, 1, new ItemStack(ObjHandler.philosStone));
		PhiloStone.setPages(new ResearchPage("1"), new ResearchPage(ThaumicRecipes.philoStone), new ResearchPage(ThaumicRecipes.shapelessPhiloStone), new ResearchPage(ThaumicRecipes.shapedPhiloStone)).setParentsHidden("INFUSION").setConcealed().setAutoUnlock().registerResearchItem();

		MatterBlocks = new ResearchItem("Matter Blocks", "TE_CATEGORY", new AspectList().add(Aspect.EXCHANGE, 4).add(Aspect.AIR, 15), -2, 3, 1, new ItemStack(ObjHandler.matterBlock, 4, 0));
		MatterBlocks.setPages(new ResearchPage("1"), new ResearchPage(ThaumicRecipes.darkMatterBlock), new ResearchPage(ThaumicRecipes.redMatterBlock)).setParentsHidden("INFUSION").setConcealed().setAutoUnlock().registerResearchItem();
	}


}
