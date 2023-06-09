package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> sounds = new ArrayList<>();

        Sound fireworks = new Firework();
        Sound parrot = new Parrot();
        Sound radio = new Radio();

        sounds.add(fireworks);
        sounds.add(parrot);
        sounds.add(radio);

        for (Sound saund : sounds) {
            saund.playSound();
        }
    }
}
