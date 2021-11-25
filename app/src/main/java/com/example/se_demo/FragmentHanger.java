package com.example.se_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class FragmentHanger extends Fragment implements View.OnClickListener{
    //Fragment 화면에서 clicklistener를 상속받을수 없음(이미 Fragment를 상속받았기때문)
    //그래서 View.OnClickListener를 인터페이스로 사용




    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cloth_info_complete, container, false);

        Button addbtn = (Button)view.findViewById(R.id.AddBtn);
        Button savebtn = (Button)view.findViewById(R.id.SaveBtn);
        Button stylerbtn = (Button)view.findViewById(R.id.styler1);
        Button trashbtn = (Button)view.findViewById(R.id.trash1);

        addbtn.setOnClickListener(this);
        savebtn.setOnClickListener(this);
        stylerbtn.setOnClickListener(this);
        trashbtn.setOnClickListener(this);

        return view;
    }
    Intent intent;
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //언더바 메뉴 누르는것을 switch구문으로 구현
            case R.id.AddBtn:
                intent = new Intent(getActivity(), Top_Bottom.class);
                startActivity(intent);
                break;
            case R.id.SaveBtn:
                intent = new Intent(getActivity(), Cloth_search.class);
                startActivity(intent);
                break;

            case R.id.styler1:
                intent = new Intent(getActivity(), Styler.class);
                startActivity(intent);
                break;

            case R.id.trash1:
                intent = new Intent(getActivity(), Trash.class);
                startActivity(intent);
                break;
        }
    }
}
