package com.example.thilini_feedback_handeling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

public class Complain_activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    tabLayout tabLayoutAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_activity);

        tabLayout=findViewById(R.id.tab);
        viewPager= findViewById(R.id.viwetab);

        tabLayout.addTab(tabLayout.newTab().setText("Add Complain"));
        tabLayout.addTab(tabLayout.newTab().setText("View Complains"));

                tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        tabLayoutAdapter=new tabLayout(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(tabLayoutAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}
