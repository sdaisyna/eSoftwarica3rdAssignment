package com.daisyna.esoftwarica.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.daisyna.esoftwarica.R;
import com.daisyna.esoftwarica.model.Students;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Display extends AppCompatActivity {

    public static List<Students> lstStudents=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        getSupportActionBar().hide();

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);



        lstStudents.add(new Students("Daisyna Shrestha", "Kathmandu", "Female", 22, R.drawable.female));
        lstStudents.add(new Students("Rupesh Dhakal", "Kathmandu", "Male", 21, R.drawable.male));
        lstStudents.add(new Students("Sobit Khadka", "Kathmandu", "Others", 81, R.drawable.others));

    }
}
