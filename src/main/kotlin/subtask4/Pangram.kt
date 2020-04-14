package subtask4

class Pangram {
    private val vowels: List<Char> = listOf('a', 'e', 'i', 'o', 'u', 'y')

    private fun buf(isPangram: Boolean, input: String): Pair<Int, String> {
        var count = 0
        var resstr = ""
        for (i in input.indices)
        {
            if ((isPangram && vowels.contains(input[i])) || (!isPangram && !vowels.contains(input[i].toLowerCase()) && input[i].toLowerCase() in 'a'..'z')) {
                count++
                resstr += input[i].toUpperCase().toString()
            } else resstr += input[i].toString()
        }
        return Pair(count, count.toString() + resstr)
    }

    fun getResult(inputString: String): String {
        var count = 0
        var char = 'A'
        while (char <= 'Z')
        {
            if (inputString.contains(char, true)) count++
            ++char
        }
        val bufres = mutableListOf<Pair<Int, String>>()
        val arstr = Regex("\\s{2,}+")
        val res = inputString.replace(arstr, " ").split(' ').filter { it.isNotEmpty() }
        val isPangram = count == 26
        for (i in res.indices)  bufres.add(buf(isPangram,res[i]))
        bufres.sortBy { it.first }
        val result = bufres.joinToString(" ") { it.second }
        return result
    }
}