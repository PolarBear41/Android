package com.example.irentmovie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.irentmovie.R
import com.example.irentmovie.data.models.Post

class PostAdapter : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    private var posts: List<Post> = emptyList()

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_ad, parent, false)
        return PostViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentPost = posts[position]
        holder.itemView.findViewById<TextView>(R.id.tv_content).text = currentPost.content
        holder.itemView.findViewById<TextView>(R.id.tv_price).text = currentPost.price
        holder.itemView.findViewById<TextView>(R.id.tv_period).text = currentPost.period
        holder.itemView.findViewById<TextView>(R.id.tv_type).text = currentPost.type
    }

    override fun getItemCount(): Int = posts.size

    fun setPosts(newPosts: List<Post>) {
        posts = newPosts
        notifyDataSetChanged()
    }
}