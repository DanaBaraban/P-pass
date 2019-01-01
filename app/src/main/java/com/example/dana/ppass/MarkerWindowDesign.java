package com.example.dana.ppass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class MarkerWindowDesign implements GoogleMap.InfoWindowAdapter {

    private final View mMarker;
    private Context mContext;

    public MarkerWindowDesign(Context context){
        mContext = context;
        mMarker = LayoutInflater.from(context).inflate(R.layout.marker_window, null);
    }

    private void RendowWindowText(Marker marker, View view){
        String title = marker.getTitle();
        TextView tvTitle = (TextView) view.findViewById(R.id.title);
        if(!title.equals("")){
            tvTitle.setText(title);
        }

        String snippet = marker.getSnippet();
        TextView tvSnippet = (TextView) view.findViewById(R.id.snippet);
        if(!snippet.equals("")){
            tvSnippet.setText(snippet);
        }
    }

    @Override
    public View getInfoWindow(Marker marker) {
        RendowWindowText(marker, mMarker);
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        RendowWindowText(marker, mMarker);
        return null;
    }
}
