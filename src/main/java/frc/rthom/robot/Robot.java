package frc.rthom.robot;

import java.lang.invoke.MethodHandles;

public class Robot
{
    // *** STATIC INITIALIZATION BLOCK ****************************************
    // This block of code is run first when the class is loaded
    static
    {
        System.out.println("\n\n*** " + MethodHandles.lookup().lookupClass().getPackageName() + " Test Code  ***");
        System.out.println("Loading Class : " + MethodHandles.lookup().lookupClass().getCanonicalName());
    }


    // *** CONSTRUCTOR ********************************************************
    // The constructor only runs one time when the class is instantiated
    public Robot()
    {
        System.out.println("-> Starting Constructor  : " + this.getClass().getName());
        // Add your constructor code here

        System.out.println("-> Finishing Constructor : " + this.getClass().getName());
    }


    // *** ROBOT INIT and PERIODIC methods ************************************
    // This method runs one time when the robot is first booted up
    public void robotInit()
    {

    }

    // This method runs after the other "Init" methods and "Periodic" methods
    public void robotPeriodic()
    {

    }

 
    // *** AUTONOMOUS INIT and PERIODIC methods *******************************
    // This method runs one time when the robot is "Enabled" in Autonomous mode
    public void autonomousInit()
    {

    }

    // This method runs periodically (every 20ms) while "Enabled" in Autonomous mode
    public void autonomousPeriodic()
    {

    }


    // *** TELEOP INIT and PERIODIC methods ***********************************
    // This method runs one time when the robot is "Enabled" in Teleop mode
    public void teleopInit()
    {

    }

    // This method runs periodically (every 20ms) while "Enabled" in Teleop mode
    public void teleopPeriodic()
    {

    }


    // *** TEST INIT and PERIODIC methods *************************************
    // This method runs one time when the robot is "Enabled" in Test mode
    public void testInit()
    {

    }

    // This method runs periodically (every 20ms) while "Enabled" in Test mode
    public void testPeriodic()
    {

    }


    // *** DISABLED INIT and PERIODIC methods *********************************
    // This method runs one time when the robot is "Disabled"
    public void disabledInit()
    {

    }

    // This method runs periodically (every 20ms) while "Disabled"
    public void disabledPeriodic()
    {

    }

}