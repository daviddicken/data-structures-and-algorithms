using System;
using System.Collections.Generic;
using System.Text;

namespace Implementations
{
    class Zoo
    {
        public abstract class Animal
        {
            public abstract bool LivesinWater { get; set; }

            public abstract bool IsEndangered { get; set; }
            public abstract bool BreathesAir { get; set; }
            public abstract bool IsNocturnal { get; set; }
            public abstract int Weight { get; set; }
            public abstract string Diet { get; set; }

            public bool Eat(string meal)
            {
                if (meal == Diet) return true;
                return false;
            }

            public bool Sleep()
            {
                DateTime time = DateTime.Now;
                time.ToString("HH:mm");
                Console.WriteLine("time " + time);
                //if (IsNocturnal && )
                return false;
            }
            
            public abstract string Sound();

        }

        public abstract class Mammal : Animal 
        {
           // public bool breathesAir = true;

        }

        public abstract class Whale : Mammal
        {

        }

    }
}
