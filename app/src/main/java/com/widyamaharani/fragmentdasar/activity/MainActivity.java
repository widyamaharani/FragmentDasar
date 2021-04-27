package com.widyamaharani.fragmentdasar.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.widyamaharani.fragmentdasar.R;
import com.widyamaharani.fragmentdasar.fragment.About;
import com.widyamaharani.fragmentdasar.fragment.Dashboard;
import com.widyamaharani.fragmentdasar.fragment.Help;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button button, bDashboard, bAbout, bHelp, bExit;

    Dashboard fragmentDashboard;
    About fragmentAbout;
    Help fragmentHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bDashboard = findViewById(R.id.b_dashboard);
        bAbout = findViewById(R.id.b_about);
        bHelp = findViewById(R.id.b_help);
        bExit = findViewById(R.id.b_exit);

        bDashboard.setOnClickListener(this);
        bAbout.setOnClickListener(this);
        bHelp.setOnClickListener(this);
        bExit.setOnClickListener(this);
    }

    void menuDashboard() {
        fragmentDashboard = new Dashboard();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentDashboard);
        ft.commit();
    }

    void menuAbout() {
        fragmentAbout = new About();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentAbout);
        ft.commit();
    }

    void menuHelp() {
        fragmentHelp = new Help();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHelp);
        ft.commit();
    }

    void menuExit() {
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == bDashboard) {
            menuDashboard();
        }
        if (v == bAbout) {
            menuAbout();
        }
        if (v == bHelp) {
            menuHelp();
        }
        if (v == bExit) {
            menuExit();
        }
    }
}