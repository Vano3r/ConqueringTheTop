package com.vano3r;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private int numberDaysToTop; // Число дней, необходимое для достижения вершины
    private int sizeGroup; // Число альпинистов в группе
    private ArrayList<Climber> groupClimbers;


    public static void main(String[] args) {
        Main main = new Main();
        main.creationExpedition();
    }

    // Создание экспедиции
    private void creationExpedition() {
        groupClimbers = new ArrayList<>();
        Scanner readLine = new Scanner(System.in);

        System.out.print("Число дней, необходимое для достижения вершины: ");
        numberDaysToTop = readLine.nextInt();

        System.out.print("Число альпинистов в клубе: ");
        sizeGroup = readLine.nextInt();

        int numberInGroup = 1;
        while (numberInGroup <= sizeGroup) {
            System.out.println(String.format("Максимальный ресурс для альпиниста %d: ", numberInGroup));
            int capacityResources = readLine.nextInt();

            System.out.println(String.format("Ежедневный расход ресурса для альпиниста %d: ", numberInGroup));
            int consumptionResources = readLine.nextInt();

            groupClimbers.add(new Climber(numberInGroup, capacityResources, consumptionResources));
            numberInGroup++;
        }
    }
}
