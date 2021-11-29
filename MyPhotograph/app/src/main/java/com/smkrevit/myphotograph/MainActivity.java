package com.smkrevit.myphotograph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.smkrevit.myphotograph.Adapter.ItemAdapter;
import com.smkrevit.myphotograph.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {
//    RecyclerView recyclerView;
//    ItemAdapter adapter;
//    List<Item> itemList;
//    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btn = findViewById(R.id.btncari);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, Cari.class));
//            }
//        });
//
//        load();
//        isiData();

        loadFragment(new HomeFragment());
        BottomNavigationView navigationView = findViewById(R.id.nav);
        navigationView.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()){
            case R.id.fr_home:
                fragment = new HomeFragment();
                break;

            case R.id.fr_notif:
                fragment = new NotificationFragment();
                break;

            case R.id.fr_activity:
                fragment = new ActivityFragment();
                break;

            case R.id.fr_account:
                fragment = new AccountFragment();
                break;
        }
        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fr_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

//    public void load() {
//        recyclerView = findViewById(R.id.rcvitem);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
//    }
//
//    public void isiData() {
//        itemList = new ArrayList<Item>();
//
//        itemList.add(new Item("", "Pitu PhotoShoot", "Perumahan Kemiri Indah", "07.00 - 14.00", "4.0"));
//        itemList.add(new Item("", "Seven PhotoShoot", "Perumahan Kemiri Indah", "14.00", "4.0"));
//        itemList.add(new Item("", "Sieben PhotoShoot", "Perumahan Kemiri Indah", "14.00", "4.0"));
//        itemList.add(new Item("", "Nana PhotoShoot", "Perumahan Kemiri Indah", "14.00", "4.0"));
//
//        adapter = new ItemAdapter(this, itemList);
//        recyclerView.setAdapter(adapter);
//    }
}