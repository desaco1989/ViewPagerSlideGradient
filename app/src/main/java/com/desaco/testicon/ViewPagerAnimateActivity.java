package com.desaco.testicon;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.desaco.testicon.widgets.LineTabIndicator;

import java.util.ArrayList;

/**
 * Created by desaco on 2018/10/8.
 *
 * https://github.com/astuetz/PagerSlidingTabStrip
 * https://blog.csdn.net/xielinhua88/article/details/51280576
 * https://github.com/jfeinstein10/JazzyViewPager
 *
 * <p>
 * ViewPagerAnimateActivity
 */

public class ViewPagerAnimateActivity extends FragmentActivity {

    private static final int CHANNELREQUEST = 1;
//    private static String[] TITLES = {"首页", "第二页", "末尾"};
    //    private ArrayList<ChannelItem> userChannelList;
    private ImageView button_more_columns;
    private LineTabIndicator lineTabIndicator;
    private MyPagerAdapter adapter;
    private int count;
    private ViewPager viewpager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager_animate);

//        initData();
        initViews();
    }

    private void initViews() {
        lineTabIndicator = (LineTabIndicator) findViewById(R.id.lineTab);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
//        button_more_columns = (ImageView) findViewById(R.id.button_more_columns);
//        button_more_columns.setOnClickListener(this);
//        adapter = new MyPagerAdapter();//getFragmentManager()
        adapter = new MyPagerAdapter(getSupportFragmentManager());//getChildFragmentManager()   getFragmentManager()
        viewpager.setAdapter(adapter);
        lineTabIndicator.setViewPager(viewpager,52);//TODO 设置ViewPager tab字体大小
        //滑动监听
        viewpager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (lineTabIndicator.isClickTo) {
                        lineTabIndicator.isClickTo = false;
                    }
                }
                return false;
            }
        });
    }

    public class MyPagerAdapter extends FragmentPagerAdapter {//FragmentPagerAdapter
        //,"Top Free", "Top Grossing", "Top New Paid","Top New Free", "Trending"
        private final String[] TITLES = {"Categories", "财经眼", "锐科技","Top Grossing", "直播", "军事"};
//        private final String[] TITLES = {"111", "222", "333","444"};

        public MyPagerAdapter(FragmentManager fm) {//FragmentManager
            super(fm);
        }


        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }

        @Override
        public int getCount() {
            return TITLES.length;
        }

        @Override
        public Fragment getItem(int position) {
            return SuperAwesomeCardFragment.newInstance(position);
        }

    }
    public void data(){
        PropertyValuesHolder ph;
        ObjectAnimator.ofFloat(lineTabIndicator, "translationX", 0f,200f)
                .setDuration(2000)
                .start();
    }
}
