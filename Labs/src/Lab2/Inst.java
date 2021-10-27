package Lab2;
public class Inst {
    public static void main(String[] vma) {
        Student student = new Student("Подпалый", "Данил", "БАП1801", 5);
        Aspirant aspirant = new Aspirant("Белов", "Никита", "БАП", 4, "Коптеры");
        Student un = new Aspirant("Мингалеев", "Марат", "БАП1801", 5, "Макдак");
        Student[] students = { student, aspirant, un };
        for (Student s : students)
            System.out.println("Сумма стипендии " + s.lastName+ ": " + s.getScholarship());
    }
    public static class Student {
        String firstName, lastName, group;
        double averageMark;
        public Student(String firstName, String lastName, String group, double averageMark) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.averageMark = averageMark;
        }
        int getScholarship() {
            return averageMark == 5 ? 1480 : 80;
        }
    }
    public static class Aspirant extends Student {
        String scientificWork;
        public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
            super(firstName, lastName, group, averageMark);
            this.scientificWork = scientificWork;
        }
        @Override
        public int getScholarship() {
            return averageMark == 4 ? 23750 : 0;
        }
    }
}
