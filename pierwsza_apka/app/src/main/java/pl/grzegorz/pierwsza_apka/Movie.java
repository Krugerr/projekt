package pl.grzegorz.pierwsza_apka;

/**
 * Created by uczen on 2017-09-24.
 */

public class Movie{
    private String title;
    private int lenght;

    public Movie(String title, int lenght){
        this.setTitle(title);
        this.setLenght(lenght);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
