package pager.pager.pager;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public PagerAdapter(FragmentManager fragmentManager, int tabCount){
        super(fragmentManager);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: {
                FragmentOne fragmentOne = new FragmentOne();
                return fragmentOne;
            }
            case 1: {
                FragmentTwo fragmentTwo = new FragmentTwo();
                return fragmentTwo;
            }
            case 3: {
                FragmentThree fragmentThree = new FragmentThree();
                return fragmentThree;
            }
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
