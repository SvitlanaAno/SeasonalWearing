package com.example.perlovina.seasonalwearing;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SeasonalFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private final int PAGE_COUNT = 2;
    private int season;

    public SeasonalFragmentPagerAdapter(Context context, FragmentManager fm, int season) {
        super(fm);
        this.context = context;
        this.season = season;
    }

    @Override
    public Fragment getItem(int position) {
        switch (season) {
            case 0:
                return (position == 0) ? new SummerFragment() : new SummerRainyFragment();
            case 1:
                return (position == 0) ? new SpringFragment() : new SpringRainyFragment();
            case 2:
                return (position == 0) ? new WinterFragment() : new WinterRainyFragment();
            case 3:
                return (position == 0) ? new AutumnFragment() : new AutumnRainyFragment();
            default:
                return (position == 0) ? new SummerFragment() : new SummerRainyFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Sunny";
        } else {
            return "Rainy";
        }
    }

}
