package com.daisyna.esoftwarica.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.daisyna.esoftwarica.activity.Display;
import com.daisyna.esoftwarica.R;
import com.daisyna.esoftwarica.model.Students;

public class AddStudentFragment extends Fragment {

    RecyclerView recyclerView;
    EditText edtName,edtAge,edtAddress;
    RadioGroup grpGender;
    RadioButton btnGender;
    Button btnSave;

    String name,age,address;
    int images;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_addstudent, container, false);
        recyclerView=root.findViewById(R.id.recyclerView);


        edtName=root.findViewById(R.id.edtFname);
        edtAge=root.findViewById(R.id.edtAge);
        edtAddress=root.findViewById(R.id.edtAddress);
        grpGender=root.findViewById(R.id.genderGroup);

        btnSave=root.findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emptyValidation()){

                    int selectGender=grpGender.getCheckedRadioButtonId();
                    btnGender=root.findViewById(selectGender);
                    switch (btnGender.getText().toString()){
                        case "Male":
                            images=R.drawable.male;
                            break;
                        case "Female":
                            images=R.drawable.female;
                            break;
                        case "Others":
                            images=R.drawable.others;
                            break;

                    }

                    //Add into array
                    Display.lstStudents.add(new Students(
                            edtName.getText().toString(),
                            edtAddress.getText().toString(),
                            btnGender.getText().toString(),
                            Integer.parseInt(edtAge.getText().toString()),
                            images));
                    
                    Toast.makeText(getContext(),"Student Added",Toast.LENGTH_LONG).show();
                }
            }
        });

        return root;
    }

    public boolean emptyValidation(){

        if(edtName.getText().toString().trim().isEmpty()){
            edtName.setError("Please enter Full name");
            return false;
        }
        if(edtAge.getText().toString().trim().isEmpty()){
            edtAge.setError("Please enter your Age");
            return false;
        }
        if(edtAddress.getText().toString().trim().isEmpty()){
            edtAddress.setError("Please enter your Address");
            return false;
        }

        return true;
    }
}

