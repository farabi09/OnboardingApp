package com.example.gigabyte.onboardingapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private ViewPager mSlideViewPager;
    private  SlideAdapter slideAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   mSlideViewPager= (ViewPager) findViewById(R.id.slideViewPager);

    slideAdapter = new SlideAdapter( this);
    mSlideViewPager.setAdapter(slideAdapter);

    }

   ViewPager.OnPageChangeListener viewListner = new ViewPager.OnPageChangeListener() {
       @Override
       public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

       }

       @Override
       public void onPageSelected(int position) {

       }

       @Override
       public void onPageScrollStateChanged(int state) {

       }
   }




}
