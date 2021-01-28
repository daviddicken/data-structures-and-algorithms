using System;
using DataStructures;

using System.Text;

namespace FIFOAnimalShelter.CodeChallenges
{
    public class AnimalShelter
    {
        public Queue<Animal> waitingList { get; set; }

        public AnimalShelter()
        {
            waitingList = new Queue<Animal>();
        }

        /// <summary>
        /// EnQueue method takes in a animal object and if the aniamal object is a dog or cat it adds the animal to the back of the waiting list.
        /// </summary>
        /// <param name="pet">Dog or Cat object</param>
        public void EnQueue(Animal pet)
        {
            Type t = pet.GetType();
            if(t.Equals(typeof(Cat)) || t.Equals(typeof(Dog)))
            {
                waitingList.EnQueue(pet);
            }
            else
            {
                Console.WriteLine("Sorry we only take in Dogs and Cats here.");
            }          
        }

        /// <summary>
        /// DeQueue takes in a string representing which type of pet you would like to adopt. If the user doesn't have a preference enter "none". It will then itterate through the waiting list until it finds the first type of pet that you are interested in adopting. returning that pet or null if none are found.
        /// </summary>
        /// <param name="pet">String: "Cat", "Dog", "", "no' , "none, "any"</param>
        /// <returns></returns>
        public Animal DeQueue(string pet)
        {
            Console.WriteLine("Start of Dequeu");
            if (waitingList.IsEmpty())
            {
                Console.WriteLine("Sorry we are all out of animals at this time");
                return null;
            }

            Animal yourPet = new Animal();
            Animal tempAnimal = new Animal();
            pet = pet.ToLower();

            if(pet == "cat" || pet == "dog")
            {
                if (pet == "cat") yourPet = new Cat();
                if (pet == "dog") yourPet = new Dog();
                Queue<Animal> temp = new Queue<Animal>();
                bool found = false;

                while (!waitingList.IsEmpty())
                {
                    tempAnimal = waitingList.DeQueue();
                    if(tempAnimal.GetType() == yourPet.GetType() && found == false)
                    {
                        Console.WriteLine("found our animal");
                        yourPet = tempAnimal;
                        found = true;
                    }
                    else
                    {
                        temp.EnQueue(tempAnimal);
                    }                
                }
                
                waitingList = temp;
                if (!found)
                {
                    Console.WriteLine($"Sorry we are all out of {pet}.");
                    return null;
                }
                return yourPet;
                
            }
            else if(pet == "" || pet == "none" || pet == "no" || pet == "any")
            {
                return waitingList.DeQueue();
            }else
            {
                Console.WriteLine("Sorry we only have Cats and Dogs at this shelter.");
                return null;
            }
        }
    }
}
