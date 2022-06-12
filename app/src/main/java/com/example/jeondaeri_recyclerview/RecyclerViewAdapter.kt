package com.example.jeondaeri_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jeondaeri_recyclerview.databinding.ListItemBinding
//import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerViewAdapter (private val dataset : ArrayList<List<String>>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    //뷰 홀더를 처음 만들때 어떤 xml파일을 이용해서 만들것인지 -> 이 프로젝트에서 사용된 xml은 list_item.xml
   override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder { //뷰 홀더 만드는 방법
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
//        return ViewHolder(view)
       val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    //데이터와 만들어진 뷰홀더를 결합하는 부분
    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bind(dataset[position])
    }

    //뷰 홀더의 갯수를 정해줌
    override fun getItemCount(): Int {
     return dataset.size
    }

////    view holder정의
//    class ViewHolder(view : View): RecyclerView.ViewHolder(view){
//
//        //list_item.xml에서 가져온 view
//        private val tvMain : TextView = view.tv_main //gradle의 플러그인에 id 'kotlin-android-extensions'추가 해주어야 가져올 수 있음
//        private val tvSub : TextView = view.tv_sub
//
//        fun bind(data:List<String>){
//            tvMain.text = data[0]
//            tvSub.text = data[1]
//        }
//    }

    //ViewHolder을 viewData형식으로
    //view binding이 활성화 되는 순간 생겨나는 ListItemBinding에 의해 연동이 필요없게 됨
    class ViewHolder(private val binding:ListItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data:List<String>){
            binding.tvMain.text = data[0]
            binding.tvSub.text = data[1]
        }
    }

}