public class People {
    protected String name;
    protected String lastname;
    protected int age;
    People(){
        name = "none";
        lastname = "none";
        age = 20;
    }
    People(String nameP, String lastnameP, int ageW){
        name = nameP;
        lastname = lastnameP;
        age = ageW;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    void walk(){
        System.out.println( name + " walk");
    }
    void voice(){
        System.out.println( name + " voice");
    }
    void run(){
        System.out.println( name + " run");
    }
}