package com.yuesth.chatkito;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        tabAdapter tabadapter = new tabAdapter(getSupportFragmentManager());

        tabadapter.addFragment(new contactFragment(), "");
        tabadapter.addFragment(new chatFragment(), "");
        tabadapter.addFragment(new exploreFragment(), "");

        viewPager.setAdapter(tabadapter);
        tabLayout.setupWithViewPager(viewPager);

        //add icon
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_contact);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_chat);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_explore);

    }
}
