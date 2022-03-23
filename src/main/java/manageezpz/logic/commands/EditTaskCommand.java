package manageezpz.logic.commands;

import manageezpz.logic.commands.exceptions.CommandException;
import manageezpz.model.Model;
import manageezpz.model.task.UniqueTaskList;

public class EditTaskCommand extends Command{
    public static final String COMMAND_WORD = "editTask";
    public static final String MESSAGE_SUCCESS = "Task successfully edited.";
    public static final String MESSAGE_USAGE = "How to use EditTask?";

    public EditTaskCommand() {
        System.out.println("called edit task");
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        throw new CommandException("not registered yet!");
    }
}
