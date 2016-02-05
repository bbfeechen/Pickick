package avator.pickick.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import avator.pickick.R;
import avator.pickick.ui.activity.ProfileActivity;

public class SignUpFragment extends Fragment {
    private EditText editEmail;
    private EditText editUser;
    private EditText editPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sign_up, parent, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        addButtonOnClick();
    }

    public void addButtonOnClick(){
        Button loginButton = (Button)getActivity().findViewById(R.id.registerButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editEmail = (EditText) getActivity().findViewById(R.id.registerEmail);
                editUser = (EditText) getActivity().findViewById(R.id.registerUserName);
                editPassword = (EditText) getActivity().findViewById(R.id.registerPassword);
                String email = editEmail.getText().toString();
                String user = editUser.getText().toString();
                String password = editPassword.getText().toString();

                /* After first time register, you will log in directly */
                /* You will be forwarded to your own profile */
                startActivity(new Intent(getActivity(), ProfileActivity.class));
            }
        });
    }
}
