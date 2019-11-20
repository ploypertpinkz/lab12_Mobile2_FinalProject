package buu.informatics.s59160587.finalcashproject


import android.content.ActivityNotFoundException
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160587.finalcashproject.databinding.FragmentAboutBankBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class AboutBankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentAboutBankBinding>(inflater,R.layout.fragment_about_bank,container,false)
        Timber.i("About Page Called")

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        Timber.i("onCreateOptionsMenu in About Page Called")
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.share, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Timber.i("onOptionsItemSelected in About Page Called")
        when (item.itemId) {
            R.id.shareMenu -> onShare()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun onShare() {
        Timber.i("onShare in About Page Called")
        val shareIntent = ShareCompat.IntentBuilder.from(getActivity())
            .setText("share App:")
            .setType("text/plain")
            .intent
        try {
            startActivity(shareIntent)
        } catch (ex: ActivityNotFoundException) {

        }
    }


}
