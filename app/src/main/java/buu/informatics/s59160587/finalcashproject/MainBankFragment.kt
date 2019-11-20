package buu.informatics.s59160587.finalcashproject


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
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
        Timber.i("Main Page Called")

        val binding = DataBindingUtil.inflate<FragmentMainBankBinding>(inflater,R.layout.fragment_main_bank,container,false)
        binding.incomeButton.setOnClickListener { view ->
            Timber.i("income Button Called")
            Toast.makeText(context, "gotoOpenBank", Toast.LENGTH_SHORT).show().run {
                view.findNavController().navigate(R.id.action_mainBankFragment_to_saveIncomeFragment)
            }
        }
        binding.outcomeButton.setOnClickListener { view ->
            Timber.i("outcome Button Called")
            Toast.makeText(context, "gotoOpenBank", Toast.LENGTH_SHORT).show().run {
                view.findNavController().navigate(R.id.action_mainBankFragment_to_saveOutcomeFragment)
            }
        }

        return binding.root
    }


}
