package Model;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideUtil {
    public  static  void resmiIndiripGoster(Context context, String resimUrl, ImageView imageView)
    {
        Glide.with(context)
                .load(resimUrl)
                .centerCrop()
                .into(imageView);
    }
}
