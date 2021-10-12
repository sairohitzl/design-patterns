package factory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        PhoneFactory phoneFactory = new PhoneFactory();
        Scanner sc = new Scanner(System.in);
        Phone phone1 = phoneFactory.getPhone(sc.next());
        Phone phone2 = phoneFactory.getPhone(sc.next());
        phone1.communicate();
        phone2.communicate();
        sc.close();


    }
}
