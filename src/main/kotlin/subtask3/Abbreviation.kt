package subtask3

import java.lang.StringBuilder

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var inputstr = a.toUpperCase()
        var outputstr = ""
        for(i in a.indices) {
            for (j in b.indices)
            {
                if(inputstr[i] == b[j]) {
                    outputstr += inputstr[i]
                }
            }
        }
        if(outputstr == b)
            return  "YES"
        else
           return "NO"

    }
}
