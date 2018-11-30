package dauphine.agile.space;

public interface IAstronaut
{
    void piloter(Rocket rocket);
    
    String state();
    
    void changeState(String newState);
}
