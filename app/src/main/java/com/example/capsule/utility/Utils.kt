package com.example.capsule.utility

import com.example.capsule.fragments.NotesFragment
import com.example.capsule.fragments.QuizFragment
import com.example.capsule.fragments.VideoFragment

class Utils {
    companion object {
        val fragments = arrayOf(VideoFragment(), NotesFragment(), QuizFragment())
        val fragmentNames = arrayOf("Video", "Notes", "Quiz")
        const val pdf =
            "https://liu.diva-portal.org/smash/get/diva2:1445181/FULLTEXT01.pdf"  // sample pdf to show in webview
    }

    class Quiz {
        private var score: Int = 0
        private val bioQuestions = arrayOf(
            Question(
                "The walls of the ventricles possess thick muscular projections, they are known as",
                arrayOf(
                    "Conus arteriosus",
                    "Truncus arterosus",
                    "Columnae carneae",
                    "Chordae tendineae"
                ),
                "Columnae carneae"
            ),

            Question(
                "The hormonal regulation of cardiac output is",
                arrayOf("mediated by the adrenal medulla", "Red blood cells", "mediated by pineal", "Platelets"),
                "mediated by the adrenal medulla"
            ),

            Question(
                "The location of the neuro centre activity of the heart is",
                arrayOf("Midbrain", "Cerebrum", "Medulla Oblongata", "White blood cells"),
                "Medulla Oblongata"
            ),

            Question(
                "The tricuspid valve is present between?",
                arrayOf("Ventricle and pulmonary artery", "Ventricle and aorta", " left auricle and left ventricle", "right auricle and right ventricle"),
                "right auricle and right ventricle"
            ),

            Question(
                "What is the function of platelets in the blood?",
                arrayOf(
                    "Transporting oxygen",
                    "Blood clotting",
                    "Fighting infections",
                    "Carrying nutrients"
                ),
                "Blood clotting"
            ),

            Question(
                "What is the process by which blood forms clots to stop bleeding?",
                arrayOf("Oxygenation", "Coagulation", "Filtration", "Digestion"),
                "Coagulation"
            ),

            Question(
                "Which blood vessels carry blood away from the heart?",
                arrayOf("Veins", "Arteries", "Capillaries", "Venules"),
                "Arteries"
            ),

            Question(
                "Bundle of His is a network of",
                arrayOf("Muscle fibres present only in the ventricle wall", "muscle fibres distributed throughout the heart walls", "nerve fibres found throughout the heart", "Nerve fibres distributed in ventricles"),
                "Muscle fibres present only in the ventricle wall"
            ),

            Question(
                "Which organ produces most of the body's blood cells?",
                arrayOf("Liver", "Spleen", "Bone marrow", "Kidneys"),
                "Bone marrow"
            ),

            Question(
                "What is the name of the condition characterized by a deficiency of red blood cells or hemoglobin?",
                arrayOf("Leukemia", "Anemia", "Thrombocytosis", "Hemophilia"),
                "Anemia"
            )
        )

        var questionIndex = 0

        init {
            bioQuestions.shuffle()
        }

        fun getQuestion(): Question? {
            if (questionIndex >= bioQuestions.size) return null
            return bioQuestions[questionIndex++]
        }

        fun incrementScore() = ++score

        fun getTotalScore() = score
    }
}