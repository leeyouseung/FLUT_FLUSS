package com.example.flut_fluss.widget.recyclerview.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flut_fluss.R;

import java.util.ArrayList;

public class ShowMoneyListAdapter extends RecyclerView.Adapter<ShowMoneyListAdapter.ViewHolder> {

    private ArrayList<String> mData;

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView moneyKind;
        TextView money_1;
        TextView money_2;

        ViewHolder(View itemView) {
            super(itemView);

            // 뷰 객체에 대한 참조. (hold strong reference)
            moneyKind = itemView.findViewById(R.id.money_kind);
            money_1 = itemView.findViewById(R.id.show_money_money);
            money_2 = itemView.findViewById(R.id.money_list_money);
        }
    }

    public ShowMoneyListAdapter(ArrayList<String> cardList) {

        mData = cardList;
    }

    @NonNull
    @Override
    public ShowMoneyListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.show_money_list_item, parent, false);

        ShowMoneyListAdapter.ViewHolder vh = new ShowMoneyListAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Log.d("LogPosition", "position = " + position);

        String text = mData.get(position);

        holder.moneyKind.setText(text);
        holder.money_1.setText(text);
        holder.money_2.setText(text);
    }

    @Override
    public int getItemCount() {

        return mData.size();
    }
}
