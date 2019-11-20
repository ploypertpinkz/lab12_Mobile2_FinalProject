package buu.informatics.s59160587.finalcashproject


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.s59160587.finalcashproject.databinding.FragmentEditIncomeBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class EditIncomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Timber.i("Edit Income Page Called")
        val binding = DataBindingUtil.inflate<FragmentEditIncomeBinding>(inflater,R.layout.fragment_edit_income,container,false)
        binding.editIncomeButton.setOnClickListener { view ->
            Timber.i("editIncomeButton Called")
            Toast.makeText(context, "Edit Income", Toast.LENGTH_SHORT).show()
        }
        binding.deleteIncomeButton.setOnClickListener { view ->
            Timber.i("deleteIncomeButton Called")
            Toast.makeText(context, "Delete Income", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }


}
