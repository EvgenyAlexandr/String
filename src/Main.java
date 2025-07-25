
public class Main {
    public static void main(String[] args) {

        // Задача 1 - Формирование Ф.И.О.
        System.out.println("Задача 1");
        String firstName  = "Ivan";
        String middleName = "Ivanovich";
        String lastName   = "Ivanov";
        String fullName   = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);


        // Задача 2 - Преобразование в верхний регистр
        System.out.println("\nЗадача 2");
        String reportFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + reportFullName);


        // Задача 3: Замена буквы "ё"
        System.out.println("\nЗадача 3");
        fullName = "Иванов Семён Семёнович";
        String correctedName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedName);

    }
}