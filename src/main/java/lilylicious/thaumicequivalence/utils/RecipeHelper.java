package lilylicious.thaumicequivalence.utils;

import moze_intel.projecte.gameObjs.customRecipes.RecipeAlchemyBag;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecipeHelper
{

	public static List<Item> items = new ArrayList<Item>();


	public static void removeRecipes()
	{
		Iterator<IRecipe> recipes = CraftingManager.getInstance().getRecipeList().iterator();

		while (recipes.hasNext())
		{
			IRecipe recipe = recipes.next();
			if (recipe.getRecipeOutput() != null && items.contains(recipe.getRecipeOutput().getItem()) && !(recipe instanceof RecipeAlchemyBag))
			{
				recipes.remove();
			}

		}

		//Requires newer java version.
		//recipes.removeIf(element -> items.contains(element.getRecipeOutput().getItem()));

	}

}
