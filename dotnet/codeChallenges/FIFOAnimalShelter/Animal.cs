using System;
using System.Collections.Generic;
using System.Text;

namespace FIFOAnimalShelter
{
    public class Animal
    {
        public string Name { get; set; }

        public Animal() { }

        public Animal(string name)
        {
            Name = name;
        }
    }
}
