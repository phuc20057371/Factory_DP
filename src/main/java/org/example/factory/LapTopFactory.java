package org.example.factory;

import org.example.factorymethod.AcerLaptop;
import org.example.factorymethod.Laptop;
import org.example.factorymethod.MSILaptop;

public class LapTopFactory {
    public LapTopFactory() {
    }
    public static Laptop getLaptop(LaptopType laptopType) throws Exception {
        switch (laptopType){
            case MSI :{
                return new MSILaptop();
            }
            case Acer:{
                return new AcerLaptop();
            }
            default:{
                throw new Exception("not support");
            }
        }
    }
}
