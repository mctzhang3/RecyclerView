# RecyclerView

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).id);
        holder.mContentView.setText(mValues.get(position).content);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    // Do not treat position as fixed; only use immediately and call holder.getAdapterPosition() to look it up later
                    // mListener.onListFragmentInteraction(holder.mItem);
                    int pos = holder.getAdapterPosition();
                    mListener.onListFragmentInteraction(mValues.get(pos));
                }
            }
        });
    }
