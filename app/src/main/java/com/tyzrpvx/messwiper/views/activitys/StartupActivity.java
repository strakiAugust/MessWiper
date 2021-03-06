package com.tyzrpvx.messwiper.views.activitys;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tyzrpvx.messwiper.app.R;

public class StartupActivity extends AppCompatActivity {

    @Bind(R.id.button_startup)
    Button startupButton;
    @Bind(R.id.toolbar_startup)
    Toolbar startupToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        ButterKnife.bind(this);
        setSupportActionBar(startupToolbar);

    }

    @OnClick(R.id.button_startup)
    public void wipe() {
        Log.d("`1", "StartupActivity.Class->wipe(): ");
        Intent wipeIntent = new Intent(this, GarbageListActivity.class);
        View sharedView  = startupButton;
        String transName = getString(R.string.trans_startup);
        ActivityOptionsCompat options = ActivityOptionsCompat
                .makeSceneTransitionAnimation(this, sharedView, transName);
        startActivity(wipeIntent, options.toBundle());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_startup, menu);
        return true;
    }
}
