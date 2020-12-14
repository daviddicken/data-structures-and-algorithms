/*
filename: node.h
author: David Dicken
Date last modified: 5/10/16

Description: header file for node class
*/
#pragma once
#include<iostream>
using namespace std;
template<class t>
class node
{
	private:
	node* next;
	t data;

public:
	/*========== construstor with no input
	input: none
	output: node object created with next pointer pointing to null
	------------*/
	node(void)
	{
		next = NULL;
	}

	/*========= constructor with pointer input
	input: pointer
	output: nobe object created with next pointer pointing to pointer that was input
	algorithm: next = ptr
	-----------------*/
	node(node* ptr)
	{
		next = ptr;
	}
	
	/*========== construstor with data input
	input: type value
	output: node object created with next pointer pointing to null and value stored in data variable
	------------*/
	node(t val)
	{
		next = 	NULL;
		data = val;
	}
	
	/*========== construstor with data and pointer input
	input: type value, node ptr 
	output: node object created with pointer pointing to ptr and value stored in data variable 
	------------*/
	node(t val, node* ptr)
	{
	next = ptr;
	data = val;
	}
	
	//======================== destructor 
	/*input: none
	 output: node destroyed
	 -----------*/
	~node(void)
	{
	}

	//========================= Functions

	//================== getnext
	/*input: none
	output: returns next pointer
	 algorithm: return next
	-------------------------------*/
	node* getnext() const
	{
		return next;
	}
	
	/*================== set next
	input: pointer
	output & algorithm: set next pointer to input pointer
	------------------------------*/
	void setnext(node* ptr)
	{
		next = ptr;
	}

	//================== getdata
	/*input: none
	 output: returns value stored in data
	 algorithm: return data
	-------------------------------*/
	t getdata() const
	{
		return data;
	}

};
