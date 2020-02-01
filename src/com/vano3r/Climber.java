package com.vano3r;

public class Climber {

    private int numberInGroup, // Номер альпениста в группе
            capacityResources, // Вместимость ресурсов для альпиниста
            consumptionResources; // Расход ресурсов для альпиниста

    Climber(int numberInGroup, int capacityResources, int consumptionResources) {
        this.numberInGroup = numberInGroup;
        this.capacityResources = capacityResources;
        this.consumptionResources = consumptionResources;
    }

    public int getCapacityResources() {
        return capacityResources;
    }

    public int getNumberInGroup() {
        return numberInGroup;
    }

    public int getConsumptionResources() {
        return consumptionResources;
    }
}
