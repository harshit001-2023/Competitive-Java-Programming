void main() {
    int[] nums = {1, 2, 3, 6, 7, 9, 9};
    IO.println(array123(nums));
    IO.println(arrayFront9(nums));
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