package com.example.flut_fluss.widget.recyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flut_fluss.R;
import com.example.flut_fluss.data.Card;
import com.example.flut_fluss.view.fragment.ShowMoneyListFragment;
import com.example.flut_fluss.widget.recyclerview.viewholder.ShowMoneyListViewHolder;

import java.util.List;

public class ShowMoneyListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Card> cardList;
    Context context;
    ShowMoneyListFragment view;

    public ShowMoneyListAdapter(List<Card> cardList, Context context, ShowMoneyListFragment view){

        this.cardList = cardList;
        this.context = context;
        this.view = view;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ShowMoneyListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.show_money_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Log.d("LogPosition", "position = " + position);

        Card card = cardList.get(position);

//        populateItemRows((ShowMoneyListViewHolder) holder, card);
    }

    @Override
    public int getItemCount() {

        return 0;
    }

//    private void populateItemRows(ShowMoneyListViewHolder viewHolder, Card card) {
//
//        viewHolder.binding.studyTitle.setText(study.getTitle());
//        viewHolder.binding.currentPerson.setText(study.getCurrentPerson().toString() + " / ");
//        viewHolder.binding.personnel.setText(study.getPersonnel().toString());
//        viewHolder.binding.studyPlace.setText(study.getLocation());
//        viewHolder.binding.studyTime.setText(study.getStartTerm().split(" ")[0] + " ~ " + study.getEndTerm().split(" ")[0]);
//        if (!study.getImgs().isEmpty()) {
//            Glide.with(view).load(study.getImgs().get(0)).into(viewHolder.binding.studyImageview);
//        }
//
//        viewHolder.binding.studyCardView.setOnClickListener(v -> {
    
//            Intent intent = new Intent(context, StudyActivity.class);
//            intent.putExtra("study",study);
//            context.startActivity(intent);
//        });
//    }
}
