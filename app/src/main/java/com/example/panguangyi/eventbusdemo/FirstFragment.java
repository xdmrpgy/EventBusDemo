package com.example.panguangyi.eventbusdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.panguangyi.eventbusdemo.event.MessageEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * ************************
 * $claass
 * <p>
 * ${date} $Created by panguangyi on 2017/6/29.
 */

public class FirstFragment extends Fragment {
    public static final String TAG = FirstFragment.class.getSimpleName();
    public static final String MSG_KEY = "MSG";
//    public static FirstFragment newInstance(String msg) {
//        FirstFragment f = new FirstFragment();
//        Bundle args = new Bundle();
//        args.putString(MSG_KEY,msg);
//        f.setArguments(args);
//        return f;
//    }

    @Override
    public void onStart() {
        super.onStart();
//        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
//        EventBus.getDefault().unregister(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,null);
        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String msg = getArguments().getString(MSG_KEY);
//                Log.d(TAG,msg);
                EventBus.getDefault().post(new MessageEvent("fragment1 test.."));
//                getActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content,new SecondFragment()).commit();
            }
        });
        return view;
    }

//    @Subscribe(threadMode = ThreadMode.MAIN)
//    public void onMessageEvent(MessageEvent event){
//        Toast.makeText(getActivity(), event.msg, Toast.LENGTH_SHORT).show();
//    }

}
