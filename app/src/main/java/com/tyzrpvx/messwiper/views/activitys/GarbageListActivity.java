package com.tyzrpvx.messwiper.views.activitys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.melnykov.fab.FloatingActionButton;
import com.melnykov.fab.ScrollDirectionListener;
import com.tyzrpvx.messwiper.app.R;
import com.tyzrpvx.messwiper.views.adapters.GarbageListAdapter;
import com.tyzrpvx.messwiper.views.models.GarbageItem;

public class GarbageListActivity extends AppCompatActivity {

    @Bind(R.id.toolbar_garbage_list)
    Toolbar garbagelistToolbar;

    @Bind(R.id.recyclerview_garbagelist)
    RecyclerView garbagelistView;

    @Bind(R.id.fab_garbage_list)
    FloatingActionButton garbageFab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garbage_list);
        ButterKnife.bind(this);
        GarbageListAdapter adapter = new GarbageListAdapter(GarbageItem.createTstList());
        setSupportActionBar(garbagelistToolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(R.string.garbage_list_actionbar_title);
        }
        garbagelistView.setAdapter(adapter);
        garbagelistView.setLayoutManager(new LinearLayoutManager(this));
        garbageFab.attachToRecyclerView(garbagelistView, new ScrollDirectionListener() {
            @Override
            public void onScrollDown() {
                garbageFab.show();
            }

            @Override
            public void onScrollUp() {
                garbageFab.hide();
            }
        });
    }
}
