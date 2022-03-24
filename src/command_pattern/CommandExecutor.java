package command_pattern;

public class CommandExecutor {

    public void press(CommandInterface commands){
        commands.execute();
    }

}
