using System;

namespace SimplePigLatin
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(PigIt("Pig latin is cool"));
        }

        public static string PigIt(string str)
        {
            string[] strArr = str.Split(' ');
            for (int i = 0; i < strArr.Length; i++)
            {
                string word = strArr[i];
                if (!Char.IsPunctuation(word[0]))
                {
                    word = $"{word.Substring(1)}{word[0]}ay";
                    Console.WriteLine(word);
                }
                strArr[i] = word;
            }

            return String.Join(" ", strArr);
        }
    }
}
