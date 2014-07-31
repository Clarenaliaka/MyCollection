package com.cla.mycollection;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class WebViewActivity extends ActionBarActivity {
WebView webview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		//initialize
		webview = (WebView) findViewById(R.id.webView);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://www.google.com");
	}

}
