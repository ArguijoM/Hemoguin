package com.example.hemogui_app.ui.articulo;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class RecibirPDF extends AsyncTask<String, Void, InputStream> {
    PDFView pdfView;
    ProgressBar progressBar;

    public RecibirPDF(PDFView pdfView, ProgressBar progressBar) {
        this.pdfView = pdfView;
        this.progressBar = progressBar;
    }

    @Override
    protected InputStream doInBackground(String... strings) {
        InputStream inputstream=null;
        try {
            URL url = new URL(strings[0]);
            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
            if(urlconnection.getResponseCode()==200){
                inputstream = new BufferedInputStream(urlconnection.getInputStream());
            }
        }catch (IOException e){
            return null;
        }
        return inputstream;
    }

    @Override
    protected void onPostExecute(InputStream inputStream) {
        pdfView.fromStream(inputStream).load();
        progressBar.setVisibility(View.GONE);
    }
}
