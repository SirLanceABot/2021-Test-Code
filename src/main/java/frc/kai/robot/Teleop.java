package frc.kai.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Teleop {
    private static final Joystick xbox = new Joystick(0);
    public void init()
    {

    }
    public void periodic()
    {
        System.out.println(xbox.getRawButton(1));
    }
}
