public class Berry extends Fruit{ 
    private boolean hasSeeds; 


    public Berry (int grams, boolean hasSeeds){ 
        super(grams);
        this.hasSeeds= hasSeeds; 
    }

    public void cook(int sugar){ 
        grams = grams*2 + sugar;
    }

    public void slice(){ 
        grams = grams/2; 

    }

    public String toString (){ 
        return grams + "" + hasSeeds; 
    }
}