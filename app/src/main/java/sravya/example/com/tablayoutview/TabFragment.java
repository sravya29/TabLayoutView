package sravya.example.com.tablayoutview;

/**
 * Created by SRAVYA on 02-03-2018.
 */

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class TabFragment extends Fragment {

    private int position;
    private TextView content;
    private ImageView image;

    public static Fragment getInstance(int position) {
        TabFragment f = new TabFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get data from Argument
        position = getArguments().getInt("position");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        image = (ImageView) view.findViewById(R.id.image);
        content = (TextView) view.findViewById(R.id.textView);

        setContentView();
    }

    private void setContentView() {
        if (position == 0) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.event1);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

           image.setImageResource(R.drawable.event1);
            /*content.setText("Description: Should create 10 website\n" +
                    "Venue:R-305\n" +
                    "₹40 per team");

            final int[] status = new int[1];
            status[0] = 0;

                image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //boolean flag = true;

                        if (status[0] == 0) {
                            //image.setBackgroundResource(000000);
                            image.setImageResource(R.drawable.event1);
                            content.setText(null);
                            status[0] = 1;

                        } else {
                           // image.setImageResource(R.drawable.event1);
                            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.event1);
                            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
                            image.setImageResource(000000);
                            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));
                            content.setText("Description: Should create 10 website\n" +
                                    "Venue:R-305\n" +
                                    "₹40 per team");

                            status[0] = 0;
                        }
                    }

                });*/
    //content.setTextColor(Color.parseColor("#B2BEB5"));

        }
        else if (position == 1) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.awalkinthedark);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.awalkinthedark);
          //  content.setText("This is Second Fragment");
        } else if (position == 2) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.beycode);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.beycode);
            //content.setText("This is Third Fragment");
        }
        else if (position == 3) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.techtrix);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.techtrix);
            //content.setText("This is Third Fragment");
        }else if (position == 4) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cryptothon);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.cryptothon);
            content.setText("This is Third Fragment");
        }
        else if (position == 5) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.anwesha);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.anwesha);
          //  content.setText("This is Third Fragment");
        }else if (position == 6) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.criminalcase);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.criminalcase);
            //content.setText("This is Third Fragment");
        }else if (position == 7) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.aeroplanechess);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.aeroplanechess);
            //content.setText("This is Third Fragment");
        }else if (position == 8) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.kncokofftournamnet);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.kncokofftournamnet);
           // content.setText("This is Third Fragment");
        }
        else if (position == 9) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dealornodeal);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.dealornodeal);
            //content.setText("This is Third Fragment");
        }
        else if (position == 10) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.poster);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.poster);
            //content.setText("This is Third Fragment");
        }
        else if (position == 11) {
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.alpatchino);
            Bitmap blurredBitmap = BlurBuilder.blur(getContext(), originalBitmap );
            image.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

            image.setImageResource(R.drawable.alpatchino);
           // content.setText("This is Third Fragment");
        }
        else if (position == 12) {
            image.setImageResource(R.mipmap.ic_launcher);
            content.setText("This is Third Fragment");
        }

        else {
            image.setImageResource(R.mipmap.ic_launcher);
            content.setText("This is Fragment");
        }
    }
}