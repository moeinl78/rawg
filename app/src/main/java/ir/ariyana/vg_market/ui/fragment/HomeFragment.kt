package ir.ariyana.vg_market.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.ariyana.vg_market.databinding.FragmentHomeBinding
import ir.ariyana.vg_market.model.VideoGameList
import ir.ariyana.vg_market.ui.adapter.AdapterRecycler
import ir.ariyana.vg_market.ui.main.MainViewModel
import ir.ariyana.vg_market.utils.Resource
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class HomeFragment: Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: AdapterRecycler
    private val mainViewModel by sharedViewModel<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        mainViewModel.getGameList()

        mainViewModel
            .gameList
            .observe(viewLifecycleOwner) { res ->

                when (res) {

                    is Resource.Success -> {
                        adapter = AdapterRecycler(res.data?.results as ArrayList<VideoGameList.Result>)
                        binding.fragmentHomeRecyclerView.adapter = adapter
                        binding.fragmentHomeRecyclerView.layoutManager = LinearLayoutManager(binding.root.context, RecyclerView.HORIZONTAL, false)
                    }

                    is Resource.Error -> {

                    }

                    is Resource.Loading -> {

                    }
                }
            }
    }
}