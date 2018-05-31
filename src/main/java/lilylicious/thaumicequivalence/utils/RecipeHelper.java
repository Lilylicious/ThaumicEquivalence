package lilylicious.thaumicequivalence.utils;

import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;
import thaumcraft.api.crafting.IArcaneRecipe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecipeHelper
{

    public static List<Item> itemsToRemove = new ArrayList<Item>();

    public static void removeRecipes()
    {
        IForgeRegistryModifiable<IRecipe> recipeRegistry = (IForgeRegistryModifiable<IRecipe>) ForgeRegistries.RECIPES;
        ArrayList<IRecipe> recipes = Lists.newArrayList(recipeRegistry.getValuesCollection());

        for(IRecipe recipe : recipes)
        {
            if(recipe instanceof IArcaneRecipe)
                continue;

            if (recipe.getRecipeOutput() != null && itemsToRemove.contains(recipe.getRecipeOutput().getItem()))
            {
                recipeRegistry.remove(recipe.getRegistryName());
            }

        }

        //Requires newer java version.
        //recipes.removeIf(element -> itemsToRemove.contains(element.getRecipeOutput().getItem()));

    }

}