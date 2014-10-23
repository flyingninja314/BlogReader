package android.wrightd.blogreader;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class BlogWebActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blog_web_activity);

        Intent intent = getIntent();
        Uri blogUri = intent.getData();

        WebView webView = (WebView)findViewById(R.id.webView);
        webView.loadUrl(blogUri.toString());
    }
}
