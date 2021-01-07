/**
 * In the programming language of your choice, write a program that parses a sentence
 * and replaces each word with the following: first letter,
 * number of distinct characters between first and last character, and last letter.
 * For example, Smooth would become S3h.  Words are separated by spaces or non-alphabetic
 * characters and these separators should be maintained in their original form and
 * location in the answer.
 * **/

fun main() {
    val sentence = readLine()!!
    println(Parser.parser(sentence))
}