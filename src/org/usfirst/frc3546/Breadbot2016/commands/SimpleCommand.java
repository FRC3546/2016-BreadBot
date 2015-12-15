package org.usfirst.frc3546.Breadbot2016.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.tables.ITable;

/**
 * Created by Andrew on 12/15/15.
 */
public abstract class SimpleCommand extends Command {
    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

    @Override
    protected void execute() {}

    @Override
    protected void end() {}
}
