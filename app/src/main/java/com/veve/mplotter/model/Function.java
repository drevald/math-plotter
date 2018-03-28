package com.veve.mplotter.model;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by ddreval on 3/26/2018.
 */

public interface Function {

    public void plot(Canvas canvas, Paint paint);

    public float calculate();

}