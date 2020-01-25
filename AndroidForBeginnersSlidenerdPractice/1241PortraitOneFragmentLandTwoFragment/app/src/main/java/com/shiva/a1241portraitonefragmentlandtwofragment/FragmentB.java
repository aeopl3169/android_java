package com.shiva.a1241portraitonefragmentlandtwofragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b,container,false);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void changeMethod(int data){
        String[] description =getResources().getStringArray(R.array.description);
        textView.setText(description[data]);
    }
}
