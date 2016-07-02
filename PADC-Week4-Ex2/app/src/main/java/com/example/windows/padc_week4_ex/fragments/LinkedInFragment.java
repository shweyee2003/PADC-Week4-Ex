package com.example.windows.padc_week4_ex.fragments;

import android.provider.ContactsContract;
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
public class LinkedInFragment extends Fragment {

    public LinkedInFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_linkedin, container, false);
        final ImageView iv_editimg=(ImageView)view.findViewById(R.id.iv_editimg);
        iv_editimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Edit",Toast.LENGTH_SHORT).show();
            }
        });

        final ImageView iv_close=(ImageView)view.findViewById(R.id.iv_close);
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Close",Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView iv_lindedinbrightness=(ImageView)view.findViewById(R.id.iv_lindedinbrightness);
        iv_lindedinbrightness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Linked In Brightness",Toast.LENGTH_SHORT).show();
            }
        });
          //      ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.left_menu_linkedin);
        return view;

    }

    public static LinkedInFragment newInstance() {
        LinkedInFragment linkedinfragment=new LinkedInFragment();
        return linkedinfragment;
    }
}
