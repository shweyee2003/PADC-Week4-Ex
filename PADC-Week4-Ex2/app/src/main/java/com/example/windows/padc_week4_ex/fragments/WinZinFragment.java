package com.example.windows.padc_week4_ex.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.windows.padc_week4_ex.PADCWeek4ExApp;
import com.example.windows.padc_week4_ex.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class WinZinFragment extends Fragment {


    public WinZinFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_winzin, container, false);
        final Button btnsample=(Button) view.findViewById(R.id.btn_sample);

        btnsample.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Sample", Toast.LENGTH_SHORT).show();
            }
        });

        final Button btnbuy=(Button) view.findViewById(R.id.btn_buy);
        btnbuy.setOnClickListener       (new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Buy",Toast.LENGTH_SHORT).show();
            }
        });
      //  ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.padc_winzin);
        return view;
    }

    public static WinZinFragment newInstance() {
        WinZinFragment winzinfragment=new WinZinFragment();

        return winzinfragment;
    }

}
