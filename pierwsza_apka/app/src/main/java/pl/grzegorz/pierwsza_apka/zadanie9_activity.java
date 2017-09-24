package pl.grzegorz.pierwsza_apka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by uczen on 2017-09-24.
 */



public class zadanie9_activity extends AppCompatActivity {
    EditText edit2;
    EditText edit;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadanie_9);

        edit2 = (EditText) findViewById(R.id.haslo);
        edit = (EditText) findViewById(R.id.login);
        btn = (Button) findViewById(R.id.przycisk);





        btn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view){
            boolean CzyMogeLogowac = true;

                if(edit.getText().toString().isEmpty()){
                    edit.setError("Pole Login nie może być pusty!");
                }else{
                    edit.setError(null);}


                if(edit2.getText().toString().isEmpty()){
                    edit2.setError("Pole Hasło nie może być puste!");
                }else{
                    edit2.setError(null);}


                if(CzyMogeLogowac){
                    if(edit.getText().toString().equals("user")&&edit2.getText().toString().equals("qwe123")){
                        Toast.makeText(getApplicationContext(),"Zalogowano!", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Błędne dane logowania!", Toast.LENGTH_SHORT).show();}
                }

            }



        });







    }



}
