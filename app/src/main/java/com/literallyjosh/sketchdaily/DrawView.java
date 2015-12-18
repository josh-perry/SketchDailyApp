package com.literallyjosh.sketchdaily;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class DrawView extends View implements View.OnTouchListener {
//    List<Point> points = new ArrayList<>();
    Paint paint = new Paint();

    List<Stroke> strokes = new ArrayList<>();

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setFocusable(true);
        setFocusableInTouchMode(true);

        this.setOnTouchListener(this);

        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Point point = new Point();
        point.x = event.getX();
        point.y = event.getY();

//        points.add(point);
        invalidate();

        return true;
    }

    @Override
    public void onDraw(Canvas canvas) {
//        for (Point point : points) {
//            canvas.drawCircle(point.x, point.y, 5, paint);
//        }
    }
}

class Point {
    float x, y;
}