package biginteger.navigationdrawer.layouts;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import biginteger.navigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeWorkFragment extends Fragment {


    public HomeWorkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_work, container, false);
    }


}
