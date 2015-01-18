package com.hclab.adapter;

import java.util.List;

import com.hclab.model.ItemSettingModel;
import com.hclab.activity.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * 设置列表的自定义适配器
 */
public class SettingAdapter extends BaseAdapter {

	private Context mContext;
	private List<ItemSettingModel> mLists;
	private LayoutInflater mLayoutInflater;
	public SettingAdapter(Context pContext,List<ItemSettingModel> pLists)
	{
   	 this.mContext=pContext;
   	 this.mLists=pLists;
   	 mLayoutInflater=LayoutInflater.from(mContext);
	}
	
	@Override
	public int getCount() {
		return mLists!=null?mLists.size():0;
	}

	@Override
	public Object getItem(int position) {
		return mLists.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
        Holder _Holder=null;
        if(null==convertView)
        {
        	_Holder=new Holder();
        	convertView=mLayoutInflater.inflate(R.layout.listview_setting_item, null);
        	_Holder.commom_or_more_text_item=(TextView)convertView.findViewById(R.id.setting_text_item);
        	convertView.setTag(_Holder);
        }else {
			_Holder=(Holder)convertView.getTag();
		}
        _Holder.commom_or_more_text_item.setText(mLists.get(position).getName());
        return convertView;
	}
	
	private static class Holder
	{
		TextView commom_or_more_text_item;
	}

}
