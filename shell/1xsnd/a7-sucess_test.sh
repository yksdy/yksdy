#!/bin/bash
CMD="ls"
$CMD
if [ $? -eq 0 ];
then
	echo "$CMD is yes"
else
	echo "$CMD is no"
fi
