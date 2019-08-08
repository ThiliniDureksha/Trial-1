package com.example.thilini_feedback_handeling;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class tabLayout extends FragmentPagerAdapter {

    private int tabcount;

    public tabLayout(FragmentManager fm, int tabcount){
        super(fm);
        this.tabcount = tabcount;
    }
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new ADD_complain_Fragment();
            case 1:
                return new View_complain_Fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }

}
