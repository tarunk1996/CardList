package com.tarunkumar.cardlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set status bar background to transparent
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // set recyclerview with the adapter

        RecyclerView recyclerView = findViewById(R.id.rv_list);

        List<item> mlist = new ArrayList<>();
        mlist.add(new item(R.drawable.b1,"Nature",R.drawable.dp2,23));
        mlist.add(new item(R.drawable.b2,"River",R.drawable.dp2,25));
        mlist.add(new item(R.drawable.b3,"Drive",R.drawable.dp2,283));
        mlist.add(new item(R.drawable.b4,"Sun",R.drawable.dp2,2));
        mlist.add(new item(R.drawable.b1,"Nature",R.drawable.dp2,2300));
        mlist.add(new item(R.drawable.b2,"Mountain",R.drawable.dp2,292));

        Adapter adapter = new Adapter(this,mlist);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
