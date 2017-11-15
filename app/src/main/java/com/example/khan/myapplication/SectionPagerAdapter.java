package com.example.khan.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by KHAN on 11/14/2017.
 */

class SectionPagerAdapter extends FragmentPagerAdapter {
    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                Messages messages = new Messages();
                return messages;
            case 1:
                Maps maps = new Maps();
                return maps;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position)
        {
            case 0:
                 return "Messages";
            case 1:
                return "Maps";
            default :
                return null;
        }
    }
}
