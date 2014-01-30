package com.UG.data;

import com.UG.demo10.R;
import com.UG.fragments.FlagFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FlagPagerAdapter extends FragmentPagerAdapter {
	private int[] arrayFlags = new int[]{
			R.drawable.brasil,
			R.drawable.mexico,
			R.drawable.colombia,
			R.drawable.argentina,
			R.drawable.peru,
			R.drawable.venezuela,
			R.drawable.chile,
			R.drawable.ecuador,
			R.drawable.guatemala,
			R.drawable.cuba
	};
	
	public FlagPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = new FlagFragment();
		Bundle args = new Bundle();
		args.putInt(FlagFragment.RESOURCE, arrayFlags[position]);
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public int getCount() {
		return arrayFlags.length;
	}

}
