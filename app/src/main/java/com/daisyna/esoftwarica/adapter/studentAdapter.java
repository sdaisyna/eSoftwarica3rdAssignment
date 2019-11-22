package com.daisyna.esoftwarica.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daisyna.esoftwarica.R;
import com.daisyna.esoftwarica.model.Students;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class studentAdapter extends RecyclerView.Adapter<studentAdapter.StudentsViewHolder> {
    Context mContext;
    List<Students> lstStudents;

    public studentAdapter(Context context, List<Students> lstStudents) {
        this.mContext = context;
        this.lstStudents = lstStudents;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view;
//        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.students, parent, false);
        return new StudentsViewHolder(view, mContext,lstStudents);

    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, int position) {
        Students students=lstStudents.get(position);

        holder.image.setImageResource(students.getImageId());
        holder.name.setText(students.getName());
        holder.age.setText(students.getAge()+"");
        holder.address.setText(students.getAddress());
        holder.gender.setText(students.getGender());

    }

    @Override
    public int getItemCount() {
        return lstStudents.size();
    }

    public class StudentsViewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        ImageButton btnDel;
        TextView name,age,address, gender;
        Context mContext;
        List<Students> stdList;


        public StudentsViewHolder(@NonNull View itemView, final Context mContext, List<Students> lstStudents) {
            super(itemView);

            image=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.txtName);
            age=itemView.findViewById(R.id.txtAge);
            gender=itemView.findViewById(R.id.txtGender);
            address=itemView.findViewById(R.id.txtAddress);
            btnDel = itemView.findViewById(R.id.btnDelete);
            this.mContext=mContext;
            this.stdList=lstStudents;

            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Students student = stdList.get(getAdapterPosition());
                    Toast.makeText(mContext, "My name is : "+student.getName(), Toast.LENGTH_SHORT).show();
                }
            });

            btnDel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    stdList.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                }
            });
        }
    }
}

