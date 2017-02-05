package lilylicious.thaumicequivalence.emc;

import com.google.common.collect.ImmutableMap;
import lilylicious.thaumicequivalence.config.TEConfig;
import moze_intel.projecte.api.ProjectEAPI;
import moze_intel.projecte.api.proxy.IConversionProxy;
import moze_intel.projecte.api.proxy.IEMCProxy;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.items.ItemsTC;

public class ManualEMC {
    private static IEMCProxy emcProxy = ProjectEAPI.getEMCProxy();
    private static IConversionProxy convProxy = ProjectEAPI.getConversionProxy();

    public static void addEMC() {
        convProxy.addConversion(1, ItemsTC.thaumonomicon, ImmutableMap.of((Object) Blocks.bookshelf, 1));
        convProxy.addConversion(1, BlocksTC.crucible, ImmutableMap.of((Object) Items.cauldron, 1));
        convProxy.addConversion(1, BlocksTC.vishroom, ImmutableMap.of(AspectMapper.objectMap.get(Aspect.PLANT.getTag()), 2, AspectMapper.objectMap.get(Aspect.DEATH.getTag()), 1, AspectMapper.objectMap.get(Aspect.AURA.getTag()), 1, AspectMapper.objectMap.get(Aspect.ENTROPY.getTag()), 1));
        convProxy.addConversion(1, BlocksTC.researchTable, ImmutableMap.of((Object) BlocksTC.tableWood, 1));
        convProxy.addConversion(1, BlocksTC.arcaneWorkbench, ImmutableMap.of((Object) BlocksTC.tableWood, 1));
        convProxy.addConversion(1, ItemsTC.coin, ImmutableMap.of((Object) Items.gold_nugget, 1));

        if (TEConfig.taintEMC) {
            //convProxy.addConversion(1, ItemApi.getBlock("blockTaint", 0), ImmutableMap.of(AspectMapper.objectMap.get(Aspect.ELDRITCH.getTag()), 3, AspectMapper.objectMap.get(Aspect.PLANT.getTag()), 1));
            //convProxy.addConversion(1, ItemApi.getBlock("blockTaint", 1), ImmutableMap.of(AspectMapper.objectMap.get(Aspect.ELDRITCH.getTag()), 3, AspectMapper.objectMap.get(Aspect.EARTH.getTag()), 1));
            //convProxy.addConversion(1, ItemApi.getBlock("blockTaintFibres", 0), ImmutableMap.of(AspectMapper.objectMap.get(Aspect.ELDRITCH.getTag()), 2, AspectMapper.objectMap.get(Aspect.LIFE.getTag()), 1));
            //convProxy.addConversion(1, ItemApi.getBlock("blockTaintFibres", 1), ImmutableMap.of(AspectMapper.objectMap.get(Aspect.ELDRITCH.getTag()), 1, AspectMapper.objectMap.get(Aspect.LIFE.getTag()), 1));
            //convProxy.addConversion(1, ItemApi.getBlock("blockTaintFibres", 2), ImmutableMap.of(AspectMapper.objectMap.get(Aspect.ELDRITCH.getTag()), 1, AspectMapper.objectMap.get(Aspect.PLANT.getTag()), 1));
            //convProxy.addConversion(1, ItemApi.getBlock("blockTaintFibres", 3), ImmutableMap.of(AspectMapper.objectMap.get(Aspect.ELDRITCH.getTag()), 2, AspectMapper.objectMap.get(Aspect.PLANT.getTag()), 1, AspectMapper.objectMap.get(Aspect.BEAST.getTag()), 1));
            //convProxy.addConversion(1, ItemApi.getItem("itemResource", 11), ImmutableMap.of(AspectMapper.objectMap.get(Aspect.ELDRITCH.getTag()), 3, AspectMapper.objectMap.get(Aspect.SLIME.getTag()), 1));
            //convProxy.addConversion(1, ItemApi.getItem("itemResource", 12), ImmutableMap.of(AspectMapper.objectMap.get(Aspect.ELDRITCH.getTag()), 1, AspectMapper.objectMap.get(Aspect.PLANT.getTag()), 1));
        }
        emcProxy.registerCustomEMC(BlocksTC.shimmerleaf, TEConfig.shimmerLeafValue);
        emcProxy.registerCustomEMC(BlocksTC.cinderpearl, TEConfig.cinderpearlValue);
        emcProxy.registerCustomEMC(ItemsTC.quicksilver, TEConfig.quicksilverValue);
        emcProxy.registerCustomEMC(ItemsTC.amber, TEConfig.amberValue);
        emcProxy.registerCustomEMC(ItemsTC.knowledgeFragment, TEConfig.knowledgeFragmentValue);
        emcProxy.registerCustomEMC(ItemsTC.brain, TEConfig.brainValue);
        emcProxy.registerCustomEMC(new ItemStack(BlocksTC.leaf, 1, 0), TEConfig.greatwoodLeafValue);
        emcProxy.registerCustomEMC(new ItemStack(BlocksTC.leaf, 1, 1), TEConfig.silverWoodLeafValue);
        emcProxy.registerCustomEMC(ItemsTC.primordialPearl, 16 * TEConfig.aerValue + 16 * TEConfig.terraValue + 16 * TEConfig.ignisValue + 16 * TEConfig.aquaValue + 16 * TEConfig.ordoValue + 16 * TEConfig.perditioValue + TEConfig.primordialPearlAddition);
        emcProxy.registerCustomEMC(ThaumicMapper.instability, TEConfig.instabilityValue);
    }
}
