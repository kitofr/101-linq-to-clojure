(ns linq-2-clojure.t-core
  (:use midje.sweet)
  (:require [linq-2-clojure.linq40 :refer :all]))

(fact "example 40"
    (with-out-str (linq40)) => 
"Numbers with a remainder of 0 when divided by 5:
5
0
Numbers with a remainder of 4 when divided by 5:
4
9
Numbers with a remainder of 1 when divided by 5:
1
6
Numbers with a remainder of 3 when divided by 5:
3
8
Numbers with a remainder of 2 when divided by 5:
7
2
")
