package com.pinkdroid.dealshunter.screen.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.pinkdroid.dealshunter.R;
import com.pinkdroid.dealshunter.controller.DealsHunterController;

public class DealViewerPageFragment extends Fragment {
	public static final int POPULAR_PAGE_ID = 0;
	public static final int MOST_RECENT_PAGE_ID = 1;
	public static final int NEAR_BY_PAGE_ID = 2;
	public static final int END_SOON_PAGE_ID = 3;
	private int pageId;

	

	public DealViewerPageFragment(int pageId) {
		this.pageId=pageId;
	}
	@Override
	public void onResume(){
		super.onResume();
		ListView list = (ListView) this.getView().findViewById(R.id.deals_listview);
		final DealListViewAdapter adapter = new DealListViewAdapter(this.getActivity(), DealsHunterController.getInstance().getDealList(pageId));
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
				DealsHunterController.getInstance().setSelectedDeal(adapter.getItem(pos));
				getActivity().showDialog(DealDetailDialog.DIALOG_TYPE_DEAL_DETAIL);
			}
		});
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//		this.pageId = getActivity().getActionBar().getSelectedTab().getPosition();
		
		ViewGroup root = (ViewGroup) inflater.inflate(R.layout.deal_viewer_fragment_page_layout, null);
		
		return root;
	}
}
