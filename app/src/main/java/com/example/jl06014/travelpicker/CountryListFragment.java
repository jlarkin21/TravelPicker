package com.example.jl06014.travelpicker;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;;import java.util.ArrayList;
import java.util.List;

/**
 * Created by jl06014 on 2/28/2017.
 */

public class CountryListFragment extends Fragment {

    private RecyclerView countryRecyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.country_list_fragment, container, false);

        List<Country> countries = getAllItemList();
        countryRecyclerView = (RecyclerView) view.findViewById(R.id.country_recycler_view);
        countryRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        return view;
    }

    public class CountryHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView nameTextView;
        public ImageView flagImageView;
        public CountryHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            nameTextView = (TextView) itemView.findViewById(R.id.country_name);
            flagImageView = (ImageView) itemView.findViewById(R.id.country_photo);
        }

        @Override
        public void onClick(View v) {

        }
    }

    public class CountryAdapter extends RecyclerView.Adapter<CountryHolder> {
        private List<Country> mCountries;

        public CountryAdapter(List<Country> countries) {
            mCountries = countries;
        }

        @Override
        public CountryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_list_item, null);
            CountryHolder rv = new CountryHolder(layoutView);
            return rv;
        }

        @Override
        public void onBindViewHolder(CountryHolder holder, int position) {
            holder.nameTextView.setText(mCountries.get(position).getName());
            holder.flagImageView.setImageResource(R.drawable.flag_uk);
        }

        @Override
        public int getItemCount() {
            return mCountries.size();
        }
    }

    private List<Country> getAllItemList() {
        List<Country> allItems = new ArrayList<Country>();
        allItems.add(new Country("United States", R.drawable.flag_uk));
        allItems.add(new Country("Canada", R.drawable.flag_uk));
        allItems.add(new Country("United Kingdom", R.drawable.flag_uk));
        allItems.add(new Country("United States", R.drawable.flag_uk));
        allItems.add(new Country("United States", R.drawable.flag_uk));
        allItems.add(new Country("United States", R.drawable.flag_uk));
        allItems.add(new Country("United States", R.drawable.flag_uk));

        return allItems;

    }
}
