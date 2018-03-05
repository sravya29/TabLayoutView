package sravya.example.com.tablayoutview;

/**
 * Created by SRAVYA on 02-03-2018.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        return TabFragment.getInstance(position);
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}