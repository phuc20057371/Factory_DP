package org.example;

import org.example.factory.LapTopFactory;
import org.example.factory.LaptopType;
import org.example.factorymethod.Laptop;

public class Main {
    public static void main(String[] args) throws Exception {
        Laptop laptop = LapTopFactory.getLaptop(LaptopType.MSI);

        System.out.println(laptop.getLaptopName());

        laptop = LapTopFactory.getLaptop(LaptopType.Acer);

        System.out.println(laptop.getLaptopName());

    }
}