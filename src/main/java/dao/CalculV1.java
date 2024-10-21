package dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cal1")
public class CalculV1 implements ICalcul{
    @Override
    public double getValue() {
        double d=100;
        return d;
    }
}
