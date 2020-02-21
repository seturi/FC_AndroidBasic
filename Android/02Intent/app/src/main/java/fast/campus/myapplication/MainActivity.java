package fast.campus.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    int REQUEST_CODE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //명시적 Intent
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("INTENT_KEY", 5);
        intent.putExtra("INTENT_KEY_STRING", "STRING");
        startActivityForResult(intent, REQUEST_CODE);
        // 암시적 Intent
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
//        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if(resultCode == 200){
                String result = data.getStringExtra("RESULT");
                Log.d("OnActivityResult", "result: " + result);
            } else if (resultCode == 300){
                Log.d("OnActivityResult", "실패");
            }
        }
    }

    @Override
    protected void onStart() {
        Log.d("lifecycle","1 : onStart");
        super.onStart();
    }
    @Override
    protected void onRestart() {
        Log.d("lifecycle","1 : onRestart");
        super.onRestart();
    }
    @Override
    protected void onResume() {
        Log.d("lifecycle","1 : onResume");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("lifecycle","1 : onPause");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("lifecycle","1 : onStop");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("lifecycle","1 : onDestroy");
        super.onDestroy();
    }

}
