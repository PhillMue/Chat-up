package mue.com.chatup;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mue on 3/20/16.
 */
public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    private List<Chat> mDataset;
    private SparseBooleanArray selectedItems;
    private Context mContext;
    private String mId;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public CardView mCardView;

        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) itemView.findViewById(R.id.tvMessage);
            //mCardView = (CardView) itemView.findViewById(R.id.card_view);
        }
    }
}
