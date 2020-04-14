package subtask5

import kotlin.reflect.KClass
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.lang.StringBuilder
class Blocks {
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        if(blockB == Int::class){
            var summa = 0
            for(i in blockA.indices){
                if(blockA[i] is Int){
                    summa += blockA[i] as Int
                }
            }
            return summa
        } else if(blockB == String::class){
            var sum = StringBuilder("")
            for(i in blockA.indices){
                if(blockA[i] is String){
                    sum.append(blockA[i] as String)
                }
            }
            return sum.toString()
        } else if(blockB == LocalDate::class){
                var log = false
            var last: LocalDate = LocalDate.now()
            for(i in blockA.indices){
                if(blockA[i] is LocalDate){
                    if((!log) || ((blockA[i] as LocalDate).compareTo(last) > 0)){
                        log = true
                        last = blockA[i] as LocalDate
                    }
                }
            }
            return last.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
        }
        else throw NotImplementedError("Not implemented")
    }
}
