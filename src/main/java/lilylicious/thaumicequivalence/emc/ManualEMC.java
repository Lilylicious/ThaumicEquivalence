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

import java.util.Map;

public class ManualEMC {
    private static IEMCProxy emcProxy = ProjectEAPI.getEMCProxy();
    private static IConversionProxy convProxy = ProjectEAPI.getConversionProxy();

    public static void addEMC() {
        emcProxy.registerCustomEMC(new ItemStack(ItemsTC.nuggets, 1, 10), TEConfig.rareEarthValue);
        emcProxy.registerCustomEMC(BlocksTC.stoneAncient, 16);
        emcProxy.registerCustomEMC(BlocksTC.stoneEldritchTile, 32);
        emcProxy.registerCustomEMC(ItemsTC.salisMundus, 4+6+64+TEConfig.aerValue);
        emcProxy.registerCustomEMC(ItemsTC.crystalEssence, TEConfig.aerValue);
        emcProxy.registerCustomEMC(BlocksTC.shimmerleaf, TEConfig.shimmerLeafValue);
        emcProxy.registerCustomEMC(BlocksTC.cinderpearl, TEConfig.cinderpearlValue);
        emcProxy.registerCustomEMC(ItemsTC.quicksilver, TEConfig.quicksilverValue);
        emcProxy.registerCustomEMC(ItemsTC.amber, TEConfig.amberValue);
        emcProxy.registerCustomEMC(ItemsTC.brain, TEConfig.brainValue);
        emcProxy.registerCustomEMC(ItemsTC.primordialPearl, 16 * TEConfig.aerValue + 16 * TEConfig.terraValue + 16 * TEConfig.ignisValue + 16 * TEConfig.aquaValue + 16 * TEConfig.ordoValue + 16 * TEConfig.perditioValue + TEConfig.primordialPearlAddition);
        emcProxy.registerCustomEMC(ThaumicMapper.instability, TEConfig.instabilityValue);
        convProxy.addConversion(1, BlocksTC.researchTable, ImmutableMap.of(BlocksTC.tableWood, 1));
        convProxy.addConversion(1, ItemsTC.thaumonomicon, ImmutableMap.of((Object) Blocks.BOOKSHELF, 1, ItemsTC.salisMundus, 1));
        convProxy.addConversion(1, BlocksTC.crucible, ImmutableMap.of((Object) Items.CAULDRON, 1, ItemsTC.salisMundus, 1));
        convProxy.addConversion(1, BlocksTC.arcaneWorkbench, ImmutableMap.of(BlocksTC.tableWood, 1, ItemsTC.salisMundus, 1));
    }
}