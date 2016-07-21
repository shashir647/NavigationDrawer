package com.snyxius.shahiranjan.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by hailyn-pc 9 on 09/06/16.
 */
public class AvenirTextViewHeavy extends TextView {

    public AvenirTextViewHeavy(Context context) {
        super(context);
        createFont();
    }

    public AvenirTextViewHeavy(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public AvenirTextViewHeavy(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),"montana_regular.ttf");
        setTypeface(font);
    }
}
