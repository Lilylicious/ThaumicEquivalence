package lilylicious.thaumicequivalence.emc;

import lilylicious.thaumicequivalence.config.TEConfig;
import lilylicious.thaumicequivalence.utils.TELogger;
import moze_intel.projecte.api.ProjectEAPI;
import moze_intel.projecte.api.proxy.IEMCProxy;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.crafting.*;
import thaumcraft.api.items.ItemsTC;

import java.util.Map;

public class ThaumicMapper {

    public static final Object instability = new Object();
    private static IEMCProxy emcProxy = ProjectEAPI.getEMCProxy();

    public static void addConversions() {


        for (Object recipe : ThaumcraftApi.getCraftingRecipes().values()) {
            try {
                if (recipe instanceof ShapedArcaneRecipe && TEConfig.shapedArcaneEMC) {
                    emcProxy.registerCustomEMC(((ShapedArcaneRecipe) recipe).getRecipeOutput(), calculateEMC((ShapedArcaneRecipe) recipe));
                } else if (recipe instanceof ShapelessArcaneRecipe && TEConfig.shapelessArcaneEMC) {
                    emcProxy.registerCustomEMC(((ShapelessArcaneRecipe) recipe).getRecipeOutput(), calculateEMC((ShapelessArcaneRecipe) recipe));
                } else if (recipe instanceof InfusionRecipe && TEConfig.infusionEMC) {
                    if(((InfusionRecipe) recipe).getRecipeOutput() instanceof Object[]) continue;
                    emcProxy.registerCustomEMC(((InfusionRecipe) recipe).getRecipeOutput(), calculateEMC((InfusionRecipe) recipe));
                } else if (recipe instanceof CrucibleRecipe && TEConfig.crucibleEMC) {
                    if(((CrucibleRecipe) recipe).getRecipeOutput().isItemEqual(ItemsTC.crystalEssence.getDefaultInstance()))
                        continue;
                    emcProxy.registerCustomEMC(((CrucibleRecipe) recipe).getRecipeOutput(), calculateEMC((CrucibleRecipe) recipe));
                }
            } catch (NullPointerException e) {
                //TELogger.logWarn("A recipe passed a null value into a conversion, skipped");
            }
        }
    }

    private static int calculateEMC(IArcaneRecipe recipe) {
        int emc = 0;

        //Vis added as EMC, does not consider discounts
        if (TEConfig.visCost)
            emc += recipe.getVis();

        for (Map.Entry<Aspect, Integer> entry : recipe.getCrystals().aspects.entrySet()) {
            emc += AspectMapper.AspectEMC.get(entry.getKey().getTag()) * entry.getValue();
        }

        for (Ingredient ingredient : recipe.getIngredients())
            emc += getLowestIngEMC(ingredient);

        return emc;
    }

    private static int calculateEMC(InfusionRecipe recipe) {
        int emc = 0;

        //Center item
        emc += getLowestIngEMC(recipe.getRecipeInput());

        //Aspects
        for (Map.Entry<Aspect, Integer> entry : recipe.getAspects().aspects.entrySet()) {
            emc += AspectMapper.AspectEMC.get(entry.getKey().getTag()) * entry.getValue();
        }

        //Component itemsToRemove
        for (Ingredient ing : recipe.getComponents()) {
            emc += getLowestIngEMC(ing);
        }

        if (TEConfig.infusionInstabilityEMC)
            emc += TEConfig.instabilityValue * recipe.instability;

        return emc;
    }

    private static int calculateEMC(CrucibleRecipe recipe) {
        int emc = 0;

        //Aspects
        for (Map.Entry<Aspect, Integer> entry : recipe.getAspects().aspects.entrySet()) {
            emc += AspectMapper.AspectEMC.get(entry.getKey().getTag()) * entry.getValue();
        }

        //Catalyst
        emc += getLowestIngEMC(recipe.getCatalyst());

        return emc;
    }

    private static int getLowestIngEMC(Ingredient ing) {
        int emc = 0;

        int lowestEMC = Integer.MAX_VALUE;
        for (ItemStack stack : ing.getMatchingStacks()) {
            lowestEMC = Math.min(emcProxy.getValue(stack), lowestEMC);
        }
        emc += lowestEMC;

        return emc;
    }
}
