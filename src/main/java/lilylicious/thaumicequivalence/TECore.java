package lilylicious.thaumicequivalence;

/* NOTE; The basic setup of this is heavily borrowed from ProjectE, for which I'm in the dev team.
 * -Lily
 */

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lilylicious.thaumicequivalence.config.TEConfig;
import lilylicious.thaumicequivalence.proxies.IProxy;
import lilylicious.thaumicequivalence.recipes.ThaumicRecipes;
import lilylicious.thaumicequivalence.research.TEResearch;
import lilylicious.thaumicequivalence.utils.RecipeHelper;

import java.io.File;

@Mod(modid = TECore.MODID, name = TECore.MODNAME, version = TECore.VERSION, dependencies = "required-after:Thaumcraft;required-after:ProjectE")
public class TECore
{
	public static final String MODID = "ThaumicEquivalence";
	public static final String MODNAME = "Thaumic Equivalence";
	public static final String VERSION = "@VERSION@";

	public static File CONFIG_DIR;

	@Instance(MODID)
	public static TECore instance;

	@SidedProxy(clientSide = "lilylicious.thaumicequivalence.proxies.ClientProxy", serverSide = "lilylicious.thaumicequivalence.proxies.ServerProxy")
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		CONFIG_DIR = new File(event.getModConfigurationDirectory(), "Thaumic Equivalency");

		if (!CONFIG_DIR.exists())
		{
			CONFIG_DIR.mkdirs();
		}

		TEConfig.init(new File(CONFIG_DIR, "ThaumicEquivalency.cfg"));

		//proxy.registerClientOnlyEvents();

		ThaumicRecipes.registerRecipes();

	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		TEResearch.registerResearch();
		if (TEConfig.enableHardMode) RecipeHelper.removeRecipes();
	}

}
