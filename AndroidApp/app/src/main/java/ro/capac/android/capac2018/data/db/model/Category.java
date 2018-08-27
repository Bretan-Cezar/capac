package ro.capac.android.capac2018.data.db.model;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;

import java.util.ArrayList;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import ro.capac.android.capac2018.R;

public class Category {
    public String name;
    public int image;

    public Category(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public static ArrayList<Category> getAllCategories(){
        ArrayList<Category> categories = new ArrayList<>();

        categories.add(new Category("Basketball", R.drawable.basketball));
        categories.add(new Category("Bowling", R.drawable.bowling));
        categories.add(new Category("Canoeing", R.drawable.canoeing));
        categories.add(new Category("Chess & board games", R.drawable.chess));
        categories.add(new Category("Cycling", R.drawable.cycling));
        categories.add(new Category("Football", R.drawable.football));
        categories.add(new Category("Golf", R.drawable.golf));
        categories.add(new Category("Gym", R.drawable.gym));
        categories.add(new Category("Handball", R.drawable.handball));
        categories.add(new Category("Hiking", R.drawable.hiking));
        categories.add(new Category("Ice skating", R.drawable.iceskating));
        categories.add(new Category("Pool", R.drawable.pool));
        categories.add(new Category("Running", R.drawable.running));
        categories.add(new Category("Skiing", R.drawable.skiing));
        categories.add(new Category("Snowboarding", R.drawable.snowboarding));
        categories.add(new Category("Swimming", R.drawable.swimming));
        categories.add(new Category("Table tennis", R.drawable.tabletennis));
        categories.add(new Category("Tennis", R.drawable.tennis));
        categories.add(new Category("Volleyball", R.drawable.volleyball));



        /*
        categories.add(new Category("Basketball", R.drawable.ic_basketball_1));
        categories.add(new Category("Swimming", R.drawable.ic_swimsuit));
        categories.add(new Category("Tennis",R.drawable.ic_tennis));
        categories.add(new Category("Football",R.drawable.ic_football));
        categories.add(new Category("Ping-Pong", R.drawable.ic_pingpong));
        categories.add(new Category("Jogging", R.drawable.ic_treadmill));
        categories.add(new Category("Golf",R.drawable.ic_golf));
        categories.add(new Category("Skiing",R.drawable.ic_ski));
        categories.add(new Category("Snowboarding",R.drawable.ic_snowboard));
        categories.add(new Category("Surf",R.drawable.ic_surf));
        categories.add(new Category("Gym Session",R.drawable.ic_weightlifting));
        categories.add(new Category("American Football",R.drawable.ic_american_football));
        categories.add(new Category("Bowling",R.drawable.ic_bowling));
        categories.add(new Category("Boxing",R.drawable.ic_boxing));
        categories.add(new Category("Chess",R.drawable.ic_chess));
        categories.add(new Category("Hiking",R.drawable.ic_climbing));
        categories.add(new Category("Cricket",R.drawable.ic_cricket));
        categories.add(new Category("Fencing",R.drawable.ic_fencing));
        categories.add(new Category("Hockey",R.drawable.ic_hockey));
        categories.add(new Category("Sailing",R.drawable.ic_kayak));
        categories.add(new Category("Yoga",R.drawable.ic_mat));
        categories.add(new Category("Card Games",R.drawable.ic_poker));
        categories.add(new Category("Pool",R.drawable.ic_pool));
        categories.add(new Category("Voleyball",R.drawable.ic_volleyball));*/
        return categories;
    }
}
