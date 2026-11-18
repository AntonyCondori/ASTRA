package com.astra.controller;

import com.astra.command.CommandBus;
import com.astra.model.VehicleKind;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpawnControllerTest {
    @Test
    void queuesOneCommandForEachRequestedVehicle() {
        var bus = new CommandBus();
        var controller = new SpawnController(bus);

        controller.request(VehicleKind.CAR, "SHORTEST", 1);
        assertEquals(1, bus.pendingCount());

        controller.request(VehicleKind.BUS, "RANDOM", 10);
        assertEquals(11, bus.pendingCount());
    }
}
