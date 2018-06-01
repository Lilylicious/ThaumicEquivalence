package lilylicious.thaumicequivalence.utils;

import moze_intel.projecte.gameObjs.ObjHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RecipeLists {


    // new ItemStack[]{new ItemStack(), new ItemStack()}
    //private static ItemStack[] placeholder = new ItemStack[]{new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone), new ItemStack(Blocks.stone)};
    //public static ItemStack[] philoStone = new ItemStack[]{new ItemStack(Items.REDSTONE), new ItemStack(Items.GLOWSTONE_dust), new ItemStack(Items.REDSTONE), new ItemStack(Items.GLOWSTONE_dust), new ItemStack(Items.REDSTONE), new ItemStack(Items.GLOWSTONE_dust), new ItemStack(Items.REDSTONE), new ItemStack(Items.GLOWSTONE_dust)};
    public static Item[] philoStone = new Item[]{Items.REDSTONE, Items.GLOWSTONE_DUST, Items.REDSTONE, Items.GLOWSTONE_DUST, Items.REDSTONE, Items.GLOWSTONE_DUST, Items.REDSTONE, Items.GLOWSTONE_DUST};
    public static ItemStack[] transmutationTablet = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(ObjHandler.matterBlock, 1, 0)};
    public static ItemStack[] darkMatter = new ItemStack[]{new ItemStack(ObjHandler.fuels, 1, 2),new ItemStack(ObjHandler.fuels, 1, 2),new ItemStack(ObjHandler.fuels, 1, 2),new ItemStack(ObjHandler.fuels, 1, 2),new ItemStack(ObjHandler.fuels, 1, 2),new ItemStack(ObjHandler.fuels, 1, 2),new ItemStack(ObjHandler.fuels, 1, 2),new ItemStack(ObjHandler.fuels, 1, 2)};
    public static ItemStack[] redMatter = new ItemStack[]{new ItemStack(ObjHandler.fuelBlock, 1, 2), new ItemStack(ObjHandler.fuelBlock, 1, 2), new ItemStack(ObjHandler.fuelBlock, 1, 2)};
    public static ItemStack[] novaCatalyst = new ItemStack[]{new ItemStack(ObjHandler.fuels, 1, 1), new ItemStack(ObjHandler.fuels, 1, 1), new ItemStack(ObjHandler.fuels, 1, 1)};
    public static ItemStack[] novaCataclysm = new ItemStack[]{new ItemStack(ObjHandler.fuels, 1, 2), new ItemStack(ObjHandler.fuels, 1, 2), new ItemStack(ObjHandler.fuels, 1, 2)};
    
    public static ItemStack[] dmAxe = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] dmHammer = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] dmHoe = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] dmShears = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] dmShovel = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] dmSword = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] dmPick = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] dmHelm = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] dmChest = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] dmLegs = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] dmFeet = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] covalenceMed = new ItemStack[]{new ItemStack(Items.IRON_INGOT), new ItemStack(Items.COAL), new ItemStack(Items.REDSTONE), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.COAL), new ItemStack(Items.REDSTONE)};
    public static ItemStack[] covalenceHigh = new ItemStack[]{new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.COAL), new ItemStack(Items.REDSTONE), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.COAL), new ItemStack(Items.REDSTONE)};
    public static ItemStack[] repairTalisman = new ItemStack[]{new ItemStack(Items.STRING), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.covalence, 1, 0), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.covalence, 1, 0)};
    public static ItemStack[] alchemicalChest = new ItemStack[]{new ItemStack(Items.IRON_INGOT), new ItemStack(ObjHandler.covalence, 1, 0), new ItemStack(Items.IRON_INGOT), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(Items.IRON_INGOT), new ItemStack(ObjHandler.covalence, 1, 2)};
    public static ItemStack[] energyCondenser = new ItemStack[]{new ItemStack(Items.DIAMOND), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.OBSIDIAN)};
    public static ItemStack[] collectorMk1 = new ItemStack[]{new ItemStack(Blocks.GLASS), new ItemStack(Blocks.FURNACE), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE)};
    public static ItemStack[] relayMk1 = new ItemStack[]{new ItemStack(Blocks.GLASS), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.OBSIDIAN)};
    public static ItemStack[] collectorMk2 = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE)};
    public static ItemStack[] relayMk2 = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.OBSIDIAN)};
    public static ItemStack[] collectorMk3 = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE)};
    public static ItemStack[] relayMk3 = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE), new ItemStack(Blocks.GLOWSTONE)};
    public static ItemStack[] swiftWolfRing = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(Items.FEATHER), new ItemStack(Items.FEATHER), new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(Items.FEATHER), new ItemStack(Items.FEATHER)};
    public static ItemStack[] harvestGoddessRing = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(Blocks.SAPLING, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.SAPLING, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(Blocks.SAPLING, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.SAPLING, 1, OreDictionary.WILDCARD_VALUE)};
    public static ItemStack[] zeroRing = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(Blocks.SNOW), new ItemStack(Blocks.SNOW), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(Blocks.SNOW), new ItemStack(Blocks.SNOW)};
    public static ItemStack[] ignitionRing = new ItemStack[]{new ItemStack(Items.FLINT_AND_STEEL), new ItemStack(ObjHandler.matter, 1, 0), new ItemStack(ObjHandler.fuels, 1, 1), new ItemStack(ObjHandler.fuels, 1, 1), new ItemStack(ObjHandler.matter, 1, 0)};

    public static ItemStack[] blackHole = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(Items.STRING), new ItemStack(Items.STRING)};
    public static ItemStack[] voidRing = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.blackHole), new ItemStack(ObjHandler.eternalDensity)};

    public static ItemStack[] arcanaRing = new ItemStack[]{new ItemStack(ObjHandler.zero), new ItemStack(ObjHandler.ignition), new ItemStack(ObjHandler.swrg), new ItemStack(ObjHandler.harvestGod)};
    public static ItemStack[] timeWatch = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(Blocks.GLOWSTONE), new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(Blocks.GLOWSTONE)};
    public static ItemStack[] kleinStarEin = new ItemStack[]{new ItemStack(Items.DIAMOND), new ItemStack(Items.DIAMOND), new ItemStack(Items.DIAMOND)};
    public static ItemStack[] kleinStarZwei = new ItemStack[]{new ItemStack(ObjHandler.fuelBlock, 1, 1), new ItemStack(ObjHandler.fuelBlock, 1, 1), new ItemStack(ObjHandler.fuelBlock, 1, 1), new ItemStack(ObjHandler.fuelBlock, 1, 1), new ItemStack(ObjHandler.fuelBlock, 1, 1)};
    public static ItemStack[] kleinStarDrei = new ItemStack[]{new ItemStack(ObjHandler.fuelBlock, 1, 2), new ItemStack(ObjHandler.fuelBlock, 1, 1), new ItemStack(ObjHandler.fuelBlock, 1, 2), new ItemStack(ObjHandler.fuelBlock, 1, 2), new ItemStack(ObjHandler.fuelBlock, 1, 1)};
    public static ItemStack[] kleinStarVier = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.fuelBlock, 1, 2), new ItemStack(ObjHandler.fuelBlock, 1, 2), new ItemStack(ObjHandler.fuelBlock, 1, 2), new ItemStack(ObjHandler.fuelBlock, 1, 2)};
    public static ItemStack[] kleinStarSphere = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.matter, 1, 1)};
    public static ItemStack[] kleinStarOmega = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matterBlock, 1, 1)};
    public static ItemStack[] rmAxe = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2)};
    public static ItemStack[] rmHammer = new ItemStack[]{new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.matter, 1, 1)};
    public static ItemStack[] rmHoe = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2)};
    public static ItemStack[] rmShears = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2)};
    public static ItemStack[] rmShovel = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 2)};
    public static ItemStack[] rmSword = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2)};
    public static ItemStack[] rmPick = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2)};

    public static ItemStack[] rmHelm = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matter, 1, 1)};
    public static ItemStack[] rmChest = new ItemStack[]{new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matterBlock, 1, 1)};
    public static ItemStack[] rmLegs = new ItemStack[]{new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matterBlock, 1, 1)};
    public static ItemStack[] rmBoots = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matter, 1, 1), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.matter, 1, 1)};

    public static ItemStack[] gemHelm = new ItemStack[]{new ItemStack(ObjHandler.kleinStars, 1, 5), new ItemStack(ObjHandler.everTide), new ItemStack(ObjHandler.soulStone)};
    public static ItemStack[] gemChest = new ItemStack[]{new ItemStack(ObjHandler.kleinStars, 1, 5), new ItemStack(ObjHandler.volcanite), new ItemStack(ObjHandler.bodyStone)};
    public static ItemStack[] gemLegs = new ItemStack[]{new ItemStack(ObjHandler.kleinStars, 1, 5), new ItemStack(ObjHandler.blackHole), new ItemStack(ObjHandler.timeWatch)};
    public static ItemStack[] gemBoots = new ItemStack[]{new ItemStack(ObjHandler.kleinStars, 1, 5), new ItemStack(ObjHandler.swrg), new ItemStack(ObjHandler.swrg)};

    public static ItemStack[] morningstar = new ItemStack[]{new ItemStack(ObjHandler.rmPick), new ItemStack(ObjHandler.rmHammer), new ItemStack(ObjHandler.rmShovel)};
    public static ItemStack[] katar = new ItemStack[]{new ItemStack(ObjHandler.rmShears), new ItemStack(ObjHandler.rmAxe), new ItemStack(ObjHandler.rmSword), new ItemStack(ObjHandler.rmHoe)};

    public static ItemStack[] interdictionTorch = new ItemStack[]{new ItemStack(Items.DIAMOND), new ItemStack(Items.DIAMOND), new ItemStack(Items.DIAMOND)};
    public static ItemStack[] energCondenserMk2 = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(ObjHandler.matterBlock, 1, 1)};
    public static ItemStack[] dmPedestal = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(ObjHandler.matterBlock, 1, 0)};
    public static ItemStack[] dmFurnace = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(ObjHandler.matterBlock, 1, 0), new ItemStack(ObjHandler.matterBlock, 1, 0)};
    public static ItemStack[] rmFurnace = new ItemStack[]{new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matterBlock, 1, 1), new ItemStack(ObjHandler.matterBlock, 1, 1)};
    public static ItemStack[] whiteAlchBag = new ItemStack[]{new ItemStack(Blocks.WOOL, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ObjHandler.covalence, 2), new ItemStack(Blocks.WOOL, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.WOOL, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ObjHandler.covalence, 1, 2)};
    public static ItemStack[] lowDiviner = new ItemStack[]{new ItemStack(ObjHandler.covalence, 1, 0), new ItemStack(ObjHandler.covalence, 1, 0), new ItemStack(ObjHandler.covalence, 1, 0)};
    public static ItemStack[] medDiviner = new ItemStack[]{new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.covalence, 1, 1)};
    public static ItemStack[] highDiviner = new ItemStack[]{new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 2)};
    public static ItemStack[] mercurialEye = new ItemStack[]{new ItemStack(Items.DIAMOND), new ItemStack(Blocks.BRICK_BLOCK), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.BRICK_BLOCK)};
    public static ItemStack[] densityGem = new ItemStack[]{new ItemStack(Items.DIAMOND), new ItemStack(Items.DIAMOND), new ItemStack(Items.DIAMOND)};
    public static ItemStack[] bodyStone = new ItemStack[]{new ItemStack(Items.SUGAR), new ItemStack(Items.BREAD), new ItemStack(Items.BREAD)};
    public static ItemStack[] soulStone = new ItemStack[]{new ItemStack(Items.POTIONITEM, 1, 8197), new ItemStack(Items.GOLDEN_APPLE), new ItemStack(Items.GOLDEN_APPLE)};
    //public static ItemStack[] mindStone = new ItemStack[]{new ItemStack(ConfigItems.itemZombieBrain), new ItemStack(Items.book), new ItemStack(Items.book)};
    public static ItemStack[] lifeStone = new ItemStack[]{new ItemStack(ObjHandler.bodyStone), new ItemStack(ObjHandler.soulStone)};
    public static ItemStack[] evertide = new ItemStack[]{new ItemStack(Items.WATER_BUCKET), new ItemStack(Items.WATER_BUCKET), new ItemStack(Items.WATER_BUCKET)};
    public static ItemStack[] volcanite = new ItemStack[]{new ItemStack(Items.LAVA_BUCKET), new ItemStack(Items.LAVA_BUCKET), new ItemStack(Items.LAVA_BUCKET)};
    public static ItemStack[] destructionCatalyst = new ItemStack[]{new ItemStack(ObjHandler.novaCatalyst), new ItemStack(ObjHandler.novaCatalyst), new ItemStack(ObjHandler.novaCatalyst)};
    public static ItemStack[] hyperkineticLens = new ItemStack[]{new ItemStack(Items.DIAMOND), new ItemStack(ObjHandler.novaCatalyst), new ItemStack(ObjHandler.novaCatalyst)};
    public static ItemStack[] catalyticLens = new ItemStack[]{new ItemStack(ObjHandler.dCatalyst), new ItemStack(ObjHandler.hyperLens)};
/*
*/
}