// ViewHolder code for RecyclerView
package mhw.inventory.viewholder;


import android.view.View;
import android.widget.TextView;

public class resourceViewHolder extends RecyclerView.ViewHolder {
        TextView examName;
        TextView examMessage;
        TextView examDate;
        View view;

    public resourceViewHolder(View itemView) {
        super(itemView);
        examName
                = (TextView)itemView
                .findViewById(R.id.examName);
        examDate
                = (TextView)itemView
                .findViewById(R.id.examDate);
        examMessage
                = (TextView)itemView
                .findViewById(R.id.examMessage);
        view  = itemView

    }
}
