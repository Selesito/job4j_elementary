package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Иванов");
        student.setName("Иван");
        student.setPatronymic("Иванович");
        student.setGroup("Дизайнеров");
        student.setEntrance(23);
        System.out.println(student.getSurname()  + " "
                + student.getName() + " " + student.getPatronymic()
                + " поступил в группу " + student.getGroup()
                + " номер " + student.getEntrance());
    }
}