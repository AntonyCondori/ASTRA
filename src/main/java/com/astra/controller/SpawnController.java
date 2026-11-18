package com.astra.controller;

import com.astra.command.CommandBus;
import com.astra.command.Commands;
import com.astra.model.VehicleKind;

public final class SpawnController {
    private final CommandBus bus;

    public SpawnController(CommandBus bus) {
        this.bus = bus;
    }

    public void request(VehicleKind kind, String strategy, int count) {
        for (int i = 0; i < count; i++) {
            bus.submit(Commands.spawn(kind, strategy));
        }
    }
}
