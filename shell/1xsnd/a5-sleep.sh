#! /bin/bash

echo -n Count:
tput sc
count=0
while true;
	do
		if [ $count -lt 40 ];
		then
			let count++;
			tput rc
			tput ed
			echo -n $count;
			sleep 1;
		else
			exit 0;
		fi		
	done

