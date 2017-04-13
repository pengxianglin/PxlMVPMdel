package com.example.pengxl.pxlmvpmdel.mvp.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.pengxl.pxlmvpmdel.R;
import com.example.pengxl.pxlmvpmdel.mvp.adapter.BaseAdapter.MyBaseAdapter;
import com.example.pengxl.pxlmvpmdel.mvp.model.TestModel;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by pengxl on 2017-4-13.
 */

public class ListImageAdapter extends MyBaseAdapter<TestModel> {

    public ListImageAdapter(Context mContext, List<TestModel> mList) {
        super(mContext, mList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_img, parent);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
//        holder.img.setImageBitmap(new Bitmap());
        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.img)
        ImageView img;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
