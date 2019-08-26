package com.example.flut_fluss.widget.recyclerview.adapter;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flut_fluss.R;
import com.example.flut_fluss.data.Card;
import com.example.flut_fluss.view.activity.AccountActivity;
import com.example.flut_fluss.view.fragment.ShowMoneyListFragment;
import com.example.flut_fluss.widget.recyclerview.viewholder.ShowMoneyListViewHolder;

import java.util.ArrayList;
import java.util.List;

public class ShowMoneyListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<String> mData;

    ShowMoneyListFragment view;

    public ShowMoneyListAdapter(ArrayList<String> cardList) {

        mData = cardList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ShowMoneyListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.show_money_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Log.d("LogPosition", "position = " + position);

//        Card card = mData.get(position);

//        populateItemRows((ShowMoneyListViewHolder) holder, card);
    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    private void populateItemRows(ShowMoneyListViewHolder viewHolder, Card card) {

//        viewHolder.binding.moneyKind.setText(card.getKind());
//        viewHolder.binding.moneyListMoney.setText(card.getMoney());
//
//        viewHolder.binding.moneyListKind.setOnClickListener(v -> {
//
//            Intent intent = new Intent(context, AccountActivity.class);
//            intent.putExtra("card", String.valueOf(card));
//
//            context.startActivity(intent);
//        });
    }
}
