string[] nums = new string[] { "1, 3, 4, 7, 13", "1, 2, 4, 13, 15" };

int[][] intArr = new int[nums.Length][];

for (int i = 0; i < nums.Length; i++)
{
    string[] strValue = nums[i].Split(", ");
    intArr[i] = new int[strValue.Length];
    for (int j = 0; i < strValue.Length; j++)
    {
        intArr[i][j] = int.Parse(strValue[j]);
    }
}

Console.WriteLine(intArr);
