package com.ezyserv;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ezyserv.custome.CustomActivity;
import com.ezyserv.fragment.FragmentDrawer;

public class Main3Activity extends CustomActivity {
    private FragmentDrawer drawerFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }
}
