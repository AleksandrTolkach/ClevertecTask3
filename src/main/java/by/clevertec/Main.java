package by.clevertec;

import by.clevertec.collector.CarsCollector;
import by.clevertec.model.Animal;
import by.clevertec.model.Car;
import by.clevertec.model.Examination;
import by.clevertec.model.Flower;
import by.clevertec.model.House;
import by.clevertec.model.Person;
import by.clevertec.model.Student;
import by.clevertec.util.Util;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
    }

    public static void task1() {
        List<Animal> animals = Util.getAnimals();
        animals.stream()
            .filter(a -> a.getAge() >= 10 && a.getAge() <= 20)
            .sorted(Comparator.comparing(Animal::getAge))
            .skip(14)
            .limit(7)
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }

    public static void task2() {
        List<Animal> animals = Util.getAnimals();
        animals.stream()
            .filter(a -> a.getOrigin().equals("Japanese"))
            .peek(a -> a.setOrigin(a.getOrigin().toUpperCase()))
            .filter(a -> a.getGender().equals("Female"))
            .map(Animal::getBread)
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }

    public static void task3() {
        List<Animal> animals = Util.getAnimals();
        animals.stream()
            .filter(a -> a.getAge() > 30 && a.getOrigin().startsWith("A"))
            .map(Animal::getOrigin)
            .collect(Collectors.toSet())
            .forEach(System.out::println);
    }

    public static void task4() {
        List<Animal> animals = Util.getAnimals();
        System.out.println(animals.stream()
            .filter(a -> a.getGender().equals("Female"))
            .count());
    }

    public static void task5() {
        List<Animal> animals = Util.getAnimals();
        System.out.println(animals.stream()
            .anyMatch(a -> a.getAge() >= 20 && a.getAge() <= 30
                && a.getOrigin().equals("Hungarian")));
    }

    public static void task6() {
        List<Animal> animals = Util.getAnimals();
        System.out.println(animals.stream()
            .allMatch(a -> a.getGender().equals("Male") && a.getGender().equals("Female")));
    }

    public static void task7() {
        List<Animal> animals = Util.getAnimals();
        System.out.println(animals.stream()
            .noneMatch(a -> a.getOrigin().equals("Oceania")));
    }

    public static void task8() {
        List<Animal> animals = Util.getAnimals();
        System.out.println(animals.stream()
            .sorted(Comparator.comparing(Animal::getBread))
            .limit(100)
            .max(Comparator.comparing(Animal::getAge))
            .map(Animal::getAge)
            .orElse(null));
    }

    public static void task9() {
        List<Animal> animals = Util.getAnimals();
        System.out.println(animals.stream()
            .map(Animal::getBread)
            .map(String::toCharArray)
            .min(Comparator.comparingInt(c -> c.length))
            .orElse(null));
    }

    public static void task10() {
        List<Animal> animals = Util.getAnimals();
        System.out.println(animals.stream()
            .map(Animal::getAge)
            .mapToLong(Integer::intValue)
            .sum());
    }

    public static void task11() {
        List<Animal> animals = Util.getAnimals();
        System.out.println(animals.stream()
            .filter(a -> a.getOrigin().equals("Indonesian"))
            .map(Animal::getAge)
            .mapToLong(Integer::intValue)
            .average().orElse(0D));
    }

    public static void task12() {
        List<Person> persons = Util.getPersons();
        persons.stream()
            .filter(r -> r.getGender().equals("Male"))
            .filter(r -> (LocalDate.now().getYear() - r.getDateOfBirth().getYear()) >= 18 &&
                (LocalDate.now().getYear() - r.getDateOfBirth().getYear() < 27))
            .sorted(Comparator.comparingInt(Person::getRecruitmentGroup))
            .limit(200)
            .forEach(System.out::println);
    }

    public static void task13() {
        List<House> houses = Util.getHouses();
        houses.stream()
            .flatMap(house -> house.getPersonList().stream()
                .map(person -> Map.entry(house.getBuildingType(), person)))
            .sorted(Comparator.comparing(e -> e.getKey().equals("Hospital")
                ? -1 : ((LocalDate.now().getYear()) - e.getValue().getDateOfBirth().getYear()) < 18
                || ((LocalDate.now().getYear()) - e.getValue().getDateOfBirth().getYear() > 60)
                ? 0 : 1))
            .limit(500)
            .forEach(e -> System.out.println(e.getValue()));
    }

    public static void task14() {
        List<Car> cars = Util.getCars();
        System.out.println("Общая выручка = " + cars.stream()
            .collect(CarsCollector.toPriceMap())
            .entrySet().stream()
            .peek(e -> System.out.printf("%s = %s%n", e.getKey(), e.getValue()))
            .mapToDouble(e -> e.getValue())
            .sum());
    }

    public static void task15() {
        List<Flower> flowers = Util.getFlowers();
        System.out.println(flowers.stream()
            .sorted(Comparator.comparing(Flower::getOrigin).reversed()
                .thenComparing(Flower::getPrice)
                .thenComparing(Flower::getWaterConsumptionPerDay).reversed())
            .filter(f -> f.getCommonName().matches("[C-S].*"))
            .filter(f -> f.isShadePreferred() && (f.getFlowerVaseMaterial().contains("Aluminum")
                || f.getFlowerVaseMaterial().contains("Steel")))
            .mapToDouble(f -> (f.getPrice() + (f.getWaterConsumptionPerDay() * 1.39) * 5))
            .sum());
    }

    public static void task16() {
        List<Student> students = Util.getStudents();
        students.stream()
            .filter(s -> s.getAge() < 18)
            .sorted(Comparator.comparing(Student::getSurname))
            .forEach(s -> System.out.printf("%s - %s %n", s.getSurname(), s.getAge()));
    }

    public static void task17() {
        List<Student> students = Util.getStudents();
        students.stream()
            .map(Student::getGroup)
            .distinct()
            .forEach(System.out::println);
    }

    public static void task18() {
        List<Student> students = Util.getStudents();
        List<Examination> examinations = Util.getExaminations();
        System.out.println(students.stream()
            .filter(student -> examinations.stream()
                .anyMatch(exam -> exam.getExam3() > 4 && exam.getStudentId() == student.getId()))
            .collect(Collectors.groupingBy(Student::getGroup, Collectors.toList())));
    }

    public static void task19() {
        List<Student> students = Util.getStudents();
        students.stream()
            .collect(Collectors.groupingBy(Student::getFaculty,
                Collectors.averagingInt(Student::getAge)))
            .entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .forEach(e -> System.out.printf("%s - %s%n", e.getKey(), e.getValue()));
    }

    public static void task20() {
        List<Student> students = Util.getStudents();
        List<Examination> examinations = Util.getExaminations();
        System.out.println(students.stream()
            .collect(Collectors.groupingBy(Student::getFaculty, Collectors.toList()))
            .entrySet().stream()
            .map(entry -> Map.entry(entry.getKey(), entry.getValue().stream()
                .mapToInt(student -> examinations.stream()
                    .filter(exam -> exam.getStudentId() == student.getId())
                    .mapToInt(Examination::getExam1)
                    .findFirst()
                    .orElse(0))
                .average()
                .orElse(0)))
            .max(Entry.comparingByValue())
            .orElse(null));
    }

    public static void task21() {
        List<Student> students = Util.getStudents();
        students.stream()
            .collect(Collectors.groupingBy(Student::getGroup, Collectors.counting()))
            .entrySet()
            .forEach(System.out::println);
    }

    public static void task22() {
        List<Student> students = Util.getStudents();
        students.stream()
            .collect(Collectors.groupingBy(Student::getFaculty,
                Collectors.minBy(Comparator.comparingInt(Student::getAge))))
            .entrySet()
            .forEach(e -> System.out.printf("%s = %s%n", e.getKey(), e.getValue()
                .orElse(null).getAge()));
    }
}
