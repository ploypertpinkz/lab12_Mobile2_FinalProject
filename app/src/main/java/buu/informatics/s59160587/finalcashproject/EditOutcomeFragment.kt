package buu.informatics.s59160587.finalcashproject


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160587.finalcashproject.databinding.FragmentEditOutcomeBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class EditOutcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Timber.i("Edit Outcome Page Called")
        val binding = DataBindingUtil.inflate<FragmentEditOutcomeBinding>(inflater,R.layout.fragment_edit_outcome,container,false)
        binding.editOutcomeButton.setOnClickListener { view ->
            Timber.i("editOutcomeButton Called")
            Toast.makeText(context, "Edit Outcome", Toast.LENGTH_SHORT).show()
        }
        binding.deleteOutcomeButton.setOnClickListener { view ->
            Timber.i("deleteOutcomeButton Called")
            Toast.makeText(context, "Delete Outcome", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }


}
