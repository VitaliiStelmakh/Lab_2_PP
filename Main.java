package Main;
import java.util.Scanner;
import Abiturient.Abiturient;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скільки буде об'єктів буде введенно?");
        int counter = scanner.nextInt();
        Abiturient[] mass = new Abiturient[counter];
        add_elem(counter, mass, scanner);


        boolean wh = true;
        while (wh==true){
            System.out.println("Виберіть що зробити\n" +
                    "1 - вивести весь список об'єктів\n" +
                    "2 - список абітурієнтів із вказаним іменем;\n" +
                    "3 - список абітурієнтів, середній бал у яких вище заданого;\n" +
                    "4 - вибрати задане число n абітурієнтів, що мають найвищий середній бал\n" +
                    "0 - вийти з програми");

            int a = scanner.nextInt();
        switch (a) {
            case 1:
                vivod(mass);
                break;
            case 2:
                task1(mass, scanner);
                break;
            case 3:
                task2(mass, scanner);
                break;
            case 4:
                task3(mass, scanner);
                break;
            case 0:
                wh = false;
        }
        }
    }

    public static void add_elem(int count, Abiturient mass[], Scanner scanner) {
        for (int i = 0; i < count; i++) {
            mass[i] = new Abiturient();
            mass[i].setId(i + 1);
            System.out.println("Ім'я");
            mass[i].setName(scanner.next());
            System.out.println("Прізвище");
            mass[i].setSurname(scanner.next());
            System.out.println("По-батькові");
            mass[i].setPb(scanner.next());
            System.out.println("Адреса");
            mass[i].setAdress(scanner.next());
            System.out.println("Телефон");
            mass[i].setPhone(scanner.next());
            System.out.println("Середній бал");
            mass[i].setMark(scanner.nextDouble());
            System.out.println(i + 1 + "-й об'єкт додано");
        }

    }

    public static void vivod(Abiturient mass[]) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i].toString());
        }
    }

    public static void task1(Abiturient mass[], Scanner scanner) {
        System.out.println("Введіть ім'я");
        String name = scanner.next();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getName().equals(name))
                System.out.println(mass[i].toString());
        }
    }

    public static void task2(Abiturient mass[], Scanner scanner) {
        System.out.println("Введіть cередній бал");
        double mark = scanner.nextDouble();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getMark()>mark)
                System.out.println(mass[i].toString());
        }
    }
    public static void task3(Abiturient mass[], Scanner scanner)
    {
        Abiturient buf;
        for (int i = 0; i < mass.length-1; i++) {
            if(mass[i].getMark() < mass[i+1].getMark()){
                buf = mass[i];
                mass[i] = mass[i+1];
                mass[i+1] = buf;
            }}

             System.out.println("Cкільки абітурієнтів з найвищим балом вибрати?");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println(mass[i].toString());

            }
        }
    }


