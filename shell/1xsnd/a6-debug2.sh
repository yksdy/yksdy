#!/bin/bash

function DEBUG()
{
	[ "$_DEBUG" == "on" ] && $@ || :
}
for i in {1..4}
do
	DEBUG echo $i;
done
