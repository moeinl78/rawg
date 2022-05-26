package ir.ariyana.vg_market.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ir.ariyana.vg_market.model.VideoGameList
import ir.ariyana.vg_market.repository.MainRepository
import ir.ariyana.vg_market.utils.Constants
import ir.ariyana.vg_market.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class MainViewModel(
    private val mainRepository: MainRepository
    ): ViewModel() {

    private val _gameList = MutableLiveData<Resource<VideoGameList>>()

    val gameList: LiveData<Resource<VideoGameList>>
        get() = _gameList

    fun getGameList() {
        _gameList.postValue(Resource.Loading())
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val res = mainRepository.getVideoGameList()
                if (res.isSuccessful) {
                    _gameList.postValue(Resource.Success(res.body()!!))
                }
                _gameList.postValue(Resource.Error(res.message()))
            }
            catch (e: Exception) {
                Timber.e(e.message!!)
            }
        }
    }
}