package pl.grzegorz.pierwsza_apka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadanie_szoste);

        text = (TextView) findViewById(R.id.text);
        String napis = text.getText().toString();

        lista = new LinkedList<>();
        lista.add(film1);
        lista.add(film2);
        lista.add(film3);
        lista.add(film4);
        lista.add(film5);
        lista.add(film6);
        lista.add(film7);

        for(int i=0;i<lista.size(); i++){
           text.append("TYTUL: " + lista.get(i).getTitle() + ", DLUGOSC: " + lista.get(i).getLenght() + "min" + "\n");
        }


    }

    Movie film1 = new Movie("Fajny film", 154);
    Movie film2 = new Movie("Kolejny fajny film", 250);
    Movie film3 = new Movie("Inny fajny film", 134);
    Movie film4 = new Movie("Następny fajny film", 114);
    Movie film5 = new Movie("I jeszcze fajny film", 180);
    Movie film6 = new Movie("Cholera, fajny film", 224);
    Movie film7 = new Movie("Naprawdę fajny film", 194);

    LinkedList<Movie> lista;

}
