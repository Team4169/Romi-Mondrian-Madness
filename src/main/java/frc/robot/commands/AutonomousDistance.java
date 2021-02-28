// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */

 
  
  public AutonomousDistance(Drivetrain drivetrain) {
    
    double spd = 0.5;
    double tspd = 0.5;

    addCommands(
      new DriveDistance(spd, 6, drivetrain), //s1
      new TurnDegrees(-tspd, 13, drivetrain), //t1
      new DriveDistance(spd, 4, drivetrain), //s2
      new TurnDegrees(-tspd, 13, drivetrain), // t2
      new DriveDistance(spd, 7.5, drivetrain), //s3
      new TurnDegrees(-tspd, 30, drivetrain), //t3
      new DriveDistance(spd, 12.25, drivetrain), //s4
      new TurnDegrees(tspd, 50, drivetrain), //t4
      new DriveDistance(-spd, 15.5, drivetrain), //s5
      new TurnDegrees(-tspd, 4, drivetrain), //t5
      new DriveDistance(-spd, 12.5, drivetrain), //s6
      new TurnDegrees(-tspd, 49.5, drivetrain), //t6
      new DriveDistance(spd, 17, drivetrain), //s7
      new TurnDegrees(tspd, 53, drivetrain), //t7 
      new DriveDistance(spd, 8, drivetrain), //s8 
      new TurnDegrees(tspd,10, drivetrain), //t8
      new DriveDistance(spd, 4.5, drivetrain));

  }

}