import model.*;
import util.ListSortable;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyen Van A", "a@stu.edu.vn");
        Student s2 = new Student("SV002", "Le Thi B", "b@stu.edu.vn");
        Student s3 = new Student("SV003", "Tran Van C", "c@stu.edu.vn");

        Teacher t1 = new Teacher("GV001", "Pham Van D", "d@uni.edu.vn", "Dr.");
        Advisor a1 = new Advisor("Nguyen Thi E", "e@company.com");
        Teacher t2 = new Teacher("GV002", "Hoang Van F", "f@uni.edu.vn", "Prof.");

        KLTN<Student, Teacher> kltn1 = new KLTN<>("AI-based Chess System", s1, t1);
        KLTN<Student, Advisor> kltn2 = new KLTN<>("Medical Image Classification", s2, a1);
        KLTN<Student, Teacher> kltn3 = new KLTN<>("Smart Traffic Control", s3, t2);

        ListSortable<KLTN<?, ?>> list = new ListSortable<>();
        list.add(kltn1);
        list.add(kltn2);
        list.add(kltn3);

        System.out.println("=== DANH SÁCH KLTN (SẮP XẾP THEO TÊN) ===");
        list.print();
    }
}
