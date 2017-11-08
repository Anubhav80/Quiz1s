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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.androidl.quizoid.R;

import static android.view.View.*;
import static com.example.androidl.quizoid.R.id.q14;


/**
 * A simple {@link Fragment} subclass.
 */
public class qa1 extends Fragment {
    Button b1;
    RadioGroup rg;
    RadioButton rb;
    public qa1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_qa1, container, false);
        b1 = (Button) v.findViewById(R.id.b1);
        rg = (RadioGroup) v.findViewById(R.id.rg1);

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int del=rg.getCheckedRadioButtonId();
                int d=R.id.q14;
                if(d==del)
                {
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    Fragment f=fm.findFragmentByTag("QA1");
                    ft.remove(f);
                    ft.add(R.id.container,new qa2(),"QA2");
                    ft.commit();
                }

                else
                {
                    AlertDialog.Builder ab=new AlertDialog.Builder(getContext());
                    ab.setTitle("TITLE");
                    ab.setMessage("ANSWER IS WRONG");
                    ab.setPositiveButton("Ok",null);
                    ab.setCancelable(false);
                    ab.show();
                }            }
        });

        return v;
    }
}
