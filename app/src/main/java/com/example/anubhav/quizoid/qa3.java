package com.example.anubhav.quizoid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.androidl.quizoid.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class qa3 extends Fragment {
Button b3;
    RadioGroup rg;
    public qa3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_qa3, container, false);
        b3 = (Button) v.findViewById(R.id.b3);
        rg = (RadioGroup) v.findViewById(R.id.rg3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int del=rg.getCheckedRadioButtonId();
                if(R.id.q34==del) {
                FragmentManager fm=getActivity().getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                Fragment f=fm.findFragmentByTag("QA3");
                ft.remove(f);
                ft.add(R.id.container,new qa4(),"QA4");
                       ft.commit();}
                else
                {
                    AlertDialog.Builder ab=new AlertDialog.Builder(getContext());
                    ab.setTitle("TITLE");
                    ab.setMessage("ANSWER IS WRONG");
                    ab.setPositiveButton("Ok",null);

                    ab.setCancelable(false);
                    ab.show();
                }


            }
        });
        return v;
    }


}
