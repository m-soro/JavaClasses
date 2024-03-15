public class Student {

//    properties
    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double gpa;
    String declaredMajor;

//    constructor
    public Student(String firstName, String lastName, int expectedYearToGraduate, double gpa, String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    };

//    method
//    public Integer incrementExpectedGraduationYear(){
//        this.expectedYearToGraduate++;
//        return expectedYearToGraduate;
//    };

    public void incrementExpectedGraduationYear(){
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;

    };

}
