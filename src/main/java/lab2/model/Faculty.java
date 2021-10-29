package lab2.model;

import java.util.List;
import java.util.Objects;

public class Faculty extends EducationUnit{
    private List<Chair> chairs;

    public List<Chair> getChairs() {
        return chairs;
    }

    public void setChairs(List<Chair> chairs) {
        this.chairs = chairs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(chairs, faculty.chairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chairs);
    }

    @Override
    public String toString() {
        return "\nFaculty name is"  + title + '\'' +
                ", manager's name is" + manager +
                ", chairs names are" + chairs +
                '.';
    }
}
