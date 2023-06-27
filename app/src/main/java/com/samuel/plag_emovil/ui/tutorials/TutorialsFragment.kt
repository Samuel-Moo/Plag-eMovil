package com.samuel.plag_emovil.ui.tutorials

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.samuel.plag_emovil.databinding.FragmentTutorialsBinding

class TutorialsFragment : Fragment() {

    private var _binding: FragmentTutorialsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val tutorialsViewModel =
            ViewModelProvider(this).get(TutorialsViewModel::class.java)

        _binding = FragmentTutorialsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTutorials
        tutorialsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}