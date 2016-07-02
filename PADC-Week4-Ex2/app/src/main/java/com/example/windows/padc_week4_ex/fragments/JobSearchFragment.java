package com.example.windows.padc_week4_ex.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.windows.padc_week4_ex.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class JobSearchFragment extends Fragment {


    public JobSearchFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_jobsearch, container, false);
        final ImageView iv_notification=(ImageView) view.findViewById(R.id.iv_notification);
        iv_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Notification",Toast.LENGTH_SHORT).show();
            }
        });

        final Switch switch_jobalert=(Switch)view.findViewById(R.id.switch_jobalert);
        switch_jobalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Switch Job Alert",Toast.LENGTH_SHORT).show();
            }
        });

        final Button btn_new=(Button) view.findViewById(R.id.btn_new);
        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"New Button",Toast.LENGTH_SHORT).show();
            }
        });
        //((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.left_menu_jobsearch);
        return view;
    }

    public static JobSearchFragment newInstance() {
        JobSearchFragment jobsearchfragment=new JobSearchFragment();
        return jobsearchfragment;
    }
}
