package com.company;

import java.io.IOException;
import java.util.*;

public class ConsoleMain {
    public static void main(String[] args) throws IOException {

        Cmd cmd = new Cmd();

        Locale.setDefault(Locale.ROOT);

        cmd.runCmd();
    }
}
