import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel(Cat cat, Dog dog, LoudDog loudDog){
        ArrayList mock = new ArrayList<Pet>();
        mock.add(cat);
        mock.add(dog);
        mock.add(loudDog);
        petList = mock;
    }

    public void allSpeak(){
        for(Pet p : petList)
            System.out.println(p.getMyName() + ": " + p.speak());
    }
}
