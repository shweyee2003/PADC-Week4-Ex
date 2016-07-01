package com.example.windows.padc_week4_ex.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        //((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.left_menu_jobsearch);
        return view;
    }

    public static JobSearchFragment newInstance() {
        JobSearchFragment jobsearchfragment=new JobSearchFragment();
        return jobsearchfragment;
    }
}
