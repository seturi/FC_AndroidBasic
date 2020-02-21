package fast.campus.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent commingIntent = getIntent();
        boolean again = commingIntent.getBooleanExtra("AGAIN", true);
        if(again == true) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);

            // Stack
            // Main
            // Third
            // Second
            // Main
        }
    }
}
