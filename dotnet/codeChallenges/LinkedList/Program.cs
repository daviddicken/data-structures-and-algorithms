using System;

namespace LinkedList
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime time = DateTime.Now;
           
            //time.ToString("HH:mm");
            int hour = time.Hour;

            Console.WriteLine("time " + hour);
        }
    }
}
