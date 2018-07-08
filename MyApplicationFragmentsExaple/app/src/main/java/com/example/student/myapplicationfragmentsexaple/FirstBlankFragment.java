package com.example.student.myapplicationfragmentsexaple;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstBlankFragment extends Fragment {
    private OnSaveDataClicgListener callback;


    public FirstBlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            callback = (OnSaveDataClicgListener) context;
        }catch (ClassCastException e){
            throw  new  ClassCastException((context.toString())+"must implement OnHeadlineSelectListner");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_blank, container, false);
        TextView textView =  view.findViewById(R.id.first_text);
        if (getArguments() != null && getArguments().getString(Third.FR_KAY) !=null){
            final String arg = getArguments().getString(Third.FR_KAY);
            textView.setText(arg);
        }

        final Button button = view.findViewById(R.id.send_data);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.onSaveDataClicked();
            }
        });

        return view;
    }

    public interface OnSaveDataClicgListener{
        void  onSaveDataClicked();
    }

}
