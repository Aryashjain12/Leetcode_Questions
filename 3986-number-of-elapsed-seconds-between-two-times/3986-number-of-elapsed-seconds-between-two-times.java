class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
     int start = (((startTime.charAt(0)*10)+startTime.charAt(1))*3600)+(((startTime.charAt(3)*10)+startTime.charAt(4))*60)+((startTime.charAt(6)*10)+startTime.charAt(7));

    int end = (((endTime.charAt(0)*10)+endTime.charAt(1))*3600)+(((endTime.charAt(3)*10)+endTime.charAt(4))*60)+((endTime.charAt(6)*10)+endTime.charAt(7));

        return end-start;
    }
}