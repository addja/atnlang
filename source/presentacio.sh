#!/bin/bash

kate ./test/test-atnbacktrack.atn ./test/test-np.atn ./test/test-quantities.atn ./test/test-numbers.atn test/freeling* &

bin/ATN ./test/test-atnbacktrack.atn -parse test/freeling-backtrack.txt
printf "\n\n\n"
read -n1 -r -p "Press a key to continue..." key
printf "\n\n\n"

bin/ATN ./atnSales.atn -parse test/freeling.txt
printf "\n\n\n"
read -n1 -r -p "Press a key to continue..." key
printf "\n\n\n"


bin/ATN ./test/test-np.atn -parse test/freeling-np.txt
printf "\n\n\n"
read -n1 -r -p "Press a key to continue..." key
printf "\n\n\n"

bin/ATN ./test/test-quantities.atn -parse test/freeling-quantities.txt
printf "\n\n\n"
read -n1 -r -p "Press a key to continue..." key
printf "\n\n\n"

bin/ATN ./test/test-numbers.atn -parse test/freeling-numbers.txt
printf "\n\n\n"
read -n1 -r -p "Press a key to end..." key
printf "\n\n\n"

