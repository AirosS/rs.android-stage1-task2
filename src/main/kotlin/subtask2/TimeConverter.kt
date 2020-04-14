package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        val hours = hour.toInt()
        val minutes = minute.toInt()
        var finaltime = ""
        var i=0
        var j=0
        val timeArray = arrayOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine","ten",
            "eleven", "twelve","thirteen", "fourteen", "quarter", "sixteen", "seventeen","eighteen", "nineteen", "twenty",
            "twenty one", "twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven", "twenty eight", "twenty nine","half")
        if((hour.toInt()>12)||(hour.toInt()<0)||(hour.isEmpty())||(minute.toInt()>59)||(minute.toInt()<0)||(minute.isEmpty()))
        {
            return ""
        }
        else
        {     if(minutes==30)
              { j=hour.toInt()
              finaltime="half past "+ timeArray[j-1]}
              if(minutes==15)
              { j=hour.toInt()
                finaltime="quarter past "+ timeArray[j-1]}
              if(minutes==45)
              { j=hour.toInt()
                finaltime="quarter to "+ timeArray[j]}
              if(minutes==0)
              { j=hour.toInt()
                  finaltime= timeArray[j-1]+ " o' clock" }
              if((minutes<30)&&(minutes!=15)&&(minutes!=0))
              { i=minute.toInt()
                j=hour.toInt()
                finaltime=timeArray[i-1] + " minutes past "+ timeArray[j-1]}

            if((minutes>30)&&(minutes!=45))
            {i=minute.toInt()
                j=hour.toInt()
            finaltime=timeArray[59-i]+" minutes to "+timeArray[j]}
        }
        return finaltime


    }
}
