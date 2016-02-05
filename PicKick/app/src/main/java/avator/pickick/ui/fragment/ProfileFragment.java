package avator.pickick.ui.fragment;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import avator.pickick.R;
import avator.pickick.ui.activity.PhotoTakenActivity;
import avator.pickick.ui.activity.ShowImageByLocationActivity;
import avator.pickick.ui.activity.ShowImageByTimeActivity;
import avator.pickick.ui.activity.SyncActivity;


public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, parent, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Button photoTakenButton = (Button) getActivity().findViewById(R.id.photoTakenButton);
//        photoTakenButton.setOnClickListener(photoTakenButtonClicked);

        Button locationButton = (Button) getActivity().findViewById(R.id.locationButton);
        locationButton.setOnClickListener(locationButtonClicked);

        Button timeButton = (Button) getActivity().findViewById(R.id.timeButton);
        timeButton.setOnClickListener(timeButtonClicked);

        Button syncButton = (Button) getActivity().findViewById(R.id.syncButton);
        syncButton.setOnClickListener(syncButtonClicked);
    }

//    View.OnClickListener photoTakenButtonClicked = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            startActivity(new Intent(getActivity(), PhotoTakenActivity.class));
//        }
//    };

    View.OnClickListener locationButtonClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getActivity(), ShowImageByLocationActivity.class));
        }
    };

    View.OnClickListener timeButtonClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getActivity(), ShowImageByTimeActivity.class));
        }
    };

    View.OnClickListener syncButtonClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getActivity(), SyncActivity.class));
        }
    };
}
