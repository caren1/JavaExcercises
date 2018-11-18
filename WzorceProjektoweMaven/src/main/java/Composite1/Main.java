package Composite1;

public class Main {
    public static void main(String[] args) {

        //diagramy wzorców projektowych
        //pełne strzałki to zawieranie
        //puste to dziedziczenie


        SchedulerComposite mondayScheduler = new SchedulerComposite(" Monday Scheduler");
        SchedulerComposite breakfast = new SchedulerComposite(" Breakfast");

        SchedulerComposite friedEggs = new SchedulerComposite(" Fried eggs");
        SchedulerComposite madeCoffee = new SchedulerComposite(" Made Coffee");
        FinalJobLeaf readNewspaper = new FinalJobLeaf(" Read Newspaper");

        breakfast.addJob(friedEggs);
        breakfast.addJob(madeCoffee);
        breakfast.addJob(readNewspaper);

        ///////////////////////////////////////////////////////

        SchedulerComposite lunch = new SchedulerComposite(" Lunch");

        SchedulerComposite madeSteak = new SchedulerComposite(" Made Steak");
        SchedulerComposite boiledPotato = new SchedulerComposite(" Boiled Potato");
        FinalJobLeaf openSalad = new FinalJobLeaf(" Open Salad");

        lunch.addJob(madeSteak);
        lunch.addJob(boiledPotato);
        lunch.addJob(openSalad);

        mondayScheduler.addJob(breakfast);
        mondayScheduler.addJob(lunch);
        mondayScheduler.listAllComponents();
    }
}
