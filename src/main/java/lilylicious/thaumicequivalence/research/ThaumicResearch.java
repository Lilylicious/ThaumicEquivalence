package lilylicious.thaumicequivalence.research;

import lilylicious.thaumicequivalence.config.TEConfig;
import lilylicious.thaumicequivalence.recipes.ThaumicRecipes;
import lilylicious.thaumicequivalence.utils.AspectLists;
import moze_intel.projecte.gameObjs.ObjHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.capabilities.IPlayerKnowledge;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchCategory;
import thaumcraft.api.research.ResearchEntry;
import thaumcraft.api.research.ResearchStage;
import thaumcraft.api.research.theorycraft.TheorycraftManager;

public class ThaumicResearch {
    public static void registerResearch() {
        //Adds research tab
        ResearchCategory TE_CATEGORY = ResearchCategories.registerCategory("TE_CATEGORY", "INFUSION", new AspectList().add(Aspect.MAGIC, 1).add(Aspect.AURA, 1).add(Aspect.EXCHANGE, 1).add(Aspect.ALCHEMY, 1).add(Aspect.ENTROPY, 1), new ResourceLocation("projecte", "textures/items/philosophers_stone.png"), new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_1.jpg"));
        TheorycraftManager.registerAid(new AidTransTable());
        TheorycraftManager.registerCard(CardTransmute.class);
    }


}