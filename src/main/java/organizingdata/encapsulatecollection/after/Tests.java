package organizingdata.encapsulatecollection.after;

public class Tests {
    public static void main(String[] args) {
        Person person = new Person();
        person.addCourse(new Course("test",true));
        System.out.println(person.getCourses());
    }
}
