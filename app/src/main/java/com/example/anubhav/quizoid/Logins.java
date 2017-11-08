package com.example.anubhav.quizoid;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.androidl.quizoid.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Logins extends Fragment {
    EditText t1, t2;
    //Communicator c;
    Button b1;

    public Logins() {
        // Required empty public constructor
    }

 /*   public void onAttach(Context context) {
        super.onAttach(context);
        c = (Communicator) context;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_logins, container, false);

  /*b1=(Button)v.findViewById(R.id.slogin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1 = (EditText) v.findViewById(R.id.sid);
                String str1 = t1.getText().toString();
                t2 = (EditText) v.findViewById(R.id.pid);
                String str2 = t2.getText().toString();
                c.com(str1, str2);
            }
        });
*/
        //}
        //public interface Communicator {
        //  public void com(String as, String ds);
        //}
    }
}