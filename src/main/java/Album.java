import java.io.Serializable;

public class Album implements Serializable {
    private int id;
    private String artist;
    private String name;
    private int releaseDate;
    private String genre;
    private Double sales;


    public Album(){

    }

    public Album(int id, String artist, String name, int releaseDate, String genre, Double sales){
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.sales = sales;
    }

    public void Setid(int id){
        this.id = id;
    }

    public int GetId(){
        return this.id;
    }

    public void SetArtist(String artist){
        this.artist = artist;
    }

    public String GetArtist(){
        return this.artist;
    }
    public void SetName(String name){
        this.name = name;
    }

    public String GetName(){
        return this.name;
    }

    public void SetReleaseDate(int date){
        this.releaseDate = date;
    }

    public int GetReleaseDate(){
        return this.releaseDate;
    }
    public void SetGenre(String genre){
        this.genre = genre;
    }

    public String GetGenre(){
        return this.genre;
    }

    public void SetSales(double sales){
        this.sales = sales;
    }

    public double GetSales(){
        return this.sales;
    }

}
