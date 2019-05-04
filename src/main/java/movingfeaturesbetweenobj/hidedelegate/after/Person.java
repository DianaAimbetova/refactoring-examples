package movingfeaturesbetweenobj.hidedelegate.after;

public class Person {
        Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        return department.getManager();
    }
    }
