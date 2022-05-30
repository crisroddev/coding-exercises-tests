##Solving problem
1. Understand what are the outputs
#################################
Example: "Given your birthday and the current date, calculate your age in days"
`Inputs: Two Dates`
1.1 What are the set of valid inputs (Assumptions):
`Second date must not be before first date`
`First_Date <= Second Date`
`Check Date its in Gregorian Calendar`

1.2 Understand How Inputs are Represented
`class daysBetweenDates(year1, month1, day1,
year2, month2, day2. ){}`

2. What are the outputs
######################################
Example: "Given your birthday and the current date, calculate your age in days"
`Outputs: Calculate your age un days`
2.1 How you should specify the output
`Return a number giving the number of days between
the first_date and second_date`

3. Solve the Problem

######################################
# Next Step --> Relationship - some examples
As you know the Inputs and Outputs, work out examples
## Examples
- For each, give the expected output or undefined if there is  no defined output
`daysBetweenDays(2012, 12, 7, 2012, 12, 7){} = [0]`
`daysBetweenDays(2012, 12, 7, 2012, 12, 8){} = [1]`
`daysBetweenDays(2012, 12, 8, 2012, 12, 7){} = [Undefined]`
`daysBetweenDays(2012, 6, 29, 2013, 6, 29){} = [+365]`
`daysBetweenDays(2012, 6, 29, 2013, 6, 31){} = [Undefined]`

######################################
4. Simple Mechanism Solution
## Example
`daysBetweenDays(2013, 1, 24, 2013, 6, 29){}`
4.1 As a human I could count the days in a calendar
`7 + 28 + 31 + 30 + 31 + 29 = 156`
4.2 Harder problem add years
`daysBetweenDays(2013, 1, 24, 2024, 6, 29){}`
```aidl
days in years
2013 --> 365
2014
.
.
.
2024 --> 366
```
4.3 Pseudo Code
`days = # of days in month1 - day1 = 31 - 24 = 7`
`month1 ++ 1`
`while (month1 < month2){
    days ++ # of days in month1
    month1 ++1
}
days == day2
while (year1 < year2){
    days ++ days in year1
}
`
4.4 Find a simpler way
- Like counting days in the calendar
```aidl
days = 0;
while(date1 < date2){
date1 = day after date1
days ++ 1
return days
}
```
###############################
5. Define the procedure
`method that takes year, month, day nextDay(y, m, d)
that takes avalid input date and return as year, month, day
Assume that every month has 30 days
   private static int nextDayEx(int year, int month, int day) {
   if (day < 30) {
   return year + month + day + 1;
   } else {
   if (month < 12) {
   return year + month + 1 + day + 1;
   }
   }
   return 0;
   }
`
5.1 Define a Dates between dates procedure
`Aproximate daysBetweenDates giving a correct nextDay procedure`
`dateIsBefore(year1, month1, day1, year2, month2, day2)`
```aidl
private static boolean dateIsBefore(int year1, int month1, int day1, int year2, int month2, int day2){
        if (year1 < year2){
            return true;
        } else if (year1 == year2){
            if(month1 < month2){
                return true;
            } else if (month1 == month2){
                return day1 < day2;
            }
        }
        return false;
    }
``` 
```
private static int daysBetweenDate(int year1, int month1, int day1, int year2, int month2, int day2){
        int days = 0;
        while (dateIsBefore(year1, month1, day1, year2, month2, day2)){
            year1, month1, day1 = nextDayEx(year1, month1, day1);
            days++1;
        }
        return days;
    }
```
6. Add Assertions if it failed
```aidl
if(year1, month1, day1 > year2, month2, day2){
return -1;
}
```
7. Do Test Cases













