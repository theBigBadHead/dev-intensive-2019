package ru.skillbranch.devintensive.utils

object Utils {
    //todo fix here
    fun parseFullName(fullName:String?, divider: String = " "): Pair<String?, String?> {
        val parts : List<String>? = fullName?.split(divider)

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return Pair(firstName, lastName)
    }
    fun changeWordLiteral(word: String) : String {
        val listLiteralRus : MutableList<String> = mutableListOf("а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","Ф","х","ц","ч","ш","щ","ъ","ы","ю","я")
        val listLiteralEng : MutableList<String> = mutableListOf("a","b","v","g","d","e","e","zh","z","i","i","k","l","m","n","o","p","r","s","t","u","f","h","c","ch","sh","sh","i","yu","ya")
        var newWord : String = ""
        for (i in 0 .. (word.length - 1))
        {
            for(j in 0 .. (listLiteralRus.size - 1))
            {
                if(word[i].toString() == listLiteralRus[j]) {
                    newWord += listLiteralEng[j]
                }
                else{
                    return word
                }
            }
        }
        //println(newWord)
        return newWord
    }
    fun translititeration(payload: String, divider:String = " "): String {
        val fullName = parseFullName(payload, divider)

        return changeWordLiteral(fullName.first.toString()) + divider.toString() + changeWordLiteral(fullName.second.toString())

    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        val first:String
        val second:String
        if (firstName == null) {
            first = ""
        }
        else
            first = firstName?.toUpperCase()?.get(0)?.toString()
        if (lastName == null) {
            second = ""
        }
        else
            second = lastName?.toUpperCase()?.get(0)?.toString()
        return first + second
    }
}