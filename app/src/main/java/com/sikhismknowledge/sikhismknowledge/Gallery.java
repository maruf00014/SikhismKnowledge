package com.sikhismknowledge.sikhismknowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();

        items.add(new ListItem(R.drawable.img1));
        items.add(new ListItem(R.drawable.img2));
        items.add(new ListItem(R.drawable.img3));
        items.add(new ListItem(R.drawable.img4));
        items.add(new ListItem(R.drawable.img5));
        items.add(new ListItem(R.drawable.img6));
        items.add(new ListItem(R.drawable.img7));
        items.add(new ListItem(R.drawable.img8));
        items.add(new ListItem(R.drawable.img9));
        items.add(new ListItem(R.drawable.img10));
        items.add(new ListItem(R.drawable.img11));
        items.add(new ListItem(R.drawable.img12));
        items.add(new ListItem(R.drawable.img13));
        items.add(new ListItem(R.drawable.img14));
        items.add(new ListItem(R.drawable.img15));
        items.add(new ListItem(R.drawable.img16));
        items.add(new ListItem(R.drawable.img17));
        items.add(new ListItem(R.drawable.img18));
        items.add(new ListItem(R.drawable.img19));
        items.add(new ListItem(R.drawable.img20));
        items.add(new ListItem(R.drawable.img21));
        items.add(new ListItem(R.drawable.img22));
        items.add(new ListItem(R.drawable.img23));
        items.add(new ListItem(R.drawable.img24));
        items.add(new ListItem(R.drawable.img25));
        items.add(new ListItem(R.drawable.img26));
        items.add(new ListItem(R.drawable.img27));
        items.add(new ListItem(R.drawable.img28));
        items.add(new ListItem(R.drawable.img29));
        items.add(new ListItem(R.drawable.img30));
        items.add(new ListItem(R.drawable.img31));
        items.add(new ListItem(R.drawable.img32));
        items.add(new ListItem(R.drawable.img33));
        items.add(new ListItem(R.drawable.img34));
        items.add(new ListItem(R.drawable.img35));
        items.add(new ListItem(R.drawable.img36));
        items.add(new ListItem(R.drawable.img37));
        items.add(new ListItem(R.drawable.img38));
        items.add(new ListItem(R.drawable.img39));
        items.add(new ListItem(R.drawable.img40));
        items.add(new ListItem(R.drawable.img41));
        items.add(new ListItem(R.drawable.img42));
        items.add(new ListItem(R.drawable.img43));
        items.add(new ListItem(R.drawable.img44));
        items.add(new ListItem(R.drawable.img45));




        ListItemAdaper listItemAdaper = new ListItemAdaper(this,items);

        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(listItemAdaper);
    }
}
