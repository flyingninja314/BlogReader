package android.wrightd.blogreader;

// no Milestone 7 code added, just reading about asyncTask

public class BlogPost {
    public final String title;
    public final String url;

    public BlogPost(String title, String url){
        this.title = title;
        this.url = url;
    }

    @Override
    public String toString() {
        return title;
    }
}
