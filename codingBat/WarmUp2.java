void main() {
    int[] nums = {1, 2, 6, 6, 9, 9, 9};
    IO.println(array123(nums));
    IO.println(arrayFront9(nums));
    IO.println(array667(nums));
    IO.println(noTriples(nums));
    IO.println(has271(nums));
}

/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false*/
public boolean arrayFront9(int[] nums) {
    int end = nums.length;
    if(end > 4) end = 4;

    for(int i = 0; i < end; i++){
        if(nums[i] == 9) return true;
    }
    return false;
}

/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true*/
public boolean array123(int[] nums) {
    for(int i = 0; i < (nums.length-2); i++){
        if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
    }

    return false;
}

/*
Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1*/
public int array667(int[] nums) {
    int count = 0;

    for(int i=0; i<nums.length-1;i++){
        if(nums[i] == 6){
            if(nums[i+1] == 6 || nums[i+1] == 7){
                count++;
            }
        }
    }

    return count;
}

/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false*/
public boolean noTriples(int[] nums) {
    for (int i = 0; i < (nums.length - 2); i++){
        if(nums[i+1] == nums[i] && nums[i+2] == nums[i]) return false;
    }

    return true;
}
/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
*/
public boolean has271(int[] nums) {
    for(int i = 0; i < nums.length-2; i++){
        int val = nums[i];
        if(nums[i+1] == (val+5) && Math.abs(nums[i+2] - (val-1)) <= 2){
            return true;
        }
    }
    return false;
}