public abstract class Fruit implements Comparable<Fruit>{

    public static int count = 0; 
    protected int grams; 

    public Fruit (int grams){ 
        this.grams = grams; 
        count++;
    }

    public int getGrams(){ 
        return grams;
    }

    public void setGrams(int grams){ 
        this.grams = grams; 
    }

    public abstract void cook(int sugar); 
    public abstract void slice(); 

    @Override 
    public int compareTo(Fruit other){ 
        return Integer.compare(this.grams, other.grams);
    }
}