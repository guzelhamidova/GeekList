package com.example.geeklist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Model>list = new ArrayList<>();

    public void addItems(ArrayList<Model> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView id,heading,description, date;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id_items);
            heading = itemView.findViewById(R.id.tv_label);
            description =itemView.findViewById(R.id.tv_description);
            date = itemView.findViewById(R.id.tv_date);
        }

        public void onBind(Model model) {
            heading.setText(model.getHeading());
            description.setText(model.getDescription());
            date.setText(String.valueOf(model.getData()));
            id.setText(String.valueOf(getAdapterPosition()+1));
        }
    }
    public String date(long time){
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        return dateFormat.format(System.currentTimeMillis());
    }
}

