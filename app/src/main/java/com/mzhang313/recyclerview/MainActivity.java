package com.mzhang313.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.mzhang313.recyclerview.ui.main.ItemFragment;
import com.mzhang313.recyclerview.ui.main.MainFragment;
import com.mzhang313.recyclerview.ui.main.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ItemFragment.newInstance(1))
                    .commitNow();
        }
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        Toast.makeText(getApplicationContext(), item.content, Toast.LENGTH_LONG).show();
    }
}
