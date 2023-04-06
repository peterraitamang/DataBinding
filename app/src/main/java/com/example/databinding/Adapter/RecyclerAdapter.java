package com.example.databinding.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databinding.BR;
import com.example.databinding.R;
import com.example.databinding.databinding.ItemRecyclerStudentBinding;
import com.example.databinding.model.StudentModel;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder> {
    List<StudentModel> sList;

    public RecyclerAdapter(List<StudentModel> sList) {
        this.sList = sList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemRecyclerStudentBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_recycler_student,parent, false);
        return new myViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        StudentModel studentModel = sList.get(position);
       holder.itemRecyclerStudentBinding.setStudentModelObject(studentModel);

    }

    @Override
    public int getItemCount() {
        return sList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        ItemRecyclerStudentBinding itemRecyclerStudentBinding;

        public myViewHolder(@NonNull ItemRecyclerStudentBinding itemStudentBind) {
            super(itemStudentBind.getRoot());
            this.itemRecyclerStudentBinding = itemStudentBind;
        }
//        public void bind(Object obj){
//            itemRecyclerStudentBinding.setVariable(BR.studentModelObject, obj);
//            itemRecyclerStudentBinding.executePendingBindings();
//        }
    }
}
