package com.example.windows.padc_week4_ex.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.windows.padc_week4_ex.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PulseFragment extends Fragment {

    public PulseFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_pulse, container, false);
        final ImageView iv_radiobtnchecked=(ImageView)view.findViewById(R.id.iv_radiobtnchecked);
        iv_radiobtnchecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Radiobuttonchecked",Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView iv_perm_idetity=(ImageView) view.findViewById(R.id.iv_perm_idetity);
        iv_perm_idetity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Perm Identity",Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView iv_pulsesearch=(ImageView) view.findViewById(R.id.iv_pulsesearch);
        iv_pulsesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Search",Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView iv_brightness=(ImageView) view.findViewById(R.id.iv_brightness);
        iv_brightness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Brightness",Toast.LENGTH_SHORT).show();
            }
        });
       // ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.pulse);
        return view;
    }

    public static PulseFragment newInstance() {
        PulseFragment Pulsefragment=new PulseFragment();
        return Pulsefragment;
    }
}
