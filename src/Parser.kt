object Parser {

    fun parser(sentence: String): String{
        val result = StringBuilder()
        val words = sentence.split(" ")
        for (word in words) {
            val subWord = word.substring(1, word.length - 1)
            val count = subWord.toSet().size
            result.append("${word[0]}$count${word[word.length - 1]}")
            result.append(" ")
        }
        return result.toString().trim()
    }
}