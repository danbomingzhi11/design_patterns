package factory;

import java.util.HashMap;

public abstract class AbstractFactory {
    abstract Run forRun();

    abstract Jump forJump();
}

