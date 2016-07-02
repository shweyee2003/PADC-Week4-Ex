package com.example.windows.padc_week4_ex.fragments;

import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        final Button btndetail=(Button)view.findViewById(R.id.btn_details);
        btndetail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Details",Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView iv_share=(ImageView)view.findViewById(R.id.iv_share);
        iv_share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Share",Toast.LENGTH_SHORT).show();
            }
        });
        final TextView tvreadmore=(TextView)view.findViewById(R.id.tv_readmore);
        tvreadmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Read More",Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView ivshowinshare1=(ImageView)view.findViewById(R.id.iv_showinshare1);
        ivshowinshare1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Share "+R.string.showinname1,Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView ivshowincall1=(ImageView)view.findViewById(R.id.iv_showincall1);
        ivshowincall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Call"+R.string.showinname1,Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView ivshowinshare2=(ImageView)view.findViewById(R.id.iv_showinshare2);
        ivshowinshare2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Share "+R.string.showinname2,Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView ivshowincall2=(ImageView)view.findViewById(R.id.iv_showincall2);
        ivshowincall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Call"+R.string.showinname2,Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    public static FilmFragment newInstance() {
        FilmFragment filmfragment=new FilmFragment();
        return filmfragment;
    }
}
