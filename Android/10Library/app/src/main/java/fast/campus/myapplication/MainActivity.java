package fast.campus.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        imageView1 = findViewById(R.id.image1);
        imageView2 = findViewById(R.id.image2);
        imageView3 = findViewById(R.id.image3);
        imageView4 = findViewById(R.id.image4);

        // 웹 이미지를 넣는 방법
        Glide.with(context)
                .load("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg")
                .into(imageView1);

        // option을 사용하는 방법
        RequestOptions cropOption = new RequestOptions().centerCrop();
        Glide.with(context)
                .load("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg")
                .apply(cropOption)
                .into(imageView2);

        RequestOptions circleCrop = new RequestOptions().circleCrop();
        Glide.with(context)
                .load("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg")
                .apply(circleCrop)
                .into(imageView3);

        // 로컬 이미지 불러오는 방법
        Glide.with(context)
                .load(R.drawable.ic_launcher_background)
                .into(imageView4);
    }
}
