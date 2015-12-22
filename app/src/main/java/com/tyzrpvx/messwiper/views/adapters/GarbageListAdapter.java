package com.tyzrpvx.messwiper.views.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.tyzrpvx.messwiper.app.R;
import com.tyzrpvx.messwiper.views.activitys.models.GarbageItem;

import java.util.List;

public class GarbageListAdapter extends RecyclerView.Adapter<GarbageListAdapter.GarbageItemViewHolder> {

    private List<GarbageItem> mGarbageList;


    public GarbageListAdapter(List<GarbageItem> garbageList) {
        mGarbageList = garbageList;
    }


    @Override
    public GarbageItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View garbageItemView = inflater.inflate(R.layout.item_garbage, parent, false);
        return new GarbageItemViewHolder(garbageItemView);
    }

    @Override
    public void onBindViewHolder(GarbageItemViewHolder holder, int position) {
        GarbageItem garbageItem = mGarbageList.get(position);
        holder.appName.setText(garbageItem.getAppName());
    }

    @Override
    public int getItemCount() {
        return mGarbageList.size();
    }

    public static class GarbageItemViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.imageview_app_icon)
        ImageView appIcon;

        @Bind(R.id.textview_app_name)
        TextView appName;

        @Bind(R.id.textview_garbage_size)
        TextView garbageSize;

        @Bind(R.id.checkbox_should_del)
        CheckBox shouldDel;

        public GarbageItemViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
