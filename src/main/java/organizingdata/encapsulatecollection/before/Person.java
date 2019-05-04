package organizingdata.encapsulatecollection.before;


import java.util.Set;

public class Person {
    private Set<Course> courses;

    public Set getCourses() {
        return courses;
    }

    public void setCourses(Set arg) {
        courses = arg;
    }
}
