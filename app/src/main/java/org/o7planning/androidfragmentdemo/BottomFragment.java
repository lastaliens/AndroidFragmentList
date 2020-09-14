package org.o7planning.androidfragmentdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BottomFragment extends Fragment {
    private TextView textViewFullName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_bottom, container, false);
        textViewFullName = (TextView) view.findViewById(R.id.textView_fullName);

        return view;
    }

    public void showText(String firstName, String lastName) {
        textViewFullName.setText(firstName + " " + lastName);
    }
}