package buu.informatics.s59160587.finalcashproject


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160587.finalcashproject.databinding.FragmentShowBankBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class ShowBankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Timber.i("Show Page Called")
        val binding = DataBindingUtil.inflate<FragmentShowBankBinding>(inflater,R.layout.fragment_show_bank,container,false)
        return binding.root
    }


}
