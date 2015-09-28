package lilylicious.thaumicequivalence.emc;

import lilylicious.thaumicequivalence.config.TEConfig;
import moze_intel.projecte.api.ProjectEAPI;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

import java.util.HashMap;
import java.util.Map;

public class AspectMapper
{

	public static Map<String, Object> map = new HashMap();


	public static void mapAspects()
	{
		for (Aspect aspect : Aspect.getPrimalAspects())
		{
			map.put(aspect.getTag(), new Object());
		}
		for (Aspect aspect : Aspect.getCompoundAspects())
		{
			map.put(aspect.getTag(), new Object());
		}

		for (Aspect aspect : Aspect.getPrimalAspects())
		{
			if (aspect == Aspect.AIR)
				ProjectEAPI.getEMCProxy().registerCustomEMC(map.get(aspect.getTag()), TEConfig.aerValue);
			else if (aspect == Aspect.EARTH)
				ProjectEAPI.getEMCProxy().registerCustomEMC(map.get(aspect.getTag()), TEConfig.terraValue);
			else if (aspect == Aspect.FIRE)
				ProjectEAPI.getEMCProxy().registerCustomEMC(map.get(aspect.getTag()), TEConfig.ignisValue);
			else if (aspect == Aspect.WATER)
				ProjectEAPI.getEMCProxy().registerCustomEMC(map.get(aspect.getTag()), TEConfig.aquaValue);
			else if (aspect == Aspect.ORDER)
				ProjectEAPI.getEMCProxy().registerCustomEMC(map.get(aspect.getTag()), TEConfig.ordoValue);
			else if (aspect == Aspect.ENTROPY)
				ProjectEAPI.getEMCProxy().registerCustomEMC(map.get(aspect.getTag()), TEConfig.perditioValue);
		}

		for (Aspect aspect : Aspect.getCompoundAspects())
		{
			int EMCTotal = 0;
			AspectList aList = breakDownAspects(aspect);

			for (Map.Entry primal : aList.aspects.entrySet())
			{

				EMCTotal += primalEMC((Aspect) primal.getKey(), (Integer) primal.getValue());
			}

			ProjectEAPI.getEMCProxy().registerCustomEMC(map.get(aspect.getTag()), EMCTotal);
		}

	}

	private static int primalEMC(Aspect aspect, int count)
	{
		if (aspect == Aspect.AIR) return count * TEConfig.aerValue;
		else if (aspect == Aspect.EARTH) return count * TEConfig.terraValue;
		else if (aspect == Aspect.FIRE) return count * TEConfig.ignisValue;
		else if (aspect == Aspect.WATER) return count * TEConfig.aquaValue;
		else if (aspect == Aspect.ORDER) return count * TEConfig.ordoValue;
		else if (aspect == Aspect.ENTROPY) return count * TEConfig.perditioValue;
		else return 0;
	}

	private static AspectList breakDownAspects(Aspect as)
	{
		boolean nonPrimals = true;

		AspectList aspects = new AspectList();

		aspects.add(as, 1);

		while (nonPrimals)
		{
			for (Aspect aspect : aspects.getAspectsSortedAmount())
			{
				if (aspect == null)
					continue;


				int count = aspects.getAmount(aspect);

				if (count == 0) aspects.remove(aspect);

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
		}
		return aspects;
	}
}
