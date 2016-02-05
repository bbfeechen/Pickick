package avator.pickick.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import avator.pickick.R;
import avator.pickick.ui.activity.SignInActivity;
import avator.pickick.ui.activity.SignUpActivity;

public class MainFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, parent, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        addButtonOnClick();
    }

    public void addButtonOnClick(){
        Button signInButton = (Button)getActivity().findViewById(R.id.buttonSignIn);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Directly convert to the sign in activity */
                startActivity(new Intent(getActivity(), SignInActivity.class));
            }
        });

        Button signUpButton = (Button)getActivity().findViewById(R.id.buttonSignUp);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Directly convert to the sign up activity */
                startActivity(new Intent(getActivity(), SignUpActivity.class));
            }
        });
    }
}
