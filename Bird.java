public class Bird {
    private String birdName;
    private String birdNameInLatin;
    private int observation;

    public Bird(String name , String latin){//,int observation){
        this.birdName = name;
        this.birdNameInLatin = latin;
        //this.observation = observation;
    } 
    public void addObservation(){
        this.observation++;
    }
    public String getName(){
        return this.birdName;
    }
    public String toString(){
        return this.birdName+" ("+this.birdNameInLatin+"):"+this.observation+" observations";
    }
}
