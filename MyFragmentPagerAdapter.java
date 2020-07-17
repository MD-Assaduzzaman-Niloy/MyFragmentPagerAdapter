package com.example;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * the code is written by MD Assaduzzaman Niloy since 17/7/2020
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    /**
     * Declare Fragment type array for store all fragments
     */

    private Fragment[] fragments;

    public MyFragmentPagerAdapter(@NonNull FragmentManager fm,Fragment[] fragments) {
        super(fm);
        this.fragments = fragments;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }



}


