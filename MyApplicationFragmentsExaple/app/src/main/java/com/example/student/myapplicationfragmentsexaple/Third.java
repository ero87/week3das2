package com.example.student.myapplicationfragmentsexaple;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Third extends Fragment {


    public static final String FR_KAY = "My fr kay";

    public Third() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final  View view = inflater.inflate(R.layout.fragment_third, container, false);
        final Button button = (Button) view.findViewById(R.id.fr_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FragmentManager manager = getActivity().getSupportFragmentManager();
                final FirstBlankFragment fragment = new FirstBlankFragment();
                final Bundle bundle = new Bundle();
                bundle.putString(FR_KAY, "Inchvor ban");

                fragment.setArguments(bundle);

                manager.beginTransaction()
                        .replace(R.id.container, fragment, "FR_1")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }

}
