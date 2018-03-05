package sravya.example.com.tablayoutview;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private final int numOfPages = 4; //viewpager has 4 pages
    public final String[] pageTitle = {"Challengica", "AWalkInTheDark", "BeyCode", "TechTrix","Cryptothon","Anwesha","CriminalCase","AeroplaneChess","KnockOffTournament","Deal-NoDeal","Dextra","AlPatchino","PaperPresentation","PosterPresentation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        for (int i = 0; i < 14; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(pageTitle[i]));
        }

        //set gravity for tab bar
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), 14);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(onTabSelectedListener(viewPager));
    }

    private TabLayout.OnTabSelectedListener onTabSelectedListener(final ViewPager pager) {
        return new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        };
    }
}
