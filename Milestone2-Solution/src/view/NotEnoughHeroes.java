package view;

public class NotEnoughHeroes extends Exception{
    public NotEnoughHeroes(){
        super();
    }
    public NotEnoughHeroes (String x){
        super(x);
    }
}
