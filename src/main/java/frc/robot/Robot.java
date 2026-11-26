package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;

public class Robot extends TimedRobot {

    private final DigitalInput botao = new DigitalInput(0);
    private final DigitalOutput led = new DigitalOutput(1);

    @Override
    public void robotPeriodic() {
        led.set(botao.get());
    }
}
