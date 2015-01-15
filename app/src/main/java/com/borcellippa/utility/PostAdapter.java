package com.borcellippa.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.borcellippa.iconquilini.R;
import com.borcellippa.resources.casa.bacheca.post.Post;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by Mattia on 14/01/2015.
 */
public class PostAdapter  extends ArrayAdapter<Post> {

    public PostAdapter(Context context, int textViewResourceId, List<Post> objects) {
        super(context, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.rowpost, null);
        TextView autore = (TextView) convertView.findViewById(R.id.textViewAutore);
        TextView contenuto = (TextView) convertView.findViewById(R.id.textViewContenuto);
        TextView data = (TextView) convertView.findViewById(R.id.textViewDataPubblicazione);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.list_image);

        Post p = getItem(position);
        autore.setText(p.getAutore());
        contenuto.setText(p.getContenuto());
        data.setText(p.getDataPubblicazione());
        String url = p.getAutore_img();
        if (url != "images/user.png") {
            ImageLoader imageLoader = ImageLoader.getInstance();
            imageLoader.displayImage(url, imageView);

        }


        return convertView;
    }

}