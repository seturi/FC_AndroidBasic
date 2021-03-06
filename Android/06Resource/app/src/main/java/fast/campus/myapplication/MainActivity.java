package fast.campus.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml의 뷰 컴포넌트를 자바로 가져오는 방법
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        // xml의 뷰 컴포넌트를 동적으로 변경하는 방법
        imageView.setImageResource(R.drawable.blueflag);
        textView.setText("안녕하세요");

        // Res에 정의된 string 가져오는 방법
        String content = getApplicationContext().getResources().getString(R.string.long_text);
        textView.setText(content);

        // Res에 정의된 string-array를 가져오는 방법
        getApplicationContext().getResources().getStringArray(R.array.string_array);
        Log.d("string_array", getApplicationContext().getResources().getStringArray(R.array.string_array)[1]);

    }
}
