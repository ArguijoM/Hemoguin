package com.example.hemogui_app.ui.piramide;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.hemogui_app.Hemodialisis;
import com.example.hemogui_app.Piramide_caras;
import com.example.hemogui_app.R;

public class Fragment_Piramide extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Button btn_carasP;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    VideoView video_view;
    MediaController mediaController;
    private ActionBar actionBar;
    int pos=0;
    View vista;

    public Fragment_Piramide() {

    }

    public static Fragment_Piramide newInstance(String param1, String param2) {
        Fragment_Piramide fragment = new Fragment_Piramide();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_piramide, container, false);

        video_view = vista.findViewById(R.id.video_view);
        btn_carasP= vista.findViewById(R.id.btn_carasP);
        String path= "android.resource://"+getActivity().getPackageName()+"/"+R.raw.piramide_paciente_renal;
        video_view.setVideoURI(Uri.parse(path));
        if(this.mediaController==null) {
            this.mediaController = new MediaController(getContext());
            this.mediaController.setAnchorView(video_view);
            this.video_view.setMediaController(mediaController);
        }
        //////////////////////darle acción a los botones //////////////////////////////
        btn_carasP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Piramide_caras.class));
            }
        });

        this.video_view.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                video_view.seekTo(pos);
                if(pos==0){
                    video_view.start();
                }
                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                                                     @Override
                                                     public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                                                         mediaController.setAnchorView(video_view);
                                                     }
                                                 }
                );
            }
        });

        return vista;
    }
}