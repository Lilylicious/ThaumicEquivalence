package lilylicious.thaumicequivalence.utils;

import moze_intel.projecte.gameObjs.customRecipes.RecipeAlchemyBag;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecipeHelper
{

    public static List<Item> itemsToRemove = new ArrayList<Item>();


    public static void removeRecipes()
    {
        Iterator<IRecipe> recipes = ForgeRegistries.RECIPES.iterator();

        while (recipes.hasNext())
        {
            IRecipe recipe = recipes.next();
            if (recipe.getRecipeOutput() != null && itemsToRemove.contains(recipe.getRecipeOutput().getItem()) && !(recipe instanceof RecipeAlchemyBag))
            {
                recipes.remove();
            }

        }

        //Requires newer java version.
        //recipes.removeIf(element -> itemsToRemove.contains(element.getRecipeOutput().getItem()));

    }

}