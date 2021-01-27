using System;
using System.Collections.Generic;
using System.Text;

namespace FIFOAnimalShelter
{
    public class Cat : Animal
    {
        public string Name { get; set; }

        public Cat() { }
        public Cat(string name)
        {
            Name = name;
        }
    }
}
