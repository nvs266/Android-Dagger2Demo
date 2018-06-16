package com.framgia.mvp_dagger.example_2_no_dagger.screen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.framgia.mvp_dagger.R;
import com.framgia.mvp_dagger.example_2_no_dagger.data.model.Result;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class RandomUserAdapter extends RecyclerView.Adapter<RandomUserAdapter.ViewHolder> {

    private List<Result> mResults;
    private LayoutInflater mLayoutInflater;
    private Context mContext;

    public RandomUserAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(mContext);
        }

        View itemView = mLayoutInflater.inflate(R.layout.item_random_user, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (mResults == null || mResults.isEmpty()) {
            return;
        }

        holder.bindData(mResults.get(position));
    }

    @Override
    public int getItemCount() {
        return mResults == null ? 0 : mResults.size();
    }

    public void setData(List<Result> results) {
        if (results == null || results.isEmpty()) {
            return;
        }

        mResults = results;
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextName;
        private ImageView mImageView;

        public ViewHolder(View itemView) {
            super(itemView);

            mTextName = itemView.findViewById(R.id.text_name);
            mImageView = itemView.findViewById(R.id.image);
        }

        private void bindData(Result result) {
            if (result == null) {
                return;
            }

            mTextName.setText(String.format("%s %s",
                    result.getName().getFirst(), result.getName().getLast()));

            Picasso.with(mImageView.getContext())
                    .load(result.getPicture().getLarge())
                    .into(mImageView);
        }
    }
}
