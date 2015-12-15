// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3546.Breadbot2016.subsystems;

import org.usfirst.frc3546.Breadbot2016.RobotMap;
import org.usfirst.frc3546.Breadbot2016.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Baguette extends Subsystem {
    public static final boolean PUMPERNICKEL_EXTENDED = true;
    public static final boolean PUMPERNICKEL_RETRACTED = false;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput limitBreak = RobotMap.baguetteLimit_Break;
    DoubleSolenoid pumperNickelValve = RobotMap.baguettePumpernickel_Valve;
    SpeedController kneader = RobotMap.baguetteKneader;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    /**
     * set the position of the pumpernickel valve
     * @param valvePosition valve position that the valve is set to
     */
    public void setPumperNickelValve(boolean valvePosition){
        if (valvePosition == PUMPERNICKEL_EXTENDED){
            pumperNickelValve.set(DoubleSolenoid.Value.kForward);
        } else {
            pumperNickelValve.set(DoubleSolenoid.Value.kReverse);
        }

    }
}

