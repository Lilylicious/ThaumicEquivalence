package lilylicious.thaumicequivalence.emc;

import com.google.common.collect.ImmutableMap;
import lilylicious.thaumicequivalence.config.TEConfig;
import moze_intel.projecte.api.ProjectEAPI;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ItemApi;
import thaumcraft.api.aspects.Aspect;

public class ManualEMC
{
	private static int tempInt = 0;

	public static void addEMC()
	{
		ProjectEAPI.getRecipeProxy().addRecipe(1, ItemApi.getItem("itemThaumonomicon", 0), ImmutableMap.<Object, Integer>of(new ItemStack(Blocks.bookshelf), 1));
		ProjectEAPI.getRecipeProxy().addRecipe(1, ItemApi.getBlock("blockMetalDevice", 0), ImmutableMap.<Object, Integer>of(new ItemStack(Items.cauldron), 1));
		ProjectEAPI.getRecipeProxy().addRecipe(1, ItemApi.getBlock("blockCustomPlant", 5), ImmutableMap.<Object, Integer>of(AspectMapper.map.get(Aspect.PLANT.getTag()), 2, AspectMapper.map.get(Aspect.POISON.getTag()), 1, AspectMapper.map.get(Aspect.MAGIC.getTag()), 2));

		if(TEConfig.taintEMC){
			ProjectEAPI.getRecipeProxy().addRecipe(1, ItemApi.getBlock("blockTaint", 0), ImmutableMap.<Object, Integer>of(AspectMapper.map.get(Aspect.TAINT.getTag()), 3, AspectMapper.map.get(Aspect.TREE.getTag()), 1));
			ProjectEAPI.getRecipeProxy().addRecipe(1, ItemApi.getBlock("blockTaint", 1), ImmutableMap.<Object, Integer>of(AspectMapper.map.get(Aspect.TAINT.getTag()), 3, AspectMapper.map.get(Aspect.EARTH.getTag()), 1));
			ProjectEAPI.getRecipeProxy().addRecipe(1, ItemApi.getBlock("blockTaintFibres", 0), ImmutableMap.<Object, Integer>of(AspectMapper.map.get(Aspect.TAINT.getTag()), 2, AspectMapper.map.get(Aspect.LIFE.getTag()), 1));
			ProjectEAPI.getRecipeProxy().addRecipe(1, ItemApi.getBlock("blockTaintFibres", 1), ImmutableMap.<Object, Integer>of(AspectMapper.map.get(Aspect.TAINT.getTag()), 1, AspectMapper.map.get(Aspect.LIFE.getTag()), 1));
			ProjectEAPI.getRecipeProxy().addRecipe(1, ItemApi.getBlock("blockTaintFibres", 2), ImmutableMap.<Object, Integer>of(AspectMapper.map.get(Aspect.TAINT.getTag()), 1, AspectMapper.map.get(Aspect.PLANT.getTag()), 1));
			ProjectEAPI.getRecipeProxy().addRecipe(1, ItemApi.getBlock("blockTaintFibres", 3), ImmutableMap.<Object, Integer>of(AspectMapper.map.get(Aspect.TAINT.getTag()), 2, AspectMapper.map.get(Aspect.PLANT.getTag()), 1, AspectMapper.map.get(Aspect.BEAST.getTag()), 1));
		}
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getBlock("blockCustomPlant", 2), TEConfig.shimmerLeafValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getBlock("blockCustomPlant", 3), TEConfig.cinderpearlValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getItem("itemResource", 3), TEConfig.quicksilverValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getItem("itemResource", 6), TEConfig.amberValue);
		ProjectEAPI.getEMCProxy().registerCustomEMC(ItemApi.getItem("itemZombieBrain", 6), TEConfig.brainValue);

	}
}
