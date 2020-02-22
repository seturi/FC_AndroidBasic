package fast.campus.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String BUNDLE_KEY = "bundle_key";

    FragmentManager fragmentManager;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "Activity : onCreate");

        Fragment fragment1 = new Fragment1();
        Bundle bundle = new Bundle();
        bundle.putInt(BUNDLE_KEY, 10);
        fragment1.setArguments(bundle);

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, fragment1);      // 작업 1
        fragmentTransaction.commit();   // 확인

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, new Fragment2());
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d("LifeCycle", "Activity : onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("LifeCycle", "Activity : onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("LifeCycle", "Activity : onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.d("LifeCycle", "Activity : onDestroy");
        super.onDestroy();
    }
}
