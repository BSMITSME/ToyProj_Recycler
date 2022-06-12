package com.example.jeondaeri_recyclerview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jeondaeri_recyclerview.databinding.ActivityMainBinding
//import kotlinx.android.synthetic.main.activity_main.*

//메인에서 리사이클러뷰에 넘겨줄 데이터를 만듬
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dataset : ArrayList<List<String>> = arrayListOf()
    //뷰가 화면에 그려질때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
//
//        addData()

//        //adapter을 초기화하고 데이터를 넘겨줌
//        recycler_view.adapter = RecyclerViewAdapter(dataset)
//
//        //layoutManager : 리사이클러 뷰의 뷰 홀더의 표시 형식을 여러가지로 바꿀 수 있게 해줌
//        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
//
//        //뷰 홀더 사이에 줄을 넣기 위함 addItemDecoration
//        recycler_view.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))

        binding = ActivityMainBinding.inflate(layoutInflater) //인스턴스 만들기
        setContentView(binding.root)// 화면 구현
        addData()
        binding.recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.adapter = RecyclerViewAdapter(dataset)
        binding.recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

    }
    private fun addData(){
        for(i in 0..99){
            dataset.add(listOf("$i th main", "$i th sub"))
        }
    }
}