package com.techreviewsandhelp.birthday;

import java.util.ArrayList;
import com.techreviewsandhelp.birthday.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Birthday extends Activity{
	
	ArrayList<Place> placelist = null;
	Context c=null;
		
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.birthday);
	    
	 
	 WebView w= new WebView (this); //(WebView) findViewbyId (R.id.webview1)
	 w.getSettings() .setBuiltInZoomControls (true);
	 w.getSettings() .setDisplayZoomControls (true);
	 w.getSettings () .setLoadWithOverviewMode (true);
	 w.getSettings() .setSupportZoom(true);
	 
	 
	 w.getSettings().setUseWideViewPort (true);
	 w.loadUrl("file:///android)asset/");
	 //NEED FIX UP
	 
	 w.setWebViewClient (new WebViewClient (){
		 @Override
		 public boolean shouldOverrideUrlLoading(WebView view, String url) {
			 String s = url.replace("http:..www.","").replace(".com/","");
			 AlertDialog.Builder builder = new AlertDialog.Builder(c);
			 
			 AlertDialog alertDialog = builder.create();
			 
			 alertDialog.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener(){
				 public void onClick (DialogInterface dialog, int which) {
					 dialog.dismiss();
				 }});
			 int i =Integer.parseInt(s);
			 switch (i) {
			 case 1:
				 alertDialog.setTitle(s);
				 alertDialog.setMessage(getResources ().getString(R.string.text1));
				 alertDialog.show();
				 break;
			 case 2:
				 alertDialog.setTitle(s);
				 alertDialog.setMessage(getResources ().getString(R.string.text2));
				 alertDialog.show();
				 break;
			 }
			 }
		 }
	 }}
	 
	 


	