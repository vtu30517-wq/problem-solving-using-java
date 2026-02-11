class UserMainCode
{
    public int NthPrime(int input1)
    {
        if (input1 <= 0)
            return 0;
        int count = 0;
        int num = 1;
        while (count < input1)
        {
            num++;
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++)
            {
                if (num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (num >= 2 && isPrime)
                count++;
        }
        return num;
    }
}
