public abstract class Pet {

    private String myName;

    public Pet(String name){
        myName = name;
    }

    public String getMyName() {
        return myName;
    }

    public abstract String speak();
}
