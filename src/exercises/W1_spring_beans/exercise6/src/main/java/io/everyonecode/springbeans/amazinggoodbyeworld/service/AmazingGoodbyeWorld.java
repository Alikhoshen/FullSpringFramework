package io.everyonecode.springbeans.amazinggoodbyeworld.service;

public class AmazingGoodbyeWorld {
    private final Goodbye goodbye;
    private final World world;

    public AmazingGoodbyeWorld(Goodbye goodbye, World world) {
        this.goodbye = goodbye;
        this.world = world;
    }

    public String get() {
        String goodbye = this.goodbye.get();
        String world = this.world.get();
        return goodbye + " " + world;
    }
}
