package Composite1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SchedulerComposite extends JobComponent {

    List<JobComponent> scheduledJobComponents;

    public SchedulerComposite(String name) {
        super(name);
        scheduledJobComponents = new LinkedList();
    }

    public void completeJob() {
        System.out.println("You have finished the job" + this.name);
    }

    public void addJob(JobComponent component) {
        scheduledJobComponents.add(component);
    }

    public void removeJob(JobComponent component) {
        scheduledJobComponents.remove(component);
    }
    public void listAllComponents(){
        for (JobComponent component : this.scheduledJobComponents) {
            component.completeJob();

            if (component instanceof SchedulerComposite){
                SchedulerComposite subTask = (SchedulerComposite)component;
                subTask.listAllComponents();
            }

        }
    }
}
