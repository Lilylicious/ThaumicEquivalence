package lilylicious.thaumicequivalence.command;

import lilylicious.thaumicequivalence.emc.EssentiaChecker;
import lilylicious.thaumicequivalence.utils.TELogger;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;

import java.util.ArrayList;
import java.util.List;

public class CommandDump implements ICommand
{
	private List aliases;

	public CommandDump()
	{
		this.aliases = new ArrayList();
		this.aliases.add("tedump");
		this.aliases.add("ted");
	}

	@Override
	public String getCommandName()
	{
		return "tedump";
	}

	@Override
	public String getCommandUsage(ICommandSender var1)
	{
		return "tedump";
	}

	@Override
	public List getCommandAliases()
	{
		return this.aliases;
	}

	@Override
	public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_)
	{
		EssentiaChecker.run();
		TELogger.logInfo("Done dumping");
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_)
	{
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_)
	{
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_)
	{
		return false;
	}

	@Override
	public int compareTo(Object o)
	{
		return 0;
	}
}
