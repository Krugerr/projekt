package pl.grzegorz.pierwsza_apka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by uczen on 2017-09-24.
 */



public class zadanie7_activiti extends AppCompatActivity {

    private EditText Edyt;
    private Button Przycisk;
    private TextView Edyt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadanie_siodme);

        Edyt = (EditText) findViewById(R.id.Edyt);
        Przycisk = (Button) findViewById(R.id.Przycisk);
        Edyt2 = (TextView) findViewById(R.id.Edyt2);

        Przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String a = Edyt.getText().toString();

                Edyt2.setText(a);
            }
        });



    }
}
