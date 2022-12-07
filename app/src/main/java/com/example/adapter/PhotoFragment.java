package com.example.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.models.Photo;
import com.example.thebioskin.R;

public class PhotoFragment extends Fragment {
    private View mView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragmanet_photo, container, false);

        Bundle bundle = getArguments();
        Photo photo = (Photo) bundle.get("object_photo");

        ImageView imgPhoto = mView.findViewById(R.id.img_Photo);
        imgPhoto.setImageResource(photo.getRsourceId());
        return mView;
    }
}
