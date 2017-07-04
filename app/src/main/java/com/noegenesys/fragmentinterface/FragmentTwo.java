package com.noegenesys.fragmentinterface;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment {
    TextView txtresult;
    int count;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtresult = (TextView)getActivity().findViewById(R.id.txtresult);
    }
    public void incrementData()
    {
        count =Integer.parseInt(txtresult.getText().toString());
        count++;
        txtresult.setText(""+count);
    }
    public void decrementData()
    {
        count =Integer.parseInt(txtresult.getText().toString());
        count--;
        txtresult.setText(""+count);
    }
}
