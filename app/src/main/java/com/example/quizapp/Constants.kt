package com.example.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.america,
            "United States",
            "China",
            "Japan",
            "Germany",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
                2,
                "What country does this flag belong to?",
                R.drawable.canada,
                "United Kingdom",
                "Canada",
                "France",
                "Italy",
                2
        )

        questionsList.add(que2)

        val que3 = Question(
                3,
                "What company does this logo belong to?",
                R.drawable.apple,
                "Amazon",
                "Microsoft",
                "Apple",
                "google",
                3
        )

        questionsList.add(que3)

        val que4 = Question(
                4,
                "What company does this logo belong to?",
                R.drawable.mercedes,
                "VolksWagen",
                "Audi",
                "BMW",
                "Mercedes",
                4
        )

        questionsList.add(que4)

        val que5 = Question(
                5,
                "What country does this flag belong to?",
                R.drawable.israel,
                "Iran",
                "Israel",
                "Qatar",
                "Syria",
                2
        )

        questionsList.add(que5)

        val que6 = Question(
                6,
                "What country does this flag belong to?",
                R.drawable.brazil,
                "Colombia",
                "Spain",
                "Argentina",
                "Brazil",
                4
        )

        questionsList.add(que6)

        val que7 = Question(
                7,
                "What country does this flag belong to?",
                R.drawable.mexico,
                "Mexico",
                "Chile",
                "Iran",
                "Egypt",
                1
        )

        questionsList.add(que7)

        val que8 = Question(
                8,
                "What country does this flag belong to?",
                R.drawable.nigeria,
                "South Africa",
                "Ethiopia",
                "Nigeria",
                "Ghana",
                3
        )

        questionsList.add(que8)

        val que9 = Question(
                9,
                "What company does this logo belong to?",
                R.drawable.nike,
                "Adidas",
                "Nike",
                "Puma",
                "New Balance",
                2
        )

        questionsList.add(que9)

        val que10 = Question(
                10,
                "What company does this logo belong to?",
                R.drawable.starbucks,
                "Starbucks",
                "McDonalds",
                "KFC",
                "BurgerKing",
                1
        )

        questionsList.add(que10)
        return questionsList
    }
}