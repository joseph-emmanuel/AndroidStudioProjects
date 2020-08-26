package com.joseph.day_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources=getResources();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem itemGotClicked) {

        Log.e("/", "onOptionsItemSelected: "+itemGotClicked.getItemId());
        ImageView imageViewMain=findViewById(R.id.main_imageMain);
        switch (itemGotClicked.getItemId()){
            case R.id.menu_cat:
                imageViewMain.setImageResource(R.drawable.a1);
                break;
            case R.id.menu_dog:
                imageViewMain.setImageResource(R.drawable.a2);
                break;
            case R.id.menu_alert:
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                final String[] myArray=getResources().getStringArray(R.array.myarray);
                builder.setTitle("Pop-Up");
                final String[] values={"A","B","C"};
                builder.setItems(myArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int pos) {
                        Log.e("/", "onClick: happend for array : "+myArray[pos] );
                    }
                });
                builder.create()
                        .show();
                break;
            case R.id.menu_dialog:
                AlertDialog.Builder dialogBuilder=new AlertDialog.Builder(this);
                dialogBuilder.setTitle("Dialog Choice");
                View customDialog=getLayoutInflater().inflate(R.layout.custom,null);
                dialogBuilder.setView(customDialog);
                dialogBuilder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       AlertDialog cusomView= (AlertDialog)dialog;
                        EditText firstName=cusomView.findViewById(R.id.fname);
                        EditText lastName=cusomView.findViewById(R.id.lname);
                        Log.e("", "First Name: "+firstName.getText());
                        Log.e("", " Last Name : "+lastName.getText() );

                    }
                });
                dialogBuilder.setNegativeButton("Refuce", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e("/", "onClick: on dialog Good" );
                    }
                });
                dialogBuilder.create()
                        .show();
                break;
            default:

        }
        return true;
    }
}