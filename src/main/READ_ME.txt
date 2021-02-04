package frc.robot;

// --------------------------------------------------------------------------- //
//   *** DIRECTIONS ***                                                        //
//                                                                             //
//   1. Do NOT make any changes to the READ_ME.txt file                        //
//                                                                             //
//   2. Create a new file in the java\frc\robot folder, called MainRobot.java  //
//                                                                             //
//   3. Copy everything from this file and paste into the MainRobot.java file  //
//                                                                             //
//   4. Change the following in the MainRobot.java file:                       //
//      a. Comment out the import of the default Robot class below (line 19)   //
//      b. Uncomment your Robot class (lines 21-33)                            //
//                                                                             //
// --------------------------------------------------------------------------- //

// DEFAULT
import frc.zdefault.robot.Robot;

// STUDENTS
// import frc.alex.robot.Robot;
// import frc.darren.robot.Robot;
// import frc.elliot.robot.Robot;
// import frc.ishaan.robot.Robot;
// import frc.joel.robot.Robot;
// import frc.kai.robot.Robot;

// MENTORS
// import frc.dwash.robot.Robot;
// import frc.jwood.robot.Robot;
// import frc.rfife.robot.Robot;
// import frc.rthom.robot.Robot;

// --------------------------------------------------------------------------- //

import edu.wpi.first.wpilibj.TimedRobot;

public class MainRobot extends TimedRobot
{
    private final Robot robot = new Robot();

    public MainRobot()
    {}
    
    @Override
    public void robotInit()
    {
        robot.robotInit();
    }

    @Override
    public void robotPeriodic()
    {
        robot.robotPeriodic();
    }

    @Override
    public void autonomousInit()
    {
        robot.autonomousInit();
    }

    @Override
    public void autonomousPeriodic()
    {
        robot.autonomousPeriodic();
    }

    @Override
    public void teleopInit()
    {
        robot.teleopInit();
    }

    @Override
    public void teleopPeriodic()
    {
        robot.teleopPeriodic();
    }

    @Override
    public void testInit()
    {
        robot.testInit();
    }

    @Override
    public void testPeriodic()
    {
        robot.testPeriodic();
    }

    @Override
    public void disabledInit()
    {
        robot.disabledInit();
    }

    @Override
    public void disabledPeriodic()
    {
        robot.disabledPeriodic();
    }
}
