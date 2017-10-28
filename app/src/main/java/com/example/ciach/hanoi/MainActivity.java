package com.example.ciach.hanoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener
{

    ImageView gameView;
    float x, y;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Drawing in a separate method
        draw();

        setContentView(gameView);
    }

    // The draw() method
    public void draw()
    {

        // Declare an object of type Bitmap
        Bitmap blankBitmap;
        // Make it 600 x 600 pixels in size
        blankBitmap = Bitmap.createBitmap(600, 600, Bitmap.Config.ARGB_8888);
        // Declare an object of type canvas
        Canvas canvas;
        // Initialize blank bitmap
        canvas = new Canvas(blankBitmap);

        // Initialize object of type ImageView
        gameView = new ImageView(this);

        // Put blank bitmap on gameView
        gameView.setImageBitmap(blankBitmap);

        // Declare an object of type Paint
        Paint paint;
        // Initialize to paint canvas
        paint = new Paint();

        // Make the canvas white
        canvas.drawColor(Color.argb(255, 255, 255, 255));

        // Make the brush blue
        paint.setColor(Color.argb(255, 26, 128, 182));

        // Draw a line for tower 1
        canvas.drawLine(100, 250, 100, 450, paint);

        // Draw a line for tower 2
        canvas.drawLine(300, 250, 300, 450, paint);

        // Draw a line for tower 3
        canvas.drawLine(500, 250, 500, 450, paint);

        // Change the brush color
        paint.setColor(Color.argb(255, 249, 129, 0));

        // Draw a rectangle for the base
        canvas.drawRect(0, 450, 700, 550, paint);

        // Change the brush color
        paint.setColor(Color.argb(255, 20, 129, 0));

        // Draw a rectangle for ring1
        canvas.drawRect(25, 400, 175, 450, paint);

        // Change the brush color
        paint.setColor(Color.argb(255, 150, 100, 100));

        // Draw a rectangle for ring2
        canvas.drawRect(50, 350, 150, 400, paint);

        // Change the brush color
        paint.setColor(Color.argb(255, 200, 12, 0));

        // Draw a rectangle for ring3
        canvas.drawRect(75, 300, 125, 350, paint);

        // Change the brush color
        paint.setColor(Color.argb(255, 200, 129, 50));

        // Draw a rectangle for ring4
        canvas.drawRect(90, 250, 110, 300, paint);


    }

    @Override
    public boolean onTouch(View v, MotionEvent event)
    {
        switch(event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                x = event.getX();
                y = event.getY();
                break;

            case MotionEvent.ACTION_UP:
                x = event.getX();
                y = event.getY();
                break;

            case MotionEvent.ACTION_MOVE:
                x = event.getX();
                y = event.getY();
                break;

        }
        return true;
    }

}

