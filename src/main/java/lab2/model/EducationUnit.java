package lab2.model;

public abstract class EducationUnit {
    protected String title;
    protected Human manager;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Human getManager() {
        return manager;
    }

    public void setManager(Human manager) {
        this.manager = manager;
    }



}
