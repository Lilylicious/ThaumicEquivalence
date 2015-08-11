package lilylicious.thaumicequivalence.utils;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class AspectLists
{
	public static AspectList placeholderAspectList = new AspectList().add(Aspect.FIRE, 1);

	//Research
	public static AspectList basicEMCResearch = new AspectList().add(Aspect.TOOL, 4).add(Aspect.SENSES, 8).add(Aspect.EXCHANGE, 12);
	public static AspectList philoStoneResearch = new AspectList().add(Aspect.TOOL, 4).add(Aspect.SENSES, 8).add(Aspect.EXCHANGE, 12);

	//Crafting
	public static AspectList philoStoneCrafting = new AspectList().add(Aspect.TOOL, 4).add(Aspect.SENSES, 8).add(Aspect.EXCHANGE, 12);
}
