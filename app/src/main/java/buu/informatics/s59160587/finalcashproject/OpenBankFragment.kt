package buu.informatics.s59160587.finalcashproject


import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.s59160587.finalcashproject.databinding.FragmentOpenBankBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class OpenBankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentOpenBankBinding>(inflater,R.layout.fragment_open_bank,container,false)
        binding.openBankButton.setOnClickListener { view ->
            Timber.i("Open Bank Button Called")
            Toast.makeText(context, "gotoOpenBank", Toast.LENGTH_SHORT).show().run {
                view.findNavController().navigate(R.id.action_loginBankFragment_to_openBankFragment)
            }
        }
        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        Timber.i("onCreateOptionsMenu in Open Bank Page Called")
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.option_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Timber.i("onOptionsItemSelected in Open Bank Page Called")
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController()) || super.onOptionsItemSelected(item)
    }


}
