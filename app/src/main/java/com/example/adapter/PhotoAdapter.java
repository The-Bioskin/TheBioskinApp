package com.example.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.models.Photo;

import java.util.List;

public class PhotoAdapter extends FragmentStateAdapter {

    private List<Photo> mListphoto;

    public PhotoAdapter(@NonNull FragmentActivity fragmentActivity, List<Photo> list) {
        super(fragmentActivity);
        this.mListphoto = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Photo photo = mListphoto.get(position);

        Bundle bundle = new Bundle();
        bundle.putSerializable("object_photo", photo);

        PhotoFragment photoFragment = new PhotoFragment();
        photoFragment.setArguments(bundle);

        return photoFragment;
    }

    @Override
    public int getItemCount() {
        if (mListphoto != null){
            return mListphoto.size();
        }
        return 0;
    }
}
