package lilylicious.thaumicequivalence.research;

import moze_intel.projecte.gameObjs.ObjHandler;
import thaumcraft.api.research.theorycraft.ITheorycraftAid;
import thaumcraft.api.research.theorycraft.TheorycraftCard;

public class AidTransTable implements ITheorycraftAid {
    @Override
    public Object getAidObject() {
        return ObjHandler.transmuteStone;
    }

    @Override
    public Class<TheorycraftCard>[] getCards() {
        return new Class[] {CardTransmute.class};
    }
}
