/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6404.robot.subsystems;

import org.usfirst.frc.team6404.robot.RobotMap;
import org.usfirst.frc.team6404.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import utils.Tracao;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriverSubsystem extends Subsystem implements Tracao {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	private DifferentialDrive drive = new DifferentialDrive(frontais, traseiros);
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new DriveCommand());
	}
	
	public void driveRobot(double x, double y) {
		drive.arcadeDrive(y, x);
	}
}
