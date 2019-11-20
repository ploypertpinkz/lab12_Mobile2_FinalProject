package buu.informatics.s59160587.finalcashproject


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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
            Toast.makeText(context, "goto SaveIncome", Toast.LENGTH_SHORT).show().run {
                view.findNavController().navigate(R.id.action_mainBankFragment_to_saveIncomeFragment)
            }
        }
        binding.outcomeButton.setOnClickListener { view ->
            Timber.i("outcome Button Called")
            Toast.makeText(context, "goto SaveOutcome", Toast.LENGTH_SHORT).show().run {
                view.findNavController().navigate(R.id.action_mainBankFragment_to_saveOutcomeFragment)
            }
        }
        binding.deleteButton.setOnClickListener { view ->
            Timber.i("deleteButton Called")
            Toast.makeText(context, "Delete All data", Toast.LENGTH_SHORT).show()
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        Timber.i("onCreateOptionsMenu in Main Page Called")
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.drawer, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Timber.i("onOptionsItemSelected in Main Page Called")
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController()) || super.onOptionsItemSelected(item)
    }


}
