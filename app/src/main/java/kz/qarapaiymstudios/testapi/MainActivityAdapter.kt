package kz.qarapaiymstudios.testapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kz.qarapaiymstudios.testapi.data.model.Laureats
import kz.qarapaiymstudios.testapi.databinding.AdapterMainItemBinding

class MainActivityAdapter() : RecyclerView.Adapter<MainActivityAdapter.ViewHolder>() {

    private lateinit var listApi: List<Laureats.Laureate>

    inner class ViewHolder(private val binding: AdapterMainItemBinding ) :
        RecyclerView.ViewHolder(binding.root) {
            fun initContent(item:Laureats.Laureate){
                binding.adapterText.text = item.fullName.en
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdapterMainItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int  = listApi.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.initContent(listApi[position])
    }

    fun submitList(list : List<Laureats.Laureate>){
        listApi = list
    }
}