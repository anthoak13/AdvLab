// LabVIEW.cpp : Defines the exported functions for the DLL application.
//

#include "stdafx.h"


extern "C" __declspec(dllexport) int multiply(int a, int b);

int multiply(int a, int b)
{
	return a*b;
}