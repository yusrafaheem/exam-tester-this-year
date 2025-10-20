public class Pear extends Fruit{ 

    private String shape; 

    public Pear(int grams, String shape){
        super(grams); 
        this.shape = shape;
    }

    public void cook (int sugar){ 
        grams = grams * 5 + sugar; 
    }

    public void slice(){ 
        grams = grams/2; 
    }

    public String toString(){ 
        return grams + "" + shape; 
    
    }
}