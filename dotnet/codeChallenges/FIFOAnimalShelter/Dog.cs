using System;
using System.Collections.Generic;
using System.Text;

namespace FIFOAnimalShelter
{
    public class Dog : Animal
    {
        public string Name { get; set; }

        public Dog(string name)
        {
            Name = name;
        }
    }
}
