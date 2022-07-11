import java.util.ArrayList;
import java.util.Scanner;
public class UI {
    private Scanner scanner;
    private ArrayList<Bird> birdsList;

    public UI(Scanner scanner){
        this.scanner = scanner;
        this.birdsList = new ArrayList<>();
    }
    public void start(){
        while(true){
            System.out.print("? ");
            String command = this.scanner.nextLine();
            if(command.equals("Quit")){
                break;
            }
            commandProcessor(command);
            //System.out.println("");
        }
    }
    public void commandProcessor(String command){
        if(command.equals("Add")){
            //System.out.println("");
            System.out.print("Name: ");
            String nameOfBird = scanner.nextLine();
            System.out.print("Name in latin: ");
            String nameInLatin = scanner.nextLine();
            if(!(birdsList.contains(nameOfBird))){
                birdsList.add(new Bird(nameOfBird, nameInLatin));
            }
        }
        //System.out.println("");
        if(command.equals("Observation")){
            //System.out.println("");
            System.out.print("Bird?");
            String nameOfBird = scanner.nextLine();
            //System.out.println("");
            //if(!(birdsList.contains(nameOfBird))){
            //    System.out.println("Not a bird!");
            //} else {
            
            //}
            boolean found = false;
            for (Bird i : birdsList){
                //boolean found = false;
                if(i.getName().equals(nameOfBird)){
                    found = true;
                    i.addObservation();
                    //System.out.println();
                }
                //if(found == false){
                //    System.out.println("Not a bird!");
                //}
            }
            if(found == false){
                System.out.println("Not a bird!");
            }
        }
        if(command.equals("All")){
            for(Bird i : birdsList){
                System.out.println(i);
            }
            //System.out.println("");

            
        }
        if(command.equals("One")){
            System.out.print("Bird? ");
            String nameOfBird = scanner.nextLine();
            for(Bird i : birdsList){
                if(nameOfBird.equals(i.getName())){
                    System.out.println(i);
                }
            }
        }
    }
}
