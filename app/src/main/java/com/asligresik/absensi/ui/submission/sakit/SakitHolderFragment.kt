package com.asligresik.absensi.ui.submission.sakit

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.asligresik.absensi.data.repository.SubmissionRepository
import com.asligresik.absensi.ui.submission.SubmissionHolderFragment
import com.asligresik.absensi.ui.submission.SubmissionViewModelFactory

/**
 * A placeholder fragment containing a simple view.
 */
class SakitHolderFragment : SubmissionHolderFragment() {
    override fun setViewModel(submissionRepository: SubmissionRepository){
        submissionViewModel =
            ViewModelProviders.of(this,
                SubmissionViewModelFactory(
                    submissionRepository
                )
            ).get(SakitViewModel::class.java)
    }
    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): SakitHolderFragment {
            return SakitHolderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}