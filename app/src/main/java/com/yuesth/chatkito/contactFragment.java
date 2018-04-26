package com.yuesth.chatkito;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class contactFragment extends android.support.v4.app.Fragment {

    private View view;
    private List<contact_model> listContact = new ArrayList<>();

    public contactFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_contact, container, false);
        RecyclerView recyclerViewContact = view.findViewById(R.id.recycler_contact);
        recyclerContactAdapter rca = new recyclerContactAdapter(getContext(),listContact);

        recyclerViewContact.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewContact.setAdapter(rca);
        return view;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        listContact.add(new contact_model(R.drawable.ava,"Yues Tadrik","082220825719"));
        listContact.add(new contact_model(R.drawable.ava,"Yues Hafiyan","08153801034"));
        listContact.add(new contact_model(R.drawable.ava,"Tadrik hafiyan","081514303576"));
        listContact.add(new contact_model(R.drawable.ava,"Yues Ganteng","085367773576"));
        listContact.add(new contact_model(R.drawable.ava,"Yues Tadrik","082220825719"));
        listContact.add(new contact_model(R.drawable.ava,"Yues Hafiyan","08153801034"));
        listContact.add(new contact_model(R.drawable.ava,"Tadrik hafiyan","081514303576"));
        listContact.add(new contact_model(R.drawable.ava,"Yues Ganteng","085367773576"));
        listContact.add(new contact_model(R.drawable.ava,"Yues Tadrik","082220825719"));
        listContact.add(new contact_model(R.drawable.ava,"Yues Hafiyan","08153801034"));
        listContact.add(new contact_model(R.drawable.ava,"Tadrik hafiyan","081514303576"));
        listContact.add(new contact_model(R.drawable.ava,"Yues Ganteng","085367773576"));

    }
}
