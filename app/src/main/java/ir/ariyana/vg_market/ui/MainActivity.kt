package ir.ariyana.vg_market.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import ir.ariyana.vg_market.R
import ir.ariyana.vg_market.databinding.ActivityMainBinding
import ir.ariyana.vg_market.ui.main.MainViewModel
import ir.ariyana.vg_market.utils.Resource
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = Navigation.findNavController(this, R.id.mainFragmentContainerView)
        val bottomNavigationView = binding.mainBottomNavigation
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }
}