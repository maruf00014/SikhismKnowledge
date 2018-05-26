package com.sikhismknowledge.sikhismknowledge;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class FullImageActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {
    private int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        Toolbar gallerytoolbar = (Toolbar) findViewById(R.id.galleryToolbar);
        setSupportActionBar(gallerytoolbar);


        Intent i =getIntent();
        position = i.getExtras().getInt("id");
        ImageAdapter adapter = new ImageAdapter(this);

        ImageView image_View = findViewById(R.id.fullImageView);
        image_View.setImageResource(adapter.images[position]);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.gallery_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.share) {
            ImageAdapter adapter = new ImageAdapter(this);
            Uri imageUri = Uri.parse("android.resource://com.sikhismknowledge.sikhismknowledge/drawable/"+adapter.images[position]);
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("image/jpeg");
            intent.putExtra(android.content.Intent.EXTRA_STREAM,imageUri);
            Intent chooseer = Intent.createChooser(intent,"Send Image");
            startActivity(chooseer);

        }

        return super.onOptionsItemSelected(item);
    }

}


