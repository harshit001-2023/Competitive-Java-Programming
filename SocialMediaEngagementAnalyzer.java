/*2. Social Media Engagement Analyzer
Easy
100 points
• 120 min suggested
Problem Description
People use different social media platforms with varying levels of engagement.
You must build a program that categorizes a user based on platform type and screen time usage.

✅ Input Requirements

You must take two inputs:

1️⃣ Platform Name — String (case-insensitive)
2️⃣ Daily Usage Hours — int (must be ≥ 0)

✅ Platform Classification Rules
Image-based Platforms

INSTAGRAM, FACEBOOK, SNAPCHAT
→ "Image-based Social Platform"

Microblogging & Discussion Platforms

TWITTER, THREADS, REDDIT
→ "Microblogging Discussion Platform"

Video Entertainment Platforms

YOUTUBE, TIKTOK, MOJ, ROPOSO
→ "Video Content Platform"


Additional Condition Inside Switch

If daily usage hours > 5, return:

High Usage — Consider reducing screen time

Finally print:

PLATFORM → RESULT

 Input Format
----------------
<platform>
<daily_usage_hours>

Output Format
----------------
PLATFORM → RESULT




If the given platform does NOT match any known list:

Unknown or Unsupported Platform

Examples
Example 1
Input:
Instagram
3
Output:
INSTAGRAM → Image-based Social Platform
Explanation:
NOTE :- USE trim() for empty String validation*/


void main(){
    String Platform_Name = IO.readln().toUpperCase();
    int Daily_Usage_Hrs = Integer.parseInt(IO.readln());

    if(Daily_Usage_Hrs <= 0){
        IO.println("No zero"); return;
    }
    else if(Daily_Usage_Hrs>0 && Daily_Usage_Hrs<6){
        String result = switch(Platform_Name){
            case "INSTAGRAM", "FACEBOOK", "SNAPCHAT"-> "Image-based Social Platform";
            case "TWITTER", "THREADS", "REDDIT" -> "Microblogging Discussion Platform";
            case "YOUTUBE", "TIKTOK", "MOJ", "ROPOSO" -> "Video Content Platform";
            default -> "Unknown or Unsupported Platform";
        };

        IO.println(Platform_Name+" = "+result);
    }else{
        IO.println(Platform_Name+" = High Usage => Consider reducing screen time");

    }
}