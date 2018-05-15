package lilylicious.thaumicequivalence.research;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import thaumcraft.api.research.theorycraft.ResearchTableData;
import thaumcraft.api.research.theorycraft.TheorycraftCard;

public class CardTransmute extends TheorycraftCard{

    @Override
    public int getInspirationCost() {
        return 1;
    }

    @Override
    public String getLocalizedName() {
        return new TextComponentTranslation("te.card.transmute.name").getUnformattedText();
    }

    @Override
    public boolean initialize(EntityPlayer player, ResearchTableData data) {
        return true;
    }

    @Override
    public String getLocalizedText() {
        return new TextComponentTranslation("te.card.transmute.text").getUnformattedText();
    }

    @Override
    public boolean activate(EntityPlayer player, ResearchTableData data) {
        data.addTotal("TE_CATEGORY", 25);
        return true;
    }

    @Override
    public boolean isAidOnly(){
        return true;
    }
}
