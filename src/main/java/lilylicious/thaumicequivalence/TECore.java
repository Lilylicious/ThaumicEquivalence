package lilylicious.thaumicequivalence;

/* NOTE; The basic setup of this is heavily borrowed from ProjectE, for which I'm in the dev team.
 * -Lily
 */

import lilylicious.thaumicequivalence.config.TEConfig;
import lilylicious.thaumicequivalence.emc.AspectMapper;
import lilylicious.thaumicequivalence.emc.ManualEMC;
import lilylicious.thaumicequivalence.emc.ThaumicMapper;
import lilylicious.thaumicequivalence.proxies.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import java.io.File;

@Mod(modid = TECore.MODID, name = TECore.MODNAME, version = TECore.VERSION, dependencies = "required-after:thaumcraft;required-after:projecte@[1.12-PE1.3.1B,)")
public class TECore {
    public static final String MODID = "thaumicequivalence";
    public static final String MODNAME = "Thaumic Equivalence";
    public static final String VERSION = "@VERSION@";

    public static File CONFIG_DIR;

    @Instance(MODID)
    public static TECore instance;

    @SidedProxy(clientSide = "lilylicious.thaumicequivalence.proxies.ClientProxy", serverSide = "lilylicious.thaumicequivalence.proxies.ServerProxy")
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        CONFIG_DIR = new File(event.getModConfigurationDirectory(), "Thaumic Equivalency");

        if (!CONFIG_DIR.exists()) {
            CONFIG_DIR.mkdirs();
        }

        TEConfig.init(new File(CONFIG_DIR, "ThaumicEquivalency.cfg"));

        //proxy.registerClientOnlyEvents();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //ThaumicAspects.registerAspects();

        if (TEConfig.aspectEMC) {
            AspectMapper.mapAspects();
        }
        ManualEMC.addEMC();
        ThaumicMapper.addConversions();

    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    }


}