using System;
using DataStructures;

namespace MultiBracketValidation
{
    public class MultiBracket
    {

        public static bool MultiBracketValidation(string input)
        {
            if (input == "") throw new NullReferenceException("The input string is empty.");
            Stack<char> stack = new Stack<char>();

            foreach(char bracket in input)
            {
                if(bracket == '(' || bracket == '{' || bracket == '[')
                {
                    stack.Push(bracket);
                }
                else
                {
                    switch (bracket)
                    {
                        case ')':
                            if (stack.IsEmpty() || stack.Peek() != '(') return false;
                            stack.Pop();
                            break;
                        case '}':
                            if (stack.IsEmpty() || stack.Peek() != '{') return false;
                            stack.Pop();
                            break;
                        case ']':
                            if (stack.IsEmpty() || stack.Peek() != '[') return false;
                            stack.Pop();
                            break;
                        default:
                            break;
                    }
                }

            }

            if (stack.IsEmpty()) return true;

            return false;
        }
    }
}
