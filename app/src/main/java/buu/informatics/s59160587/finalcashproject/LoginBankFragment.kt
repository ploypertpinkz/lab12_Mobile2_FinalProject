package buu.informatics.s59160587.finalcashproject


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.s59160587.finalcashproject.databinding.FragmentLoginBankBinding
import kotlinx.android.synthetic.main.fragment_login_bank.*
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class LoginBankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBankBinding>(inflater,R.layout.fragment_login_bank,container,false)
        Timber.i("Login Page Called")
        binding.singinButton.setOnClickListener {view ->
            Timber.i("Singin Button Called")

            if(inputIdText.length() != 0 && inputPassText.length() != 0) {
                if(inputIdText.text.toString() == "ploy" && inputPassText.text.toString() == "12345") {
                    Toast.makeText(context, "gotoOpenBank", Toast.LENGTH_SHORT).show().run { view.findNavController().navigate(R.id.action_loginBankFragment_to_openBankFragment) }
                } else if(inputIdText.text.toString() != "ploy" && inputPassText.text.toString() == "12345") {
                    Toast.makeText(context, "Username ไม่ถูกต้อง", Toast.LENGTH_SHORT).show()
                } else if(inputIdText.text.toString() == "ploy" && inputPassText.text.toString() != "12345") {
                    Toast.makeText(context, "Password ไม่ถูกต้อง", Toast.LENGTH_SHORT).show()
                } else if(inputIdText.text.toString() != "ploy" && inputPassText.text.toString() != "12345") {
                    Toast.makeText(context, "Username เเละ Password ไม่ถูกต้อง", Toast.LENGTH_SHORT).show()
                }

            } else if(inputIdText.length() == 0 && inputPassText.length() != 0) {
                Toast.makeText(context, "กรุณากรอก Username", Toast.LENGTH_SHORT).show()
            }else if(inputIdText.length() != 0 && inputPassText.length() == 0) {
                Toast.makeText(context, "กรุณากรอก Password", Toast.LENGTH_SHORT).show()
            } else if(inputIdText.length() == 0 && inputPassText.length() == 0) {
                Toast.makeText(context, "กรุณากรอก Username เเละ Password", Toast.LENGTH_SHORT).show()
            }

        }
        return binding.root
    }


}
