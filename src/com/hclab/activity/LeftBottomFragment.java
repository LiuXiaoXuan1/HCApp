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

	private List<ItemCommonModel> commonModels;  //�����б��Item����
	private List<ItemSettingModel> settingModels;   //�����б��item����
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
	 * ��ʼ������Ԫ��
	 */
	private void initView() {
		listview_common = (ListView) mView.findViewById(R.id.listview_common);
		listview_setting = (ListView) mView.findViewById(R.id.listview_setting);

	}
	/**
	 * ��ʼ������
	 */
	private void initValidata() {
		mContext = mView.getContext();
		commonModels=new ArrayList<ItemCommonModel>();
		settingModels=new ArrayList<ItemSettingModel>();
		//1:���й��쳣���б��е�����,ͼ��,����
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
			
		//2:���й��������б��е�����,����
		String[] arrays_setting=mContext.getResources().getStringArray(R.array.arrays_setting);
		for(int i=0;i<arrays_setting.length;i++)
		{
			ItemSettingModel setting=new ItemSettingModel(arrays_setting[i]);
			settingModels.add(setting);
		}		
	}

	/**
	 * ������
	 */
	private void bindData() {
       //�������������ҽ��а����ݵ�listview��
		listview_common.setAdapter(new CommonAdapter(mContext, commonModels));
		listview_setting.setAdapter(new SettingAdapter(mContext, settingModels));
	}

}