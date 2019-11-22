package com.daisyna.esoftwarica.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.daisyna.esoftwarica.R;

public class AboutFragment extends Fragment {

    private WebView softwaricaWeb;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_aboutus, container, false);
        softwaricaWeb =root.findViewById(R.id.webView);
        softwaricaWeb.loadUrl("https://softwarica.edu.np/");

        return root;
    }

}
