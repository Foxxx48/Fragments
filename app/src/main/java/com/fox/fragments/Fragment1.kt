package com.fox.fragments

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.fox.fragments.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private var _binding: Fragment1Binding? = null
    private val binding get() = _binding!!

//    lateinit var onFragmentSendDataListener: OnFragmentSendDataListener
//
//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        try {
//            onFragmentSendDataListener = context as OnFragmentSendDataListener
//        } catch (e: ClassCastException) {
//            throw ClassCastException("$context должен реализовывать интерфейс OnFragmentInteractionListener")
//        }
//
//
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment1Binding.inflate(layoutInflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onResume() {
        super.onResume()

        val autoCompleteTextView = binding.fr1Et

        val cats = resources.getStringArray((R.array.bicycles))
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, cats)

        autoCompleteTextView.setAdapter(arrayAdapter)

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            println("Orientation")

            binding.fr1InputText.visibility = INVISIBLE
            return;
        } else {
            binding.fr1InputText.visibility = VISIBLE
        }
    }

    fun onSendDataFragment() : String {
        return binding.fr1Et.text.toString()
    }
}