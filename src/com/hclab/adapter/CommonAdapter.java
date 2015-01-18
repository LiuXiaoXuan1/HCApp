package com.hclab.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hclab.model.ItemCommonModel;
import com.hclab.activity.R;
/**
 * 常用与更多的Item列表的自定义适配器
 */
public class CommonAdapter extends BaseAdapter {

	private Context mContext;
	private List<ItemCommonModel> mLists;	
	private LayoutInflater mLayoutInflater;
	public CommonAdapter(Context pContext,List<ItemCommonModel> pLists)
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
	public Object getItem(int arg0) {
		return mLists.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int arg0, View view, ViewGroup arg2) {
		Holder _Holder=null;;
		if(null==view)
		{
			_Holder=new Holder();
			view=mLayoutInflater.inflate(R.layout.listview_common_item, null);
			_Holder.common_image_icon=(ImageView)view.findViewById(R.id.common_image_icon);
			_Holder.commom_text_item=(TextView)view.findViewById(R.id.commom_text_item);
			view.setTag(_Holder);
		}else {
			_Holder=(Holder)view.getTag();
		}
		_Holder.common_image_icon.setImageResource(mLists.get(arg0).getId());
		_Holder.commom_text_item.setText(mLists.get(arg0).getName());
		return view;
	}

	private static class Holder
	{
		ImageView common_image_icon;
		TextView commom_text_item;
	}
}
