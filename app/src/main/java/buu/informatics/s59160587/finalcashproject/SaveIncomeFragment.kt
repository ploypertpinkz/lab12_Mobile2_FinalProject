package buu.informatics.s59160587.finalcashproject


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160587.finalcashproject.databinding.FragmentSaveIncomeBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class SaveIncomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Timber.i("Svae Income Page Called")
        val binding = DataBindingUtil.inflate<FragmentSaveIncomeBinding>(inflater,R.layout.fragment_save_income,container,false)
        return binding.root
    }


}
