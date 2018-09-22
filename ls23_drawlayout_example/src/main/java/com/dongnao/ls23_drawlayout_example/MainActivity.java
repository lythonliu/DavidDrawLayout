package com.dongnao.ls23_drawlayout_example;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements DrawerLayout.DrawerListener{

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        drawerLayout.setDrawerShadow(R.mipmap.ic_launcher, GravityCompat.START);
        drawerLayout.setDrawerShadow(null, GravityCompat.END);
        drawerLayout.addDrawerListener(this);
    }

    public void close(View view) {
//        drawerLayout.closeDrawer(GravityCompat.START);
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_OPEN,GravityCompat.START);
        Snackbar.make(view, "消息内容", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
        Log.i("tuch", "  drawerView  " + drawerView + " slideOffset " + slideOffset);
    }

    @Override
    public void onDrawerOpened(View drawerView) {
        Log.i("tuch", " 打开   drawerView  " + drawerView  );
    }

    @Override
    public void onDrawerClosed(View drawerView) {
        Log.i("tuch", " 关闭 drawerView  " + drawerView  );
    }

    @Override
    public void onDrawerStateChanged(int newState) {
        Log.i("tuch", " newState  " + newState  );
    }
}
