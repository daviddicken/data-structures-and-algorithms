using System;
using Xunit;
using FIFOAnimalShelter;
using FIFOAnimalShelter.CodeChallenges;

namespace AnimalShelterTest
{
    public class AnimalShelterTest
    {
        [Fact]
        public void EnQueueTest()
        {
            Dog dog = new Dog("fido");
            AnimalShelter shelter = new AnimalShelter();
            shelter.EnQueue(dog);
            Dog animal = (Dog)shelter.DeQueue("");
            Assert.Equal("fido", animal.Name);
        }

        [Fact]
        public void DeQueueCatTest()
        {
            AnimalShelter shelter = new AnimalShelter();
            Dog fido = new Dog("Fido");
            Dog spike = new Dog("Spike");
            Cat fluffy = new Cat("Fluffy");
            Dog buddy = new Dog("Buddy");
            Cat mittens = new Cat("Mittens");

            shelter.EnQueue(fido);
            shelter.EnQueue(spike);
            shelter.EnQueue(fluffy);
            shelter.EnQueue(buddy);
            shelter.EnQueue(mittens);

            Cat pet = (Cat)shelter.DeQueue("cat");
            Assert.Equal("Fluffy", pet.Name);
        }
        [Fact]
        public void DeQueueDogTest()
        {
            AnimalShelter shelter = new AnimalShelter();
            Dog fido = new Dog("Fido");
            Dog spike = new Dog("Spike");
            Cat fluffy = new Cat("Fluffy");
            Dog buddy = new Dog("Buddy");
            Cat mittens = new Cat("Mittens");

            shelter.EnQueue(fluffy);
            shelter.EnQueue(spike);
            shelter.EnQueue(fido);
            shelter.EnQueue(buddy);
            shelter.EnQueue(mittens);

            Dog pet = (Dog)shelter.DeQueue("dog");
            Assert.Equal("Spike", pet.Name);
        }
        [Fact]
        public void DeQueueAnyTest()
        {
            AnimalShelter shelter = new AnimalShelter();
            Dog fido = new Dog("Fido");
            Dog spike = new Dog("Spike");
            Cat fluffy = new Cat("Fluffy");
            Dog buddy = new Dog("Buddy");
            Cat mittens = new Cat("Mittens");

            shelter.EnQueue(fluffy);
            shelter.EnQueue(spike);
            shelter.EnQueue(fido);
            shelter.EnQueue(buddy);
            shelter.EnQueue(mittens);

            Cat pet = (Cat)shelter.DeQueue("");
            Assert.Equal("Fluffy", pet.Name);
        }

        [Fact]
        public void DeQueueEmptyTest()
        {
            AnimalShelter shelter = new AnimalShelter();
            Assert.Null(shelter.DeQueue(""));
        }
        [Fact]
        public void NoCatsTest()
        {
            AnimalShelter shelter = new AnimalShelter();
            Dog fido = new Dog("Fido");
            Dog spike = new Dog("Spike");
            Dog buddy = new Dog("Buddy");

            shelter.EnQueue(spike);
            shelter.EnQueue(fido);
            shelter.EnQueue(buddy);

            Assert.Null(shelter.DeQueue("Cat"));
        }
        [Fact]
        public void NoDogsTest()
        {
            AnimalShelter shelter = new AnimalShelter();
            Cat fluffy = new Cat("Fluffy");
            Cat mittens = new Cat("Mittens");

            shelter.EnQueue(fluffy);
            shelter.EnQueue(mittens);
            Assert.Null(shelter.DeQueue("Dog"));
        }
    }
}
