public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("Mark", "Soro", 2024, 4.0, "Software Engineering");
        Student studentB = new Student("Rachael", "Green", 2024, 3.8, "Fashion Marketing");

        System.out.println(studentA.firstName);
        System.out.println(studentB.firstName);
        System.out.println(studentB.expectedYearToGraduate);
        studentB.incrementExpectedGraduationYear();
        System.out.println(studentB.expectedYearToGraduate);
    }
}