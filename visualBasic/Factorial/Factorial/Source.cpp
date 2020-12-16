//#include "stdafx.h"
#include<iostream>
using namespace std;

int factorial(int base);

int main()
{
	int base(0);

	cout << "Base: /n";
	cin >> base;

	base = factorial(base);

	cout << base << endl;

	return 0;
}
	int factorial(int base)
	{
		
		if (0 == base)
		{
			return 0;
		}
		else if (1 == base)
		{
			return 1;
		}
		else
		{
			return(base * factorial(base - 1));
		}
	}

	int fibonacci(int base)
	{
		//counter[base]++;
			if (0 == base)
			{
				return 0;

			}
			else if (1 == base)
			{
				return 1;
			}
			else if (2 == base)
			{
				return 1;
			}
			else
			{
				return(fibonacci(base - 1) + fibonacci(base - 2));
			}
	}