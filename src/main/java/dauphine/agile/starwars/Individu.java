package dauphine.agile.starwars;

public class Individu implements IIndividu {

    private String  nom;
    private String  prenom;
    private String  faction;
    private Integer age = null;
    
    public Individu(String nom, String prenom, String faction) {
        this.nom = nom;
        this.prenom = prenom;
        this.faction = faction;
    }
    
    @Override
    public void faireDuSport()
    {
        System.out.println("Sautille sur lui meme");
    }

    @Override
    public void sePreparer()
    {
        System.out.println("ferme les yeux et souffle");
    }

    @Override
    public void agir()
    {
        System.out.println("ouvre les yeux et fais quelque chose");
    }

    @Override
    public int getAge()
    {
        return age;
    }

    @Override
    public void setAge(int age)
    {
        if (age < 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            this.age = age;
        }

    }

    @Override
    public String getNom()
    {
        return nom;
    }

    @Override
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    @Override
    public String getPrenom()
    {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    @Override
    public String getFaction()
    {
        return faction;
    }

    @Override
    public void setFaction(String faction)
    {
        this.faction = faction;
    }
}
