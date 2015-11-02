package lilylicious.thaumicequivalence.recipes;

import moze_intel.projecte.gameObjs.ObjHandler;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class ThaumicAspects {

    public static void registerAspects() {

        registerItemAspects();
        
    }

    private static void registerItemAspects() {
        
        ThaumcraftApi.registerObjectTag(new ItemStack(ObjHandler.covalence, 1, 0), new AspectList().add(Aspect.EXCHANGE, 1));//.remove(Aspect.ENERGY).remove(Aspect.ENTROPY).remove(Aspect.FIRE).remove(Aspect.ORDER));
        ThaumcraftApi.registerObjectTag(new ItemStack(ObjHandler.covalence, 1, 1), new AspectList().add(Aspect.EXCHANGE, 3));//.remove(Aspect.ENERGY).remove(Aspect.ENTROPY).remove(Aspect.FIRE).remove(Aspect.ORDER));
        ThaumcraftApi.registerObjectTag(new ItemStack(ObjHandler.covalence, 1, 2), new AspectList().add(Aspect.EXCHANGE, 5));//.remove(Aspect.ENERGY).remove(Aspect.ENTROPY).remove(Aspect.FIRE).remove(Aspect.ORDER));
    }

}
