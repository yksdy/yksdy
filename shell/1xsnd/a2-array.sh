#!/bin/bash
declare -A mzy
mzy=([name]=mengzhaoyang [age]=27)
echo "I'm ${mzy[name]} , may age is ${mzy[age]}"
echo ${mzy[*]}
echo ${mzy[@]}
echo ${!mzy[*]}
