package com.hclab.activity;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.hclab.adapter.CommonAdapter;
import com.hclab.adapter.SettingAdapter;
import com.hclab.model.ItemCommonModel;
import com.hclab.model.ItemSettingModel;
import com.hclab.activity.R;

public class LeftBottomFragment extends Fragment{
	private View mView;
	private Context mContext;
	private ListView listview_common;
	private ListView listview_setting;

	private List<ItemCommonModel> commonModels;  //常用列表的Item集合
	private List<ItemSettingModel> settingModels;   //设置列表的item集合
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (null == mView) {
			mView = inflater.inflate(R.layout.fragment_left_bottom, container,
					false);
			initView();
			initValidata();
			bindData();
		}
		return mView;
	}
	/**
	 * 初始化界面元素
	 */
	private void initView() {
		listview_common = (ListView) mView.findViewById(R.id.listview_common);
		listview_setting = (ListView) mView.findViewById(R.id.listview_setting);

	}
	/**
	 * 初始化变量
	 */
	private void initValidata() {
		mContext = mView.getContext();
		commonModels=new ArrayList<ItemCommonModel>();
		settingModels=new ArrayList<ItemSettingModel>();
		//1:进行构造常用列表中的数据,图标,名称
		Integer[] common_icon_id = new Integer[] {
				R.drawable.school_img_first,
				R.drawable.school_img_information,
				R.drawable.school_img_server,
				R.drawable.school_imge_commity,
				R.drawable.school_img_news};
		String[] arrays_commom=mContext.getResources().getStringArray(R.array.arrays_commom);
		for(int i=0;i<common_icon_id.length;i++)
		{
			ItemCommonModel commcon=new ItemCommonModel(common_icon_id[i], arrays_commom[i]);
			commonModels.add(commcon);
		}
			
		//2:进行构造设置列表中的数据,名称
		String[] arrays_setting=mContext.getResources().getStringArray(R.array.arrays_setting);
		for(int i=0;i<arrays_setting.length;i++)
		{
			ItemSettingModel setting=new ItemSettingModel(arrays_setting[i]);
			settingModels.add(setting);
		}		
	}

	/**
	 * 绑定数据
	 */
	private void bindData() {
       //创建适配器并且进行绑定数据到listview中
		listview_common.setAdapter(new CommonAdapter(mContext, commonModels));
		listview_setting.setAdapter(new SettingAdapter(mContext, settingModels));
	}

}