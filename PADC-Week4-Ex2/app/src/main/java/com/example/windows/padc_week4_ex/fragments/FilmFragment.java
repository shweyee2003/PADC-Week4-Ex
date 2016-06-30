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
public class FilmFragment extends Fragment {

    public FilmFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_flim, container, false);

        return view;
    }

    public static FilmFragment newInstance() {
        FilmFragment filmfragment=new FilmFragment();
        return filmfragment;
    }
}
