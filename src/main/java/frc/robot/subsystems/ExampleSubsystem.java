// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() 
  {
    wpilib_TalonFX motorFL = new wpilib_TalonFX(1);
    wpilib_TalonFX motorFL = new motorFL(2);
    wpilib_TalonFX motorFL = new motorFL(3);
    wpilib_TalonFX motorFL = new motorFL(4);
    wpilib_TalonFX motorFL = new wpilib_TalonFX(5);
    wpilib_TalonFX motorFL = new wpilib_TalonFX(6);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
