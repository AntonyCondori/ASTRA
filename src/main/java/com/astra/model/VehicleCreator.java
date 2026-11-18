package com.astra.model;

import com.astra.graph.Intersection;
import com.astra.routing.RouteStrategy;

interface VehicleCreator {
    Vehicle create(VehicleSpec spec, RouteStrategy strategy, Intersection origin, Intersection dest);
}

final class CarCreator implements VehicleCreator {
    @Override
    public Vehicle create(VehicleSpec spec, RouteStrategy strategy, Intersection origin, Intersection dest) {
        return new Car(spec, strategy, origin, dest);
    }
}

final class BusCreator implements VehicleCreator {
    @Override
    public Vehicle create(VehicleSpec spec, RouteStrategy strategy, Intersection origin, Intersection dest) {
        return new Bus(spec, strategy, origin, dest);
    }
}

final class AmbulanceCreator implements VehicleCreator {
    @Override
    public Vehicle create(VehicleSpec spec, RouteStrategy strategy, Intersection origin, Intersection dest) {
        return new Ambulance(spec, strategy, origin, dest);
    }
}
