package android.wrightd.blogreader;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;


public class BlogActivity extends Activity {

    protected ProgressBar progressBar;
    protected ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

//      this is how I used to have it, before i got content from the treehouse blog. I had an array of strings that i displayed as the tiles of the posts
//        String[] arrayStrings = new String[]{
//                "Blog Post 1",
//                "Blog Post 2",
//                "Blog Post 3",
//                "Blog Post 4"
//        };



        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        listView = (ListView)findViewById(R.id.listView);

        listView.setEmptyView(progressBar);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                when the blog post is clicked on (or touched or whatever), it opens the url of the blog post in the application
                Log.i("BlogActivity", "Title: " + BlogPostParser.get().posts.get(position).title);

                Intent intent = new Intent(getApplicationContext(), BlogWebActivity.class);
                Uri blogUri = Uri.parse(BlogPostParser.get().posts.get(position).url);
                intent.setData(blogUri);

                startActivity(intent);
            }
        });

        new BlogPostTask().execute(this);
    }

}
