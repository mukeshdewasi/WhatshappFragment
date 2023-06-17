package com.app.whatsapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.whatsapp.Data.ChatData
import com.app.whatsapp.databinding.ChatscreenBinding
import com.app.whatsapp.databinding.FragmentChatBinding

class ChatAdapter(var context:Context,var list:MutableList<ChatData>):
    RecyclerView.Adapter<ChatAdapter.Myviewholder>() {
    lateinit var binding: ChatscreenBinding

        class Myviewholder(var bind:ChatscreenBinding):RecyclerView.ViewHolder(bind.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        binding=ChatscreenBinding.inflate(LayoutInflater.from(context),parent,false)
        return Myviewholder(binding)
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
        var list=list[position]
        holder.bind.ivProfile.setImageResource(list.image)
        holder.bind.userName.text="${list.name}"
        holder.bind.lastMessage.text="${list.message}"
        holder.bind.lastTime.text="${list.time}"
        holder.bind.notification.text="${list.notification}"

    }

    override fun getItemCount(): Int {
        return list.size
    }
}