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

        while (true){
            System.out.print("Число дней, необходимое для достижения вершины: ");
            numberDaysToTop = readLine.nextInt();

            if (numberDaysToTop < 1 || numberDaysToTop > 100){
                System.out.println("Число дней должно находится в диапозоне от 1 до 100 !");
            }
            else {
                break;
            }
        }

        while (true){
            System.out.print("Число альпинистов в клубе: ");
            sizeGroup = readLine.nextInt();

            if (sizeGroup < 1 || sizeGroup > 20){
                System.out.println("Число альпинистов должно находится в диапозоне от 1 до 20 !");
            }
            else {
                break;
            }
        }

        int numberInGroup = 1;
        while (numberInGroup <= sizeGroup) {
            System.out.print(String.format("Максимальный ресурс для альпиниста %d: ", numberInGroup));
            int capacityResources = readLine.nextInt();

            System.out.print(String.format("Ежедневный расход ресурса для альпиниста %d: ", numberInGroup));
            int consumptionResources = readLine.nextInt();

            groupClimbers.add(new Climber(numberInGroup, capacityResources, consumptionResources));
            numberInGroup++;
        }
    }

    private void startExpedition(){

    }
}
