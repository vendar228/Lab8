public class Lab8 {
    public static void main(String[] args) {
        People people =  new People("Conor","Diaz",30);
        people.walk();
        people.run();
        people.voice();
        Student student = new Student("jones","bones",32);
        student.walk();
        student.learn();
        Teacher teacher = new Teacher("Eddie","Poirier",34);
        teacher.voice();
        teacher.teach();
    }
}