package singleton.driver;

import singleton.utilities.Application;
import singleton.utilities.Gaming;
import singleton.utilities.RandomAccessMemory;
import singleton.utilities.WordProcessor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Application application1 = new WordProcessor(343);
        System.out.println(application1);
        RandomAccessMemory ramInstance1 = RandomAccessMemory.getInstance();
        ramInstance1.allocateSpace(application1);


        Application application2 = new Gaming(2944);
        System.out.println(application2);
        RandomAccessMemory ramInstance2 = RandomAccessMemory.getInstance();
        ramInstance1.allocateSpace(application2);



    }

}
