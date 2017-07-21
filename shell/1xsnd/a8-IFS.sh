#!/bin/bash

date="abc,mez,hello,sheloo"
oldIFS=IFS
IFS=,
for i in $date;
do
	echo Iten: $i
done
IFS=oldIFS
