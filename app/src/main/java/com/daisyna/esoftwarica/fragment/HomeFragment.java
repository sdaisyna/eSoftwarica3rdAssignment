package com.daisyna.esoftwarica.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.daisyna.esoftwarica.activity.Display;
import com.daisyna.esoftwarica.R;
import com.daisyna.esoftwarica.adapter.studentAdapter;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = root.findViewById(R.id.recyclerView);
        //recyclerView = root.findViewById(R.id.recyclerView);



        studentAdapter studentAdapter = new studentAdapter(getContext(), Display.lstStudents);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;


    }
}
