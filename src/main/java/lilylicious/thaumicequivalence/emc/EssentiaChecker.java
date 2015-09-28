package lilylicious.thaumicequivalence.emc;

import lilylicious.thaumicequivalence.utils.TELogger;
import moze_intel.projecte.api.ProjectEAPI;
import moze_intel.projecte.api.proxy.IEMCProxy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.lib.crafting.ThaumcraftCraftingManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class EssentiaChecker
{
/*
	public static List<String> prints = new ArrayList();
	public static Iterator itemList = Item.itemRegistry.iterator();
	public static IEMCProxy emcProxy = ProjectEAPI.getEMCProxy();
	public static float lowestEmcPerPrimal = 10000000;
	public static int emcCostPerPrimal = 1000;

	public static void run()
	{
		TELogger.logInfo("Dumping EMC and Aspects");
		while (itemList.hasNext())
		{
			Item item = (Item) itemList.next();

			if (item != null)
			{
				List<ItemStack> stacks = new ArrayList();
				try
				{
					item.getSubItems(item, item.getCreativeTab(), stacks);
					for (ItemStack stack : stacks)
						prints.add(createAspectString(stack));
				} catch (Throwable t)
				{
					t.printStackTrace();
				}
			}

		}

		Collections.sort(prints);

		File fileAspects = new File(".", "aspects.txt");
		File fileAspectsClean = new File(".", "aspectsClean.txt");

		try
		{
			fileAspects.createNewFile();
			fileAspectsClean.createNewFile();

			BufferedWriter writerAspects = new BufferedWriter(new FileWriter(fileAspects));
			BufferedWriter writerAspectsClean = new BufferedWriter(new FileWriter(fileAspectsClean));

			for (String s : prints)
			{
				writerAspects.write(s + "\n");
				if (!s.contains(": nil"))
					writerAspectsClean.write(s + "\n");
			}

			writerAspects.close();
			writerAspectsClean.close();
		} catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}


	private static String createAspectString(ItemStack stack)
	{
		int emc = emcProxy.getValue(stack);
		int count = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(stack.getDisplayName()).append(": EMC:").append(emc);
		AspectList aspects = ThaumcraftCraftingManager.getObjectTags(stack);

		if (aspects == null || aspects.size() == 0)
			sb.append("nil");
		else
		{
			AspectList copyList = breakDownAspects(stack, aspects);


			if (copyList.size() == 0)
				sb.append("nil");
			else for (Aspect aspect : copyList.getAspectsSortedAmount())
			{
				if (aspect == null)
					continue;


				count += aspects.getAmount(aspect);
			}

			float emcPerPrimal = (float)emc / count;

			if(emcPerPrimal < lowestEmcPerPrimal && emcPerPrimal != 0) lowestEmcPerPrimal = emcPerPrimal;
			sb.append(" Primals:").append(count).append(" EMC cost:").append(count*emcCostPerPrimal);
		}


		return sb.toString();
	}

	private static AspectList breakDownAspects(ItemStack is, AspectList oldAspects)
	{
		AspectList aspects = oldAspects;
		boolean nonPrimals = true;


		TELogger.logInfo("Item:" + is.getUnlocalizedName());
		String debug = "First Aspects:";

		for (Aspect a : aspects.getAspects())
		{
			debug += (" " + a.getName());
		}
		TELogger.logInfo(debug);

		while (nonPrimals)
		{
			for (Aspect aspect : aspects.getAspectsSortedAmount())
			{
				if (aspect == null)
					continue;


				int count = aspects.getAmount(aspect);

				if(count==0)aspects.remove(aspect);

				if (count > 0 && !Aspect.getPrimalAspects().contains(aspect))
				{
					for (Aspect a : aspect.getComponents())
					{
						aspects.add(a, count);
					}

					aspects.remove(aspect, count);
				}
			}
			nonPrimals = false;
			for (Aspect a : aspects.getAspects())
			{
				if (!Aspect.getPrimalAspects().contains(a)) nonPrimals = true;
			}

			debug = "Aspects:";
			for (Aspect a : aspects.getAspectsSortedAmount())
			{
				debug += (" " + a.getName() + aspects.getAmount(a));
			}
			TELogger.logInfo(debug);
		}
		return aspects;
	}
*/
}
