package com.example.windows.padc_week4_ex.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.windows.padc_week4_ex.R;
import com.example.windows.padc_week4_ex.fragments.FilmFragment;
import com.example.windows.padc_week4_ex.fragments.JobSearchFragment;
import com.example.windows.padc_week4_ex.fragments.LinkedInFragment;
import com.example.windows.padc_week4_ex.fragments.PulseFragment;
import com.example.windows.padc_week4_ex.fragments.WinZinFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        MenuItemCompat.OnActionExpandListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        Menu leftMenu = navigationView.getMenu();
        navigationView.setNavigationItemSelectedListener(this);
        navigatetoLinkedIn();
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onMenuItemActionExpand(MenuItem item) {
        return false;
    }

    @Override
    public boolean onMenuItemActionCollapse(MenuItem item) {
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(final MenuItem menuItem) {
        menuItem.setChecked(true);
        drawerLayout.closeDrawers();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                switch (menuItem.getItemId()){
                    case R.id.padc_linkedin:
                        navigatetoLinkedIn();
                        break;
                    case R.id.padc_jobsearch:
                        navigatetojobsearch();
                        break;
                    case R.id.drawer_pulse:
                          navigatetopulse();
                        break;
                    case R.id.padc_flim:
                        navigatetofilm();
                        break;
                    case R.id.padc_winzin:
                        navigatetowinzin();
                        break;
                }
            }
        },100);

        return true;
    }

    private void navigatetoLinkedIn()
    {
        LinkedInFragment linkedinfragment=LinkedInFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, linkedinfragment)
                .commit();
    }

    private void navigatetojobsearch()
    {
        JobSearchFragment jobsearchfragment=JobSearchFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, jobsearchfragment)
                .commit();
    }
    private  void navigatetofilm(){
        FilmFragment filmFragment=FilmFragment.newInstance();
        getSupportActionBar().setTitle(R.string.padc_film);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, filmFragment)
                .commit();
    }

    private void navigatetopulse()
    {
        PulseFragment pulsefragment=PulseFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, pulsefragment)
                .commit();
    }
    private void navigatetowinzin()
    {
        WinZinFragment winzinfragment=WinZinFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, winzinfragment)
                .commit();
    }
}
