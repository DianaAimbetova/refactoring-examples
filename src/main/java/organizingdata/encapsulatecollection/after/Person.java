package organizingdata.encapsulatecollection.after;

import org.junit.Assert;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
    private Set<Course> courses = new HashSet();;

    public Set getCourses() {
        return Collections.unmodifiableSet(courses);
    }

    public void initializeCourses(Set arg) {
        Assert.assertTrue(courses.isEmpty());
        courses.addAll(arg);
    }

    public void addCourse (Course arg) {
        courses.add(arg);
    }
    public void removeCourse (Course arg) {
        courses.remove(arg);
    }


}
