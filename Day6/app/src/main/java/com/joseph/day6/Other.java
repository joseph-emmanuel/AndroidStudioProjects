package com.joseph.day6;

import android.util.Log;
import android.os.Process;
import android.widget.TextView;

public class Other implements  Runnable {
    TextView textView;
    public  Other(TextView textView){
        this.textView=textView;
    }
    @Override
    public void run() {
        //usually set low priority
        Process.setThreadPriority(Process.THREAD_PRIORITY_BACKGROUND);
        Log.e("TAG", " ia m run: ");
        for (int i=0;i<10;i++){
            textView.setText("The thread text is : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
