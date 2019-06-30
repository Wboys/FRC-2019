/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  XboxController stick = new XboxController(0);
  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);
  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to
   * the switch structure below with additional strings. If using the
   * SendableChooser make sure to add them to the chooser code above as well.
   */
  @Override
  public void autonomousInit() {
    m_autoSelected = m_chooser.getSelected();
    // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    System.out.println("Auto selected: " + m_autoSelected);
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    switch (m_autoSelected) {
      case kCustomAuto:
        // Put custom auto code here
        break;
      case kDefaultAuto:
      default:
        // Put default auto code here
        break;
    }
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    // yeet
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    double value = stick.getX(Hand.kLeft);
    double value2 = stick.getY();
    double lt = stick.getTriggerAxis(Hand.kLeft);
    //boolean Ltrigger = stick.getTriggerPressed();
  
    boolean button1 = stick.getRawButton(1);
    boolean button2 = stick.getRawButton(2);
    boolean button3 = stick.getRawButton(3);
    boolean button4 = stick.getRawButton(4);
    boolean button5 = stick.getRawButton(5);
    boolean button6 = stick.getRawButton(6);
    boolean button7 = stick.getRawButton(7);
    boolean button8 = stick.getRawButton(8);
    boolean button9 = stick.getRawButton(9);
    boolean button10 = stick.getRawButton(10);
    // boolean button11 = stick.getRawButton(11);
    // boolean button12 = stick.getRawButton(12);
    // boolean button13 = stick.getRawButton(13);
    // boolean button14 = stick.getRawButton(14);

    // double throttle = stick.getThrottle();
    // double zval = stick.getZ();
    // double twist = stick.getTwist();
    // boolean getTop = stick.getTop();

    if(value > 0.5){
      System.out.println("RIGHT");
    }
    if(value < -0.5){
      System.out.println("LEFT");
    }
    if(value2 > 0.5){
      System.out.println("YOINK");
    }
    if(value2 < -0.5){
      System.out.println("YEET");
    }
    // if(Ltrigger) {
    //   System.out.println("Ltrigger");
    // }

    if(button1){
      System.out.println("button 1");
    }
    if(button2){
      System.out.println("button 2");
    }
    if(button3){
      System.out.println("button 3");
    }
    if(button4){
      System.out.println("button 4");
    }
    if(button5){
      System.out.println("button 5");
    }
    if(button6){
      System.out.println("button 6");
    }
    if(button7){
      System.out.println("button 7");
    }
    if(button8){
      System.out.println("button 8");
    }
    if(button9){
      System.out.println("button 9");
    }
    if(button10){
      System.out.println("button 10");
    }

    if(lt > 0.5){
      System.out.println("Left trigger:");
    }
    // if(button11){
    //   System.out.println("button 11");
    // }
    // if(button12){
    //   System.out.println("button 12");
    // }
    // if(button13){
    //   System.out.println("button 13");
    // }
    // if(button14){
    //   System.out.println("button 14");
    // }

    // if(throttle > 0.5){
    //   System.out.println("getThrottle:");
    // }
    // if(zval > 0.5){
    //   System.out.println("getZ: ");
    // }
    // if(twist > 0.5){
    //   System.out.println("getTwist: ");
    // }
    // if(getTop) {
    //   System.out.println("Top:");
    // }
  }
}
