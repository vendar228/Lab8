public class Student extends People{
    Student(String nameP, String lastnameP, int ageP){
        super(nameP,lastnameP,ageP);
    }

    @Override
    void walk(){
        System.out.println( name + " A.");
    }
    void learn(){
        System.out.println( name + " B");
    }
}