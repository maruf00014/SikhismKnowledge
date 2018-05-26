package com.sikhismknowledge.sikhismknowledge;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Maruf on 20-May-18.
 */

public class ImageAdapter extends BaseAdapter {

    private Context context;

    public Integer[] images = {
            R.drawable.img1,R.drawable.img2,R.drawable.img3,
            R.drawable.img4,R.drawable.img5,R.drawable.img6,
            R.drawable.img7,R.drawable.img8,R.drawable.img9,
            R.drawable.img10,R.drawable.img11,R.drawable.img12,
            R.drawable.img13,R.drawable.img14,R.drawable.img15,
            R.drawable.img16,R.drawable.img17,R.drawable.img18,
            R.drawable.img19,R.drawable.img20,R.drawable.img21,
            R.drawable.img22,R.drawable.img23,R.drawable.img24,
            R.drawable.img25, R.drawable.img26, R.drawable.img27

    };

    public ImageAdapter(Context c)
    {
        context = c;
    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(215,215));
        return imageView;
    }
}
