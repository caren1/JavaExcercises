package Composite1;

public class FinalJobLeaf extends JobComponent {


    public void completeJob() {
        System.out.println("This job cannot be divided into smaller ones.");
    }

    public FinalJobLeaf(String name) {
        super(name);

    }
}
