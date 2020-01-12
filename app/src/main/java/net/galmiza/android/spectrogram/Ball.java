package net.galmiza.android.spectrogram;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class Ball {

    private float ballRadius;
    private float ballX = this.ballRadius + this.ballRadius / 4;
    private float ballY = this.ballRadius + this.ballRadius / 2;
    private float ballSpeedX;
    private float ballSpeedY;
    private RectF ballBounds;
    private Paint paint;

    public Ball(float ballX, float ballY, float radius, int ballSpeedX, int ballSpeedY, int alpha, int red, int green, int blue) {
        this.ballX = ballX;
        this.ballY = ballY;
        this.ballRadius = radius;

        this.ballSpeedX = ballSpeedX;
        this.ballSpeedY = ballSpeedY;

        this.ballBounds = new RectF();
        this.paint = new Paint();

        this.setColor(alpha, red, green, blue);
    }

    public Ball(float ballX, float ballY, float radius, int alpha, int red, int green, int blue) {

        this.ballX = ballX;
        this.ballY = ballY;
        this.ballRadius = radius;

        this.ballBounds = new RectF();
        this.paint = new Paint();

        this.setColor(alpha, red, green, blue);
    }

    public void setColor(int alpha,int red,int green,int blue) {

        this.paint.setARGB(alpha, red, green, blue);

    }

    public void setBallSpeed(float speedX,float speedY) {
        this.ballSpeedX = speedX;
        this.ballSpeedY =speedY;

    }

    public void update(int xMin,int xMax,int yMin,int yMax) {

        this.ballX += this.ballSpeedX;
        this.ballY += this.ballSpeedY;

        if (this.ballX + this.ballRadius > xMax) {
            this.ballSpeedX = -this.ballSpeedX;
            this.ballX = xMax - this.ballRadius;
        }

        if (this.ballX - this.ballRadius < xMin) {
            this.ballSpeedX = -this.ballSpeedX;
            this.ballX = xMin + this.ballRadius;
        }

        if (this.ballY + this.ballRadius > yMax) {
            this.ballSpeedY = -this.ballSpeedY;
            this.ballY = yMax - this.ballRadius;
        }
        if (this.ballY + this.ballRadius < yMin) {
            this.ballSpeedY = -this.ballSpeedY;
            this.ballY = yMin + this.ballRadius;
        }
    }

    public void draw(Canvas canvas) {
        this.ballBounds.set(this.ballX-this.ballRadius,this.ballY-this.ballRadius,this.ballX+this.ballRadius,this.ballY-this.ballRadius);
        canvas.drawOval(this.ballBounds,this.paint);
    }


}


