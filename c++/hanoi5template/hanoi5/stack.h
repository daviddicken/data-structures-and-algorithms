/*
Filename: stack.h
Author: David Dicken
Date last modified: 5/10/16

Description: header file for stack class
*/
#pragma once
#include "node.h"
#include<iostream>
#include<exception>

using namespace std;

template<class t>
class stack
{
private:

int numElements;     // keeps track of amount of nodes on the stack
node<t> *top;        // points to the top node

public:
	//constructors
	
	/*========== construstor with no input
	input: none
	output: stack object created with top pointer to NULL and numElements set to 0
	------------*/
	stack()
	{
		top = NULL;
		numElements = 0;
	}
 
/*========== copy constructor
input: stack
output: new stack that is a copy of the input stack
algorithm:  create a temp pointer to the input stacks top
			write a loop while the input stacks top pointer is not pointing to another node
			push value returned by input stacks getdata function to this stack
			increase numElements by 1
			use getnext function to get the next node on stacks location then set the input stacks top pointer to that location
			end loop
			use the temp pointer to return the input stacks top pointer to the top node
--------------*/
stack(stack& from)
{
	this->top = copy(from);
	this->numElements = from.size();
}

//destructor
/*input: none
 output: stack destroyed
 -----------*/
~stack(void)
{
}

	//functions

//================= push
/*input: type value
 output: new node added to the stack with pointer to node bellow it and type value store in data
 algorithm: set top to new node 
			increase numElements 1
 -----------------*/
void push(t val)
{
	try
	{
		top = new node<t>(val, top);
		numElements++;
	}
	catch(bad_alloc &ba)                                     // catch and exit with message if memory can not be allocated
	{
		cerr << "Caught in push function: " << ba.what() << endl;
		exit(1);
	}
}

//================= pop
/*input: none
 output: return value of data stored in top node and destroy top node
 algorithm: set return value variable
			test if stack has nodes
				set temp pointer to top
				use getnext to set top pointer to next node
				set return value to value returned from calling getdata with the temp pointer
				delete temp
				subtract one from numElements
				return return value
 -----------------*/
t pop()
{
	t retVal;
	
	try
	{
		assert(numElements > 0);
	
		if (numElements<= 0)
		{
			throw logic_error("Illegal pop");
		}
	
		node<t> *temp = top;
		top = top->getnext();
		retVal = temp->getdata();
		delete temp;
		numElements--;

		
	}
	catch (exception &e)                       //catch and exit with message if an illegal pop is made 
	{
		cerr << "Caught: " << e.what() << endl;
		cerr << "Type: " << typeid(e).name() << endl;
		exit(1);
	}
	return(retVal);
}

//================= size
/*input: none
 output: returns the number of nodes on the stack
 algorithm: return numElements
 -----------------*/
int size() const
{
	return numElements;
}

//================= back
/*input: none
 output: returns value of data in the node on top of the stack
 algorithm: write variable to hold data
			use getdata function
			return variable holding data
 -----------------*/
t back()
{
	t retVal;
	retVal = top->getdata();
	return retVal;
}
	
//================= clear
/*input: none
 output: stack with all node cleared and numElent reset to 0
 algorithm: loop while top is pointing to another node
				pop this
			end loop
			reste numElements
 -----------------*/
void clear()
{
	while ( top != NULL )
		{
				this->pop();
		}
		numElements = 0;
}
	
//================= << overload
/*input: ostream out, stack
 output: ostream the data value of each node on the stack
 algorithm: set temp pointer to curent top of stack
			write a loop while temp pointer is pointing to another node
			use getdata to get data value for current temp node send to outstream
			set temp pointer to location returned by getnext function
			end loop
			return outstream
 -----------------*/
friend ostream& operator << (ostream& out, const stack& stak)
{
	node<t> *temp = stak.top;

	while(temp != NULL)
	{
		out << temp->node::getdata() << " ";
		temp=temp->node::getnext();
	}

	return out;
}
	
//------------------- = overload
/*input: stack
 output: copy of input stack 
 algorithm: test that the stack we are in isn't the stack that got sent in to copy
			if not
			write a loop while top pointer is pointing to another node
			this pop to clear the current stack
			end loop
			reset numElements to 0
			create a temp pointer to the input stacks top
			write a loop while the input stacks top pointer is not pointing to another node
			push value returned by input stacks getdata function to this stack
			increase numElements by 1
			use getnext function to get the next node on stacks location then set the input stacks top pointer to that location
			end loop
			use the temp pointer to return the input stacks top pointer to the top node
 -----------------*/
stack& operator = (stack& from)
{
		if (this != &from)
	{
		while ( top != NULL )
		{
			this->pop();
		}
		numElements = 0;
		
		node<t> *fromtemp = from.top;
		
		while (from.top != NULL)
		{
			push(from.top->getdata());
			numElements++;
			from.top = from.top->getnext();
		}

		 from.top = fromtemp;
	}
	return *this;
}
/*================== copy
input: stack
output: copy of stack
algorithm:
create 3 node pointers (temp, from, to)
set from to fromstack.top
while from pointer is not pointing to null
create new node in temp and fill with data from from node
set from pointer to next node in from stack
end loop
return temp stack
--------------------------------------*/
node<t>* copy(const stack &fromstack)
{
	node<t> *temp(nullptr), *from(nullptr), *to(nullptr);

	from = fromstack.top;
	while (from != nullptr)
	{
		try
		{
			if (temp == nullptr)
			{
				temp = new node<t>(from->getdata(), nullptr);
				to = temp;
			}
			else
			{
				to->setnext(new node<t>(from->getdata(), nullptr));
				to = to->getnext();
			}
		}
		catch(bad_alloc &ba)                                          // catch and exit with message if memory can not be allocated
		{
			cerr << "Caught in copy function: " << ba.what() << endl;
			exit(1);
		}
		from = from->getnext();
	}
	return(temp);
}

};

