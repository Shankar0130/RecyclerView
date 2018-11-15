package com.shankaryadav.www.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyaAdapter extends RecyclerView.Adapter<MyaAdapter.MyHolder> {

    private Context context;
    private  int res;

    public MyaAdapter(Context context, int res) {
        this.context = context;
        this.res = res;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater  inflater = LayoutInflater.from (context);
        View rootView = inflater.inflate (R.layout.card_layout,parent,false);

        MyHolder holder = new MyHolder (rootView);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
            holder.imageView.setImageResource (res);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        ImageView imageView;

        public MyHolder(View itemView) {
            super (itemView);
            imageView = itemView.findViewById (R.id.imageView);
        }
    }
}
