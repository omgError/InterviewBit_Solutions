long Solution::countSalutes(string A)
{

    int result = 0;
    int l = A.length();
    vector<int> right(l, 0);
    int count = 0;
    for (int i = l - 1; i >= 0; i--)
    {
        if (A[i] == '<')
        {
            count++;
        }
        right[i] = count;
    }

    for (int i = 0; i < l; i++)
    {
        if (A[i] == '>')
        {
            result += right[i];
        }
    }
    return result;
}
