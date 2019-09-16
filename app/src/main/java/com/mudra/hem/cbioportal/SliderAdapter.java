package com.mudra.hem.cbioportal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;

    }

    //arrays

    public int[] slide_images = {
            R.drawable.logo,
            R.drawable.cbioportal_logo,
            R.drawable.handheld_main
    };

    public String[] slide_headings = {

            "SATHYABAMA INSTITUTE OF SCIENCE AND TECHNOLOGY",
            "Cancer Genomics on cBioPortal",
            "The complete walk-through on an application"
    };

    public String[] slide_descs = {
            "This is an initiative by an under grad from the department of Bioinformatics.",
            "This application gives you complete guide to accessing cancer genomics on cBioPortal.",
            "All the data to kick start you in a single user-friendly application."
    };
    @Override
    public int getCount() {

        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject( View view, Object o) {
        return view == (RelativeLayout) o;
    }


    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);


        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);


       return view;
    }

    @Override
    public void destroyItem( ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);

    }
}
