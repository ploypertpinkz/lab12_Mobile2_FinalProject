package buu.informatics.s59160587.finalcashproject


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160587.finalcashproject.databinding.FragmentMainBankBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class MainBankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMainBankBinding>(inflater,R.layout.fragment_main_bank,container,false)
        Timber.i("Main Page Called")
        return binding.root
    }


}
