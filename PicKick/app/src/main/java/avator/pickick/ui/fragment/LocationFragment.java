package avator.pickick.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import avator.pickick.R;
import avator.pickick.ui.activity.EditImageActivity;
import avator.pickick.ui.activity.ManageImageActivity;


public class LocationFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_location, parent, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        addButtonOnClick();
    }

    public void addButtonOnClick(){
        Button selectTimeButton = (Button)getActivity().findViewById(R.id.selectLocationButton);
        selectTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* select the photos to manage */

            }
        });

        Button manageTimeButton = (Button)getActivity().findViewById(R.id.manageLocationButton);
        manageTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Go to the manage page */
                startActivity(new Intent(getActivity(), ManageImageActivity.class));
            }
        });

        Button editTimeButton = (Button)getActivity().findViewById(R.id.editLocationButton);
        editTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Go to the manage page */
                startActivity(new Intent(getActivity(), EditImageActivity.class));
            }
        });
    }
}
