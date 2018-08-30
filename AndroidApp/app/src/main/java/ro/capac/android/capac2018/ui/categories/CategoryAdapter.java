package ro.capac.android.capac2018.ui.categories;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ro.capac.android.capac2018.R;
import ro.capac.android.capac2018.data.db.model.Category;

public class CategoryAdapter extends ArrayAdapter<Category> {
    public CategoryAdapter(Context context, List<Category> objects){
        super(context, 0, objects);
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // get item for selected view
        final Category category = getItem(position);
        // if cell is exists - reuse it, if not - create the new one from resource
        View view = convertView;
        final ViewHolder viewHolder;
        if(convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater vi = LayoutInflater.from(getContext());
            view = vi.inflate(R.layout.item_category, parent, false);
            // binding view parts to view holder
            viewHolder.imageView = view.findViewById(R.id.category_image);
            viewHolder.textView = view.findViewById(R.id.category_title);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        // bind data from selected element to view through view holder
        viewHolder.imageView.setImageDrawable(ContextCompat.getDrawable(this.getContext(),category.image));

        viewHolder.textView.setText(category.getName());

        return view;

    }

    private static class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
