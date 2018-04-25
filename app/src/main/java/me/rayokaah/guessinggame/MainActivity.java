package me.rayokaah.guessinggame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    public int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG);
    }

    public void guess (View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        int guessInt = parseInt(editText.getText().toString());
        if (guessInt > randomNumber){
            makeToast("Go Lower!");
        }
        else if (guessInt< randomNumber){
            makeToast("Go Higher");
        }
        else {
            makeToast("That's right baby! Play again");
        }
    }
}
