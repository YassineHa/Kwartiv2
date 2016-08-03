package com.odc.kwarti;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.odc.kwarti.R;

/**
 * Created by student on 2/3/16.
 */
public class NavDrawerAdapter extends RecyclerView.Adapter<NavDrawerAdapter.ViewHolder>{

    private String titles[];
    private int icons[];

    private final int TYPE_HEADER = 0;
    private final int TYPE_ITEM = 1;




    NavDrawerAdapter(String titles[] , int icons[]){
        this.titles = titles;
        this.icons = icons;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == TYPE_HEADER){

            View headerRootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_drawer_header, parent , false);
            ViewHolder headerHolder = new ViewHolder(headerRootView , TYPE_HEADER);
            return headerHolder;

        } else if (viewType == TYPE_ITEM){

            View itemRootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_drawer_row , parent , false);
            ViewHolder itemHolder = new ViewHolder(itemRootView , TYPE_ITEM);
            return itemHolder;
        }

        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (holder.holderID == TYPE_HEADER){

            holder.headerImage.setImageResource(R.drawable.profil);

        }else {
            holder.rowText.setText(titles[position-1]);
            holder.rowIcon.setImageResource(icons[position-1]);
        }

    }
    //test

    @Override
    public int getItemCount() {
        return titles.length +1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == TYPE_HEADER)
            return TYPE_HEADER;
        else
            return TYPE_ITEM;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView rowText;
        ImageView rowIcon;
        ImageView headerImage;

        int holderID;

        public ViewHolder(View itemView , int viewType) {
            super(itemView);

            if (viewType == TYPE_HEADER){

                headerImage = (ImageView) itemView.findViewById(R.id.headerImage);
                holderID = TYPE_HEADER;

            } else if (viewType == TYPE_ITEM){

                rowIcon = (ImageView) itemView.findViewById(R.id.rowIcon);
                rowText = (TextView) itemView.findViewById(R.id.rowText);

                holderID = TYPE_ITEM;

            }

        }
    }
}
