package com.example.greenforest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.greenforest.R;
import com.example.greenforest.entities.Object;

import java.util.ArrayList;
import java.util.List;

public class ObjectAdapter extends ListAdapter<Object, ObjectAdapter.NoteHolder> {
    private ObjectAdapter.OnItemClickListener listener;
    float ImageRadius = 40.0f;
    private List<Object> objectList=new ArrayList<>();
    String TAG = "HistoryAdapter";
    String PAYLOAD_SELECTED_INDICATOR = "PAYLOAD_SELECTED_INDICATOR";
    private int selectedPos = RecyclerView.NO_POSITION;
    int previousPosition=-1;
    public ObjectAdapter() {
        super(DIFF_CALLBACK);
    }

    private static final DiffUtil.ItemCallback<Object> DIFF_CALLBACK = new DiffUtil.ItemCallback<Object>() {
        @Override
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            return true;
        }

        @Override
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            return true;
        }
    };
    @NonNull

    public ObjectAdapter.NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.object_item_adapter, parent, false);
        return new ObjectAdapter.NoteHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ObjectAdapter.NoteHolder holder, final int position) {
        final Object currentSong = getItem(position);




    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int position, @NonNull List<java.lang.Object> payloads) {
            super.onBindViewHolder(holder, position, payloads);
            NoteHolder noteHolder=holder;
            View view=holder.itemView;
            view.setSelected(selectedPos==position);

        if (!payloads.isEmpty()) {
            java.lang.Object pay = payloads.get(0);
            if (pay instanceof String && pay.equals(this.PAYLOAD_SELECTED_INDICATOR)) {
              //  this.updateSelectedIndicator(objectList);
            }
        } else {
            super.onBindViewHolder(holder, position, payloads);
        }

    }

  /*  private final void updateSelectedIndicator(ObjectAdapter.NoteHolder noteHolder) {
        ConstraintLayout var10000 = noteHolder.getRootView();
        if (var10000 != null) {
            View var10001 = historyPreviewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(var10001, "historyPreviewHolder.itemView");
            var10000.setSelected(var10001.isSelected());
        }

    }*/

    public Object getNoteAt(int position) {
        return getItem(position);
    }



    class NoteHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView discription;
        private TextView number;
        private TextView time;
        private ConstraintLayout parentFrame;

        public NoteHolder(final View itemView) {
            super(itemView);
            //title = itemView.findViewById(R.id.title);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (listener != null && position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(getItem(position),itemView);
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Object note, View view);
    }

    public void setOnItemClickListener(ObjectAdapter.OnItemClickListener listener) {
        this.listener = listener;
    }
}