package Composite1;

public abstract class JobComponent {
    public String name;

    public JobComponent(String name) {
        this.name = name;
    }

    public abstract void completeJob();
}
