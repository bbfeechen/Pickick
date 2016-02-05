package avator.pickick.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import avator.pickick.R;


public class EditImageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_edit_image, parent, false);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        addButtonOnClick();
    }

    public void addButtonOnClick(){
        Button editButton = (Button)getActivity().findViewById(R.id.editButton);

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Some edit functions of the photos will be added here. */


            }
        });

        Button uploadButton = (Button)getActivity().findViewById(R.id.uploadButton);

        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* socket operations will be added here to upload the photos to the server. */


            }
        });
    }
}
