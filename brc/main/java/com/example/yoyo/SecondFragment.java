package com.example.yoyo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View editText = view.findViewById(R.id.enter_recited_word);
        String str = "placeholder";
        String user = ((TextView)editText).getText().toString();
        String sen = str.length() >= user.length() ? str : user;;
        String s = str.length() >= user.length() ? user : str;

        int inc = Math.abs(str.length() - user.length());
        System.out.print(inc);
        for (int i = 0; i < s.length(); i++)
        {
            if(sen.charAt(i) != s.charAt(i))
                inc++;
        }

        boolean check = inc == 0 ? true : (inc / (double) str.length()) <= 0.25;
    }

}