public static List<Integer> maxSubarray(List<Integer> arr) {
    int maxCurrent = arr.get(0);
    int maxGlobal = arr.get(0);

    int maxSubsequence = 0;
    int maxElement = arr.get(0);

    for (int i = 0; i < arr.size(); i++) {
        int value = arr.get(i);

        if (i > 0) {
            maxCurrent = Math.max(value, maxCurrent + value);
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }

        if (value > 0) {
            maxSubsequence += value;
        }

        if (value > maxElement) {
            maxElement = value;
        }
    }

    if (maxSubsequence == 0) {
        maxSubsequence = maxElement;
    }

    return Arrays.asList(maxGlobal, maxSubsequence);
}
