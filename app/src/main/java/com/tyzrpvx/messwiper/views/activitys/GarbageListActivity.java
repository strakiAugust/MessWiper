package com.tyzrpvx.messwiper.views.activitys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.tyzrpvx.messwiper.app.R;
import com.tyzrpvx.messwiper.views.activitys.models.GarbageItem;
import com.tyzrpvx.messwiper.views.adapters.GarbageListAdapter;

public class GarbageListActivity extends AppCompatActivity {

    @Bind(R.id.recyclerview_garbagelist)
    RecyclerView garbagelistView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garbage_list);
        ButterKnife.bind(this);
        GarbageListAdapter adapter = new GarbageListAdapter(GarbageItem.createTstList());
        garbagelistView.setAdapter(adapter);
        garbagelistView.setLayoutManager(new LinearLayoutManager(this));
    }
}
