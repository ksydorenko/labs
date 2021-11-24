package lab2.model;

import java.util.List;
import java.util.Objects;

public class University extends EducationUnit {
    private List<Faculty> faculties;

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculties);
    }

    @Override
    public String toString() {
        return "University " + title + '\'' +
                ", manager's name is " + manager +
                ", faculties names are " + faculties +
                '.';
    }
}
