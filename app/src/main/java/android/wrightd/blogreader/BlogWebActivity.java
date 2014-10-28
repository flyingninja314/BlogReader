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
//        creates window that shows web page
        setContentView(R.layout.blog_web_activity);

        Intent intent = getIntent();
//        gets the information for the blog post from the url
        Uri blogUri = intent.getData();

        WebView webView = (WebView)findViewById(R.id.webView);
        webView.loadUrl(blogUri.toString());
//        loads the blog post
    }
}
