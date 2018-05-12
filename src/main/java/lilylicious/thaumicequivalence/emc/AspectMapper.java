package lilylicious.thaumicequivalence.emc;

import lilylicious.thaumicequivalence.config.TEConfig;
import moze_intel.projecte.api.ProjectEAPI;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

import java.util.HashMap;
import java.util.Map;

public class AspectMapper {

    public static Map<String, Object> objectMap = new HashMap();

    public static Map<String, Integer> AspectEMC = new HashMap();


    public static void mapAspects() {

        AspectEMC.put(Aspect.AIR.getTag(), TEConfig.aerValue);
        AspectEMC.put(Aspect.EARTH.getTag(), TEConfig.terraValue);
        AspectEMC.put(Aspect.FIRE.getTag(), TEConfig.ignisValue);
        AspectEMC.put(Aspect.WATER.getTag(), TEConfig.aquaValue);
        AspectEMC.put(Aspect.ORDER.getTag(), TEConfig.ordoValue);
        AspectEMC.put(Aspect.ENTROPY.getTag(), TEConfig.perditioValue);

        for (Aspect aspect : Aspect.getCompoundAspects()) {
            int EMCTotal = 0;
            AspectList aList = breakDownAspects(aspect);

            for (Map.Entry primal : aList.aspects.entrySet()) {

                EMCTotal += primalEMC((Aspect) primal.getKey(), (Integer) primal.getValue());
            }

            AspectEMC.put(aspect.getTag(), EMCTotal);
        }

    }

    private static int primalEMC(Aspect aspect, int count) {
        if (aspect == Aspect.AIR) return count * TEConfig.aerValue;
        else if (aspect == Aspect.EARTH) return count * TEConfig.terraValue;
        else if (aspect == Aspect.FIRE) return count * TEConfig.ignisValue;
        else if (aspect == Aspect.WATER) return count * TEConfig.aquaValue;
        else if (aspect == Aspect.ORDER) return count * TEConfig.ordoValue;
        else if (aspect == Aspect.ENTROPY) return count * TEConfig.perditioValue;
        else return 0;
    }

    private static AspectList breakDownAspects(Aspect as) {
        boolean nonPrimals = true;

        AspectList aspects = new AspectList();

        aspects.add(as, 1);

        while (nonPrimals) {
            for (Aspect aspect : aspects.getAspectsSortedByAmount()) {
                if (aspect == null)
                    continue;


                int count = aspects.getAmount(aspect);

                if (count == 0) aspects.remove(aspect);

                if (count > 0 && !Aspect.getPrimalAspects().contains(aspect)) {
                    for (Aspect a : aspect.getComponents()) {
                        aspects.add(a, count);
                    }

                    aspects.remove(aspect, count);
                }
            }
            nonPrimals = false;
            for (Aspect a : aspects.getAspects()) {
                if (!Aspect.getPrimalAspects().contains(a)) nonPrimals = true;
            }
        }
        return aspects;
    }
}
