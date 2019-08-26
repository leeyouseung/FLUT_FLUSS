package com.example.flut_fluss.widget.recyclerview.viewholder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flut_fluss.databinding.ShowMoneyListItemBinding;

public class ShowMoneyListViewHolder extends RecyclerView.ViewHolder {

    ShowMoneyListItemBinding binding;

    public ShowMoneyListViewHolder(@NonNull View itemView) {
        super(itemView);

        binding = DataBindingUtil.bind(itemView);
    }
}
