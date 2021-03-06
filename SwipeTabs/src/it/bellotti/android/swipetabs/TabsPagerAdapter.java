package it.bellotti.android.swipetabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter{

	private final static int PAGES_COUNT = 3;
	
	//Constructor
	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

        switch (index) {
        case 0:
            // TabOne fragment activity
            return new HomeFragment();
        case 1:
            // TabTwo fragment activity
            return new StatisticsFragment();
        case 2:
            // TabThree fragment activity
            return new TabThree();
        }
		
		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return PAGES_COUNT;
	}

}
