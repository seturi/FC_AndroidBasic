package phone.book.phonebook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PhoneBook> phoneBookList;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);

        PhoneBook phoneBook1 = new PhoneBook("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg",
                "홍길동", "010-0000-0001");
        PhoneBook phoneBook2 = new PhoneBook("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg",
                "홍길동", "010-0000-0001");
        PhoneBook phoneBook3 = new PhoneBook("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg",
                "홍길동", "010-0000-0001");
        PhoneBook phoneBook4 = new PhoneBook("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg",
                "홍길동", "010-0000-0001");
        PhoneBook phoneBook5 = new PhoneBook("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg",
                "홍길동", "010-0000-0001");
        PhoneBook phoneBook6 = new PhoneBook("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg",
                "홍길동", "010-0000-0001");
        PhoneBook phoneBook7 = new PhoneBook("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg",
                "홍길동", "010-0000-0001");
        PhoneBook phoneBook8 = new PhoneBook("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg",
                "홍길동", "010-0000-0001");
        PhoneBook phoneBook9 = new PhoneBook("https://laftelimage.blob.core.windows.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg",
                "홍길동", "010-0000-0001");

        phoneBookList = new ArrayList<>();
        phoneBookList.add(phoneBook1);
        phoneBookList.add(phoneBook2);
        phoneBookList.add(phoneBook3);
        phoneBookList.add(phoneBook4);
        phoneBookList.add(phoneBook5);
        phoneBookList.add(phoneBook6);
        phoneBookList.add(phoneBook7);
        phoneBookList.add(phoneBook8);
        phoneBookList.add(phoneBook9);

        LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
        for(int i = 0; i < phoneBookList.size(); i++){
            View view = layoutInflater.inflate(R.layout.phonebook_item_view, null, false);
            TextView name = view.findViewById(R.id.name);
            TextView number = view.findViewById(R.id.number);
            ImageView imageView = view.findViewById(R.id.imageView);

            name.setText(phoneBookList.get(i).name);
            number.setText(phoneBookList.get(i).number);
            RequestOptions circleOption = new RequestOptions().circleCrop();
            Glide.with(MainActivity.this)
                    .load(phoneBookList.get(i).image)
                    .apply(circleOption)
                    .into(imageView);

            container.addView(view);

        }

    }
}

