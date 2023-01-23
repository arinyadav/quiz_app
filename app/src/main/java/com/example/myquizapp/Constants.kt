package com.example.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "toal_questions"
    const val CORRECT_ANSWERS: String = "correct_questions"



    fun getQuestions() : ArrayList<Question> {
        val questionsLists = ArrayList<Question>()

        val que1 = Question(
            1,"What country this flag belong to?",R.drawable.argentina,"INDIA","AUSTRALIA",
            "ARGENTINA","FIZI",3
        )
        questionsLists.add(que1)

        val que2 = Question(
            2,"What country this flag belong to?",R.drawable.australia,"INDIA","AUSTRALIA",
            "ARGENTINA","FIZI",2
        )
        questionsLists.add(que2)

        val que3 = Question(
            3,"What country this flag belong to?",R.drawable.belgium,"BELGIUM","AUSTRALIA",
            "ARGENTINA","FIZI",1
        )
        questionsLists.add(que3)

        val que4 = Question(
            4,"What country this flag belong to?",R.drawable.brazil,"INDIA","BRAZIL",
            "ARGENTINA","FIZI",2
        )
        questionsLists.add(que4)

        val que5 = Question(
            5,"What country this flag belong to?",R.drawable.denmark,"INDIA","AUSTRALIA",
            "ARGENTINA","DENMARK",4
        )
        questionsLists.add(que5)

        val que6 = Question(
            6,"What country this flag belong to?",R.drawable.fizi,"INDIA","AUSTRALIA",
            "ARGENTINA","FIZI",4
        )
        questionsLists.add(que6)

        val que7 = Question(
            7,"What country this flag belong to?",R.drawable.germany,"INDIA","AUSTRALIA",
            "ARGENTINA","GERMANY",4
        )
        questionsLists.add(que7)

        val que8 = Question(
            8,"What country this flag belong to?",R.drawable.india,"INDIA","AUSTRALIA",
            "ARGENTINA","FIZI",1
        )
        questionsLists.add(que8)

        val que9 = Question(
            9,"What country this flag belong to?",R.drawable.kuwait,"INDIA","KUWAIT",
            "ARGENTINA","FIZI",2
        )
        questionsLists.add(que9)
        return questionsLists
    }
}