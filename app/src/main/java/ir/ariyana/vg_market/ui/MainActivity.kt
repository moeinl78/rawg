package ir.ariyana.vg_market.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.ariyana.vg_market.R
import ir.ariyana.vg_market.databinding.ActivityMainBinding
import ir.ariyana.vg_market.ui.main.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}