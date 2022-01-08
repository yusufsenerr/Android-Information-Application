package Model;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideUtil {
    public  static  void resmiIndiripGoster(Context context, String Fotograf, ImageView imageView)
    {
        Glide.with(context)
                .load(Fotograf)
                .centerCrop()
                .into(imageView);
    }
}
