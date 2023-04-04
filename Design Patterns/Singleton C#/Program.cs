using System;

class Program
{
    static void Main(string[] args)
    {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
