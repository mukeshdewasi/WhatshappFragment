package com.app.whatsapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.whatsapp.Adapter.ChatAdapter
import com.app.whatsapp.Data.ChatData
import com.app.whatsapp.R
import com.app.whatsapp.databinding.FragmentChatBinding


class ChatFragment : Fragment() {
    lateinit var binding: FragmentChatBinding
    var chatlist= mutableListOf<ChatData>()
    lateinit var cAdapter:ChatAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentChatBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chatlist.add(ChatData(1, "Krishna","Hyy","4:15pm",2,R.drawable.man))
        chatlist.add(ChatData(1, "Krishna","Hyy","4:15pm",2,R.drawable.man))
        chatlist.add(ChatData(1, "Krishna","Hyy","4:15pm",2,R.drawable.man))
        chatlist.add(ChatData(1, "Krishna","Hyy","4:15pm",2,R.drawable.man))
        chatlist.add(ChatData(1, "Krishna","Hyy","4:15pm",2,R.drawable.man))
        chatlist.add(ChatData(1, "Krishna","Hyy","4:15pm",2,R.drawable.man))
        chatlist.add(ChatData(1, "Krishna","Hyy","4:15pm",2,R.drawable.man))
        chatlist.add(ChatData(1, "Krishna","Hyy","4:15pm",2,R.drawable.man))
        chatlist.add(ChatData(1, "Krishna","Hyy","4:15pm",2,R.drawable.man))

        cAdapter= ChatAdapter(requireContext(),chatlist)
        binding.chatRecyclerview.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        binding.chatRecyclerview.adapter=cAdapter



    }



}