package ru.mirea.task25;

import java.util.Iterator;
import java.util.Vector;
//Now the Test only needs to work with the facade to complete all the above operations
public class Test {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.buildCampus();
        facade.buildTeam("Software engineering", "09.03.04");
        facade.buildTeam("Informatics and computer engineering", "09.03.01");
        facade.buildTeam("Applied Informatics","09.03.03");

        facade.enroll(01, "Software engineering");
        facade.enroll(02, "Software engineering");
        facade.enroll(03, "Informatics and computer engineering");

        Vector c = facade.display("Software engineering");
        Iterator iterator = c.iterator();
        System.out.println("Team name: " + (String)iterator.next());
        System.out.println("Training System name: " + (String)iterator.next());
        System.out.println("Students list: ");
        while(iterator.hasNext()){
            System.out.println(" + " + (String)iterator.next());
        }
    }
}
