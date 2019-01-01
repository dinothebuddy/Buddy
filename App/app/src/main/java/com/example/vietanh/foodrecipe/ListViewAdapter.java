package com.example.vietanh.foodrecipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    private final List<ListViewAdapter.Item> mItems = new ArrayList<ListViewAdapter.Item>();
    private final LayoutInflater mInflater;

    public ListViewAdapter(Context context){
        mInflater = LayoutInflater.from(context);


        mItems.add(new ListViewAdapter.Item("Thịt kho trứng", R.drawable.thit ) );
        mItems.add(new ListViewAdapter.Item("Bò xào rau muống", R.drawable.boxao ) );
        mItems.add(new ListViewAdapter.Item("Tôm rang me chua ngọt", R.drawable.tomme ) );
        mItems.add(new ListViewAdapter.Item("Canh chua cá lóc", R.drawable.cccl ) );
        mItems.add(new ListViewAdapter.Item("Cánh gà chiên nước mắm", R.drawable.cgcnl ) );
        mItems.add(new ListViewAdapter.Item("Mực nhồi thịt chiên", R.drawable.mntc ) );
        mItems.add(new ListViewAdapter.Item("Bún đậu mắm tôm", R.drawable.bdmt ) );
        mItems.add(new ListViewAdapter.Item("Canh kim chi", R.drawable.ckc ) );
        mItems.add(new ListViewAdapter.Item("Bánh căn", R.drawable.bc ) );
        mItems.add(new ListViewAdapter.Item("Bánh flan", R.drawable.bf ) );

        mItems.add(new Item("Thịt kho trứng", R.drawable.thit ) );
        mItems.add(new Item("Bò xào rau muống", R.drawable.boxao ) );
        mItems.add(new Item("Tôm rang me chua ngọt", R.drawable.tomme) );
        mItems.add(new Item("Canh chua cá lóc", R.drawable.cccl ) );
        mItems.add(new Item("Cánh gà chiên nước mắm", R.drawable.cgcnl ) );
        mItems.add(new Item("Mực nhồi thịt chiên", R.drawable.mntc ) );
        mItems.add(new Item("Bún đậu mắm tôm", R.drawable.bdmt ) );
        mItems.add(new Item("Canh kim chi", R.drawable.ckc ) );
        mItems.add(new Item("Bánh căn", R.drawable.bc ) );
        mItems.add(new Item("Bánh flan", R.drawable.bf ) );
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public ListViewAdapter.Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return mItems.get(i).drawableId;
    }



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        ImageView picture;
        TextView name;
        if (v==null){

            v= mInflater.inflate(R.layout.list_item, viewGroup, false);
            v.setTag(R.id.picture_list, v.findViewById(R.id.picture_list));
            v.setTag(R.id.text_list,v.findViewById(R.id.text_list));
        }

        picture = (ImageView)v.getTag(R.id.picture_list);
        name = (TextView)v.getTag(R.id.text_list);
        ListViewAdapter.Item item = getItem(i);
        picture.setImageResource(item.drawableId);
        name.setText(item.name);
        return v;

    }

    private static class Item {
        public final String name;
        public final  int  drawableId;
        Item(String name, int drawableId){
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}

