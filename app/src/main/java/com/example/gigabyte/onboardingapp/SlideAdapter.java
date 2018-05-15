package com.example.gigabyte.onboardingapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by GIGABYTE on 5/16/2018.
 */

public class SlideAdapter  extends PagerAdapter{

    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapter(Context context){
        this.context=context;
    }

    public int[] slide_images = {

        R.drawable.eat_icon,
        R.drawable.sleep_icon,
            R.drawable.code_icon
    };

public  String[]  slide_headings = {

            "Food",
           "Sleep",
            "Code"
};

public String[]  slide_descrpt = {

     "Eat anything you want" ,
        "Sleep anytime you want",
        "Code anything you want"


};






    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return  view == (RelativeLayout) object;
    }



public  Object instantiateItem (ViewGroup container , int position)
{
   layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
   View view = layoutInflater.inflate(R.layout.slide_layout, container ,   false);
    ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
    TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
    TextView slideDescription = (TextView) view.findViewById(R.id.slide_descrpt);

   slideImageView.setImageResource(slide_images[position]);
   slideHeading.setText(slide_headings[position]);
    slideDescription.setText(slide_descrpt[position]);

    container.addView(view);
    return view;
}

public  void destriyItem(ViewGroup container, int position , Object o ){

        container.removeView((RelativeLayout)o);


}





}
