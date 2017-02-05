package lilylicious.thaumicequivalence;

/* NOTE; The basic setup of this is heavily borrowed from ProjectE, for which I'm in the dev team.
 * -Lily
 */
import lilylicious.thaumicequivalence.config.TEConfig;
import lilylicious.thaumicequivalence.emc.ThaumicMapper;
import lilylicious.thaumicequivalence.proxies.IProxy;
import lilylicious.thaumicequivalence.recipes.ThaumicAspects;
import lilylicious.thaumicequivalence.recipes.ThaumicRecipes;
import lilylicious.thaumicequivalence.research.ThaumicResearch;
import lilylicious.thaumicequivalence.utils.TELogger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import java.io.File;

@Mod(modid = TECore.MODID, name = TECore.MODNAME, version = TECore.VERSION, dependencies = "required-after:Thaumcraft;required-after:ProjectE@[1.7.10-PE1.9.3,)")
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

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		CONFIG_DIR = new File(event.getModConfigurationDirectory(), "Thaumic Equivalency");

		if (!CONFIG_DIR.exists())
		{
			CONFIG_DIR.mkdirs();
		}

		TEConfig.init(new File(CONFIG_DIR, "ThaumicEquivalency.cfg"));

		//proxy.registerClientOnlyEvents();
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if(!TEConfig.removeRecipes && TEConfig.mode == 1) TELogger.logWarn("Hard mode is enabled but recipes are not set to be removed.");		
		ThaumicRecipes.registerRecipes();
		ThaumicResearch.registerResearch();
		ThaumicAspects.registerAspects();

		ThaumicMapper.addConversions();

	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
	}


}
