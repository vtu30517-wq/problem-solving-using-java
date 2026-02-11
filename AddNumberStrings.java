public int AddSub(int input1, int input2) {
    int N = input1;
    int opt = input2;
    int result = N;
    boolean add;
    if (opt == 1) {
        add = false;
    } else {
        add = true;   
    }
    for (int i = N - 1; i >= 1; i--) {
        if (add) {
            result += i;
        } else {
            result -= i;
        }
        add = !add;  
    }
    return result;
}


