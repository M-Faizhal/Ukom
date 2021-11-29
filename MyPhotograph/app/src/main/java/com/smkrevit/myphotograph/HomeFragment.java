package com.smkrevit.myphotograph;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.smkrevit.myphotograph.Adapter.AdapterPhotograph;
import com.smkrevit.myphotograph.Adapter.ItemAdapter;
import com.smkrevit.myphotograph.Model.Item;
import com.smkrevit.myphotograph.Model.ModelPhotograph;
import com.smkrevit.myphotograph.Service.FotoService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    Button btn;
    RecyclerView recyclerView;
    ItemAdapter adapter;
    List<Item> itemList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn = view.findViewById(R.id.btncari);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Cari.class));
            }
        });

        load();
        isiData();
    }

    public void load() {
        recyclerView = getActivity().findViewById(R.id.rcvitem);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setHasFixedSize(true);

        FotoService service = Api.getService().create(FotoService.class);
        Call<List<ModelPhotograph>> call = service.getData();
        call.enqueue(new Callback<List<ModelPhotograph>>() {
            @Override
            public void onResponse(Call<List<ModelPhotograph>> call, Response<List<ModelPhotograph>> response) {
                List<ModelPhotograph> data = response.body();
                recyclerView.setAdapter(new AdapterPhotograph(getContext(), data));
            }

            @Override
            public void onFailure(Call<List<ModelPhotograph>> call, Throwable t) {
//                Toast.makeText(getContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void isiData() {
        itemList = new ArrayList<Item>();

        itemList.add(new Item("", "Pitu PhotoShoot", "Perumahan Kemiri Indah", "07.00 - 14.00", "4.0"));
        itemList.add(new Item("", "Seven PhotoShoot", "Perumahan Kemiri Indah", "14.00", "4.0"));
        itemList.add(new Item("", "Sieben PhotoShoot", "Perumahan Kemiri Indah", "14.00", "4.0"));
        itemList.add(new Item("", "Nana PhotoShoot", "Perumahan Kemiri Indah", "14.00", "4.0"));

        adapter = new ItemAdapter(getContext(), itemList);
        recyclerView.setAdapter(adapter);
    }
}