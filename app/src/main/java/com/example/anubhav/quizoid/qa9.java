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
public class qa9 extends Fragment {
   Button b9;
    RadioGroup rg;
    public qa9() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_qa9, container, false);
        b9 = (Button) v.findViewById(R.id.b9);
        rg = (RadioGroup) v.findViewById(R.id.rg9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int del=rg.getCheckedRadioButtonId();
                if(R.id.q94==del) {
                    FragmentManager fm = getActivity().getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    Fragment f = fm.findFragmentByTag("QA9");
                    ft.remove(f);
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
                }

            }
        });
        return v;
    }
}

