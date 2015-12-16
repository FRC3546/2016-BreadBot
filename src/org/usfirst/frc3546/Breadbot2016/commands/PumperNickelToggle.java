package org.usfirst.frc3546.Breadbot2016.commands;

import org.usfirst.frc3546.Breadbot2016.Robot;

/**
 * Created by mason on 12/15/15.
 */
public class PumperNickelToggle extends SimpleCommand {
    @Override
    protected void initialize() {
        Robot.baguette.invertPumperNickelValve();
    }
}
