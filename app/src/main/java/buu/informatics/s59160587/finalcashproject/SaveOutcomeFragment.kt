package buu.informatics.s59160587.finalcashproject


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.s59160587.finalcashproject.databinding.FragmentSaveOutcomeBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class SaveOutcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Timber.i("Save Outcome Page Called")
        val binding = DataBindingUtil.inflate<FragmentSaveOutcomeBinding>(inflater,R.layout.fragment_save_outcome,container,false)
        binding.saveOutcomeButton.setOnClickListener { view ->
            Timber.i("saveOutcomeButton Called")
            Toast.makeText(context, "goto Main Page", Toast.LENGTH_SHORT).show().run {
                view.findNavController().navigate(R.id.action_saveOutcomeFragment_to_mainBankFragment)
            }
        }
        return binding.root
    }


}
