package ru.mirea.task27;
import java.util.Scanner;

public class Student {

        String ID, Name, Birthday, Address;

        enum SEX {
            MALE, FEMALE
        }
        SEX Sex;
        int GPA;

        public Student(String ID, String Name, String Birthday, String Address, int GPA) {
            this.ID = ID;
            this.Name = Name;
            this.Birthday = Birthday;
            this.Address = Address;
            this.GPA = GPA;
        }

        public Student() {
        }

        public String getID() {
            return ID;
        }

        public String getName() {
            return Name;
        }

        public String getBirthday() {
            return Birthday;
        }

        public String getAddress() {
            return Address;
        }

        public int getGPA() {
            return GPA;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public void setBirthday(String birthday) {
            this.Birthday = birthday;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public void setGPA(int GPA) {
            this.GPA = GPA;
        }

        public void input() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter ID :");
            ID = input.nextLine();
            System.out.println("Enter Name :");
            Name = input.nextLine();
            System.out.println("Enter Birthday :");
            Birthday = input.nextLine();
            System.out.println("Enter Address :");
            Address = input.nextLine();
            System.out.println("Enter GPA :");
            try {
                String StrGPA = input.nextLine();
                GPA = Integer.parseInt(StrGPA);
            } catch (NumberFormatException ex) {
                System.err.println("GPA must be a number!");
                return;
            }

            System.out.println("Choose sex :");
            System.out.println("1.Male ");
            System.out.println("2.Female ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    Sex = Sex.MALE;
                    break;
                case 2:
                    Sex = Sex.FEMALE;
                    break;

            }
        }


    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", Address='" + Address + '\'' +
                ", Sex=" + Sex +
                ", GPA=" + GPA +
                '}';
    }
}
