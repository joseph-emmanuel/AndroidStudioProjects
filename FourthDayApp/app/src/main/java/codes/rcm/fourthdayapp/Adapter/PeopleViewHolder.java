package codes.rcm.fourthdayapp.Adapter;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import codes.rcm.fourthdayapp.R;

public class PeopleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView profileImage;
    ImageView heart;
    TextView like;

    public PeopleViewHolder(@NonNull View customActivity) {
        super(customActivity);

        profileImage = customActivity.findViewById(R.id.customRecycler_image);
        heart = customActivity.findViewById(R.id.heartblank);
        like = customActivity.findViewById(R.id.like);
        customActivity.setOnClickListener(this);

    }
    //Bind data to View elements
    public void bind(People people)
    {
        profileImage.setImageResource(people.profileImage);
        heart.setImageResource(people.heart);
    }
    @Override
    public void onClick(View v) {
//        int k=Integer.parseInt(like.getText().toString());
//        k++;
//        like.setText(String.valueOf(k));
        Log.e("profileImage", profileImage.toString() );
        Log.e("heart", heart.toString() );

    }
}
