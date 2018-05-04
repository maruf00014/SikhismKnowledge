package com.sikhismknowledge.sikhismknowledge;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView quizImage,templeImage,historyImage,faqImage,galleryImage,
            shabadGurbani,websitePosts,newsImage,gurbaniImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        quizImage = findViewById(R.id.quiz_image);
        quizImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });


        historyImage = findViewById(R.id.history_image);
        historyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, SikhHistory.class);
                startActivity(intent);
            }
        });


       templeImage = findViewById(R.id.temple_image);
        templeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, GoldenTemple.class);
                startActivity(intent);
            }
        });

        faqImage = findViewById(R.id.ask_image);
        faqImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, AskQuestion.class);
                startActivity(intent);
            }
        });

        galleryImage = findViewById(R.id.gallery_image);
        galleryImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, Gallery.class);
                startActivity(intent);
            }
        });

        shabadGurbani = findViewById(R.id.shabad_image);
        shabadGurbani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, ShabadGurbani.class);
                startActivity(intent);
            }
        });

       websitePosts = findViewById(R.id.website_image);
        websitePosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, WebsitePosts.class);
                startActivity(intent);
            }
        });

        newsImage = findViewById(R.id.news_image);
        newsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, News.class);
                startActivity(intent);
            }
        });

        gurbaniImage = findViewById(R.id.gurbani_image);
        gurbaniImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, Gurbani.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.aboutThisApp) {
            Intent intent = new Intent(
                    MainActivity.this, AboutThisApp.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.sikMenu) {
            Intent intent = new Intent(
                    MainActivity.this, SikhHistory.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.goldenMenu) {
            Intent intent = new Intent(
                    MainActivity.this, GoldenTemple.class);
            startActivity(intent);

        } else if (id == R.id.gurbaniMenu) {
            Intent intent = new Intent(
                    MainActivity.this, Gurbani.class);
            startActivity(intent);

        } else if (id == R.id.shabadMenu) {
            Intent intent = new Intent(
                    MainActivity.this, ShabadGurbani.class);
            startActivity(intent);

        } else if (id == R.id.fagMenu) {
            Intent intent = new Intent(
                    MainActivity.this, AskQuestion.class);
            startActivity(intent);

        }else if (id == R.id.galleryMenu) {
            Intent intent = new Intent(
                    MainActivity.this, Gallery.class);
            startActivity(intent);

        }else if (id == R.id.websiteMenu) {
            Intent intent = new Intent(
                    MainActivity.this, WebsitePosts.class);
            startActivity(intent);

        }else if (id == R.id.quizMenu) {
            Intent intent = new Intent(
                    MainActivity.this, QuizActivity.class);
            startActivity(intent);

        }else if (id == R.id.newsMenu) {
            Intent intent = new Intent(
                    MainActivity.this, News.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
