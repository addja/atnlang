#!/bin/bash

USAGE="\n USAGE: ./run-atn.sh PROG.atn LANG INPUT\n
        PROG.atn    -> ATN program name\n
		LANG        -> Language of the input {en, ca, es}
		INPUT       -> Sentence to be parsed"

if (test $# -lt 3 || test $# -gt 3) then
	echo $USAGE
	exit 0
fi


echo $3 | analyze -f $2.cfg > ./out.txt
bin/ATN $1 -parse ./out.txt
rm ./out.txt

